# http.formLogin(withDefaults())
#Form-Based Authentication:
> [!NOTE]
##✅ How it works:
#1.	The user opens a browser and accesses a protected URL like:
	o	http://localhost:2025/formbased

#2.	Spring Security redirects to the default login form (or custom if defined).

#3.	The user submits the login form with username and password:
	o	POST /login
	o	Content-Type: application/x-www-form-urlencoded
	o	username=amit&password=amit

#4.	Spring Security verifies the credentials.

#5.	If correct:
	o	A session is created on the server side.
	o	A JSESSIONID cookie is sent back to the browser.

#6.	On future requests:
	o	The browser automatically sends the session cookie.
	o	Spring uses the session ID to identify the logged-in user.


# A web page (HTML form) created by Spring Security.
	We can customize or create your own login page.
	We can add:
	    "Remember Me"
	    "Forgot Password?"
	    "Sign Up" link
	    Company logo or background
	    	
#	Spring Security will show a default login web page where users can enter a username and password.
#	After successful login, it redirects the user to the original requested page