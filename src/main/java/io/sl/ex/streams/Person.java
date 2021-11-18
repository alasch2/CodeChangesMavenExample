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
		i += 223;
	}
	
	@FunctionalInterface
	static interface MakeOlder {
		int run(Person p);
	}

	@Override
	public String toString() {
		return "Person (id=" + id +
				", name=" + name + ", age =" + age +
				", children" + children + ")";
	}

}
