package com.java.abstraction;

public class MutipleInheritanceDemo2 {
	public static void main(String[] args) {
		Student s=new Student();
		s.schoolName();
		s.tutionName();
	}

}
interface School{
	void schoolName();
}
interface Tution{
	void tutionName();
}
class Student implements School,Tution{

	@Override
	public void tutionName() {
System.out.println("tutionname is xyz");		
	}

	@Override
	public void schoolName() {
System.out.println("schoolname is abc");		
	}
	
}