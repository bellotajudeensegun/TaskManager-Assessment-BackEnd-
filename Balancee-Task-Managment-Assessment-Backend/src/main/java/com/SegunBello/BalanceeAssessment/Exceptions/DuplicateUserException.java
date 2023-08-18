/**
 * This exception class represents an exception that is thrown when a duplicate user is detected.
 */
package com.SegunBello.BalanceeAssessment.Exceptions;

public class DuplicateUserException extends RuntimeException {

	/**
	 * Constructor for creating a DuplicateUserException with a custom error message.
	 *
	 * @param message The error message for the exception.
	 */
	public DuplicateUserException(String message) {
		super(message);
	}
}
