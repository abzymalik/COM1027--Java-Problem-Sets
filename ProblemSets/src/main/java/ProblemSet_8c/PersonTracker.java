package ProblemSet_8c;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class PersonTracker {
	private List<Person> peopleList;
	public PersonTracker() {
		super();
		this.peopleList = new ArrayList<Person>();
	}
	/**
	 * Adds a Person object to Person list.
	 *
	 * @param f
	 * @param s
	 * @param a
	 */

	public void addPerson(String f, String s, int a) {
		this.peopleList.add(new Person(f, s, a));
	}

	/**
	 * Reads the filename.
	 *
	 * @param file
	 * @return contents of the file
	 * @throws RunTimeException if file read fails
	 */

	public String readTextFile(String file) throws RuntimeException {
		StringBuilder toReturn = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader(file));
			String line = reader.readLine();

			while (line != null) {
				this.breakLine(line);
				toReturn.append(String.format("%s\n", line));
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
		return toReturn.toString();
	}

	/**
	 * Parses the line and constructs a Person object to add to the liust.
	 * @param line
	 */
	private void breakLine(String line) {
		String[] parts = line.split(" ");
		this.addPerson(parts[0], parts[1], Integer.parseInt(parts[2]));
	}

	/**
	 * Gets all the people present in the tracker
	 * and returns all the elements in the people list.
	 * 
	 * @return all elements in people list
	 */
	public String getPeopleList() {
		return this.peopleList.toString();
	}
	/**
	 * Returns the list of all people present in the tracker.
	 * @return all people on a new line
	 */

	public String displayList() {
		StringBuilder toReturn = new StringBuilder();
		for (Person person : this.peopleList) {
			toReturn.append(person.toString()).append("\n");
		}
		return toReturn.toString();
	}
}
