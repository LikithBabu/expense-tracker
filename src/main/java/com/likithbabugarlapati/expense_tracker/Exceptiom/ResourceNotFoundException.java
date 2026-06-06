package com.likithbabugarlapati.expense_tracker.Exceptiom;

public class ResourceNotFoundException extends RuntimeException
{
    public ResourceNotFoundException(String message)
    {
        super(message);
    }
}
