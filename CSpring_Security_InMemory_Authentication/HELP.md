#🔐 What is In-Memory Authentication?

##	In-Memory Authentication means storing user details (username, password, roles) in the application memory, rather than in a database or external system.
>
It is:
•	Easy to configure
•	Mostly used for development, testing, or small apps
•	Not suitable for production (because users are lost when the app restarts)
________________________________________
##	✅ When to Use:
>
•	For quick testing/demo apps
•	When you don't want to connect to a database
•	To understand how Spring Security works

##🧠 Key Features:
>
Feature	 				Description
Storage	 				In memory (hardcoded users in Java code)
Authentication Type	 	Can be httpBasic() or formLogin()
Custom Roles	 		Yes
Password Encoding		Required (e.g., BCryptPasswordEncoder)
