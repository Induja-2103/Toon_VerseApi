# CartoonApi

A Spring Boot application for managing and retrieving cartoon character information.

## Overview

This project provides a REST API to access details about various cartoon characters, including their images, facts, and ratings.

## Technologies Used

*   **Java 17**
*   **Spring Boot** (Web, Data JPA, Thymeleaf)
*   **H2 Database** (Runtime)
*   **PostgreSQL Driver** (Runtime)
*   **Maven**

## getting Started

### Prerequisites

*   Java Development Kit (JDK) 17 or later
*   Maven

### Installation

1.  Clone the repository:
    ```bash
    git clone https://github.com/Induja-2103/Toon_VerseApi.git
    ```
2.  Navigate to the project directory:
    ```bash
    cd CartoonApi
    ```

### Running the Application

You can run the application using the Maven wrapper:

```bash
./mvnw spring-boot:run
```

Or on Windows:

```bash
mvnw.cmd spring-boot:run
```

The application will start on `http://localhost:8080`.

## API Endpoints

*   `GET /cartoons/name/{name}`: Retrieve details for a specific cartoon character.

## Frontend

A simple HTML frontend (`cartoon.html`) is included to interact with the API. Open it in a web browser to search for characters.
