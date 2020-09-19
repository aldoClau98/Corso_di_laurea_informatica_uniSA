package Model;

public class Utenti {
	
	private String IDutenti;
	private String username;
	private String email;
	private String password;
	private boolean amm;
	public Utenti() {
		super();
		
	}
	public String getIDutenti() {
		return IDutenti;
	}
	public void setIDutenti(String iDutenti) {
		IDutenti = iDutenti;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Utenti [IDutenti=" + IDutenti + ", username=" + username + ", email=" + email + ", password=" + password
				+ "]";
	}
	public boolean isAmm() {
		return amm;
	}
	public void setAmm(boolean amm) {
		this.amm = amm;
	}
	
	

}
