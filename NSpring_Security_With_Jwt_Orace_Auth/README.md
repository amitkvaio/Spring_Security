# N - JWT With Oracle Authentication

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

This chapter combines Oracle user authentication with JWT-based authorization.

## What You Will Learn

- How AuthenticationManager validates credentials
- How JWT filters build SecurityContext
- How database users and roles connect to tokens

## Security Keywords

- **AuthenticationManager**
- **UsernamePasswordAuthenticationToken**
- **Bearer token**
- **JwtAuthenticationFilter**
- **SecurityContextHolder**
- **stateless**
- **Oracle users**

## How To Run

- Start Oracle database
- Run from NSpring_Security_With_Jwt_Orace_Auth: mvn spring-boot:run
- Register/login through the JWT endpoints present in the project
- Call protected endpoints with Authorization: Bearer <token>

## Example

`	ext
Authorization: Bearer <jwt-token>
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
Continue with [OSpring_Security_With_Jwt_Cookies](../OSpring_Security_With_Jwt_Cookies/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. What is a Bearer token?** 
A token sent in the Authorization header.

**Q2. What does a JWT filter do?** 
It validates the token and sets Authentication in SecurityContext.

**Q3. Why use stateless auth?** 
The server does not need to store session state.

**Q4. What is AuthenticationManager?** 
It performs authentication using configured providers.

**Q5. What is SecurityContextHolder?** 
It stores the current request authentication.

**Q6. What comes next?** 
Sending JWT using HttpOnly cookies.

## Existing HELP Content Preserved

The section below keeps the original generated HELP.md content so no existing project notes are lost.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.3/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.3/maven-plugin/build-image.html)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.





