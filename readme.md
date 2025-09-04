[2~[3;2~[2~# My Spring Boot Monorepo

This repository is a monorepo for a set of Spring Boot microservices and related infrastructure.

## 🏛️ Architecture Overview

The project is structured to separate different components of our system:

-   **`services/`**: Contains the individual Spring Boot microservices. Each service is an independent application with its own business logic.
-   **`webapp/`**: Hosts the frontend application, which communicates with the backend services.
-   **`infra/`**: Stores infrastructure-as-code, including deployment configurations (e.g., Docker Compose, Kubernetes) and resource provisioning (e.g., Terraform).
-   **`docs/adrs/`**: Contains Architectural Decision Records (ADRs) that document significant architectural choices made for the project.

## 🚀 Getting Started

### Prerequisites

-   Java 17+
-   Maven
-   Docker (if running services via Docker Compose)

### Running Services

Each service in the `services/` directory can be run independently.

1.  Navigate to the service directory: `cd services/service-a`
2.  Build the service: `mvn clean install`
3.  Run the application: `mvn spring-boot:run`

### Infrastructure

To deploy the entire system locally, refer to the `infra/deployment/` directory.

### Documentation

-   **Architectural Decisions**: See `docs/adrs/` for a history of key architectural choices.
-   **API Documentation**: on the way[[C[C[C[A[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[[C[C[C[C[C[C[C[C[C[C[C[C[C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[1;5C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[A[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[C[C[B[C[C[C[C[C[C[C[C[C[C21[A[A[A[A[A[A[A[A
[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Ci
:
