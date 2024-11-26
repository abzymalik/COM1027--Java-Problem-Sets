package ProblemSet_9a;

public class Service {
	private String code;
	private String name;
	private VATRate rate;
	
	public Service(String code, String name, VATRate rate) {
	    super();
	    if (code == null || name == null || rate == null) {
	        throw new NullPointerException();
	    }
	    if (!code.matches("[A-Z]{4}\\d{5}")) {
	        throw new IllegalArgumentException("Invalid code format.");
	    }
	    this.code = code;
	    this.name = name;
	    this.rate = rate;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public VATRate getRate() {
		return rate;
	}
}
