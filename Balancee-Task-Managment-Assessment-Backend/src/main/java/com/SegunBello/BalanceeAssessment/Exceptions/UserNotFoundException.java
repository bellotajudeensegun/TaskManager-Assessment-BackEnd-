/**
 * This exception class represents an exception that is thrown when a user is not found.
 */
package com.SegunBello.BalanceeAssessment.Exceptions;

public class UserNotFoundException extends RuntimeException {

	/**
	 * Constructor for creating a UserNotFoundException with a custom error message.
	 *
	 * @param message The error message for the exception.
	 */
	public UserNotFoundException(String message) {
		super(message);
	}
}
