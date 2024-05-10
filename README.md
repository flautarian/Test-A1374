# Test-A1374
Resolution of A1374 algorithm challenge in https://codeforces.com/problemset/problem/1374/A

## Introduction

This project contains a Spring Boot backend located in the `/backend` folder and an Angular 17 frontend located in the `/frontend` folder.

## Getting Started

### Prerequisites

Make sure you have the following installed:

- Docker
- Docker Compose

### Initialization

To initialize the project, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/your-repo-url.git

  
2. Navigate to project location
3. Run Docker Compose to start the services:

    ```bash
    docker-compose up -d

4. Ensure the correct initialize of the containers and navigate to http://localhost:4200 for frontend and http://localhost:8080/swagger-ui/index.html for swagger backend

In case of errors or unexpected setbacks you can init both projects manually:
- in frontend folder:
  
  ```bash
    npm install
    npm run build
    npm run start
  
- in backend folder:
   ```bash
      mvn clean install
      mvn spring-boot:run
