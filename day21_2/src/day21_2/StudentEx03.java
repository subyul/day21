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
		System.out.println("�̸�: "+id+"  ��й�ȣ: "+pw);
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
		
		
		mg.name = "�л� ���� ���� �ý���";
		System.out.println("=========="+mg.name+"=========");
		
		while(run) {
			System.out.println("[1]���� [2]Ż�� [3]���� [4]��� [5]���� [6]���");
			System.out.print("��ȣ�� �������ּ���>>>");
			int select = sc.nextInt();
			System.out.println();
			
			if(select == 1) {
				
				System.out.print("[����] ID�� �Է����ּ���>>>");
				String ID_data = sc.next();
				
				System.out.print("[����] PW�� �Է����ּ���>>>");
				String PW_data = sc.next();
				
				Student temp = new Student();
				temp.id = ID_data;
				temp.pw = PW_data;
				count++;
				
				
				
			}
			else if(select == 2) {
				
				for(int i = 0; i<count;i++) {
					System.out.println("�̸� : "+mg.list[i].id+"��й�ȣ : "+mg.list[i].pw);
				}
				
				System.out.print("[Ż��]id�� �Է��ϼ���>>>");
				String del_ID = sc.next();
				}
			
			else if(select == 3) {
				System.out.println("��ȣ�� �������ּ���>>>");
				int num = sc.nextInt();
				
				
			}
			
			
		}
	}
}
