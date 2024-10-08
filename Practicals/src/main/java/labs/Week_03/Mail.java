package labs.Week_03;

public class Mail {
	private User sender = null;
	private User recipient = null;
	private String message = null;
	
	public User getSender() {
		return sender;
	}
	public void setSender(User sender) {
		this.sender = sender;
	}
	public User getRecipient() {
		return recipient;
	}
	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Mail(User sender, User recipient, String message) {
		this.sender = sender;
		this.recipient = recipient;
		this.message = message;
	}
	private void isEmpty() {
		if (this.getMessage() == null || this.getMessage() == "") {
			this.setMessage("** Something went wrong! **");
			
		}else {
			
		}
	}

		public void print() {
			System.out.println("From: " + getSender());
			System.out.println("To: " + getRecipient());
			
			//call isEmpty method
			this.isEmpty();
			
			//this line already exists
			System.out.println("Message: " + this.message);
		}
}

