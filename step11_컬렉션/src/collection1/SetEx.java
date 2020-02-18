package collection1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set : �ߺ� ��� x, ���� ���� x
public class SetEx {
	@SuppressWarnings(value="unchecked") // type�� Ȯ������ ����, �ڷ��� �˻縦 ����
	public static void main(String[] args) {
		// Set<Integer> set = new HashSet<Integer>(); // <Integer> => integer �ڷ����� �ְ� �ʹ�, generic ǥ�� (�� ��� integer ���� ���� ������ ����)
		Set set = new HashSet();
		set.add("one"); //add(Object)
		set.add(2); 	//int-->new Integer(2) : �⺻�� -> ��ü��(Boxing)
		set.add(new Float(3.0f));
		set.add(4.00); //double -> new Double(4.00)
		set.add(2);
		set.add(new Integer(2));
		set.add(new Double(4.00));
//		set.add(Integer.valueOf(2));
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) // �����ܰ迡�� ������ �� �ִ� ���� �ִ°�
			System.out.println(iter.next());
	}

}

// summicro => ����Ŭ

// �� ���α׷� => ��ҹ��� ����
// *** Ŭ���� �ܾ� �ϳ� �ٲ� ������ �빮�� ��� ***
// instanceof(of �ҹ���)
// ������ ��ҵ鿡�� ������ ������ ����, �ߺ��� ������ �ʴ´�.

// Generic �����̳� => ���𰡸� ���� �� �ִ�.
// Set �ڷ��� => �ȿ� �ִ� �ڷ����� set�� �ƴϴ�, �ƹ��ų� ��� ���� ���� ���� �� �ִ�. 
// => [Integer][Double]

/* HashMap : Ű ���� �����͸� ����Ͽ� HashTable�� ���� ã��.

HaspMap<Ű�� Ÿ��, �������� Ÿ��> ��ü�� = new HaspMap<Ű�� Ÿ��, �������� Ÿ��>(�迭 ��);

Ÿ�� �Ķ���͸� ������Ƽ�� Ÿ������ ���ϸ� �ȵ� 

()�� 50�̳� 60���� �迭�� ũ�⸦ ���� ���� 

���ϵ�ī�� ���� ù��°�� "Ű�� Ÿ��" �ڴ� "������ Ÿ��"���� �޸�(,)�� �Ἥ �����Ѵ� 

��ó: https://soft91.tistory.com/16 [�ʿ� ���� ���α׷���]
/////////////////////////////////////////////////////////////////////////////////////////
HashSet : "�ߺ��ؼ� �������� �ʴ�" �������� ����� �� �ִ� Ŭ����.

HashSet<Ÿ�� �Ķ����> ��ü�� = new HashSet<Ÿ�� �Ķ����>();

HashSet ��ü���� "String" Ÿ���� ��ü�� ������ �� �ִ�.
�̹� �ִ� �����͸� �����ϸ� ���տ� ������ �Ͼ�� �ʴ´�.(�ߺ� ���� ����)


��ó: https://soft91.tistory.com/16 [�ʿ� ���� ���α׷���]

�� HashSet�� �����Ϳ� ������ ���� ������ �����͸� ������� �о���ų�, Ư�� ��ġ�� �����͸� �о�� �� �ִ� ����� ���� ������ 
"Iterator" �޼ҵ带 Ȱ���ؼ� ���տ� �ִ� "��ü" �����͸� �ҷ��� �� �ִ�.

��ó: https://soft91.tistory.com/16 [�ʿ� ���� ���α׷���]

*/



