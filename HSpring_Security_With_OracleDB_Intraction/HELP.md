# Interaction with Oracle Database.

# Below table will get automatically created.
>
CREATE TABLE customer (
  id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  email VARCHAR2(45) NOT NULL,
  pwd VARCHAR2(200) NOT NULL,
  role VARCHAR2(45) NOT NULL
);


# Insert below two entry
>
--INSERT INTO "SYSTEM"."CUSTOMER" (EMAIL, PWD, ROLE) VALUES ('user@gmail.com', '{noop}user', 'ROLE_USER');
--INSERT INTO "SYSTEM"."CUSTOMER" (EMAIL, PWD, ROLE) VALUES ('admin@gmail.com', '{bcrypt}$2a$10$0XR7EcRzxJQm3NlOV1RzDe..La4yJoyaSNh7n9ihxJ.30sye/uFo2', 'ROLE_ADMIN')

# If we want to insert some user through the postman
>
	http://localhost:2025/register ==> POST REQUEST TRY TO EXECUTE BY POSTMAN
	{
	  "email": "user@example.com",
	  "pwd": "securePassword123",
	  "role": "USER"
	}

 
#Summary of Flow
>
Step	What Happens						Who Handles It
1		User accesses a secured URL			Spring Security intercepts
2		User is redirected to /login		Spring Security
3		User submits login form				Spring Security
4		Username is looked up in DB			UserDetailsService
5		Password & roles retrieved			JPA repository
6		Password matched securely			PasswordEncoder
7		If match: redirect to /welcome		Spring Security
8		If fail: redirect to /login?error	Spring Security
9		On logout: session invalidated		Spring Security




