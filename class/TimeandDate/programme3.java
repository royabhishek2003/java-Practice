//Accept the Exam date ,print exam date is over or yet to come or is today

import java.time.*;
import java.util.*;
class programme3
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		LocalDate examdate=LocalDate.parse(s);
		LocalDate today=LocalDate.now();

		if(examdate.isBefore(today))
			System.out.println("Exam date is over");
		if(examdate.isAfter(today))
			System.out.println("Exam date is yet to come");
		if(examdate.isEqual(today))
			System.out.println("Your Exam is on today");
	}
}