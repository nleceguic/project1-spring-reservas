# Project 1 - Spring Reservas

One-liner: API REST para gestión de reservas. Stack: Java 17, Spring Boot, PostgreSQL, JWT.

## Demo
- Endpoints básicos:
  - `POST /auth/login`
  - `GET /reservations`
  - `POST /reservations`

## Requisitos
- Java 17, Maven, PostgreSQL, Docker

## Ejecutar local
1. `cp .env.example .env` (configura DB)
2. `./mvnw spring-boot:run`

## Tests
`./mvnw test`

## Docker
`docker build -t project1 . && docker run -p 8080:8080 project1`

## Contribuir
1. Fork → branch `feat/xxx` → PR
