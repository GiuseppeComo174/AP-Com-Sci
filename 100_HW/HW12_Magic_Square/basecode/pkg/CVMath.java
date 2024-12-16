package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static void findSpecialSquare(int n){
		int a = 0;
		int b = 1;
		int c;
		double d;
		while(a < n){
			c = b * (b+1) / 2;
			d = Math.sqrt(c);
			if(d == (int) d){
				System.out.println(c);
				a++;
			}
			b++;
		}
	}
}
