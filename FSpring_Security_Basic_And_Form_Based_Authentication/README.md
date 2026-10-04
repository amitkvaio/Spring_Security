# F - Basic And Form Login With URL Rules

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

This chapter solves the problem of protecting only selected URLs while allowing public pages.

## What You Will Learn

- How requestMatchers control endpoint access
- How authenticated and permitAll differ
- How Basic and Form login can be enabled together

## Security Keywords

- **requestMatchers**
- **authenticated**
- **permitAll**
- **denyAll**
- **httpBasic**
- **formLogin**
- **Endpoint authorization**

## How To Run

- From FSpring_Security_Basic_And_Form_Based_Authentication, run mvn spring-boot:run
- Open public endpoint http://localhost:2025/notices
- Open protected endpoint http://localhost:2025/myAccount
- Try http://localhost:2025/basicAndFormbased after login

## Example

`	ext
GET http://localhost:2025/myAccount
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
Continue with [GSpring_Security_With_Custom_Login_Page](../GSpring_Security_With_Custom_Login_Page/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. What does permitAll mean?** 
Anyone can access the endpoint.

**Q2. What does authenticated mean?** 
The user must be logged in.

**Q3. Can Basic and Form login coexist?** 
Yes, this chapter enables both.

**Q4. What is URL authorization?** 
Access rules based on request path.

**Q5. Why avoid permitAll everywhere?** 
It makes protected data public.

**Q6. What comes next?** 
Using a custom login page.

## Existing HELP Content Preserved

The section below keeps the original generated HELP.md content so no existing project notes are lost.

# Getting Started
# What Happens When You Use Both formLogin() and httpBasic():
>
http.formLogin(withDefaults());
http.httpBasic(withDefaults());
 Result:
Both types of authentication are enabled - but Spring Security chooses the one based on the type of client request.
## How It Works:
>Scenario	What Happens
 Access via browser (HTML)	Triggers Form Login - shows a login page.
 Access via tools like Postman or REST clients	Uses HTTP Basic Auth - expects credentials in the Authorization header.
 Both enabled	Spring picks the appropriate one automatically based on the request type.

# Why Use Both?
>
- Useful in development/testing environments.
- Form login for browser-based users.
- HTTP Basic for REST clients and automation tools.
# In Production:
>
- It's better to choose one based on your use case.
- For web apps -> prefer formLogin().
- For REST APIs -> prefer httpBasic() or more secure options like token-based (JWT) authentication.





