# R - CSRF Disabled Demo

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

This chapter demonstrates why disabling CSRF protection is dangerous for form/session-based applications.

## What You Will Learn

- What CSRF is
- How forged POST requests can trigger actions
- Why CSRF protection should stay enabled for browser forms

## Security Keywords

- **CSRF**
- **Cross-Site Request Forgery**
- **csrf.disable**
- **state-changing request**
- **POST**
- **session cookie**
- **SameSite**
- **CSRF token**

## How To Run

- From RSpring_Security_Without_CSRF, run mvn spring-boot:run
- Open http://localhost:2030/login and login
- Open http://localhost:2030/transfer
- Use csrf.html only as a local demo page to understand the risk

## Example

`	ext
POST http://localhost:2030/transfer
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
This is the final chapter. Practice by enabling CSRF protection and comparing the behavior.

## Common Interview Questions And Short Answers

**Q1. What is CSRF?** 
An attack where a logged-in browser is tricked into submitting an unwanted request.

**Q2. Why are cookies involved?** 
Browsers automatically send cookies with matching requests.

**Q3. When is CSRF most important?** 
For browser-based session applications with state-changing actions.

**Q4. Should CSRF be disabled in production?** 
Usually no for form/session apps.

**Q5. When can APIs disable CSRF?** 
Often for stateless APIs that do not use cookies for auth.

**Q6. What is the best next practice?** 
Re-enable CSRF and add a valid CSRF token to the transfer form.

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





