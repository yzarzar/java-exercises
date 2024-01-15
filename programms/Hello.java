import java.util.Scanner;

class Hello{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number 25 : ");
		int input = scanner.nextInt();
		System.out.print("Enter number 5 : ");
		int input1 = scanner.nextInt();
		int num = input * input1;
		System.out.println("This is result : " + num);
	}
}