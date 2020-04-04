import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		


	int a[][] = {{ 0, 1, 2}, {4, 7, 9}, {8, 5, 12}, {11, 10, 6}};
	drawBoard(a);
	
	moveTileaswd(a);


	}


	public static void drawBoard(int [][] a) {
		System.out.println("   1   2   3");
		System.out.println(" +---+---+---+");
		  for(int i = 0; i < a.length; i++) {



			  for(int j = 0; j < 3; j++) {


		    	if(a[i][j] > 9) {
		    	   System.out.print(" |"+a[i][j]);
		    	}
		    	else
		    		System.out.print(" | "+a[i][j]);




		    } 


		    System.out.print(" |");
		    System.out.println();

		    System.out.println(" +---+---+---+");



		  }
		  }
	
	
	
	//takes in the array
	//whatever tile that you want to move into the blank space (0 space), you click a,w,s, or d
	public static void moveTileaswd(int [][] a)
	{

		 char direction;
		 Scanner s = new Scanner(System.in);
		 int temp;
		 int i =0;
		 int j =0;
		 while(true)
		 {
			  System.out.println("a: left");
			  System.out.println("d: right");
			  System.out.println("s: down");
			  System.out.println("w: up");
			  System.out.println("Enter an option: ");
			  direction = s.next().charAt(0);
		  if(direction == 'a')
			{
					  if(j != 0)
					  {
						  temp = a[i][j-1];
						  a[i][j-1] = a[i][j];
						  a[i][j] = temp;
						  j = j-1;
					  }else
					  {
						  System.out.println("Choose another direction...");
					  }
		
			}else
		if(direction == 'd')
		{
			if(j !=2)
			{
			temp = a[i][j+1];
			a[i][j+1] = a[i][j];
			a[i][j] = temp;
			j = j+1;
			System.out.println("it has been moved ");
			}else
				{
					System.out.println("Choose another direction....\n\n");
				}
			
		}else if (direction == 'w')
		{
			if(i != 0)
			{
			temp = a[i-1][j];
			a[i-1][j] = a[i][j];
			a[i][j] = temp;
			i = i-1;
			}else
				System.out.println("Choose another direction....\n\n");
			
		}else if(direction == 's')
		{
			if(i != 3)
			{
			temp = a[i+1][j];
			a[i+1][j] = a[i][j];
			a[i][j] = temp;
			i = i+1;
			}else
				System.out.println("Choose another direction....\n\n");
		}
	
	drawBoard(a);
		 }//end of the while loop
		 }//end of the moveTileawsd function

	
}