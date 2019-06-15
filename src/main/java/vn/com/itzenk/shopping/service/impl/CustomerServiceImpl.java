package vn.com.itzenk.shopping.service.impl;

import org.salespointframework.useraccount.Role;
import org.salespointframework.useraccount.UserAccount;
import org.salespointframework.useraccount.UserAccountManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.itzenk.shopping.entity.CustomerEntity;
import vn.com.itzenk.shopping.repository.CustomerRepository;
import vn.com.itzenk.shopping.service.CustomerService;
import vn.com.itzenk.shopping.ultils.RegistrationForm;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	UserAccountManager userAccountManager;

	@Override
	public void createNewCusomer(RegistrationForm registrationForm) {
		UserAccount userAccount = userAccountManager.create(registrationForm.getName(), registrationForm.getPassword(),
				Role.of("ROLE_CUSTOMER"));
		userAccount.setEmail(registrationForm.getEmail());
		customerRepository
				.save(new CustomerEntity(registrationForm.getEmail(), registrationForm.getPhoneNumber(), userAccount));
	}

}
