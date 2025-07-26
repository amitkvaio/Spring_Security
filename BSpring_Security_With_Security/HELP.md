# Default Features Enabled by spring-boot-starter-security
___________________________________________________________

# 1.	Basic Authentication is Enabled
>	o	A default login page is provided by Spring Security.
	o	Every HTTP request to our app is protected by default.
	o	We will be prompted with a login dialog box in the browser or via a 401 Unauthorized if calling via Postman/cURL.

>	Username: user
	o	Password: A random one printed in the console at startup.
	o	Using generated security password: 9d7a12f0-xxxx-xxxx-xxxx-xxxxxxxxxxxx

#2.	Form-based Login
>	o	A simple login form is auto-configured.
	o	You can access it at any protected endpoint like http://localhost:8080/ which will redirect to /login.

#3.	CSRF Protection is Enabled
>	o	CSRF tokens are expected in POST, PUT, DELETE requests.
	o	It protects your app from Cross-Site Request Forgery attacks.

#4.	All Endpoints Are Secured
>	o	You must be authenticated to access any endpoint.
	o	No endpoint is publicly accessible unless explicitly configured.

#5.	Session Management
>	o	Session is automatically created after successful login.
	o	It maintains user state until logout or timeout.

#6.	Logout Endpoint Provided
>	o	POST request to /logout will end the session.
	o	It will redirect to /login?logout.
__________________________________
# What Type of Authentication Is This?
>	By default, it's HTTP Basic Authentication and Form-Based Authentication.
	✅ Basic Authentication:
	•	Credentials (username:password) are sent in Authorization header.
	•	Useful for tools like Postman, curl, or APIs.
	✅ Form-Based Authentication:
	•	Shown when you access the app via a browser.
	•	Uses a login form at /login.
_______________________________________
# Summary Notes
>	Feature 				Enabled by Default		Description
	HTTP Basic Auth			✅						Uses headers, useful for APIs
	Form-Based Login		✅						Shows login form on browser
	CSRF Protection			✅						Secures against CSRF attacks
	Session Management		✅						Auto session creation post-login
	Secured Endpoints		✅						All endpoints need authentication
	Logout Endpoint			✅						/logout endpoint is available
	Custom User (Optional)	❌						We can override via application.properties

________________________________________
