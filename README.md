# Educational Platform - Spring Modulith Implementation

This repository provides an implementation of the [educational-platform](https://github.com/anton-liauchuk/educational-platform) using **Spring Modulith**. The goal is to leverage modular architectural patterns to enhance scalability, maintainability, and testability.

## Features
- Modular design using **Spring Modulith**.
- Clean separation of concerns with domain-driven boundaries.
- Easy maintainability and enhanced testability.

## Project Structure

The project follows a modular architecture provided by Spring Modulith:

```
src/main/java/
├── com.educational.platform
│   ├── module-a
│   ├── module-b
│   ├── module-c
│   ├── shared-kernel
```

### Key Components
- **Modules**: Each module encapsulates a specific feature or domain boundary.
- **Shared Kernel**: Contains shared code and common utilities used across modules.
- **Event-Driven Communication**: Modules communicate via domain events using Spring Modulith's event publishing.

## Testing

Run the test suite with:

```bash
mvn test
```

The project includes:
- Unit tests for individual components.
- Integration tests to verify module interactions.

## Documentation

- **Spring Modulith**: Learn more about [Spring Modulith](https://spring.io/projects/spring-modulith).
- **Educational Platform**: Original project repository is available [here](https://github.com/anton-liauchuk/educational-platform).

## License

This project is licensed under the MIT License. See the LICENSE file for details.