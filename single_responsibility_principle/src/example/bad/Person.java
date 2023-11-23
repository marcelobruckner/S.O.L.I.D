package example.bad;

import java.util.ArrayList;
import java.util.List;

import example.bad.Person;

public class Person {
	
	public void generateReport() {
	}

	public void sendEmail() {

	}

	public Person savePerson(Person person) {
		return new Person();
	}

	public Person editPerson(Person person) {
		return new Person();
	}

	public void deletePerson(Long idPerson) {

	}

	public List<Person> list() {
		return new ArrayList<Person>();
	}
}
