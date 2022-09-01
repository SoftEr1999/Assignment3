
public class Prime_Beetween_100to200 {

	/*
	 * Program 2: Write java program that find prime number between 100 to 200 number range.
	 */
	public static void main(String[] args) {
		
			//Declaration and initialization of i and num integer variable
		   int i =0;
	       int num =0;
	       
	       //Empty String
	       String  primeNumbers = "";

	       for (i = 100; i <= 200; i++)      //for loop starts from 100 to 200    
	       { 		  	  
	          int counter=0; 	  //counter integer variable
	          
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)//checking for prime
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       
	      }	
	       
	       //Printing prime numbers
	       System.out.println("Prime numbers between 100 to 200 are :");
	       System.out.println(primeNumbers);

	}

}
