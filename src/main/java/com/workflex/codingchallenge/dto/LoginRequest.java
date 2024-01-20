package com.workflex.codingchallenge.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class LoginRequest {

	@NotNull(message = "Email is required.")
	@Pattern(regexp = "^(?!.*@example\\.com$)([A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,})$", message = "example.com is not allowed.")
	@Email(message = "Email is not valid.")
	private String email;

	@NotBlank(message = "Passowrd is required.")
	@NotNull(message = "Passowrd is required.")
	private String password;
}
