package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		Student stu1 = new Student("������", "1234");
		Student stu2 = new Student("��޽�", "1235");
		Student stu3 = new Student("Ǫ�ٿ�", "1236");

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("��� �˻��� �ϰ� �����ø� y, �����ϰ� �����ø� n");
			String input = scan.next();

			if (input.equals("y")) {
				System.out.println("�˻��� �����մϴ�.");
				String name = scan.next();
				boolean flag = false;

				for (Student stu : list) {
					if (stu.getName().equals(name)) {
						System.out.println("�ش� �л��� �й��� : " + stu.getNo());
						flag = true;
					}

				}

				if (!flag) {
					System.out.println("�ش� �л��� �����ϴ�.");
				}

			} else if (input.equals("n")) {
				break;
			}
		}

		System.out.println("�˻��� �����մϴ�.");

	}

}
