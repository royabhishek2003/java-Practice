// NUmber Game 
import java.util.*;
 class Lpu
 {
	 public static void main(String arg[])
	 {
		 char ch='y';
		 while(ch=='y')
		 {
			 Scanner sc=new Scanner(System.in);
			 int r_num=(int)((Math.random()*100)+1);
			 System.out.println("Random number generated successfully");
			 int score=700;
			 int i;
			 for(i=1;i<=7;i++)
			 {
				 System.out.print("Attempt number "+i+" : ");
				 int val=sc.nextInt();
				 if(val==r_num)
				 {
					 System.out.println("Congratulations : right Guess");
					 System.out.println("Score is: "+score);
					 break;
				 }
				 else if(val>r_num)
				 {
					 System.out.println("Too High");
				 }
				 else if(val<r_num)
				 {
					 System.out.println("Too Low");
				 }
				 score=score-100;
			 }
			 if(i==8)
				System.out.println("Game Over");
			System.out.println("Do u want to play again(y/n)");
			ch=sc.next().charAt(0);
		}
	 }
 }