# L - Role Based Authentication

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

This chapter solves endpoint authorization using user roles and authorities.

## What You Will Learn

- How roles map to authorities
- How protected pages differ for USER and ADMIN
- How role data can be stored in Oracle

## Security Keywords

- **Role-based access control**
- **RBAC**
- **ROLE_USER**
- **ROLE_ADMIN**
- **hasRole**
- **hasAuthority**
- **GrantedAuthority**
- **method security**

## How To Run

- Start Oracle database
- Run from LSpring_Security_Role_Based_Authentication: mvn spring-boot:run
- Open http://localhost:2035/login
- Use seeded users/roles if database scripts are loaded

## Example

`	ext
GET http://localhost:2035/admin
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
Continue with [MSpring_Security_Simple_Uses_Of_Jwt_Token](../MSpring_Security_Simple_Uses_Of_Jwt_Token/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. What is RBAC?** 
Role-based access control grants permissions by role.

**Q2. What is ROLE_USER?** 
A Spring Security authority convention for user role.

**Q3. What is the difference between role and authority?** 
A role is a type of authority with ROLE_ prefix convention.

**Q4. Why store roles in DB?** 
Roles can be managed without code changes.

**Q5. What is least privilege?** 
Give users only the access they need.

**Q6. What comes next?** 
JWT token concepts.

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





