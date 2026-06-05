package com.likithbabugarlapati.expense_tracker.Service;

import com.likithbabugarlapati.expense_tracker.Model.Expense;
import com.likithbabugarlapati.expense_tracker.Repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class ExpenseService
{
    @Autowired
    private ExpenseRepository expenseRepository;


    public Expense addExpense(Expense expense)
    {
      return expenseRepository.save(expense);
    }

    public List<Expense> getExpenses()
    {
        return expenseRepository.findAll();
    }

    public Expense getById(long id)
    {
        return expenseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Expense not found with id: " + id));
    }

    public List<Expense> GetByCategory(String category)
    {
        return expenseRepository.findByCategory(category);
    }

    public List<Expense> getByDate(LocalDate date)
    {
        return expenseRepository.findByDate(date);
    }

    public List<Expense> getByDateAndCategory(LocalDate date, String category)
    {
        return expenseRepository.findByDateAndCategory(date,category);
    }

    public List<Expense> getByDateRange(LocalDate start, LocalDate end)
    {
        return expenseRepository.findByDateBetween(start,end);
    }

    public List<Expense> getByCategoryAndDateRange(String category, LocalDate start, LocalDate end)
    {
        return expenseRepository.findByCategoryAndDateBetween(category,start,end);
    }

    public List<Expense> getByMonthAndYear(int month, int year)
    {
        return expenseRepository.getByMonthAndYear(month,year);
    }

    public Double getTotalAmount()
    {
        return expenseRepository.getTotalAmount();
    }

    public Expense updateExpense(long id, Expense expense)
    {
        expense.setId(id);
        return expenseRepository.save(expense);
    }

    public void deleteById(long id)
    {
        expenseRepository.deleteById(id);
    }

    public Expense partialUpdate(Long id, Expense updatedExpense) {
        Expense expense = expenseRepository.findById(id)
                                            .orElseThrow(() -> new RuntimeException("Expense not found with id: " + id));


        if (updatedExpense.getTitle() != null) {
            expense.setTitle(updatedExpense.getTitle());
        }
        if (updatedExpense.getAmount() != null) {
            expense.setAmount(updatedExpense.getAmount());
        }
        if (updatedExpense.getCategory() != null) {
            expense.setCategory(updatedExpense.getCategory());
        }
        if (updatedExpense.getDate() != null) {
            expense.setDate(updatedExpense.getDate());
        }
        if (updatedExpense.getDescription() != null) {
            expense.setDescription(updatedExpense.getDescription());
        }

        return expenseRepository.save(expense);
    }



}
