package com.likithbabugarlapati.expense_tracker.Controller;

import com.likithbabugarlapati.expense_tracker.Model.Expense;
import com.likithbabugarlapati.expense_tracker.Service.ExpenseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController
{

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World";
    }

    @PostMapping
    public Expense addExpenses(@Valid  @RequestBody Expense expense)
    {
       return expenseService.addExpense(expense);
    }

    @GetMapping
    public List<Expense> getExpenses()
    {
        return expenseService.getExpenses();
    }

    @GetMapping("/{id}")
    public Expense getById(@PathVariable long id)
    {
       return expenseService.getById(id);
    }

    @GetMapping("/category")
    public List<Expense> findByCategory(@RequestParam String category)
    {
        return expenseService.GetByCategory(category);
    }

    @GetMapping("/date")
    public List<Expense> getByDate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date)
    {
        return expenseService.getByDate(date);
    }

    @GetMapping("/dateAndCat")
    public List<Expense> getByDateAndCategory(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date, @RequestParam String category)
    {
        return expenseService.getByDateAndCategory(date,category);
    }

    @GetMapping("/date-range")
    public List<Expense>  getByDateRange(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate start, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate end)
    {
       return expenseService.getByDateRange(start,end);
    }

    @GetMapping("/filter")
    public List<Expense> getByCategoryAndDateRange(@RequestParam String category, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate start, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate end)
    {
        return expenseService.getByCategoryAndDateRange(category,start,end);
    }

    @GetMapping("/month")
    public List<Expense> getByMonthAndYear(@RequestParam int month, @RequestParam int year)
    {
        return  expenseService.getByMonthAndYear(month,year);
    }

    @GetMapping("/total")
    public Double getTotalAmount()
    {
        return expenseService.getTotalAmount();
    }


    @PutMapping("/{id}")
    public Expense updateExpense(@PathVariable long id, @Valid @RequestBody Expense expense)
    {
        return expenseService.updateExpense(id,expense);
    }



    @PatchMapping("/{id}")
    public Expense partialUpdateExpense(@PathVariable long id, @RequestBody Expense expense)
    {
        return expenseService.partialUpdate(id,expense);
    }

    @DeleteMapping("/{id}")
    public List<Expense> deleteExpense(@PathVariable long id)
    {
        expenseService.deleteById(id);
        return expenseService.getExpenses();
    }





}
