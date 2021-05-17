package by.epam.unit02.main;

public class Task06 {
	public static void main(String[] args) {
		double n,m;
		int res1;
		int minInt;
		int maxFrac;
		m=142;
		n=5;
		
		res1=(int)(m/n);
		minInt=(int)(res1%10);
		maxFrac=(int) (m/n*10)%10;
		
		System.out.println("M/N="+m/n);
		//System.out.println(res1);
		System.out.println("старшая цифра дробной части "+maxFrac);
		System.out.println("младшая цифра целой части "+minInt);
		
		
	}

}
