# Habit Tracker Backend API 🚀

The backend of the **Habit Tracker App**, built using **Spring Boot** and **MySQL**, is designed to provide a robust API to handle **habit tracking**, **user authentication will be added in next**, and **data persistence**. This backend supports all basic CRUD operations and integrates seamlessly with the frontend.

---

## 🌐 Features

- **CRUD Operations** for managing habits
- **Database Integration** with MySQL
- **RESTful API** with all necessary endpoints to manage habits
- **User Authentication will be add next** (Signup, Login, JWT-based authorization)
- Secure and efficient handling of user data
- Optimized code for performance

---

## 🛠️ Tech Stack

- **Backend**: Spring Boot (Java)
- **Database**: MySQL
- **Authentication**: JWT (JSON Web Tokens)
- **Build Tool**: Maven

---

## 📂 Folder Structure

```text
habit-tracker-backend/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── com/Nk
│ │ │ │ ├── habittracker/
│ │ │ │ │ ├── controller/
│ │ │ │ │ ├── model/
│ │ │ │ │ ├── repository/
│ │ │ │ │ ├── service/
│ │ │ │ │ └── security/
│ │ ├── resources/
│ │ │ ├── application.properties
├── pom.xml


- **controller/**: Contains REST controllers for handling API requests
- **model/**: Entity classes (representing database tables)
- **repository/**: Interfaces for database CRUD operations
- **service/**: Business logic layer
- **security/**: JWT authentication utilities

---

## 🔧 Setup and Installation

### Prerequisites

- **JDK 17 or later**
- **MySQL**
- **Maven**

## 📈 Progress & Future Features
- Add more security features (role-based access control)

- Implement habit streak tracking

- Integrate email notifications for daily reminders

