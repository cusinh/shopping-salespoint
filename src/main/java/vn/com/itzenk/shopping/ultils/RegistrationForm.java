package vn.com.itzenk.shopping.ultils;

import javax.validation.constraints.NotEmpty;

public interface RegistrationForm {
	@NotEmpty(message = "{RegistrationForm.name.NotEmpty}")
	String getName();

	@NotEmpty(message = "{RegistrationForm.password.NotEmpty}")
	String getPassword();

	@NotEmpty(message = "{RegistrationForm.email.NotEmpty}")
	String getEmail();

	@NotEmpty(message = "{RegistrationForm.phoneNumber.NotEmpty}")
	String getPhoneNumber();
}
