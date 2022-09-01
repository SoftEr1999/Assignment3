
public class Capital_L_Pattern {
	/*
	 * Program3:Write a java program  to draw pattern.
	 * 		*
	 * 		*
	 * 		*
	 * 		*
	 * 		*****
	 */

	public static void main(String[] args) {
		
		
		int i, j;		//Declaration of i and j integer variable
		
		//logic for pattern
	    for (i = 1; i <= 5; i++)		//outer for loop start
	    {
	        
	        for (j = 1; j <= 5; j++)		//inner for loop start
	        {
	            if (i>=1&&i<=5&&j==1||i==6-1&&j>1)
	                System.out.printf("*");		//Priting *
	            else
	                System.out.printf(" ");		//printing spaces
	        }
	        
	        //End of inner loop
	        
	        System.out.printf("\n");		//for new line
	    }

	    //End of outer loop
	}

}
