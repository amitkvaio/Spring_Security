# Spring profiles

# What is spring.profiles.active?
	It's a Spring Boot property that activates a specific configuration profile.
	spring.profiles.active=dev

# Means Spring Boot will:
	•	Load application-dev.properties or application-dev.yml
	•	Apply any @Profile("dev") beans
	•	Ignore other profile-specific configs (like test, prod)

# Basic property files:
	File	                      				When It’s Loaded
	application.properties	                    	Always (base/default config)
	application-dev.properties	                	Only if spring.profiles.active=dev
	application-prod.properties	                	Only if spring.profiles.active=prod

# Possible Values
	We can set any custom profile name. Some common examples:

# 	Value						Usage
	dev							Development environment
	test							Testing or QA
	staging						Pre-production
	prod							Production environment
	default						Fallback profile or local dev/testing
	Multiple: dev,db-mysql				We can activate multiple profiles separated by a comma

