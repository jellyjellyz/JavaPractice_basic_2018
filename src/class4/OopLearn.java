package class4;

public class OopLearn {
	public static void main(String[] args) {
		Student s = new Student("Tom");
		s = changeStudent(s);
		System.out.print(s.name);
	}
	public static Student changeStudent(Student ss) {
		Student t = new Student("Jerry");
		ss = t;
		return ss;
	}

}
class Student {
	public String name;
	public Student(String name) {
		this.name = name;
	}
}

