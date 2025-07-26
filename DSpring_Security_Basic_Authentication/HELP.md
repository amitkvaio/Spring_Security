###  Default Authentication Behavior
### http.httpBasic(withDefaults());

>	It secures all endpoints.
	When a user accesses any secured URL (like /hello), Spring Security checks if the user is logged in.
	If not, the browser shows a popup asking for a username and password.
	
# Example
>	When user tries to access: http://localhost:8080/hello	
		If not logged in, browser shows:
		Check the image present in /src/main/resouces/static/images/Browserpopup.jpg
		After entering correct credentials, user is logged in and redirected to /hello

# Note
>	http.httpBasic() uses the browser's built-in login popup.
	It does not show a web page.
	We cannot customize the popup (no logo, no design).
	It is often used for:
		    APIs (like in Postman)
		    Command-line tools (like curl)
		    Simple internal tools or testing purposes
	
# Browser Popup Login
>	This popup is a built-in feature of your browser.
	It appears when the server sends back a 401 Unauthorized status with a special header.
	The popup asks for:
		Username: _______
		Password: _______

>	This popup is not a web page, and you cannot change how it looks.
	It is best used for:
		    APIs
		    Testing
		    Simple authentication without UI