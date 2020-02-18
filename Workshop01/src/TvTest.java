
class Tv {
		
		private String name;
		private int price;
		private String description;

		public void Tv(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
		}
		
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getPrice() {
			return price;
		}


		public void setPrice(int price) {
			this.price = price;
		}


		public String getDesciption() {
			return description;
		}


		public void setDesciption(String desciption) {
			this.description = description;
		}


		@Override
		public String toString() {
			return name + "\t" + price + "\t" + description + "\n";
		}
		
}

public class TvTest {	
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		String[][] num = new String[3][3];
		tv.Tv("INFINIA", 1500000, "LED TV");
		System.out.print(tv.toString());
		num[0][0] = tv.getName();
		num[0][1] = Integer.toString(tv.getPrice());
		num[0][2] =	tv.getDesciption();
		
		tv.Tv("XCANVAS", 1000000, "LCD TV");
		System.out.print(tv.toString());
		num[1][0] = tv.getName();
		num[1][1] = Integer.toString(tv.getPrice());
		num[1][2] =	tv.getDesciption();
		
		tv.Tv("CINEMA", 2000000, "LED TV");
		System.out.print(tv.toString());
		num[2][0] = tv.getName();
		num[2][1] = Integer.toString(tv.getPrice());
		num[2][2] =	tv.getDesciption();
		int max = Integer.parseInt(num[0][1]);
		String maxitem = "";
		int min = Integer.parseInt(num[0][1]);
		String minitem = "";
		for(int i = 0 ; i <= num.length-1 ; i++) {
			if(Integer.parseInt(num[i][1]) >= max) {
				max = Integer.parseInt(num[i][1]);
				maxitem = num[i][0];
			}
		}
		for(int j = 0 ; j <= num.length-1 ; j++) {
			if(Integer.parseInt(num[j][1]) <= min) {
				min = Integer.parseInt(num[j][1]);
				minitem = num[j][0];
			}
		}
		System.out.println("가격이 가장 비싼 제품: " + maxitem);
		System.out.println("가격이 가장 저렴한 제품: " + minitem);
		
	}
}

		
		/*int max = TvtvArray[0];
		int min = TvtvArray[0];
		for(int i ; i <= TvtvArray.length ; i++) {
			System.out.println(TvtvArray[i]);
			if(max <= TvtvArray[i]) {
			max = TvtvArray[i];
			}
			if(min >= TvtvArray[i]) {
			min = TvtvArray[i];
			}
		}
		System.out.println("가격이 가장 비싼 제품" + max);
		System.out.println("가격이 가장 저렴한 제품" + min);*/

	


