# G - Custom Login Page

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

This chapter replaces the default Spring Security login screen with an application-owned Thymeleaf login page.

## What You Will Learn

- How loginPage points to a custom page
- How Thymeleaf templates integrate with Spring Security
- How logout and login error parameters are handled

## Security Keywords

- **Custom login page**
- **Thymeleaf**
- **loginProcessingUrl**
- **logout**
- **CSRF token**
- **Form parameters username/password**

## How To Run

- From GSpring_Security_With_Custom_Login_Page, run mvn spring-boot:run
- Open http://localhost:2025/login
- After login, test protected pages such as /welcome or configured secured endpoints

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
Continue with [HSpring_Security_With_OracleDB_Intraction](../HSpring_Security_With_OracleDB_Intraction/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. Why create a custom login page?** 
To match application UI and user experience.

**Q2. What fields does Spring Security expect by default?** 
username and password.

**Q3. What is loginProcessingUrl?** 
The URL Spring Security processes for login submission.

**Q4. Why is CSRF important for login forms?** 
It prevents unwanted forged form submissions.

**Q5. What template engine is used?** 
Thymeleaf.

**Q6. What comes next?** 
Loading users from Oracle DB instead of memory.

## Existing HELP Content Preserved

The section below keeps the original generated HELP.md content so no existing project notes are lost.

# Custom Login page.
## Maven Dependency

	<dependency>
 <groupId>org.springframework.boot</groupId>
 <artifactId>spring-boot-starter-security</artifactId>
	</dependency>
	
	<dependency>
 <groupId>org.springframework.boot</groupId>
 <artifactId>spring-boot-starter-thymeleaf</artifactId>
	</dependency>

##Code
	http.formLogin(
 form -> form
 .loginPage("/login") ----> Specifies the custom login page URL
 .loginProcessingUrl("/login")-----> URL that spring security will use to process
 .defaultSuccessUrl("/welcome")-------------> Page redirect after successful login
 .permitAll());---------------------->Allow everyone to access the login page.
 
 http.logout(
 logout -> logout
 .logoutUrl("/logout") ------------> URL trigger logout
 .permitAll()); ------------------------> Allow everyone to access the logout URL.







