package day16042025;

final class ImmutablePerson {
	private final String name;
	private final int age;

	public ImmutablePerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		ImmutablePerson p = new ImmutablePerson("Rama", 28);
		System.out.println(p.getName() + " is " + p.getAge() + " years old.");
	}
}
