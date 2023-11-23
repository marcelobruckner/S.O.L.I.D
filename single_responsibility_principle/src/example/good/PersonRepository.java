package example.good;

import java.util.List;

import example.bad.Person;

public class PersonRepository {

	public Person savePerson(Person person) {
		return new Person();
	}

	public Person editPerson(Person person) {
		return new Person();
	}

	public void deletePerson(Long idPerson) {

	}

	public List<Person> list() {
		return null;
	}

}
