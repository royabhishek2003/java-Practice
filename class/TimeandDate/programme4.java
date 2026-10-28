// Accept the time from the user and provide a break after two hours and print the break 
import java.time.*;
import java.util.*;
class programme4
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		LocalTime t1= LocalTime.parse(s);
        // LocalTime breaktime = t1.plusHours(2);
        // System.out.println(breaktime);

        // exam time is 30 inutes earlier 
        LocalTime examreportingtime = t1.minusMinutes(30);
        System.out.println("Exam reporting time is : "+ examreportingtime );
	}
}