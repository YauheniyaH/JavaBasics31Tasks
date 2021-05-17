package by.epam.unit02.main;
import java.lang.Math;

public class Task04 {

	public static void main(String[] args) {
		double x1,y1;
		double x2,y2;
		x1=3;
		x2=-4;
		y1=-3;
		y2=-7;
	
		double len;
		
	
		
		len=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("расстояние между двумя точками ("+x1+", "+y1+") и ("+x2+", "+y2+") равно "+len);

	}

}
