package collection1;

import java.util.ArrayList;
import java.util.List;

public class ListError {
	@SuppressWarnings(value = "unchecked")
	public static void main(String[] args) {
		
			List<Object> list = new ArrayList<>();
			
			list.add("����");
			list.add("���� ���");
			list.add("�˴޻�");
			list.add(new Integer(4));
			list.add("�����ͼ� �Գ���");
			list.add(5.0f);
			list.add(4.0);
			
			for (int i = 0 ; i < list.size(); i++) {
				Object season = list.get(i);
				System.out.println(season);
			}
	}

}
