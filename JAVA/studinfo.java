import java.util.Scanner;
class student
{
	String name;
	String usn;
	String branch;
	String phone;
	void getinfo()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name");
		name=in.next();
		System.out.println("Enter the usn");
		usn=in.next();
		System.out.println("Enter the branch");
		branch=in.next();
		System.out.println("Enter the phone");
		phone=in.next();
	}
	void display()
	{
		System.out.println(name+"\t"+usn+"\t"+branch+"\t"+phone);
	}
}
class P1a
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		student s[]=new student[10];
		System.out.println("Enter the number of students");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			s[i]=new student();
			s[i].getinfo();
		}
		System.out.println("Name "+"\t"+" usn"+"\t"+"Branch "+" phone");
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
	}
}
