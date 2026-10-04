# J - Dev And Prod Environment Configuration

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

This chapter shows how environment profiles influence security and database configuration.

## What You Will Learn

- How spring.profiles.active selects configuration
- Why dev and prod security settings differ
- How logging and SQL visibility should change by environment

## Security Keywords

- **Profiles**
- **dev**
- **prod**
- **environment variables**
- **logging level**
- **show-sql**
- **configuration hardening**

## How To Run

- Configure Oracle database
- Run from JSpring_Security_With_Prod_Dev_Env: mvn spring-boot:run
- Change spring.profiles.active or import prod config when testing environment-specific behavior

## Example

`	ext
spring.profiles.active=default
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
Continue with [KSpring_Security_With_SSL_Configuration](../KSpring_Security_With_SSL_Configuration/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. What is a Spring profile?** 
A named set of configuration activated for an environment.

**Q2. Why separate dev and prod config?** 
Production should use safer logging, secrets, and SSL settings.

**Q3. Why avoid TRACE logs in prod?** 
They can expose sensitive security details.

**Q4. Why use environment variables?** 
They avoid hardcoding deployment-specific values.

**Q5. What is config hardening?** 
Reducing insecure defaults before production.

**Q6. What comes next?** 
SSL/HTTPS configuration.

## Existing HELP Content Preserved

The section below keeps the original generated HELP.md content so no existing project notes are lost.

# Spring profiles

# What is spring.profiles.active?
	It's a Spring Boot property that activates a specific configuration profile.
	spring.profiles.active=dev

# Means Spring Boot will:
- Load application-dev.properties or application-dev.yml
- Apply any @Profile("dev") beans
- Ignore other profile-specific configs (like test, prod)

# Basic property files:
	File When It's Loaded
	application.properties Always (base/default config)
	application-dev.properties Only if spring.profiles.active=dev
	application-prod.properties Only if spring.profiles.active=prod

# Possible Values
	We can set any custom profile name. Some common examples:

# Value Usage
	dev Development environment
	test Testing or QA
	staging Pre-production
	prod Production environment
	default Fallback profile or local dev/testing
	Multiple: dev,db-mysql We can activate multiple profiles separated by a comma





