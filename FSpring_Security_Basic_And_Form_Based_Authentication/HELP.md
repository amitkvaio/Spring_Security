# Getting Started
# What Happens When You Use Both formLogin() and httpBasic():
>
http.formLogin(withDefaults());
http.httpBasic(withDefaults());
🔹 Result:
Both types of authentication are enabled — but Spring Security chooses the one based on the type of client request.
________________________________________
## How It Works:
>Scenario	What Happens
🧑‍💻 Access via browser (HTML)	Triggers Form Login — shows a login page.
🛠️ Access via tools like Postman or REST clients	Uses HTTP Basic Auth — expects credentials in the Authorization header.
🔁 Both enabled	Spring picks the appropriate one automatically based on the request type.
________________________________________

# Why Use Both?
>
•	Useful in development/testing environments.
•	Form login for browser-based users.
•	HTTP Basic for REST clients and automation tools.
________________________________________
# In Production:
>
•	It’s better to choose one based on your use case.
•	For web apps → prefer formLogin().
•	For REST APIs → prefer httpBasic() or more secure options like token-based (JWT) authentication.

