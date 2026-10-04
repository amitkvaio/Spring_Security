# P - Google OAuth2 Reading User Details

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

This chapter demonstrates Google OAuth2 login and reading authenticated user profile details.

## What You Will Learn

- How oauth2Login works
- How OAuth2User exposes profile attributes
- Which Google scopes are requested

## Security Keywords

- **OAuth2**
- **OpenID Connect**
- **Google login**
- **client-id**
- **client-secret**
- **redirect-uri**
- **scope**
- **OAuth2User**
- **profile**
- **email**

## How To Run

- Configure Google client-id and client-secret safely before running
- Run from PSpring_Security_With_Google_Oauth_Reading_Details: mvn spring-boot:run
- Open http://localhost:8080/ and login with Google
- Open http://localhost:8080/profile after login

## Example

`	ext
GET http://localhost:8080/profile
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
Continue with [QSpring_Security_With_GoogleOauth_Saving_Details](../QSpring_Security_With_GoogleOauth_Saving_Details/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. What is OAuth2 login?** 
A delegated login flow using an external identity provider.

**Q2. What is OpenID Connect?** 
An identity layer on top of OAuth2.

**Q3. What scopes are requested?** 
openid, email, and profile.

**Q4. What is redirect-uri?** 
The callback URL where Google sends the authorization response.

**Q5. Should client-secret be committed?** 
No. Store it in secrets or environment variables.

**Q6. What comes next?** 
Saving OAuth user details to the database.

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





