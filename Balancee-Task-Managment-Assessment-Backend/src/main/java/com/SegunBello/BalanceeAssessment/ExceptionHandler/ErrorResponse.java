/**
 * This class represents the response structure for handling error messages.
 */
package com.SegunBello.BalanceeAssessment.ExceptionHandler;

import java.util.Map;

public class ErrorResponse {

	private Map<String, String> errors;

	/**
	 * Constructor to create an ErrorResponse object.
	 *
	 * @param errors A map containing error details, typically field names and error messages.
	 */
	public ErrorResponse(Map<String, String> errors) {
		this.errors = errors;
	}

	/**
	 * Get the map of errors.
	 *
	 * @return A map containing error details.
	 */
	public Map<String, String> getErrors() {
		return errors;
	}

	/**
	 * Set the map of errors.
	 *
	 * @param errors A map containing error details to set.
	 */
	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
}
