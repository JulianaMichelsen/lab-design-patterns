# Lab Design Patterns - Strategy Pattern

Este projeto é um exemplo de uso do **Strategy Pattern** em Java com Spring Boot, adaptado para um cenário de **entregas**. O Objetivo é aprender melhor sobre o uso de Design Patterns.
---

## Estrutura do Projeto

```
src/main/java/one/digitalinnovation/gof/
├── Application.java         -> Classe principal do Spring Boot
└── strategy/
    ├── Entrega.java         -> Interface de estratégia
    ├── EntregaBicicleta.java -> Implementação de entrega por bicicleta
    ├── EntregaCarro.java -> Implementação de entrega por Carro
    └── EntregaDrone.java   -> Implementação de entrega por Drone
```

---

## Tecnologias

* Java 21
* Spring Boot 3.2
* Maven
* Lombok (opcional)
* Testes com Spring Boot Starter Test

---

## Como Rodar

1. Clonar o repositório:

```bash
 git clone <URL_DO_REPOSITORIO>
 cd lab-design-patterns
```

2. Build e execução via Maven:

```bash
  mvn clean install
  mvn spring-boot:run
```

3. O Spring Boot irá iniciar e você verá no console as simulações de entrega.

---

## Explicação do Strategy Pattern

O **Strategy Pattern** permite definir uma família de algoritmos (ou comportamentos), encapsulá-los e torná-los intercambiáveis. No nosso caso, cada tipo de entrega é uma estratégia:

* **EntregaCorreios**: simula o envio tradicional pelos Correios.
* **EntregaMotoboy**: simula entrega rápida em curtas distâncias.
* **EntregaDrone**: simula entrega por drones em áreas específicas.

A classe principal (`Application`) escolhe dinamicamente qual estratégia de entrega usar.

---


## Possíveis Modificações

* Adicionar mais estratégias de entrega, como **EntregaCorreios** ou **EntregaAutônoma**.
* Integrar com Spring para definir a estratégia via **Dependency Injection**.
* Criar testes unitários para cada tipo de entrega.
* Implementar logs detalhados para monitorar cada entrega.

---

## Aprendizado e Conhecimento Adquirido

Ao realizar este projeto, foi possível:

* Compreender profundamente o **Strategy Pattern**, aprendendo a separar comportamentos e tornar o código mais flexível e extensível.
* Entender como diferentes algoritmos podem ser encapsulados em classes específicas e trocados dinamicamente.
* Praticar boas práticas de programação orientada a objetos e **SOLID**, especialmente o Princípio de Substituição de Liskov e o Princípio Aberto/Fechado.
* Integrar o padrão com **Spring Boot**, reforçando conceitos de injeção de dependência e estrutura de projeto em Java.
* Ganhar experiência em organizar código de forma modular e escalável, facilitando futuras extensões do sistema.

---

