package io.sl.ex.streams;

import java.util.List;

import com.google.common.collect.ImmutableList;

import lombok.Data;

@Data
public class Person {

	private long id;
	private String name;
	private int age;
	private List<Person> children;

	public Person(long id, String name, int age, Person... children) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.children = ImmutableList.copyOf(children);
	}
	
	public void makeOlder(MakeOlder ager) {		age = ager.run(this);	}

	// something here
	private boolean callUnderToString = false;
// method documentation
	private void underToString() {
		int i=123880;
		i += 23;
	}
	
	@FunctionalInterface
	static interface MakeOlder {
		int run(Person p);
	}

	public void anotherMethod() {
		System.out.println("Let's check the hash-code");
	}

	@Override
	public String toString() {
		return "Person (id:" + id +
				", Name :" + name + "another text"
				+ ", age :" + age +
				", children:" + children + ")";
	}

}
