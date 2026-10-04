# M - Simple JWT Token Usage

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

This chapter introduces JWT token generation and validation without full database authentication flow.

## What You Will Learn

- What a JWT contains
- How signing protects token integrity
- How tokens differ from server sessions

## Security Keywords

- **JWT**
- **JWS**
- **claims**
- **subject**
- **issuer**
- **expiration**
- **signature**
- **HS256**
- **stateless authentication**

## How To Run

- From MSpring_Security_Simple_Uses_Of_Jwt_Token, run mvn spring-boot:run
- Use the JWT utility/endpoints in the project to generate or validate tokens

## Example

`	ext
JWT = header.payload.signature
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
Continue with [NSpring_Security_With_Jwt_Orace_Auth](../NSpring_Security_With_Jwt_Orace_Auth/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. What is JWT?**  
A signed token carrying claims between client and server.

**Q2. What are the three JWT parts?**  
Header, payload, and signature.

**Q3. Is JWT encrypted by default?**  
No. It is encoded and signed, not encrypted.

**Q4. Why use expiration?**  
To limit the lifetime of stolen tokens.

**Q5. Where should signing keys be stored?**  
In secure external configuration or secret storage.

**Q6. What comes next?**  
JWT authentication with Oracle users.

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


