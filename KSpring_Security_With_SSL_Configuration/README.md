# K - SSL And HTTPS Configuration

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

This chapter adds HTTPS/SSL configuration and session timeout concepts to the secured application.

## What You Will Learn

- How a PKCS12 keystore is configured
- Why HTTPS is required for secure authentication
- How session timeout affects logged-in users

## Security Keywords

- **SSL**
- **TLS**
- **HTTPS**
- **keystore.p12**
- **PKCS12**
- **key alias**
- **session timeout**
- **Secure cookie**

## How To Run

- Do not modify the keystore unless you intentionally rotate it
- Run from KSpring_Security_With_SSL_Configuration: mvn spring-boot:run
- Use https://localhost:2035 if SSL profile/config is enabled
- Use http://localhost:2035 for the current dev profile behavior if SSL is not active

## Example

`	ext
https://localhost:2035
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
Continue with [LSpring_Security_Role_Based_Authentication](../LSpring_Security_Role_Based_Authentication/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. Why is HTTPS important?** 
It encrypts credentials, cookies, and tokens in transit.

**Q2. What is a keystore?** 
A file that stores private keys and certificates.

**Q3. What is PKCS12?** 
A common keystore format.

**Q4. Why set Secure cookies?** 
So cookies are sent only over HTTPS.

**Q5. What is session timeout?** 
How long an inactive session remains valid.

**Q6. What comes next?** 
Role-based authorization.

## Existing HELP Content Preserved

The section below keeps the original generated HELP.md content so no existing project notes are lost.

# Spring profiles





