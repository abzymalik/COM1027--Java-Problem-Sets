package ProblemSet_4a;

public class Day{
	private String name;
	private Session[] sessions;
	
	public Day(String name) {
		this.name = name;
		this.sessions = new Session[4];
	}
	public String getName() {
		return name;
	}
	public void setSession(int index, String sessionName, int startTime, int endTime) {
		this.sessions[index] = new Session(sessionName, startTime, endTime);
	}
	public Session getSessions(int index) {
		return sessions[index];
	}
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Session session : sessions) {
			if (session != null) {
				result.append(session.toString()).append("\n");
			}
		}
		return result.toString();
	}
	public void display() {
		System.out.println("Day: " + name);
		System.out.println(this.toString());
	}
}