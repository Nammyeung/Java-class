package work3;

import java.util.ArrayList;
import java.util.List;

public class StudentView {

	public void viewStudent(Student st) {
		System.out.println(st.getName() + "\t" + st.getAge() + "\t" 
		 + st.getHeight() + "\t" + st.getWeight());
		}
		public void viewStudentList(List<Student> list) {
		for (Student i : list) { // foreach : 향상된 for문
			System.out.println(i.getName() + "\t" + i.getAge() + "\t" 
					 + i.getHeight() + "\t" + i.getWeight());				
		}
	}
}
	

