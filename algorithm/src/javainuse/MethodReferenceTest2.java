package javainuse;

import java.util.ArrayList;
import java.util.stream.Collectors;

import javainuse.Employee;
import javainuse.Person;

public class MethodReferenceTest2 {
	public static void main(String args[]) {

		MethodReferenceTest2 methodReferenceTest = new MethodReferenceTest2();

		ArrayList<Person> personList = new ArrayList();
		personList.add(new Person("person1"));
		personList.add(new Person("person2"));
		personList.add(new Person("person3"));
		personList.add(new Person("person4"));

		methodReferenceTest.convertToEmployee(personList);
	}

	private void convertToEmployee(ArrayList<Person> personList) {

		System.out.println("-------Using Lambda Functions--------");

		// Using Lambda function to call recruit method
		personList.stream().map(person -> this.recruit(person)).collect(Collectors.toList())
				.forEach(s -> System.out.println(s));

		System.out.println("-------Using Method Reference--------");

		// Using method reference to call recruit method
		personList.stream().map(this::recruit).collect(Collectors.toList()).forEach(System.out::println);

	}

	private Employee recruit(Person person) {
		Employee emp = new Employee(person.getName());
		return emp;
	}

}