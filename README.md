## Flight Reservation System Project

This system here is a system to be developed using OOP logic in Java to create this system for learning and reinforcing the foundation in the logic and structuring of projects in Java.

## Index

- [Technologies and Tools Used](#technologies-and-tools-used)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Installation and Configuration](#installation-and-configuration)
- [Project Execution](#project-execution)

## Technologies and Tools Used

<br>
<div style="display: inline_block" align="center">

<img width="100" src="https://skillicons.dev/icons?i=java">

</div>
<br>

- ***Language:*** Java

## Prerequisites

You need to ensure that your development environment is properly configured. Here are the main prerequisites:

<br>
<div style="display: inline_block" align="center">

<img width="100" src="https://skillicons.dev/icons?i=java">

</div>
<br>

- Java Development Kit (JDK): ***version 8*** or higher as ***JDK 17*** recommended by the documentation.

#### IDE (Integrated Development Environment):

<br>
<div style="display: inline_block" align="center">

<img width="100" src="https://skillicons.dev/icons?i=vscode">
<img width="100" src="https://skillicons.dev/icons?i=eclipse">
<img width="100" src="https://skillicons.dev/icons?i=idea">

</div>
<br>

 - ***IntelliJ IDEA*** (with integrated Spring Boot plugin).
 - ***Eclipse*** (with the Spring Tools Suite - STS plugin).
 - ***VS Code*** (with extensions for Java and Spring Boot)

## Installation and Configuration

1. **Clone the repository**:
```bash
git clone https://github.com/seu-repositorio/sistema-gerenciamento-escola.git
```
2. **Go to the APP folder and run the code main**
```java
public class App {
public static void main(String[] args) throws Exception {
System.out.println("Hello, World!");
}
}
```


 ## Ciando comandos para poder execultar o .jar completo e roda o projeto

- 1️⃣ Criar a pasta META-INF dentro de out/
Execute este comando no PowerShell para criar a pasta necessária:

 ```powershell
New-Item -ItemType Directory -Path out\META-INF -Force
 ```
- 2️⃣ Criar o MANIFEST.MF corretamente
Agora crie o arquivo MANIFEST.MF no PowerShell com:

```powershell
Set-Content -Path out\META-INF\MANIFEST.MF -Value "Manifest-Version: 1.0`nMain-Class: App.App`n"

```

- 1️⃣ Criar a pasta target (caso ainda não exista)

```powershell
New-Item -ItemType Directory -Path target -Force
```

- 2️⃣ Criar o .jar diretamente na pasta target

```powershell
jar cfm target/Project_Flight-Reservation_Poo.jar out/META-INF/MANIFEST.MF -C out .
````

- 4️⃣ Executar o .jar
Teste para ver se funciona:

```powershell
java -jar target/Project_Flight-Reservation_Poo.jar
```
