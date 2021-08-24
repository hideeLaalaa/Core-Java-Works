  import java.util.Scanner;
  
  public class New {

	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	 
		int count;
		int inpcount;
		
			
		
			for(;;){
		System.out.printf("\nEnter number for countdown:");
		inpcount = input.nextInt();
		count=inpcount;
		if(count==10 || count<10){
		
				for(count=count;count>0;count--)
				{
					System.out.printf("\n%d",count);
					if(count==0)
					{
						System.out.print("");
					}
					
				 }
				
				for(count=count;count<=inpcount;count++)
					{
						System.out.printf("\n%d",count);}
			
				
				
					}
				
					
		}
	}
	 		 
		

		}

  