# O - JWT Stored In Cookies

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

This chapter stores JWT in an HttpOnly cookie instead of returning it only in the response body/header.

## What You Will Learn

- How ResponseCookie creates a JWT cookie
- Why HttpOnly helps against JavaScript token theft
- How cookie-based JWT changes CSRF considerations

## Security Keywords

- **HttpOnly cookie**
- **Set-Cookie**
- **Secure**
- **SameSite**
- **CSRF**
- **XSS**
- **JWT cookie**
- **Cookie theft**

## How To Run

- Start Oracle database
- Run from OSpring_Security_With_Jwt_Cookies: mvn spring-boot:run
- POST credentials to /api/jwt/generate
- Call /api/jwt/validate or protected endpoints with the cookie

## Example

`	ext
Set-Cookie: jwt=<token>; HttpOnly
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
Continue with [PSpring_Security_With_Google_Oauth_Reading_Details](../PSpring_Security_With_Google_Oauth_Reading_Details/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. Why use HttpOnly cookie?**  
JavaScript cannot read it, reducing XSS token theft risk.

**Q2. Should Secure be true?**  
Yes in HTTPS production.

**Q3. Does cookie JWT remove CSRF risk?**  
No. Cookies are sent automatically, so CSRF must be considered.

**Q4. What is SameSite?**  
A cookie attribute controlling cross-site sending.

**Q5. What endpoint generates the cookie?**  
/api/jwt/generate.

**Q6. What comes next?**  
OAuth2 login with Google.

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


