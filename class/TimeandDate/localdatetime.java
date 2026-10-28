import java.time.*;
class localdatetime{
    public static void main(String args[]){
        LocalDate d= LocalDate.of(2026,11,15);
        LocalTime t= LocalTime.of(10,15);
        LocalDateTime td1= LocalDateTime.of(d,t);
        // i can write 2 days later + 1 hour later 
        //  by using plusDays(2) and plushours(1)
        System.out.println(td1);
    }
}