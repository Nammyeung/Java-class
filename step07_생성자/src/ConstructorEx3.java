package constructor;
//Ŭ������ : UserInfo
//-name : String
//-addr : String
//+UserInfo()
//+UserInfo(name:String, addr:String)\
//+getter
//---���
// **** �ּҷ� ****	<-- ����Ʈ �����ڿ��� ���
//�̸� : ���󿡸�	<-- main()���� getter�� �̿��ؼ� ���
//�ּ� : ����� ������	<-- main()���� getter�� �̿��ؼ� ���

class UserInfo {
	private String name; // 3
	private String addr; // 4
	
	public UserInfo() {
		System.out.println("**** �ּҷ� ****"); // 6
	
	}
	public UserInfo(String name, String addr) { // 2
		this(); // ������ ����, 5
		this.name = name; // main�Լ��� ���, 2
		this.addr = addr; // 2
	}
	// generate Constructor using field.
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}

public class ConstructorEx3 {
			
	public static void main(String[] args) {
		UserInfo ob = new UserInfo("���󿡸�","����� ������"); // 1
		System.out.println("�̸� : " + ob.getName()); // 7
		System.out.println("�ּ� : " + ob.getAddr()); // �����Լ� ���� x, 8

	}

}

/* public UserInfo() {
 * 	super(); // superŬ������ ȣ��(���) => �ǹ̰� ����? object class
 * public UserInfo(String name, String addr) {
 * 
 * 
 * 
 */

