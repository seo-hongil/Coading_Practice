package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Step1 {
	/* 문제 1번
	 * 학생 정보들을 저장하고, 학생이름으로 검색했을 때 학번을 출력하는 프로그램 작성
	 * 
	 * - Student 클래스 생성
	 * - String name,no를 가짐(이름, 학번)
	 * 
	 * - 학생들을 ArrayList에 저장한 이후,
	 *   계속 검색을 하겠느냐 y(반복)
	 *   종료하고 싶으면 n(종료)
	 *   
	 * - 학생 이름이 있는 경우 그 학생의 학번을 출력
	 *   학생 이름이 없으면, 없는 학생이름이라고 출력
	 *   
	 *   while, flag, ArrayList, foreach
	 * */
	
	
	
	
	public static void main(String[] args) {
		
		Student st1 = new Student("홍길동", "1234");
		Student st2 = new Student("길동홍", "4567");
		Student st3 = new Student("사오정", "7890");
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3); // ArrayList에 학생 정보를 저장
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속 검색을 하고 싶으면 y, 종료하고 싶으면 n");
			String input = scan.next();
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = scan.next();
				
				boolean flag = false;
				
				for(Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("학생 학번은 : "+stu.getNo());
						flag=true;
					}
				}
				if(!flag) {
					System.out.println("해당하는 학생이름이 없습니다.");
				}
			}else if(input.equals("n")){
				System.out.println("종료합니다");
				break;
			}
		}
	}
}
