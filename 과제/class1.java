package p201109;
import java.util.Scanner;

public class class1 {

	Scanner sc= new Scanner(System.in);
	String [] x,s;
	int a,j;
	void input()
	{
		System.out.print("입력할 개수를 등록해 주세요 : ");
		a=sc.nextInt();
		s=new String[a];
	}
	void kprocess()
	{
		for(int i=0; i<s.length; i++)
		{
			System.out.println("["+i+"]"+"지역명:");
			s[i]=sc.next();
		}
	}
	void kprint()
	{
		String[] x= { "서울", "교육과 상업이 발달된 도시입니다",
				"부산", "해양 산업이 발달된 도시입니다", 
				"춘천", "도시 건강 산업이 발달된 도시입니다",
				"강릉","바다의 도시이며 관광지역인 도시입니다",
				"대구","분지적 지형으로서 남부 산지 북부 산지 중앙부와 서남부 저지로 이뤄져 있는 도시입니다"};
		for(int i=0; i<s.length; i++)
		{
			for(j=0; j<x.length; j+=2)
			{
				if(s[i].equals(x[j]))
				{
					System.out.println("["+s[i]+"]은 "+x[j+1]+"입니다");
				}
			}
		}
		System.out.println("이상 ["+a+"]개 지역입니다.");
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		class1 k=new class1();
		k.input();
		k.kprocess();
		k.kprint();

	}

 

}