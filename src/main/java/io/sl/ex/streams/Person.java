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
		this.name = name;
		this.age = age;
		this.id = id;
		this.children = ImmutableList.copyOf(children);
		System.out.println("created");
	}

	@Override
	public String toString() {
		return "Person (id:" + id +
				", Name :" + name + "test text text"
				+ ", age :" + age +
				", children:" + children + ")";
	}

	public void makeOlder(MakeOlder ager) {
		age = ager.run(this);
	}

	public void methodAaaa() {
		int i=2;
		System.out.print(i+2);
	}

	// something here
	private boolean callUnderToString = true;
// method documentation
	private void underToString() {
		int i=123880;
		i += 23;
	}
	
	@FunctionalInterface
	static interface MakeOlder {
		int run(Person p);
	}

//	public void anotherMethod() {
//		System.out.println("Let's check the hash-code");
//	}

}
