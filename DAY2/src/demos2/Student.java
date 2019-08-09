package demos2;

public class Student {
	private int studentid;
	private int marks;
	private String name;
public Student()
{
	studentid=0;
	marks=50;
	name= "na";
}
public Student(int studentid, String name) {
	this();
	this.studentid = studentid;
	this.name = name;
}
public Student(int studentid, int marks) {
	this();
	this.studentid = studentid;
	this.marks = marks;
}
public Student(int studentid, int marks, String name) {
	//this();
	this.studentid = studentid;
	this.marks = marks;
	this.name = name;
}

public static void main(String[] args) {
	Student s = new Student(100,"isha");
	System.out.println(s.studentid);
	System.out.println(s.marks);
	System.out.println(s.name);
}
}
