public class Diamond {
	public static void main(String [] args){
		int i = 1 ;
		int space = 3;
		int odd = 1;
		while (i<=7){
			i++;
			int x = space ;
			while (x>=1){
				System.out.print(" ");
				x--;
			}
			int x1=1;
			while (x1<=odd){
				System.out.print("*");
				x1++;
				}
			System.out.println();
			if (i<4){
			    odd= odd + 2;
			    space = space-1;
			}
			else{
				odd=odd-2;
				space = space+1;
			}
		}
		
		
	}

}