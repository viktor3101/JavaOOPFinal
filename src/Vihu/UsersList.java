package Vihu;

import java.util.ArrayList;
import java.util.Arrays;

import static Vihu.UserConsoleReader.*;


public class UsersList {
	private final ArrayList<User> users = new ArrayList<>();
	private static long id = 1L;

	public void addUser() {
		users.add(readUser(id));
		id++;
	}

	public void addUser(String uName, String pass) {
		System.out.println("ADDING USER");
		users.add(new User(id, uName, pass));
		id++;
	}

	public User getUser(int i) {
		return users.get(i);
	}

	public User getUser(String username) {
		int i = 0;
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				i = (int) user.getId() - 1;
			}
		}
		return users.get(i);
	}

	public void deleteUser() {
		long tempId = userId();
		User tempUser = null;
		while (tempUser == null) {
			for (User user : users) {
				if (tempId == user.getId()) {
					tempUser = user;
					break;
				}
			}
			if (tempUser == null) {
				tempId = userId();
			}
		}
		String pass = password();
		if (pass.equals(tempUser.getPassword())) {
			System.out.println("your account will be deleted:)");
			users.remove(tempUser);
		}
	}

	public User loginUser() {
		System.out.println("LOGIN");
		User tempUser = null;
		while (tempUser == null) {
			String tempUN = username();
			String tempPass = password();
			for (User user : users) {
				if (user.getUsername().equals(tempUN) && user.getPassword().equals(tempPass)) {
					tempUser = user;
				}
			}
		}
		return tempUser;
	}

	public String showUser() {
		String[] usersArray = new String[users.size()];
		int i = 0;
		for (User user : users) {
			usersArray[i] = user.getUsername();
			i++;
		}
		return Arrays.toString(usersArray);
	}

	public String logoutUser() {
		return "you have logged out";
	}
}
