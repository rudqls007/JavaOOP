package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		Student stu1 = new Student("갱얼쥐", "1234");
		Student stu2 = new Student("고앵스", "1235");
		Student stu3 = new Student("푸바오", "1236");

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("계속 검색을 하고 싶으시면 y, 종료하고 싶으시면 n");
			String input = scan.next();

			if (input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = scan.next();
				boolean flag = false;

				for (Student stu : list) {
					if (stu.getName().equals(name)) {
						System.out.println("해당 학생의 학번은 : " + stu.getNo());
						flag = true;
					}

				}

				if (!flag) {
					System.out.println("해당 학생이 없습니다.");
				}

			} else if (input.equals("n")) {
				break;
			}
		}

		System.out.println("검색을 종료합니다.");

	}

}
