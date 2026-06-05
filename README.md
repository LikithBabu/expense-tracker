# 💰 Expense Tracker API

A Spring Boot REST API for managing personal expenses — built to practice and solidify core backend concepts.

## 📌 About This Project
This is a **learning project** built to practice:
- REST API design with Spring Boot
- Spring Data JPA & MySQL integration
- CRUD operations
- Custom query methods & JPQL

## 🛠️ Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok

## 📡 API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/expenses` | Get all expenses |
| POST | `/api/expenses` | Add new expense |
| GET | `/api/expenses/{id}` | Get by ID |
| PUT | `/api/expenses/{id}` | Update expense |
| PATCH | `/api/expenses/{id}` | Partial update |
| DELETE | `/api/expenses/{id}` | Delete expense |
| GET | `/api/expenses/category?category=Food` | Filter by category |
| GET | `/api/expenses/date?date=2024-01-01` | Filter by date |
| GET | `/api/expenses/date-range?start=&end=` | Filter by date range |
| GET | `/api/expenses/month?month=1&year=2024` | Filter by month |
| GET | `/api/expenses/total` | Get total amount |

## 🔮 Planned Improvements
- [ ] JWT Authentication & Security
- [ ] Global Exception Handling & Input Validation
- [ ] Pagination & Sorting
- [ ] Swagger API Documentation
- [ ] DTO Layer

## 🙋 Author
**Likith Babu Garlapati**  
[GitHub](https://github.com/LikithBabu)
