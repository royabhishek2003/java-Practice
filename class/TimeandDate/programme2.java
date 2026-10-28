// WAP to find the difference between two times 
import java.time.*;
public class programme2 {
    
    public static void main(String args[]){
        LocalTime t1= LocalTime.of(10,40);
        LocalTime t2= LocalTime.of(14,20);
        Duration d= Duration.between(t1, t2);
        System.out.println("Time gap is :"+d.toHoursPart() +"Hours" + d.toMinutesPart() +"minutes");
    }
}


// crono and period to find the 
