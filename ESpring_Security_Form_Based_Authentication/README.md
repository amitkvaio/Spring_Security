# E - Form Based Authentication

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

This chapter demonstrates browser-based login using Spring Security form login.

## What You Will Learn

- How formLogin enables browser login
- How authenticated requests access Authentication
- How form login differs from Basic auth

## Security Keywords

- **Form login**
- **Login page**
- **Session**
- **JSESSIONID**
- **Authentication**
- **PasswordEncoder**

## How To Run

- From ESpring_Security_Form_Based_Authentication, run mvn spring-boot:run
- Open http://localhost:2025/formbased
- Login using the in-memory credentials configured in code

## Example

`	ext
GET http://localhost:2025/formbased
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
Continue with [FSpring_Security_Basic_And_Form_Based_Authentication](../FSpring_Security_Basic_And_Form_Based_Authentication/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. What is form-based authentication?**  
A user submits username and password through an HTML login form.

**Q2. How is login state maintained?**  
Usually with an HTTP session and session cookie.

**Q3. How is it different from Basic auth?**  
Form login uses a login page and session; Basic sends credentials in a header.

**Q4. What is JSESSIONID?**  
The default session cookie used by servlet applications.

**Q5. What should protect the login form?**  
HTTPS should protect credentials in transit.

**Q6. What comes next?**  
Combining Basic, Form login, and path authorization rules.

## Existing HELP Content Preserved

The section below keeps the original generated HELP.md content so no existing project notes are lost.

# http.formLogin(withDefaults())
#Form-Based Authentication:
> [!NOTE]
##âœ… How it works:
#1.	The user opens a browser and accesses a protected URL like:
	o	http://localhost:2025/formbased

#2.	Spring Security redirects to the default login form (or custom if defined).

#3.	The user submits the login form with username and password:
	o	POST /login
	o	Content-Type: application/x-www-form-urlencoded
	o	username=amit&password=amit

#4.	Spring Security verifies the credentials.

#5.	If correct:
	o	A session is created on the server side.
	o	A JSESSIONID cookie is sent back to the browser.

#6.	On future requests:
	o	The browser automatically sends the session cookie.
	o	Spring uses the session ID to identify the logged-in user.


# A web page (HTML form) created by Spring Security.
	We can customize or create your own login page.
	We can add:
	    "Remember Me"
	    "Forgot Password?"
	    "Sign Up" link
	    Company logo or background
	    	
#	Spring Security will show a default login web page where users can enter a username and password.
#	After successful login, it redirects the user to the original requested page
