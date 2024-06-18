# Booking Movie Ticket APIs Spring Boot Project

This project is a Spring Boot implementation of the backend APIs for a ticket booking system similar to the popular platform "BookMyShow". It provides a set of RESTful APIs that enable client applications to interact with the ticket booking system and perform various operations.

## Features
* User Registration -> Users can create an account, log in, and manage their profile information.
* Movie Management -> Admin users can add, edit, and remove movie from the system.
* Theater Management -> Admin users can add, allocate seats, edit, and remove Theaters from the system.
* Ticket Booking -> Users can browse through the available movie, select the desired event, and book tickets for it.
* Seat Selection -> Users can choose their preferred seats from the available options for a selected event.
* Booking History -> Users can view their booking history and check the details of their past bookings.

## Technologies Used
* Java 17+
* Spring Boot 3.3.0 
* Spring Data JPA
* MySQL (as the database)
* Maven (for dependency management)

## Getting Started
To set up the project on your local machine, follow these steps:

1. Clone the repository: `git clone https://github.com/JavaaTechSolutions/movie-ticket-booking-system.git
2. Navigate to the project directory
3. Configure the database settings in `application.properties` file.
4. Build the project using Maven: `mvn clean install`
5. Run the application: `mvn spring-boot:run`
6. The application will be accessible at `http://localhost:8080`.

## Database Setup
This project uses MySQL as the database. Follow these steps to set up the database:
1. Install MySQL on your local machine.
2. Create a new database named movie_ticket_booking.
3. Update the database configuration in `application.properties` file.

## API Documentation
The API documentation for this project can be found at `http://localhost:8080/swagger-ui.html`. It provides detailed information about each API, including request/response formats and parameters.

