package Collections;
import java.util.Scanner;
public class Student  implements Branch,HOD {
	String sno,bcode,hodcode;
	String sname,bname,hodname;
	Scanner s=new Scanner(System.in);
	void getStudent() {
		System.out.println("enter student no. and name");
		sno=s.next();
		sname =s.next();
		
		getBranch();
		getHOD();
	}
	void showStudent() {
		System.out.println("Student no : "+sno);
		System.out.println("Student name : "+sname);
		showBranch();
		showHOD();
	}
	public void  getBranch() {
		System.out.println("enter branch code. and name");
		bcode=s.next();
		bname =s.next();
		
	}
	public void showBranch() {
		System.out.println("Branch code : "+bcode);
		System.out.println("Branch name : "+bname);
	}
	public void getHOD() {
		System.out.println("enter HOD code. and name");
		hodcode=s.next();
		hodname =s.next();
	}
	public void showHOD() {
		System.out.println("HOD code : "+hodcode);
		System.out.println("HOD name : "+hodname);
	}
	
}
