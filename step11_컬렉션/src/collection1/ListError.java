package collection1;

import java.util.ArrayList;
import java.util.List;

public class ListError {
	@SuppressWarnings(value = "unchecked")
	public static void main(String[] args) {
		
			List<Object> list = new ArrayList<>();
			
			list.add("°ñ¸ñ±æ");
			list.add("±íÀº »ê¼Ó");
			list.add("¿Ë´Þ»ù");
			list.add(new Integer(4));
			list.add("´©°¡¿Í¼­ ¸Ô³ª¿ä");
			list.add(5.0f);
			list.add(4.0);
			
			for (int i = 0 ; i < list.size(); i++) {
				Object season = list.get(i);
				System.out.println(season);
			}
	}

}
