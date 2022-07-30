#Start with a base image containing Java runtime
FROM openjdk:18 as build

#Information about who maintains the image
MAINTAINER sudhir.com

#Add the application Jar to thae container
COPY target/LoanApplication.jar LoanApplication.jar

# Execute the application
ENTRYPOINT ["java","-jar","/LoanApplication.jar"]