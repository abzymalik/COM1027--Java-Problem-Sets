package ProblemSet_7c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StudentTracker {
	private List<Student> studentList;
	private Map<Integer, Student> moduleList;

	public StudentTracker() {
		super();
		this.studentList = new ArrayList<>();
		this.moduleList = new HashMap<>();
	}
	/**
	 * Adds all the modules to the Student object and then adds the Student
	 * object to the list of the Students.
	 * @param s
	 * @param mList
	 */

	public void addStudent(Student s, List<Module> mList) {
		for (Module module : mList) {
			s.addModuleList(module);
		}
		this.studentList.add(s);
	}

	private void initialiseMap() {
	    for (Student student : this.studentList) {
	        int urn = student.getUrn();
	        moduleList.put(urn, student);
	    }
	}

	public String printStudents() {
	    StringBuilder students = new StringBuilder();
	    for (Student s : studentList) {
	        students.append(s.getName())
	                .append("(")
	                .append(s.getUrn())
	                .append(")")
	                .append("\n");
	    }
	    return students.toString();
	}

	public String printModules(int urn) {
		if (moduleList.isEmpty()) {
            initialiseMap();
        }

		if (moduleList.containsKey(urn)) {
			Student student = moduleList.get(urn);
			return "URN " + urn + " is enrolled in:\n"
					+ student.printModules();
		} else {
			return "URN " + urn + " not found.";
		}
	}
}
