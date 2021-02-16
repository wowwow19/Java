package chap11;

import java.util.HashSet;

public class CollectionEx8 {
	public static void main(String[] args) {
		HashSet persons = new HashSet();
		persons.add("가나다라");
		persons.add("가나다라");
		persons.add("1");
		persons.add("2");
		persons.add(new Person("홍길동", 30));
		persons.add(new Person("홍길동", 30));
		
		System.out.println(persons);
		System.out.println(persons.size());
		
	}
}

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {	// generate constructor using field
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {	// generate toString
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public boolean equals(Object obj) {
		// 이름과 나이가 같으면 true
		return obj != null && obj instanceof Person && name.equals(((Person)obj).name) && age == ((Person)obj).age;
	}

	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	
}
