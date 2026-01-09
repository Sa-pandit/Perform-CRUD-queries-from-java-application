JDBC Employee CRUD Application

📌 Project Description
This project is a Java JDBC-based console application used to perform CRUD operations
on an `employee` table in a MySQL database.
The application demonstrates how SQL queries (Create, Insert, Update, Delete)
can be executed directly from a Java program using JDBC.

---

## 🛠️ Technologies Used
- Java (JDK 8 or above)
- JDBC (Java Database Connectivity)
- MySQL Database
- MySQL Connector/J
- IDE: IntelliJ 

 Employee Table Structure

Table Name: employee

| Column Name | Data Type |
|------------|----------|
| Id         |      INT |
| Name       | VARCHAR(50) |
| Email      | VARCHAR(50) |
| City       | VARCHAR(100) |
| Contact    | INT |

 ✅ CRUD Operations Performed

1️⃣ Create Table
Creates the `employee` table if it does not already exist in the database.

2️⃣ Insert Employee Data
Inserts employee details such as Id, Name, Email, City, and Contact into the table.

3️⃣ Update Employee Data
Updates employee information (such as Name) using the employee Id.

 4️⃣ Delete Employee Data
Deletes an employee record from the table using the employee Id.

