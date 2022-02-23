package day21_2;
import java.util.List;
import java.util.Scanner;
class Student{
	String id = "";
	String pw = "";
	
	void set_data(String i, String p) {
		id = i;
		pw = p;
	}
	
	void print_data() {
		System.out.println("이름: "+id+"  비밀번호: "+pw);
	}
}
class Manager{
	Student[] list = null;
	String name = "";
	int count = 0;
	
	void add_id (String id, String pw) {
		if(count == 0) {
			list = new Student[1];
		}
		else {
			Student[] temp = list;
			list = new Student[count+1];
			
			for(int i = 0; i<count;i++) {
				list[i] = temp[i];
				temp = null;
			}
		}
	}
	void out_id (String id, String pw) {
		
	}
}


public class StudentEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager mg = new Manager();
		boolean run = true;
		int count = 0;
		
		
		mg.name = "학생 정보 관리 시스템";
		System.out.println("=========="+mg.name+"=========");
		
		while(run) {
			System.out.println("[1]가입 [2]탈퇴 [3]정렬 [4]출력 [5]저장 [6]노드");
			System.out.print("번호를 선택해주세요>>>");
			int select = sc.nextInt();
			System.out.println();
			
			if(select == 1) {
				
				System.out.print("[가입] ID를 입력해주세요>>>");
				String ID_data = sc.next();
				
				System.out.print("[가입] PW를 입력해주세요>>>");
				String PW_data = sc.next();
				
				Student temp = new Student();
				temp.id = ID_data;
				temp.pw = PW_data;
				count++;
				
				
				
			}
			else if(select == 2) {
				
				for(int i = 0; i<count;i++) {
					System.out.println("이름 : "+mg.list[i].id+"비밀번호 : "+mg.list[i].pw);
				}
				
				System.out.print("[탈퇴]id를 입력하세요>>>");
				String del_ID = sc.next();
				}
			
			else if(select == 3) {
				System.out.println("번호를 선택해주세요>>>");
				int num = sc.nextInt();
				
				
			}
			
			
		}
	}
}
