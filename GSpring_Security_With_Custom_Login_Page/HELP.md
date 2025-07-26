# Custom Login page.
## Maven Dependency

	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
	</dependency>
	
	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
	</dependency>

##Code
	http.formLogin(
                form -> form
                .loginPage("/login") ----> Specifies the custom login page URL
                .loginProcessingUrl("/login")-----> URL that spring security will use to process
                .defaultSuccessUrl("/welcome")-------------> Page redirect after successful login
                .permitAll());---------------------->Allow everyone to access the login page.
    	
    	http.logout(
                logout -> logout
                .logoutUrl("/logout") ------------> URL trigger logout
                .permitAll()); ------------------------> Allow everyone to access the logout URL.



