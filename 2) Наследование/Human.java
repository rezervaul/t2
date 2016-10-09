package task;

public class Human implements HumanInfo {

	private int age;
	private boolean sex;
	private int height;
	private int weight;

	

	public Human(int age, boolean sex) {
		this.age = age;
		this.sex = sex;
	}

	public Human() {

	}

	@Override
	public String toString() {
		return "Human [age=" + age + ", sex=" + (sex ? "male" : "female") + ", height=" + height + ", weight=" + weight
				+ "]";
	}

	public int getAge() {
		return age;
	}

	public boolean getSex() {
		return sex;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
