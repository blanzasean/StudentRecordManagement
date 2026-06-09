# Student Record Management System

A desktop-based CRUD (Create, Read, Update, Delete) application built using **JavaFX** and **PostgreSQL**. This application provides an interface for managing student registrations, allowing users to efficiently add, view, update, and remove student records from a relational database.

## 🚀 Features
- **Full CRUD Operations:** Add new students, update existing profiles, and remove obsolete records.
- **Dynamic Data Display:** Utilizes a JavaFX `TableView` to show real-time database records.
- **Relational Backend:** Connected directly to a PostgreSQL relational database management system using JDBC.
- **User-Friendly Interface:** Built cleanly using structured layout controls (`TextField`, `ChoiceBox`, `Button`, and `TableView`).

## 🛠️ Tech Stack & Dependencies
- **Language:** Java 17+
- **GUI Framework:** JavaFX 21 (Controls, FXML)
- **Database Engine:** PostgreSQL
- **Build & Dependency Management:** Maven
- **Database Connectivity:** PostgreSQL JDBC Driver

## 📁 Database Schema
The backend relies on a database named `studentdb` containing a `students` table structured as follows:

```sql
CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    course VARCHAR(50),
    year_level VARCHAR(20)
);
