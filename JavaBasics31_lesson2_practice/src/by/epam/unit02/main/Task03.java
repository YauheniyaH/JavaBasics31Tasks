package by.epam.unit02.main;



public class Task03 {

	public static void main(String[] args) {
	
		int T;
		int h,m,s;
		
		
		T= 331176;
		h=0;
		m=0;
		s=0;
		
		h=T/3600;
		System.out.println(h);
		
		m=(T-h*3600)/60;
		
		System.out.println(m);
		
		s=T-h*3600-m*60;
		
		System.out.println(s);
		
		System.out.println(h+"ч "+m+"мин "+s+"c");
		

	}

}
