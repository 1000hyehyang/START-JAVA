
public class Ex09_05 {

	public static void main(String[] args) {
		int aa[] = {10, 20, 30, 40, 50};
		int count, size;
		
		count = aa.length;
		size = count*Integer.BYTES;
		
		System.out.printf("�迭 aa[]�� ����� ������ %d�� �Դϴ�\n", count);
		System.out.printf("�迭 ����[]�� ����� ��ü ũ��� %d����Ʈ �Դϴ�.\n",size);

	}

}