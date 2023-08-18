/**
 * This exception class represents an exception that is thrown when an invalid todo is detected.
 */
package com.SegunBello.BalanceeAssessment.Exceptions;

public class InvalidTodoException extends RuntimeException {

	/**
	 * Constructor for creating an InvalidTodoException with a custom error message.
	 *
	 * @param message The error message for the exception.
	 */
	public InvalidTodoException(String message) {
		super(message);
	}
}
