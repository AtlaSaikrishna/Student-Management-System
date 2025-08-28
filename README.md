# 🎓 Student Management System (Java + MySQL + JDBC)

This is a **console-based Student Management System** built using **Java, MySQL, and JDBC**.  
It provides a simple **menu-driven interface** to perform CRUD operations (Create, Read, Update, Delete) on student records stored in a MySQL database.

---

## 📖 Features
- Display all students
- View student by ID
- Add new student
- Update student information
- Remove student by ID
- Exit the application gracefully

---

## 🛠 Tech Stack
- **Language:** Java (JDK 8 or above)  
- **Database:** MySQL  
- **Connectivity:** JDBC (Java Database Connectivity)  
- **IDE:** Eclipse  

---

## ⚙️ Setup & Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/AtlaSaikrishna/Student-Management-System.git

2. **Open the project in your preferred IDE**

3. **Add MySQL JDBC Driver**
   Download mysql-connector-java-x.x.x.jar and add it to your project’s classpath.
4. **Create MySQL Database**
   CREATE DATABASE studentDB;
   USE studentDB;
5. **Create Table**
   CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    course VARCHAR(100) NOT NULL,
    age INT NOT NULL
   );
6. **Update Database Credentials** in DBConnection.java
   private static final String url = "jdbc:mysql://localhost:3306/studentDB";
   private static final String username = "root";
   private static String password = "mysql_password";
7. **Run the project**
   javac Main.java
   java Main

   
**▶️ Example Run**
   ✨ Student Management System 👨🏻‍🎓🌟
1. Display all Students
2. View Student by ID
3. Add new Student
4. Update student Info
5. Remove student by ID
6. Exit
👉 Enter your Choice : 3

Enter student name 👨🏻‍🎓 : Krishna
Enter course 📚 : Java
Enter student age : 21
✅ Student addded sussfully! 🤹‍♂✅


👉 Enter your Choice : 1
ID    | Name            | Course     | Age
-----------------------------------------------------
1     | Krishna         | Java       | 21


**📂 Project Structure**
student_management_system/
│── DBConnection.java   # Handles database connection
│── Main.java           # Menu-driven console app
│── Student.java        # Student model class (POJO)
│── StudentDAO.java     # Handles CRUD operations
│── studentdb.sql       # SQL script to create DB & table

**🤝 Contributing**
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

**📄 License**
This project is licensed under the MIT License.


   
 
