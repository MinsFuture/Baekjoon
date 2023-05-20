import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int[] ary1 = new int[input];
		int[] ary2 = new int[input];
		
		for(int i =0; i<input; i++) {
			ary1[i] = scanner.nextInt();
			ary2[i] = scanner.nextInt();
		}
		
		for(int i = 0; i<input; i++) {
			System.out.println(ary1[i]+ary2[i]);
		}
		
		
	}

}
