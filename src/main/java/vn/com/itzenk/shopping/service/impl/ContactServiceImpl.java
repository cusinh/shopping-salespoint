package vn.com.itzenk.shopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.itzenk.shopping.entity.ContactEntity;
import vn.com.itzenk.shopping.repository.ContactRepository;
import vn.com.itzenk.shopping.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	ContactRepository contactRepository;
	
	@Override
	public ContactEntity createNewContact(ContactEntity contactEntity) {
		return contactRepository.save(contactEntity);
	}
	
}
