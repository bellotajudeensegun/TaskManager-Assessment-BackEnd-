/**
 * This exception class represents an exception that is thrown when a duplicate email is detected.
 */
package com.SegunBello.BalanceeAssessment.Exceptions;

public class DuplicateEmailException extends RuntimeException {

	/**
	 * Constructor for creating a DuplicateEmailException with a custom error message.
	 *
	 * @param message The error message for the exception.
	 */
	public DuplicateEmailException(String message) {
		super(message);
	}
}
