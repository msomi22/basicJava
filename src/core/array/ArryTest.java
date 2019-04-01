package core.array;

public class ArryTest {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		String[][] test = new String[5][5]; //5X5 box - 2d
		String[][][] info = new String[5][5][5]; //5X5X5 box or cube - 3d 
		
		for(int x=0;x<numbers.length;x++){
			//System.out.print(" " + numbers[x]);  
		}
		
		test[1][1] = "10";
		
		int temp = 0;
		for(int x=0;x<test.length;x++){
			int y = 0;
			y = temp;
			for(;y<test.length;y++){
				//int product = x*y;
				int sum = x+y;
				test[x][y] = String.valueOf(sum); 
				temp = y;
				System.out.println("temp = " + temp + ", y = " + y);
			}
			
		}
		
		for(int x=0;x<test.length;x++){
			for(int yy=0;yy<test.length;yy++){
				System.out.println("x = " + x + ", y = " + yy + ", sum = " + test[x][yy]);
			}
			System.out.println("*******************************");
		}
		

	}

}
