package pyramid;

import java.util.Scanner;

public class test_pyramid
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("피라미드 층수 입력 : ");
		int receive = sc.nextInt();

		for (int i = 0; i < receive; i++) {
			for (int k = i; k < receive - 1; k++) {
				System.out.print("-");
			}

			for (int m = 0, n = i + i + 1; m < n; m++) {
				System.out.print("*");
			}
			System.out.println("   줄바꿈");
		}

		sc.close();
	}
}
