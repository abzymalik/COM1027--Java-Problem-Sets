package ProblemSet_7b;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int urn;
	private List<Module> moduleList;

	public Student(String name, String urn) {
		super();
		if (name.matches("[A-Z][a-z]+ [A-Z][a-z]+")) {
			this.name = name;
		} else {
			this.name = "Invalid Name";
		}
		if (urn.matches("\\d{5}")) {
			this.urn = Integer.parseInt(urn);
		} else {
			this.urn = 00000;
		}
		this.moduleList = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public int getUrn() {
		return urn;
	}

	public void addModuleList(Module m) {
		if (m != null && !moduleList.contains(m)) {
			moduleList.add(m);
		}
	}

	public String printModules() {
		StringBuilder display = new StringBuilder();
		for (int i = 0; i < moduleList.size(); i++) {
			display.append(moduleList.get(i).getName());
			if (i < moduleList.size() - 1) {
				display.append(", ");
			}
		}
		return display.toString();
	}
}
