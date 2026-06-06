# 💰 Expense Tracker API
A Spring Boot REST API for managing personal expenses — built to practice and solidify core backend concepts.

## 📌 About This Project
This is a **learning project** built to practice:
- REST API design with Spring Boot
- Spring Data JPA & MySQL integration
- CRUD operations with layered architecture (Controller → Service → Repository)
- Custom query methods & JPQL
- Input validation and global exception handling

## 🛠️ Tech Stack
- Java 25
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok
- Spring Validation

## 📡 API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/expenses` | Add new expense |
| GET | `/api/expenses` | Get all expenses |
| GET | `/api/expenses/{id}` | Get by ID |
| PUT | `/api/expenses/{id}` | Full update |
| PATCH | `/api/expenses/{id}` | Partial update |
| DELETE | `/api/expenses/{id}` | Delete expense |
| GET | `/api/expenses/category?category=Food` | Filter by category |
| GET | `/api/expenses/date?date=2026-06-05` | Filter by date |
| GET | `/api/expenses/date-range?start=&end=` | Filter by date range |
| GET | `/api/expenses/filter?category=Food&start=&end=` | Filter by category and date range |
| GET | `/api/expenses/month?month=6&year=2026` | Filter by month and year |
| GET | `/api/expenses/total` | Get total amount spent |

## ✅ Features
- Full CRUD operations
- Partial update support with PATCH
- Advanced filtering by category, date, date range and month
- Input validation with meaningful error messages
- Global exception handling with proper HTTP status codes

## 🔮 Planned Improvements
- [ ] JWT Authentication & Security
- [ ] Pagination & Sorting
- [ ] Swagger API Documentation
- [ ] DTO Layer

## 🙋 Author
**Likith Babu Garlapati**
[GitHub](https://github.com/LikithBabu)
