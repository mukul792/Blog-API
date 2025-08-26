# Blog Management REST API

## Overview
A robust Blog Management REST API built with Spring Boot, featuring CRUD operations, layered architecture, and advanced search capabilities. Includes pagination, sorting, and Swagger API documentation for easy testing.


## Backend Technologies
- **Spring Boot** - Framework for building REST APIs
- **Spring Data JPA** - Database interaction with PostgreSQL
- **Spring Boot Starter Web** - For building web applications
- **Spring Boot Starter Test** - Testing utilities
- **MYSQL** - Relational database for persistent storage
- **JPQL Queries** - Custom queries for advanced filtering
- **Swagger** - API documentation and testing

## Features
- Create, Read, Update, and Delete blogs
- Pagination and sorting for large datasets
- Advanced blog search using custom JPQL queries
- DTO-based request and response handling
- Custom exception handling
- API documentation with Swagger UI
  
## Setup
### Backend:
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/Blog-Management-API.git
   cd Blog-Management-API
   ```
2. Configure `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/blog_db
   spring.datasource.username=root
   spring.datasource.password=password
   spring.jpa.hibernate.ddl-auto=update
   ```
3. Build and run:
   ```sh
   mvn spring-boot:run
   ```

## Swagger Documentation
Once the application is running, access Swagger UI at:
  ```sh
http://localhost:8080/swagger-ui.html
   ```

## API Endpoints
| Method | Endpoint         | Description      |
|--------|-----------------|------------------|
| GET    | /api/blogs       | Get all blogs    |
| GET    | /api/blogs/{id}  | Get blog by ID   |
| POST   | /api/bllogs      | Create a blog    |
| PUT    | /api/blogs/{id}  | Update a blog    |
| DELETE | /api/blogs/{id}  | Delete a blog    |
| GET    | /api/blogs/search?keyword= | Search blogs by keyword   |

## License
MIT License
