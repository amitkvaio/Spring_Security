#❗ Risks If We Don’t Add Spring Security or 🚨 Why Building a Spring Application Without Security is Risky:
________________________________________________________________________________

#1.	🚫 No Authentication
>	o	Anyone can access all your APIs and web pages.
	o	No one is asked to log in — no username or password required.
	✅ 	Example: If you have an /admin endpoint, anyone on the internet can open it.
________________________________________________________________________________
#2.	🔓 No Authorization
>	o	We cannot control who is allowed to do what.
	o	All users (even hackers) can access all data and perform actions.
	✅ 	Example: Anyone could delete user records or change important data.
________________________________________________________________________________
#3.	⚠️ No CSRF Protection
>	o	Without CSRF (Cross-Site Request Forgery) protection, attackers can trick users into performing unwanted actions.
	o	Very dangerous if you have forms like money transfer, password change, etc.
________________________________________________________________________________
#4.	🕵️ No Protection for Sensitive Data
>	o	Passwords, tokens, and user info are not secured.
	o	No encryption, no filters — attackers can easily steal or misuse data.
________________________________________________________________________________
#5.	📂 Open Endpoints
>	o	All REST APIs are publicly available.
	o	Anyone can call your endpoints from anywhere (even bots or hackers).
________________________________________________________________________________
#6.	🛠 No Login or Logout Features
>	o	We cannot implement secure login/logout flows on your own easily.
	o	We have to write full login logic from scratch (which may have bugs or loopholes).
________________________________________________________________________________
#7.	📈 Easy Target for Attackers
>	o	Hackers look for unsecured apps on the internet.
	o	No security makes your app an easy target for brute-force, SQL injection, or XSS attacks.
________________________________________________________________________________
#8.	🔁 No Session Management
>	o	We can't track user login sessions.
	o	Users stay logged in forever unless you handle it manually.
________________________________________________________________________________
#9.	🧪 No Built-in Security Testing
>	o	We lose Spring Security’s powerful security filters and checks.
	o	We have to manually test everything, which is hard and error-prone.
________________________________________________________________________________
________________________________________________________________________________
# Why You Should Use spring-boot-starter-security
>	•	It gives basic protection out of the box.
	•	We get login, logout, session handling, CSRF, and secure headers automatically.
	•	Later, you can customize it as per your needs (like using JWT, OAuth2, etc.).
________________________________________
