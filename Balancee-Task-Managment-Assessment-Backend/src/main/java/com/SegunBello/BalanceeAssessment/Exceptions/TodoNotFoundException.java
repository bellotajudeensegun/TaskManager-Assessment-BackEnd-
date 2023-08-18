/**
 * This exception class represents an exception that is thrown when a todo is not found.
 */
package com.SegunBello.BalanceeAssessment.Exceptions;

public class TodoNotFoundException extends RuntimeException {

	/**
	 * Constructor for creating a TodoNotFoundException with a custom error message.
	 *
	 * @param message The error message for the exception.
	 */
	public TodoNotFoundException(String message) {
		super(message);
	}
}
