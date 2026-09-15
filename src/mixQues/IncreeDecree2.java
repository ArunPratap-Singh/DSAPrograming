package mixQues;

public class IncreeDecree2 {

	public static void main(String[] args) {
		
		//Solve and answer value of x, y, z and p:
			int x=12;
			
			int y=x++ + ++x;
			
			y++;
			
			x--;
			
			int z=++y;
			
			int p=x++ - ++y + z++;
			
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(p);


	}

}
