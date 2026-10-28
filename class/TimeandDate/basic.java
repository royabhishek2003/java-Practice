//WAP to retive the system date

//  import java.time.*;
//  import java.time.format.*;
//  class lpu
//  {
// 	 public static void main(String arg[])
// 	 {
// 		 LocalDate d=LocalDate.now();
// 		 System.out.println("Date : "+d);

// 		 //change the format of date
// 		 DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MMMM-yy");
// 		 System.out.println("Date :"+d.format(f));
// 	 }
//  }







// [11:47 am, 22/10/2026] +91 97787 96686: //WAP to Accept the date(in default format) from the user and print it in dd-MMM-yyyy format
//  import java.time.*;
//  import java.time.format.*;
//  import java.util.*;
//  class lpu
//  {
// 	 public static void main(String arg[])
// 	 {
// 		 Scanner sc=new Scanner(System.in);
// 		 String s=sc.nextLine();
// 		 LocalDate d=LocalDate.parse(s);
// 		 DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
// 		 System.out.println(d.format(f));
// 	 }
//  }
// [11:57 am, 22/10/2026] +91 97787 96686: //WAP to Accept the date(MM-dd-yyyy format) from the user and print it in dd-MMM-yyyy format
//  import java.time.*;
//  import java.time.format.*;
//  import java.util.*;
//  class lpu
//  {
// 	 public static void main(String arg[])
// 	 {
// 		 Scanner sc=new Scanner(System.in);
// 		 String s=sc.nextLine();
// 		 DateTimeFormatter fin=DateTimeFormatter.ofPattern("MM-dd-yyyy");
// 		 DateTimeFormatter fout=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
// 		 LocalDate d=LocalDate.parse(s,fin);
// 		 System.out.println("Date: "+d.format(fout));


// 	 }
//  }






// import java.time.*;
// import java.time.format.*;
// import java.util.*;
// class lpu
// {
// 	public static void main(String arg[])
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		String s=sc.nextLine();
// 		DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
// 		LocalDate d=LocalDate.parse(s,f1);
// 		DateTimeFormatter f2=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
// 		System.out.println(d.format(f2));
// 	}
// }