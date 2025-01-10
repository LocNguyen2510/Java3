package model;

public class User2 {
	private String username;
	private String password;
	private String hovaten;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHovaten() {
		return hovaten;
	}

	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}

	public User2() {
		super();
	}

	public User2(String username, String password, String hovaten) {
		super();
		this.username = username;
		this.password = password;
		this.hovaten = hovaten;
	}

	@Override
	public String toString() {
		return "User2 [username=" + username + ", password=" + password + ", hovaten=" + hovaten + "]";
	}

}
