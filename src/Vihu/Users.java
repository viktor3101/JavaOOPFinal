package Vihu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Users implements Serializable {
	private final List<User> users = new ArrayList<User>();

	public void register(User user) {
		users.add(user);
	}

	public void deleteUser(User user) {
		User tempUser = null;
		int temp = 0;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUname().equals(user.getUname())) {
				tempUser = users.get(i);
				temp = i;
			}

		}
		if (tempUser.getPass().equals(user.getPass())) {
			UserIO.deleting(users.get(temp));
			users.remove(temp);
		}
	}

	public User getUser(String un) {
		int i = 0;
		for (User user : users) {
			if (un.equals(user.getUname())) {
				i = (int) user.getId() - 1;
			}
		}
		return users.get(i);
	}

	public User logIn() {
		UserIO.loginStart();
		User user = null;
		while (user==null) {
			String tempUn = UserIO.un();
			String tempPas = UserIO.pas();
			int temp = 0;
			while (user == null && temp < users.size()) {
				if (users.get(temp).getUname().equals(tempUn) && users.get(temp).getPass().equals(tempPas)) {
					user = users.get(temp);
					UserIO.logining(user);
				}
				temp++;
			}
		}
		return user;
	}

	public User logOut(User user) {
		UserIO.logingOut(user);
		return null;
	}
}
