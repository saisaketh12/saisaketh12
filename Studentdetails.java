import java.util.*;
import java.util.Scanner;
public class StudentDetails {
     public static void main(String args[]) {
    	 ArrayList<String>name=new ArrayList<String>();
    	ArrayList<Integer>age=new ArrayList<Integer>();
    	ArrayList<Integer>rollnumber=new ArrayList<Integer>();
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("Enter Student details:");
    	 int num=0;
    	 while(num<3) {
    	 System.out.println("Enter student name:");
    	 String n=s.next();
    	 name.add(n);
    	 System.out.println("Enter student age:");
    	 int a=s.nextInt();
    	 age.add(a);
    	 System.out.println("Enter student rollnumber:");
    	 int rno=s.nextInt();
    	 rollnumber.add(rno);
    	 num+=1;
     }
    for(int i=0;i<3;i++) {
    	System.out.println("details of student "+(i+1)+" are:");
    	System.out.println("name:"+name.get(i));
    	System.out.println("age:"+age.get(i));
    	System.out.println("rollnumber:"+rollnumber.get(i));	
    }
    System.out.println("Enter the student name to search");
    String sr=s.next();
    if(name.contains(sr)) System.out.println("student is found");
    else System.out.println("student is not found"); 	
   }
}
