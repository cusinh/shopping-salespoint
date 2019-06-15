package vn.com.itzenk.shopping.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.salespointframework.useraccount.UserAccount;

@Entity
@Table(name = "customer")
public class CustomerEntity {
	private @Id @GeneratedValue long id;
	private String phoneNumber;
	private String emailAddress;
	private Date dateCreated;

	@OneToOne
	private UserAccount userAccount;

	public CustomerEntity() {
		super();
	}

	public CustomerEntity(String emailAddress, String phoneNumber, UserAccount userAccount) {
		super();
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.dateCreated = new Date();
		this.userAccount = userAccount;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

}
