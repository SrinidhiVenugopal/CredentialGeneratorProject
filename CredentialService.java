package com.credential.service;
import java.util.Random;
import com.credential.model.Employee;
public class CredentialService {
	private String generatePassword() {
		String code = "ABCDEFGHIJJKMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
		String pwd = "";
		Random r = new Random();
		for (int i = 1; i <= 8; i++) {
			pwd = pwd + code.charAt(r.nextInt(code.length()));
		}
		return pwd;
}

private String generateEmail(Employee E, String dept) {
	return E.getFirstName().toLowerCase() + E.getLastName().toLowerCase() + "@" + dept + ".gl.com";
}

public void showCredential(Employee E, String dept) {
	System.out.println("Dear " + E.getFirstName() + " your generated credentials are as follows");
	System.out.println("Email: " + generateEmail(E, dept));
	System.out.println("Password: " + generatePassword());
}
}
