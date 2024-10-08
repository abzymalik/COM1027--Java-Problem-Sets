package labs.Week_03;

public class Email {
	private static final String DEFAULT_ADDRESS = "unknown@unknown";
	private String emailAddress = DEFAULT_ADDRESS;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public Email(String string) {
		this.emailAddress = string;
	}
}
