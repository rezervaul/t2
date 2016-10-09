package task;

public class Student extends Human {

	private String group;
	private int GPA;

	public Student(int age, boolean sex, int GPA, String group) {
		super(age, sex);
		this.GPA = GPA;
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [group=" + group + ", GPA=" + GPA + ", sex=" + (getSex() ? "male" : "female") + ", age="
				+ getAge() + "]";
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getGPA() {
		return GPA;
	}

	public void setGPA(int gPA) {
		GPA = gPA;
	}

	public static void info(Student st) {
		System.out.println(st);
	}

}
