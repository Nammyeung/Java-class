package work3;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student("민들레", 15, 170, 55);
		Student st2 = new Student("진달래", 22, 165, 53);
		Student st3 = new Student("개나리", 20, 155, 46);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		StudentView sv = new StudentView();
		System.out.println("이름\t나이\t신장\t몸무게");
		System.out.println("-----------------------------");
		sv.viewStudent(st1);
		System.out.println();
		sv.viewStudentList(list);
	}

}
