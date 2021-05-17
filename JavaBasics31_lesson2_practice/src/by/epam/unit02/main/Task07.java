package by.epam.unit02.main;

import java.lang.Math;


public class Task07 {

	public static void main(String[] args) {
		double a,b,c;
		a=2.3;
		b=0;
		c=-2;
		
		if (a>0) {
			a=Math.pow(a,3);
		}else {
			a=Math.pow(a,4);
		}
		
		if (b>0) {
			b=Math.pow(b,3);
		}else {
			b=Math.pow(b,4);
		}
		
		if (c>0) {
			c=Math.pow(c,3);
		}else {
			c=Math.pow(c,4);
		}

		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
	}

}
