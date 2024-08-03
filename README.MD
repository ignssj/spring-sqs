# Spring Boot AWS SQS PoC

This project demonstrates a simple integration between Spring Boot and Amazon SQS using LocalStack to simulate the AWS environment. The project consists of a producer that sends messages to an SQS queue and a consumer that reads those messages.

## Project Structure

- **Producer:** Sends messages to the SQS queue.
- **Consumer:** Reads and processes messages from the SQS queue.

## Prerequisites

- Java 17 or higher
- Maven
- Docker (to run LocalStack)

## Setup

1. **Start LocalStack:**

    ```bash
    docker run --rm -it -p 4566:4566 -p 4571:4571 localstack/localstack
    ```
2. **Create the SQS Queue in LocalStack:**

    ```bash
    aws --endpoint-url=http://localhost:4566 sqs create-queue --queue-name my-aws-queue
    ```
## Execution
1. **Install Dependencies and Start the Application:**

    ```bash
    ./mvnw clean install
    ./mvnw spring-boot:run
    ```
   On startup, the producer automatically sends a "Hello SQS!" message to the SQS queue.


2. **Message Consumption:**

   The consumer listens to the SQS queue and prints the message content to the console.

## Tech Stack
- Spring Boot
- AWS SDK for Java v2
- Spring Cloud AWS
- LocalStack
