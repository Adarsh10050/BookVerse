# 📚 BookVerse - Spring Boot Bookstore API

**BookVerse** is a RESTful web application built using **Spring Boot** that provides complete CRUD operations for managing books along with an integrated **file upload** feature.  
It is connected to a **MySQL database** and allows users to add, update, delete, view, and upload book cover images easily.

---

## 🚀 Features

- 📘 Add new books with author details  
- ✏️ Update existing book information  
- ❌ Delete books from the database  
- 🔍 Fetch all or specific books by ID  
- 🖼️ Upload book cover images to the server  
- 💾 MySQL database integration using JPA and Hibernate  
- ⚡ RESTful APIs following clean architecture principles  

---

## 🛠️ Tech Stack

- **Java 17+**  
- **Spring Boot** (Web, JPA, Validation)  
- **MySQL Database**  
- **Maven** for project management  
- **Postman** for API testing  
- **Spring REST Controller** for endpoints  

---

## ⚙️ Setup Instructions

### 1️⃣ Open in IDE
Open the project in **IntelliJ IDEA**, **VS Code**, or **Spring Tool Suite (STS)**.

### 2️⃣ Configure Database
Update your MySQL credentials in `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookverse_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
```

---

## Run using Maven:

mvn spring-boot:run

---

## 📝 Test APIs using Postman
| Function       | Method | Endpoint       |
| -------------- | ------ | -------------- |
| Get All Books  | GET    | `/books`       |
| Get Book by ID | GET    | `/books/{id}`  |
| Add Book       | POST   | `/books`       |
| Delete Book    | DELETE | `/books/{id}`  |
| Upload Image   | POST   | `/upload-file` |

---

## 📸 Example API Response
```
{
  "id": 1001,
  "title": "Java Programming",
  "author": {
    "authorId": 501,
    "firstName": "Adarsh",
    "lastName": "Dev",
    "language": "English"
  }
}
```

---

## 📂Project Structure

```text
src/
└── main/
├── java/com/api/book/bootrestbook/
│ ├── controllers/
│ │ ├── BookController.java
│ │ └── FileUploadController.java
│ ├── entities/
│ │ ├── Book.java
│ │ └── Author.java
│ ├── services/
│ │ └── BookService.java
│ ├── dao/
│ │ └── BookRepository.java
│ ├── helper/
│ │ └── FileUploadHelper.java
│ └── BootrestbookApplication.java
└── resources/
├── application.properties
└── static/image/
```

---

## ⭐ Show Your Support 

If you like this project, please ⭐ the repository — it helps others find it too!
