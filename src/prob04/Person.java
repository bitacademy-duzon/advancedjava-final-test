package prob04;

public class Person {
	private static int numberOfPerson; // 전체 인구수
	private int age;
	private String name;

	public Person() {
		super();

		name = "";
		age = 12;
		numberOfPerson++;

	}

	public Person(String name) {

		this.name = name;
		age = 12;

		numberOfPerson++;

	}

	public Person(int age, String name) {

		this.age = age;
		this.name = name;
		numberOfPerson++;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void selfIntroduce() {

		System.out.printf("내 이름은 %s 이며 나이는 %d살 입니다.\n\n", name, age);
	}

	static int getPopulation() {
		return numberOfPerson;
	}
}
