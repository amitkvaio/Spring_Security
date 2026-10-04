# D - Basic Authentication

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

This chapter demonstrates HTTP Basic authentication and explicit SecurityFilterChain configuration.

## What You Will Learn

- How httpBasic works
- How SecurityFilterChain configures request rules
- How UserDetailsService and PasswordEncoder are declared

## Security Keywords

- **HTTP Basic**
- **Authorization header**
- **Base64 credentials**
- **SecurityFilterChain**
- **UserDetailsService**
- **DelegatingPasswordEncoder**

## How To Run

- From DSpring_Security_Basic_Authentication, run mvn spring-boot:run
- Open http://localhost:2030/basicauth
- Try http://localhost:2030/getheader to inspect request header behavior

## Example

`	ext
curl -u user:12345 http://localhost:2030/basicauth
`

Use this example to verify the security behavior for this chapter.

## Key Points Or Common Mistakes

- Do not commit real passwords, OAuth client secrets, JWT signing keys, or keystore passwords.
- Use HTTPS whenever credentials, sessions, cookies, or tokens are transmitted.
- Keep demo shortcuts such as disabled CSRF, default passwords, or verbose security logs out of production.
- Prefer BCrypt or another strong password encoder for stored passwords.

## Chapter Summary And Next Step

This chapter focuses on one Spring Security concept and prepares the next security topic.
Continue with [ESpring_Security_Form_Based_Authentication](../ESpring_Security_Form_Based_Authentication/README.md), which covers the next security topic.

## Common Interview Questions And Short Answers

**Q1. What is Basic authentication?** 
A browser/client sends username and password in the Authorization header.

**Q2. Is Basic authentication encrypted?** 
No. It must be used over HTTPS to protect credentials.

**Q3. What does SecurityFilterChain do?** 
It defines Spring Security rules for HTTP requests.

**Q4. What is UserDetailsService?** 
It loads user details for authentication.

**Q5. What is PasswordEncoder?** 
It verifies encoded passwords safely.

**Q6. What is the main drawback of Basic auth?** 
Credentials are sent on every request.

## Existing HELP Content Preserved

The section below keeps the original generated HELP.md content so no existing project notes are lost.

### Default Authentication Behavior
### http.httpBasic(withDefaults());

>	It secures all endpoints.
	When a user accesses any secured URL (like /hello), Spring Security checks if the user is logged in.
	If not, the browser shows a popup asking for a username and password.
	
# Example
>	When user tries to access: http://localhost:8080/hello	
 If not logged in, browser shows:
 Check the image present in /src/main/resouces/static/images/Browserpopup.jpg
 After entering correct credentials, user is logged in and redirected to /hello

# Note
>	http.httpBasic() uses the browser's built-in login popup.
	It does not show a web page.
	We cannot customize the popup (no logo, no design).
	It is often used for:
 APIs (like in Postman)
 Command-line tools (like curl)
 Simple internal tools or testing purposes
	
# Browser Popup Login
>	This popup is a built-in feature of your browser.
	It appears when the server sends back a 401 Unauthorized status with a special header.
	The popup asks for:
 Username: _______
 Password: _______

>	This popup is not a web page, and you cannot change how it looks.
	It is best used for:
 APIs
 Testing
 Simple authentication without UI



