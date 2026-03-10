<!-- PROJECT LOGO -->
<br />
<p align="center">
  <h1 align="center">To-Do App</h1>
</p>

<p align="center">
  <strong>To-Do Web App</strong> – A full-stack Java Spring Boot application with Thymeleaf and H2 for managing tasks (add, edit, delete, mark complete) with a clean MVC structure.  
</p>

---
<!-- BADGES -->
<p align="center">
  <!-- Example badges -->
  <img src="https://img.shields.io/github/stars/Rahul-web-2/To-Do-App.svg?style=social" alt="GitHub Stars" />
  <img src="https://img.shields.io/github/forks/Rahul-web-2/To-Do-App.svg" alt="GitHub Forks" />
  <img src="https://img.shields.io/github/languages/top/Rahul-web-2/To-Do-App.svg" alt="Top Language" />
  <img src="https://img.shields.io/github/issues/Rahul-web-2/To-Do-App.svg" alt="Open Issues" />
</p>

---

## 📌 About The Project

This **To-Do App** helps users manage daily tasks efficiently.  
Built using **Java, Spring Boot, Thymeleaf, H2 Database, HTML & CSS**, it follows the MVC architecture and provides a clean and intuitive task management interface including:

✔️ Add new tasks  
✔️ View existing tasks  
✔️ Edit tasks  
✔️ Mark tasks as complete  
✔️ Delete tasks

🛠️ No external database setup required — the embedded **H2 database** makes for quick testing and deployment. :contentReference[oaicite:0]{index=0}

---

## 🚀 Features

- 🗂 MVC Architecture (clean separation of concerns)  
- 💾 Embedded H2 Database (no external configuration)  
- ✨ Interactive UI with Thymeleaf  
- 📌 CRUD operations on tasks  
- 📦 Maven project structure

---

## 🛠️ Tech Stack

| Component | Technology |
|-----------|------------|
| Backend   | Java, Spring Boot |
| Frontend  | Thymeleaf, HTML, CSS |
| Database  | H2 (embedded) |
| Build     | Maven |

---

## 📁 Folder Structure
├── .mvn/
├── .settings/
├── .vscode/
├── src/
│ ├── main/
│ │ ├── java/…
│ │ └── resources/
│ │ └── static/
│ └── test/
├── pom.xml
├── HELP.md
├── mvnw
└── mvnw.cmd


📝 Usage

Once the app is running:

Add a new task in the input field.

View your task list on the homepage.

Click Edit to update a task.

Mark complete or Delete a task as needed.


---

## 📦 Installation & Setup

1. **Clone the repository**  
   ```
   git clone https://github.com/Rahul-web-2/To-Do-App.git

2. Navigate to the project directory

cd To-Do-App

3. Build the project with Maven

mvn clean install

4. Run the application

mvn spring-boot:run

5. Open in browser
Visit:

http://localhost:8080
