# Q - Google OAuth2 Saving User Details

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

This chapter extends Google OAuth2 login by saving important user details in Oracle.

## What You Will Learn

- How OAuth2 login success can persist user data
- How OAuth profile attributes map to an entity
- How OAuth and database persistence work together

## Security Keywords

- **OAuth2 success handler**
- **OAuth2User**
- **Google profile**
- **email**
- **name**
- **picture**
- **Oracle persistence**
- **JPA**
- **create-drop**

## How To Run

- Configure Google OAuth credentials safely
- Start Oracle database
- Run from QSpring_Security_With_GoogleOauth_Saving_Details: mvn spring-boot:run
- Login at http://localhost:8080/ and check saved details after /profile

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
Continue with [RSpring_Security_Without_CSRF](../RSpring_Security_Without_CSRF/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. Why save OAuth user details?** 
To create/update local application user records.

**Q2. Which fields are usually saved?** 
Email, name, provider, provider id, and profile picture.

**Q3. What is a success handler?** 
Logic that runs after successful OAuth login.

**Q4. Why avoid ddl-auto=create-drop in production?** 
It can delete data on restart.

**Q5. Can OAuth replace local passwords?** 
Yes for users who authenticate through the identity provider.

**Q6. What comes next?** 
Understanding CSRF by disabling it in a demo.

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





