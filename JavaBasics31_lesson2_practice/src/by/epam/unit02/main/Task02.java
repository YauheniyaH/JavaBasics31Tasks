package by.epam.unit02.main;

public class Task02 {

	public static void main(String[] args) {
		//Перераспределить значения переменных х и у так,
		//чтобы в х оказалось большее из этих значений, а в y - меньшее.
		
		double x,y, temp;
		
		x= 16.55353452;
		y= 12.22345245;
		
		if(x>y) {
			System.out.println("x="+x+" y="+y);
		} else {
			temp=x;
			x=y;
			y=temp;
			System.out.println("x="+x+" y="+y);
		}
			

	}

}
