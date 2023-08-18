/**
 * This class represents the controller for managing User operations.
 */
package com.SegunBello.BalanceeAssessment.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.SegunBello.BalanceeAssessment.Model.User;
import com.SegunBello.BalanceeAssessment.Service.UserService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * Endpoint for retrieving a User by their ID.
	 *
	 * @param id The ID of the user to retrieve.
	 * @return ResponseEntity with the fetched User if found, or 404 if not found.
	 */
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id) {
		User user = userService.getUserById(id);
		if (user != null) {
			return ResponseEntity.ok(user);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	/**
	 * Endpoint for user login.
	 *
	 * @param user  The User object containing email and password for login.
	 * @param model The Model object for adding attributes.
	 * @return ResponseEntity with the existing User if login is successful, or 404 if user not found.
	 */
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody User user, Model model) {
		User existingUser = userService.getUserByEmail(user.getEmail());
		if (existingUser != null) {
			userService.validateCredentials(user.getEmail(), user.getPassword());
			existingUser.setId(existingUser.getId());
			model.addAttribute("userEmail", existingUser.getEmail());
			return ResponseEntity.ok(existingUser);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	/**
	 * Endpoint for user signup.
	 *
	 * @param user  The User object containing details for signup.
	 * @param model The Model object for adding attributes.
	 * @return ResponseEntity with the created User if signup is successful.
	 */
	@PostMapping("/signup")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user, Model model) {
		User createdUser = userService.createUser(user);
		model.addAttribute("userEmail", user.getEmail());
		return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
	}

}
