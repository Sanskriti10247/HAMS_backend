<div align="center">

# 🏥 Hospital Appointment Management System (HAMS)

## A Backend System using Spring Boot


<img width="500" height="300" alt="image" src="https://github.com/user-attachments/assets/9df39d15-32da-4911-ade8-6c2873c820c4" />

</div>

### A production-grade backend system built using Spring Boot for managing hospital appointments with secure authentication, role-based access, email notifications, analytics APIs, and a bonus frontend interface.
### This project is designed as a real-world backend product, following proper layered architecture and clean coding principles.

## 📌 Features

- User Registration & Login with **JWT Authentication**
- Role-Based Access Control (**Admin / Doctor / Patient**)
- Doctor Management APIs (CRUD)
- Patient Management APIs (CRUD)
- Appointment Booking & Management System
- Email Notifications using **SMTP (Gmail)**
- Analytics & Reporting APIs
- Global Exception Handling
- Input Validation using Jakarta Validation
- Swagger / OpenAPI Interactive API Documentation
- Redis Caching for performance optimization
- Kafka Integration (Bonus - Event Driven)
- Frontend UI Dashboard (Bonus)

---

## 🛠 Tech Stack

| Layer            | Technology                         |
|------------------|------------------------------------|
| Backend          | Spring Boot 3                      |
| Language         | Java 21                            |
| Security         | Spring Security + JWT              |
| Database         | PostgreSQL                         |
| ORM              | Spring Data JPA                    |
| Documentation    | Swagger / OpenAPI                  |
| Caching          | Redis                              |
| Messaging        | Kafka                              |
| Email Service    | Gmail SMTP                         |
| Frontend         | HTML / CSS / JavaScript            |
| Build Tool       | Maven                              |
| Version Control  | GitHub                             |

🗂 Project Folder Structure
```
hams/
│
├── controller/
│   ├── AuthController.java
│   ├── DoctorController.java
│   ├── PatientController.java
│   ├── AppointmentController.java
│   ├── AnalyticsController.java
│   └── TestMailController.java
│
├── service/
│   ├── AuthService.java
│   ├── DoctorService.java
│   ├── PatientService.java
│   ├── AppointmentService.java
│   └── impl/
│       ├── AuthServiceImpl.java
│       ├── DoctorServiceImpl.java
│       ├── PatientServiceImpl.java
│       └── AppointmentServiceImpl.java
│
├── repository/
│   ├── UserRepository.java
│   ├── DoctorRepository.java
│   ├── PatientRepository.java
│   └── AppointmentRepository.java
│
├── model/
│   ├── User.java
│   ├── Doctor.java
│   ├── Patient.java
│   └── Appointment.java
│
├── dto/
│   ├── LoginRequest.java
│   ├── RegisterRequest.java
│   ├── DoctorDTO.java
│   ├── PatientDTO.java
│   └── JwtResponse.java
│
├── config/
│   ├── SecurityConfig.java
│   ├── JwtAuthFilter.java
│   └── OpenApiConfig.java
│
├── exception/
│   ├── GlobalExceptionHandler.java
│   └── ResourceNotFoundException.java
│
├── util/
│   └── JwtUtil.java
│
└── resources/
    ├── application.yml
    └── static/
        └── index.html (Frontend UI)
```
## 🔐 JWT Authentication Flow

1. User registers via /api/auth/register
2. User logs in via /api/auth/login
3. JWT token generated
4. Token passed in headers:
``Authorization: Bearer <token>``
5. JwtAuthFilter validates token
6. Spring Security authorizes request

### ***How to Run the Project***
 #### Start PostgreSQL
``docker run -d -p 5432:5432 --name hams-db postgres:16``

 #### Run Backend
``mvn spring-boot:run``

📖 Swagger API Documentation

Open in browser:

``http://localhost:8080/swagger-ui/index.html``
- Use Authorize button to paste JWT token.

---

## 🗄 Database Configuration

| Property        | Value                          |
|-----------------|--------------------------------|
| Database        | PostgreSQL                     |
| Port            | 5432                           |
| Database Name   | hamsdb                         |
| ORM             | Spring Data JPA                |
| Connection Pool | HikariCP                       |
| DDL Mode        | update                         |

---

## 📸 Screenshots

> Add the following screenshots inside a `/screenshots` folder in your repo.

- IntelliJ Project Structure  
- Swagger UI Dashboard  
- Postman API Testing  
- Frontend Home Page  
- Email Received Screenshot  

Example:

1.
  <img width="300" height="500" alt="Screenshot 2026-01-22 at 17 25 53" src="https://github.com/user-attachments/assets/9fea41b2-8749-4f0e-8e08-396a065ae7bc" />

  <img width="300" height="500" alt="Screenshot 2026-01-22 at 17 26 27" src="https://github.com/user-attachments/assets/05ad9192-357c-4de1-80dd-ca56653b468d" />

2.

<img width="1470" height="812" alt="Screenshot 2026-01-22 at 17 27 11" src="https://github.com/user-attachments/assets/1f490a7b-b453-49df-9fd4-b77ea761d8ef" />

3.

<img width="486" height="812" alt="Screenshot 2026-01-22 at 17 27 46" src="https://github.com/user-attachments/assets/7f7ad915-c034-4ff4-93f7-64840e645a61" />

4.

 <img width="1470" height="773" alt="Screenshot 2026-01-22 at 17 28 11" src="https://github.com/user-attachments/assets/cd83319b-7fd2-41d7-a8b4-8e12c4f865a1" />

5.

<img width="1600" height="826" alt="image" src="https://github.com/user-attachments/assets/7648d7a5-33fb-40ed-9a8d-fdd6cc85f6a4" />








---

## 🎥 Live Demo

### 🔧 Backend Demo

#### 1️⃣ Folder Structure & Code Walkthrough
Video shows:
- controller/
- service/
- repository/
- model/
- dto/
- config/
- exception/
- util/

Explains how request flows:
Controller → Service → Repository → Database


https://github.com/user-attachments/assets/15a08e8b-90d2-44c8-aad3-490f470d59db


---

#### 2️⃣ Swagger API Demonstration
Video shows:
- Opening Swagger UI
- Authorize with JWT token
- Testing protected APIs
- Viewing request/response models


https://github.com/user-attachments/assets/bbc02e2a-97bc-4875-b329-cbf80884081c


---

#### 3️⃣ Postman API Testing
Video shows:
- Register user
- Login and copy token
- Create doctor
- Create patient
- Book appointment
- Fetch analytics


https://github.com/user-attachments/assets/4e788210-5883-42fa-8cc6-a4bdc213d67a


---

### 🎨 Frontend Demo (Bonus)

Video shows:
- Landing page
- Fetching patients from backend
- Display cards with hover effects
- Real-time data from APIs
- UI connected to backend



https://github.com/user-attachments/assets/ebc9be53-a9bd-4a9c-8fb5-7a38ecc8065b



---

## 🙌 Thank You

This project was built as a **real-world backend system**, following:

- Clean architecture
- Secure design
- Industry-level practices
- End-to-end integration

---

## 🚀 Future Enhancements

- Docker Compose for full setup  
- Role-based UI dashboards  
- Payment gateway integration  
- Kafka-based event notifications  
- Cloud deployment (AWS / Render)  
- Admin analytics dashboard  
