/**
 * This exception class represents an exception that is thrown when a duplicate todo is detected.
 */
package com.SegunBello.BalanceeAssessment.Exceptions;

public class DuplicateTodoException extends RuntimeException {

	/**
	 * Constructor for creating a DuplicateTodoException with a custom error message.
	 *
	 * @param message The error message for the exception.
	 */
	public DuplicateTodoException(String message) {
		super(message);
	}
}
