# Flight Checkin Application

# Project Description
This Spring Boot project uses Rest APIs exposed by the "flightReservation2022" application [https://github.com/Kaustav-Mandal/flightreservation2022.git]. 
There is no data base call used in order to complete checkin process. 

# How to Run:
1. Download and import the Project to STS. 
2. In application.properties file change the server port to a port number OTHER THAN  8080 (if flightReservation2022 application is running at 8080). By default the post is 9090. 
3. Hit the URL : http://localhost:9090/flightcheckin/showStartCheckin
