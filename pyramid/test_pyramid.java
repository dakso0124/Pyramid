package pyramid;

import java.util.Scanner;

public class test_pyramid
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("�Ƕ�̵� ���� �Է� : ");
		int receive = sc.nextInt();

		for (int i = 0; i < receive; i++) {
			for (int k = i; k < receive - 1; k++) {
				System.out.print("-");
			}

			for (int m = 0, n = i + i + 1; m < n; m++) {
				System.out.print("*");
			}
			System.out.println("   �ٹٲ�");
		}

		sc.close();
	}
}
