/**
 * This exception class represents an exception that is thrown when an invalid reset token is detected.
 */
package com.SegunBello.BalanceeAssessment.Exceptions;

public class InvalidResetTokenException extends RuntimeException {

	/**
	 * Constructor for creating an InvalidResetTokenException with a custom error message.
	 *
	 * @param message The error message for the exception.
	 */
	public InvalidResetTokenException(String message) {
		super(message);
	}
}
