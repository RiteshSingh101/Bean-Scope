# Spring Bean Scope Example

This project demonstrates the use of **Spring Bean Scopes** using Java-based configuration.

## Concepts Covered

- Spring Java Configuration (`@Configuration`)
- Component Scanning (`@ComponentScan`)
- Bean Creation using `@Bean`
- Singleton Scope (Default Scope)
- Prototype Scope
- Dependency Injection using `@Autowired`
- Value Injection using `@Value`
- Collection Injection (`List<String>`)

## Project Structure

```
src/main/java
│
├── com.mca
│   ├── AppConfig.java
│   ├── Driver.java
│   ├── Student.java
│   └── Employee.java
```

## Technologies Used

- Java
- Spring Framework 5.3.18
- Maven

## Configuration

### AppConfig.java

- Creates a `List<String>` bean containing:
  - Java
  - Spring
  - Hibernate

- Creates an `Employee` bean with **prototype scope**.

```java
@Bean
public List<String> getList() {
    return Arrays.asList("Java", "Spring", "Hibernate");
}

@Bean
@Scope("prototype")
public Employee getEmployee() {
    return new Employee();
}
```

## Student Bean

The `Student` class is marked as:

```java
@Component
@Scope("prototype")
```

Features:

- Injects primitive values using `@Value`
- Injects `List<String>` bean using `@Autowired`

Example Output:

```text
id: 101
Name: Tanmay
Subjects: [Java, Spring, Hibernate]
```

## Employee Bean

The `Employee` bean is configured using `@Bean` and `@Scope("prototype")`.

```java
public void work() {
    System.out.println("Working on project...");
}
```

## Bean Scope Demonstration

### Prototype Scope

Every call to:

```java
app.getBean(Student.class);
```

creates a new object.

Similarly:

```java
app.getBean(Employee.class);
```

creates a new `Employee` object.

Example:

```text
Address 1: com.mca.Student@1a2b3c
Address 2: com.mca.Student@4d5e6f

Emp address: com.mca.Employee@7g8h9i
Emp address: com.mca.Employee@0j1k2l
```

Different memory addresses indicate different objects.

## Maven Dependency

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.18</version>
</dependency>
```

## How to Run

1. Clone the repository

```bash
git clone https://github.com/your-username/Bean-Scope.git
```

2. Open the project in Eclipse/IntelliJ IDEA.

3. Update Maven dependencies.

4. Run:

```java
Driver.java
```

## Learning Outcome

After completing this project, you will understand:

- Difference between Singleton and Prototype scope
- How Spring manages bean lifecycle
- Java-based Spring configuration
- Dependency Injection with collections
- Bean creation using `@Bean` and `@Component`
