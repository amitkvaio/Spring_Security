# B - Spring Security Default Protection

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

This chapter shows what happens when Spring Security is added with default behavior.

## What You Will Learn

- How Spring Security protects all endpoints by default
- How generated/default login behavior works
- How Authentication is injected into a controller

## Security Keywords

- **Spring Security filter chain**
- **Default login form**
- **Authentication object**
- **SecurityContext**
- **Authenticated principal**

## How To Run

- From BSpring_Security_With_Security, run mvn spring-boot:run
- Open http://localhost:2030/security
- Use the default generated password from the console unless configured otherwise

## Example

`	ext
GET http://localhost:2030/security
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
Continue with [CSpring_Security_InMemory_Authentication](../CSpring_Security_InMemory_Authentication/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. What happens after adding spring-boot-starter-security?** 
Spring Security protects endpoints by default.

**Q2. Where is the current username available?** 
It is available from the Authentication object.

**Q3. What is SecurityContext?** 
It stores security details for the current request/thread.

**Q4. Why does the browser show a login page?** 
Spring Security configures form login by default for web apps.

**Q5. What is a principal?** 
The logged-in user identity.

**Q6. What improves next?** 
Credentials are configured using application properties.

## Existing HELP Content Preserved

The section below keeps the original generated HELP.md content so no existing project notes are lost.

# Default Features Enabled by spring-boot-starter-security

# 1.	Basic Authentication is Enabled
- A default login page is provided by Spring Security.
- Every HTTP request to our app is protected by default.
- We will be prompted with a login dialog box in the browser or via a 401 Unauthorized if calling via Postman/cURL.

>	Username: user
- Password: A random one printed in the console at startup.
- Using generated security password: 9d7a12f0-xxxx-xxxx-xxxx-xxxxxxxxxxxx

### 2.	Form-based Login
- A simple login form is auto-configured.
- You can access it at any protected endpoint like http://localhost:8080/ which will redirect to /login.

### 3.	CSRF Protection is Enabled
- CSRF tokens are expected in POST, PUT, DELETE requests.
- It protects your app from Cross-Site Request Forgery attacks.

### 4.	All Endpoints Are Secured
- You must be authenticated to access any endpoint.
- No endpoint is publicly accessible unless explicitly configured.

### 5.	Session Management
- Session is automatically created after successful login.
- It maintains user state until logout or timeout.

### 6.	Logout Endpoint Provided
- POST request to /logout will end the session.
- It will redirect to /login?logout.
# What Type of Authentication Is This?
>	By default, it's HTTP Basic Authentication and Form-Based Authentication.
 Basic Authentication:
- Credentials (username:password) are sent in Authorization header.
- Useful for tools like Postman, curl, or APIs.
 Form-Based Authentication:
- Shown when you access the app via a browser.
- Uses a login form at /login.
# Summary Notes
>	Feature Enabled by Default Description
	HTTP Basic Auth Uses headers, useful for APIs
	Form-Based Login Shows login form on browser
	CSRF Protection Secures against CSRF attacks
	Session Management Auto session creation post-login
	Secured Endpoints All endpoints need authentication
	Logout Endpoint /logout endpoint is available
	Custom User (Optional) We can override via application.properties





