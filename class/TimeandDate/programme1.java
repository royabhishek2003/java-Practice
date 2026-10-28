// WAP to accept tehe time from user in HH:MM and display the same in HH:MM:SS

import java.util.*;
import java.time.*;
import java.time.format.*;

class programme1{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String st= s.nextLine();
        DateTimeFormatter f1= DateTimeFormatter.ofPattern("HH:mm");
        LocalTime t= LocalTime.parse(st,f1);
        DateTimeFormatter f2=  DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(t.format(f2));

    }
}