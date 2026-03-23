# JAVA-Library: Used Bookstore Management 📚☕

**JAVA-Library** (LibreriaUsados) is a lightweight Java application designed to manage the inventory and sales of a used bookstore. It implements a basic Point of Sale (TPV) system to handle books, sellers, and transaction records.

## 🎓 Academic Context
This project was developed during my **early years of the Computer Science degree**. It serves as a foundational exercise in Object-Oriented Programming (OOP) and the MVC (Model-View-Controller) design pattern. Due to its academic nature, the project focuses on simplicity, core logic, and basic data structures rather than complex persistence or advanced interfaces.

## 📁 Project Structure

The project follows a standard Maven directory layout and is organized into layers:

* **`negocio` (Model/Business Logic)**: Contains the core entities.
    * `Libro.java`: Represents book attributes and data.
    * `Vendedor.java`: Managed seller profiles.
    * `Venta.java` & `LineaVenta.java`: Logic for processing transactions and individual sale lines.
* **`controladora` (Controller)**:
    * `Libreria.java`: Main logic for inventory management.
    * `Tpv.java`: Handles the logic for the Point of Sale terminal.
* **`vista` (View)**:
    * `Pantalla.java`: A basic interface (CLI/GUI) to interact with the user.
* **`test`**: 
    * `LibroTest.java`: Includes unit tests using **JUnit** to ensure the integrity of the core business logic.

## 🛠️ Tech Stack
* **Language**: Java.
* **Build Tool**: Maven (standard `pom.xml` configuration).
* **Testing**: JUnit 4/5.
* **IDE Support**: Developed with NetBeans support (`nbproject` files included).

## 🚀 How to Run

Since this is a Maven project, you can compile and run it easily:

1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/eLeCe2611/JAVA-Library.git](https://github.com/eLeCe2611/JAVA-Library.git)
    ```
2.  **Compile and Build**:
    ```bash
    mvn clean install
    ```
3.  **Run Tests**:
    ```bash
    mvn test
    ```
4.  **Execute**:
    The compiled `.jar` will be generated in the `target/` folder.

## 👤 Author
* **Luis Carmona** - [eLeCe2611](https://github.com/eLeCe2611)

---
*This repository is part of my personal archive of early programming projects.*
