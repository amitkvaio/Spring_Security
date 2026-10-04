# H - Oracle Database Authentication

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

This chapter stores users in Oracle and uses database-backed authentication instead of hard-coded users.

## What You Will Learn

- How Spring Data JPA and Oracle JDBC are used
- How users are registered and read from DB
- How password hashing should be applied

## Security Keywords

- **Oracle DB**
- **JPA**
- **Customer table**
- **UserDetailsService**
- **BCrypt**
- **Password hashing**
- **DAO authentication**

## How To Run

- Start Oracle database and ensure freepdb1 is reachable
- Set DATABASE_HOST, DATABASE_PORT, DATABASE_NAME, DATABASE_USERNAME, DATABASE_PASSWORD if needed
- From HSpring_Security_With_OracleDB_Intraction, run mvn spring-boot:run
- Use POST /register and then access protected endpoints such as /myAccount

## Example

`	ext
POST http://localhost:8080/register
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
Continue with [ISpring_Security_With_Login_Page_Oracle_Db](../ISpring_Security_With_Login_Page_Oracle_Db/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. Why use DB authentication?**  
Users can be managed persistently.

**Q2. Why hash passwords?**  
Plain text passwords are unsafe if the DB leaks.

**Q3. What is BCrypt?**  
A slow adaptive password hashing algorithm.

**Q4. What is UserDetailsService used for?**  
Loading user details by username/email.

**Q5. What is the role column used for?**  
It provides authorities such as ROLE_USER or ROLE_ADMIN.

**Q6. What comes next?**  
Custom login page with Oracle-backed users.

## Existing HELP Content Preserved

The section below keeps the original generated HELP.md content so no existing project notes are lost.

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





