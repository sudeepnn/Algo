import java.util.Scanner;

public class LowerToUpper2 {
	private static Scanner sc;
	public static void main(String[] args) {
		String lowStr;
		int i;
		
		sc= new Scanner(System.in);

		System.out.print("\nPlease Enter Lowercase String =  ");
		lowStr = sc.nextLine();
		
		char[] ch = lowStr.toCharArray();
		
		for(i = 0; i < ch.length; i++)
		{
			if(ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) ((int)ch[i] - 32);;
			}
		}
		System.out.print("\nThe Uppercase String  =  ");
		for(i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
