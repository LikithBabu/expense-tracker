package com.likithbabugarlapati.expense_tracker.Repository;

import com.likithbabugarlapati.expense_tracker.Model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense,Long>
{

    List<Expense> findByCategory(String category);

    List<Expense> findByDate(LocalDate date);

    List<Expense> findByDateAndCategory(LocalDate date, String category);

    @Query("SELECT e FROM Expense e WHERE MONTH(e.date) = :month AND YEAR(e.date) = :year")
    List<Expense> getByMonthAndYear(@Param("month") int month, @Param("year") int year);

    @Query("SELECT SUM(e.amount) FROM Expense e")
    Double getTotalAmount();

    List<Expense> findByDateBetween(LocalDate start, LocalDate end);

    List<Expense> findByCategoryAndDateBetween(String category, LocalDate start, LocalDate end);
}
