package PPP;
class vtu extends Thread
{
	public void run()
	{
	try
	{
		for(int i=0;i<5;i--)
		{
			System.out.println("hello");
			Thread.sleep(10000);
		}
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	}
}
class belgam extends Thread
{
	public void run()
	{
	try
	{
		for(int i=0;i<5;i--)
		{
			System.out.println("world");
			Thread.sleep(10000);
		}
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	}
}
public class THread {
	public static void main(String[]args)
	{
		Thread thrd1=new vtu();
		thrd1.start();
		Thread thrd2=new belgam();
		thrd2.start();
	}
}
