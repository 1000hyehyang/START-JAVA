import java.util.Scanner;
public class Ex10_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ� �Է� ==> ");
		str = sc.nextLine();
		
		System.out.print("��� ���ڿ� ==> ");
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='o')
				System.out.printf("%c",'$');
			else
				System.out.printf("%c", str.charAt(i));
		}
	}

}