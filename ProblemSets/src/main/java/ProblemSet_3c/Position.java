package ProblemSet_3c;

public class Position {
	private String role;
	
	public Position(String role) {
		this.role = role;
	}
	public String getRoleName() {
		return role;
	}
	public void setRoleName(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return role;
	}
	
}
