package org.home.mazi.functionalprogramming.chapter2;

import org.home.mazi.functionalprogramming.NoArgFunction;

public class Chapter2Video4 {

	public static void main(String[] args) {
		final Boolean IS_DEVELOPMENT = true;

		DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);

		System.out.println(dataLoader.loadPerson.apply());
	}

	protected static class Person {
		private String name;
		private Integer age;

		public Person(String name, Integer age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}
	}

	protected static class DataLoader {

		public final NoArgFunction<Person> loadPerson;

		public DataLoader(Boolean isDevelopment) {
			loadPerson = isDevelopment
					? this::loadFake
					: this::loadReal;
		}

		private Person loadReal() {
			System.out.println("Loading Person...");

			return new Person("Real Person", 30);
		}

		private Person loadFake() {
			System.out.println("Loading fake Person...");
			return new Person("Fake Person", 18);
		}
	}
}
