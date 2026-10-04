# C - In-Memory Authentication

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

This chapter solves the problem of replacing generated credentials with predictable local credentials for learning.

## What You Will Learn

- How username/password can come from properties
- How in-memory authentication works
- How security logging level can be configured

## Security Keywords

- **In-memory user**
- **spring.security.user.name**
- **spring.security.user.password**
- **Security logging**
- **Authentication**

## How To Run

- From CSpring_Security_InMemory_Authentication, run mvn spring-boot:run
- Open http://localhost:2030/inmemory
- Default credentials from properties: amit / amit

## Example

`	ext
GET http://localhost:2030/inmemory
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
Continue with [DSpring_Security_Basic_Authentication](../DSpring_Security_Basic_Authentication/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. What is in-memory authentication?**  
Users are stored in application memory, not a database.

**Q2. Is in-memory authentication production-ready?**  
Usually no; it is mainly for demos, tests, or small tools.

**Q3. How are credentials configured here?**  
Using spring.security.user.name and spring.security.user.password.

**Q4. Why use environment placeholders?**  
They allow overriding credentials without changing code.

**Q5. What is the risk of default passwords?**  
They are easy to guess if not changed.

**Q6. What comes next?**  
HTTP Basic authentication is configured explicitly.

## Existing HELP Content Preserved

The section below keeps the original generated HELP.md content so no existing project notes are lost.

#ðŸ” What is In-Memory Authentication?

##	In-Memory Authentication means storing user details (username, password, roles) in the application memory, rather than in a database or external system.
>
It is:
â€¢	Easy to configure
â€¢	Mostly used for development, testing, or small apps
â€¢	Not suitable for production (because users are lost when the app restarts)
________________________________________
##	âœ… When to Use:
>
â€¢	For quick testing/demo apps
â€¢	When you don't want to connect to a database
â€¢	To understand how Spring Security works

##ðŸ§  Key Features:
>
Feature	 				Description
Storage	 				In memory (hardcoded users in Java code)
Authentication Type	 	Can be httpBasic() or formLogin()
Custom Roles	 		Yes
Password Encoding		Required (e.g., BCryptPasswordEncoder)

