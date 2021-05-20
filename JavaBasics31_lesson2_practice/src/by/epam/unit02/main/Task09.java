package by.epam.unit02.main;

import java.lang.Math;

public class Task09 {

	public static void main(String[] args) {
		
		double x, F;
		
		x=4;
		
		if(x<=-3) {
			F=9;
			System.out.println("F(x)="+F);
		}else {
			if(x>3) {
				F=1/(Math.pow(x,2)+1);
				System.out.println("F(x)="+F);
			}else {
				System.out.println("Функция F(x) при x="+x+" неопределена");
			}
				
		}
		

	}

}// Молодец
