package by.epam.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		double x,y;
		x=-2.5;
		y=2;
		boolean res;
		
		if(y<=0 & y>=-3) {
			if(x>=-4 & x<=4) {
				res=true;
			}else {
				res=false;
			}
		}else {
			if (y>=0 & y<=4) {
				if(x>=-2 & x<=2) {
					res=true;
				}else {
					res=false;
				}
			}else {
				res=false;
			}
		}
		
		System.out.println(res);
				
				
		

	}

}
