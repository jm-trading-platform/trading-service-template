# Trading Service Template

Plantilla base para todos los microservicios Java.

## Tecnologías

- Java 21
- Spring Boot
- Maven
- Kafka
- PostgreSQL
- Redis
- Flyway
- OpenAPI

## Arquitectura

Hexagonal Architecture.

domain/
application/
adapters/
configuration/
bootstrap/

## Cómo crear un servicio

1. Use this template
2. Crear repositorio
3. Renombrar paquete base
4. Actualizar pom.xml

## Estándares

Consultar:

trading-docs/architecture


Crear DTO de evento
```JAVA
public record HealthEvent(
        String id,
        String timestamp,
        String status) {
}

````

## Esto deja preparado:

- UserCreatedEvent
- OrderCreatedEvent
- PositionOpenedEvent
- PortfolioUpdatedEvent

## Topics:

auth.user.created
auth.user.deleted
trading.order.created
trading.order.executed
portfolio.updated


