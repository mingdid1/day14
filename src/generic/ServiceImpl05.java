package generic;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImpl05 implements Service05{
	private ArrayList<DTO05> member;
	
	public ServiceImpl05() { member = new ArrayList<>(); }
	
	public int register(String n, String a) {
		DTO05 dto = new DTO05();
		
		dto.setName(n);	dto.setAddr(a);
		member.add(dto);
		/*
		 	if문을 통해서 저장이 잘 되면 1을 돌려주고
		 	실패하면 0으로 돌려준다
		 */
		return 1;
	}
	
	
	public void display() {
		
		System.out.println("== 회원관리 ==");
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("1.회원 저장");
			System.out.println("2.모든 회원 보기");
			System.out.println("3.main 이동");
			num = sc.nextInt();
			
			String name = null, addr = null;
			int result;
			
			switch(num) {
			case 1:
				System.out.println("이름 입력");
				name = sc.next();
				System.out.println("주소 입력");
				addr = sc.next();
				
				result = register(name, addr);
				if(result == 1) {
					System.out.println("저장되었습니다");
				}else {
					System.out.println("문제가 발생했습니다");
				}
				break;
			case 2:
				memberView();
				break;
			case 3:
				return;
			}
		}
	}

	@Override
	public void memberView() {
		System.out.println("====================");
		System.out.println("이름\t주소");
		System.out.println("====================");

		for (int i =0; i<member.size(); i++) {
			DTO05 dto = member.get(i);
			System.out.println(dto.getName() + "\t" + dto.getAddr());
			System.out.println("----------------------");
		}
		
		System.out.println("=== for each ===");
		for (DTO05 d : member) {
			System.out.println(d.getName() + "\t" + d.getAddr());
			System.out.println("----------------------");
		}
	}

}
