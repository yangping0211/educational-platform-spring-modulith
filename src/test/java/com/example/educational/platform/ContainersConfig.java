package com.example.educational.platform;

import org.springframework.boot.test.context.*;
import org.springframework.boot.testcontainers.service.connection.*;
import org.springframework.context.annotation.*;
import org.testcontainers.containers.*;
import org.testcontainers.utility.*;

@TestConfiguration(proxyBeanMethods = false)
public class ContainersConfig {
	@Bean
	@ServiceConnection
	PostgreSQLContainer<?> postgresContainer() {
		return new PostgreSQLContainer<>(DockerImageName.parse("postgres:17.2"));
	}
}
