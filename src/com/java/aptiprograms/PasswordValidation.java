package com.java.aptiprograms;

public class PasswordValidation {
	public static void main(String[] args) {
		String password = "123@Xworkz";
		int uppercase = 0;
		int lowercase = 0;
		int num = 0;
		int special = 0;
		if (password.length() >= 8 && password.length() <= 16) {
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) > 47 && password.charAt(i) < 58) {
					num++;
				}
				if (password.charAt(i) > 64 && password.charAt(i) < 91) {
					uppercase++;
				}
				if (password.charAt(i) > 96 && password.charAt(i) < 123) {
					lowercase++;
				}
				if ((password.charAt(i) > 32 && password.charAt(i) < 48)
						|| (password.charAt(i) > 57 && password.charAt(i) < 65
								|| (password.charAt(i) > 90 && password.charAt(i) < 97))) {
					special++;
				}

			}
			if (num > 0 && uppercase > 0 && lowercase > 0 && special > 0) {
				System.out.println("strong password");

			} else {
				System.out.println("weak password");
			}

		} else {

			System.out.println("weak password");
		}
	}

}
