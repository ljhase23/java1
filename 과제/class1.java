package p201109;
import java.util.Scanner;

public class class1 {

	Scanner sc= new Scanner(System.in);
	String [] x,s;
	int a,j;
	void input()
	{
		System.out.print("�Է��� ������ ����� �ּ��� : ");
		a=sc.nextInt();
		s=new String[a];
	}
	void kprocess()
	{
		for(int i=0; i<s.length; i++)
		{
			System.out.println("["+i+"]"+"������:");
			s[i]=sc.next();
		}
	}
	void kprint()
	{
		String[] x= { "����", "������ ����� �ߴ޵� �����Դϴ�",
				"�λ�", "�ؾ� ����� �ߴ޵� �����Դϴ�", 
				"��õ", "���� �ǰ� ����� �ߴ޵� �����Դϴ�",
				"����","�ٴ��� �����̸� ���������� �����Դϴ�",
				"�뱸","������ �������μ� ���� ���� �Ϻ� ���� �߾Ӻο� ������ ������ �̷��� �ִ� �����Դϴ�"};
		for(int i=0; i<s.length; i++)
		{
			for(j=0; j<x.length; j+=2)
			{
				if(s[i].equals(x[j]))
				{
					System.out.println("["+s[i]+"]�� "+x[j+1]+"�Դϴ�");
				}
			}
		}
		System.out.println("�̻� ["+a+"]�� �����Դϴ�.");
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		class1 k=new class1();
		k.input();
		k.kprocess();
		k.kprint();

	}

 

}