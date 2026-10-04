# Spring Security Learning Workspace

This repository is a chapter-by-chapter Spring Security learning workspace.
It starts with an unsecured Spring Boot endpoint and gradually adds authentication, authorization, sessions, database-backed users, SSL, JWT, OAuth2, cookies, and CSRF concepts.

## Agenda

- [Problem We Will Solve](#problem-we-will-solve)
- [What You Will Learn](#what-you-will-learn)
- [Project index](#project-index)
- [How To Run](#how-to-run)
- [Recommended learning order](#recommended-learning-order)
- [Security keyword map](#security-keyword-map)
- [Common interview questions](#common-interview-questions-and-short-answers)
- [Practice roadmap](#practice-roadmap)

## Problem We Will Solve

Security is easier to learn when each concept is isolated.
This workspace solves that problem by moving step by step from an open endpoint to real application security patterns such as login, roles, JWT, OAuth2, HTTPS, cookies, and CSRF.

## What You Will Learn

- How Spring Boot behaves with and without Spring Security.
- How Basic authentication and form login work.
- How to load users from memory and from Oracle database tables.
- How to protect URLs using roles and authorities.
- How JWT, cookies, OAuth2, SSL, and CSRF fit into secure applications.
- Which keywords are commonly asked in Spring Security interviews.
## Project Index

| Chapter | Project | Problem Solved |
| --- | --- | --- |
| A | [A - Spring Without Security](ASpring_Without_Security/README.md) | This chapter establishes the baseline: a Spring Boot web endpoint that is accessible without authentication or authorization. |
| B | [B - Spring Security Default Protection](BSpring_Security_With_Security/README.md) | This chapter shows what happens when Spring Security is added with default behavior. |
| C | [C - In-Memory Authentication](CSpring_Security_InMemory_Authentication/README.md) | This chapter solves the problem of replacing generated credentials with predictable local credentials for learning. |
| D | [D - Basic Authentication](DSpring_Security_Basic_Authentication/README.md) | This chapter demonstrates HTTP Basic authentication and explicit SecurityFilterChain configuration. |
| E | [E - Form Based Authentication](ESpring_Security_Form_Based_Authentication/README.md) | This chapter demonstrates browser-based login using Spring Security form login. |
| F | [F - Basic And Form Login With URL Rules](FSpring_Security_Basic_And_Form_Based_Authentication/README.md) | This chapter solves the problem of protecting only selected URLs while allowing public pages. |
| G | [G - Custom Login Page](GSpring_Security_With_Custom_Login_Page/README.md) | This chapter replaces the default Spring Security login screen with an application-owned Thymeleaf login page. |
| H | [H - Oracle Database Authentication](HSpring_Security_With_OracleDB_Intraction/README.md) | This chapter stores users in Oracle and uses database-backed authentication instead of hard-coded users. |
| I | [I - Custom Login With Oracle DB](ISpring_Security_With_Login_Page_Oracle_Db/README.md) | This chapter combines a custom login page with Oracle-backed users. |
| J | [J - Dev And Prod Environment Configuration](JSpring_Security_With_Prod_Dev_Env/README.md) | This chapter shows how environment profiles influence security and database configuration. |
| K | [K - SSL And HTTPS Configuration](KSpring_Security_With_SSL_Configuration/README.md) | This chapter adds HTTPS/SSL configuration and session timeout concepts to the secured application. |
| L | [L - Role Based Authentication](LSpring_Security_Role_Based_Authentication/README.md) | This chapter solves endpoint authorization using user roles and authorities. |
| M | [M - Simple JWT Token Usage](MSpring_Security_Simple_Uses_Of_Jwt_Token/README.md) | This chapter introduces JWT token generation and validation without full database authentication flow. |
| N | [N - JWT With Oracle Authentication](NSpring_Security_With_Jwt_Orace_Auth/README.md) | This chapter combines Oracle user authentication with JWT-based authorization. |
| O | [O - JWT Stored In Cookies](OSpring_Security_With_Jwt_Cookies/README.md) | This chapter stores JWT in an HttpOnly cookie instead of returning it only in the response body/header. |
| P | [P - Google OAuth2 Reading User Details](PSpring_Security_With_Google_Oauth_Reading_Details/README.md) | This chapter demonstrates Google OAuth2 login and reading authenticated user profile details. |
| Q | [Q - Google OAuth2 Saving User Details](QSpring_Security_With_GoogleOauth_Saving_Details/README.md) | This chapter extends Google OAuth2 login by saving important user details in Oracle. |
| R | [R - CSRF Disabled Demo](RSpring_Security_Without_CSRF/README.md) | This chapter demonstrates why disabling CSRF protection is dangerous for form/session-based applications. |

## Recommended Learning Order

Follow the alphabetical order from A to R.
Each chapter adds one security concept and prepares the next one.

## How To Run

Each chapter is an independent Spring Boot project.
Open the chapter folder you want to practice and run the Maven command from that folder.

```bash
mvn spring-boot:run
```

Some chapters need Oracle database, Google OAuth2 credentials, or SSL configuration before they can run successfully.
Check the chapter README and `src/main/resources/application*.properties` file before starting it.
## Security Keyword Map

| Keyword | Short Meaning |
| --- | --- |
| **Authentication** | Verifies who the user is. |
| **Authorization** | Decides what the user can access. |
| **Principal** | The authenticated user identity. |
| **GrantedAuthority** | A permission or role assigned to a user. |
| **SecurityFilterChain** | The Spring Security web filter configuration. |
| **HttpSecurity** | Builder API used to define security rules. |
| **SecurityContext** | Stores the current Authentication. |
| **UserDetailsService** | Loads user details for authentication. |
| **PasswordEncoder** | Encodes and verifies passwords. |
| **BCrypt** | Adaptive hashing algorithm for passwords. |
| **HTTP Basic** | Sends credentials in the Authorization header. |
| **Form Login** | Browser login using a form and session. |
| **Session** | Server-side login state for browser applications. |
| **CSRF** | Attack that forces a logged-in browser to submit unwanted requests. |
| **CORS** | Browser rule controlling cross-origin requests. |
| **JWT** | Signed token carrying claims. |
| **Bearer Token** | Token sent in the Authorization header. |
| **HttpOnly Cookie** | Cookie hidden from JavaScript. |
| **Secure Cookie** | Cookie sent only over HTTPS. |
| **SameSite** | Cookie control for cross-site requests. |
| **OAuth2** | Delegated authorization/login flow. |
| **OpenID Connect** | Identity layer on top of OAuth2. |
| **SSL/TLS** | Transport encryption used by HTTPS. |
| **RBAC** | Role-based access control. |

## Chapter Summary And Next Step

This root README connects all chapters and gives a quick interview-focused map of the workspace.
Start with chapter A, then continue in order until chapter R.
After chapter R, practice combining database users, roles, HTTPS, JWT, OAuth2, and CSRF-safe browser flows in one small secure application.
## Common Interview Questions And Short Answers

**Q1. What is Spring Security?** 
Spring Security is a framework for authentication, authorization, and common web security protections in Spring applications.

**Q2. What is the difference between authentication and authorization?** 
Authentication verifies identity. Authorization checks access permission.

**Q3. What is SecurityFilterChain?** 
It defines how Spring Security filters HTTP requests.

**Q4. Why should passwords be encoded?** 
Encoded passwords reduce damage if the database is leaked.

**Q5. Why is HTTPS required?** 
HTTPS protects credentials, cookies, and tokens during network transfer.

**Q6. What is JWT used for?** 
JWT is used to carry signed claims for stateless authentication or authorization.

**Q7. Why is CSRF dangerous?** 
A malicious site can force a logged-in browser to send state-changing requests.

**Q8. Why should OAuth client secrets not be committed?** 
They allow access to the registered OAuth application and must be kept private.

## Practice Roadmap

1. Run chapters A to F to understand default, Basic, Form, and URL authorization.
2. Run chapters G to L to understand login pages, database users, SSL, and roles.
3. Run chapters M to O to understand JWT and token storage trade-offs.
4. Run chapters P and Q to understand OAuth2 login.
5. Run chapter R to understand why CSRF matters.




