# I - Custom Login With Oracle DB

This Spring Security learning chapter is part of the Spring_Security workspace.

## Agenda

- [Problem we will solve](#problem-we-will-solve)
- [What you will learn](#what-you-will-learn)
- [Security keywords](#security-keywords)
- [How to run](#how-to-run)
- [Example](#example)
- [Key points or common mistakes](#key-points-or-common-mistakes)
- [Chapter summary and next step](#chapter-summary-and-next-step)
- [Common interview questions](#common-interview-questions-and-short-answers)
- [Existing HELP content preserved](#existing-help-content-preserved)

## Problem We Will Solve

This chapter combines a custom login page with Oracle-backed users.

## What You Will Learn

- How custom login works with DB users
- How Thymeleaf login templates submit credentials
- How sessions represent authenticated users

## Security Keywords

- **Custom login**
- **Oracle DB**
- **Thymeleaf**
- **Session**
- **JPA**
- **BCrypt**
- **ROLE_USER**

## How To Run

- Start Oracle database
- Run from ISpring_Security_With_Login_Page_Oracle_Db: mvn spring-boot:run
- Open http://localhost:2025/login
- Register/test users as described in sql/scripts.sql

## Example

`	ext
GET http://localhost:2025/login
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
Continue with [JSpring_Security_With_Prod_Dev_Env](../JSpring_Security_With_Prod_Dev_Env/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. What is combined in this chapter?**  
Custom login UI plus database-backed authentication.

**Q2. Why use email as username?**  
Many real applications use email as login identity.

**Q3. Where is the login template?**  
src/main/resources/templates/login.html.

**Q4. Why keep role values in DB?**  
Authorization can be changed without code changes.

**Q5. What should be avoided in production?**  
Default DB passwords and show-sql=true.

**Q6. What comes next?**  
Environment-specific configuration.

## Existing HELP Content Preserved

The section below keeps the original generated HELP.md content so no existing project notes are lost.

# Interaction with Oracle Database with custom login page.

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





