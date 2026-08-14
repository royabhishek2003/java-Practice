import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    String department;
    Student(String name,String department){
        this.name=name;
        this.department=department;
    }
    public String toString(){
        // return name+"->" +department;
        return name ;
    }
}
public class Class3 {

    public static void main(String args[]){

        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Abhishek","Cse"));
        list.add(new Student("Shruti","Bsc"));
        list.add(new Student("Guriya","Bsc"));
        list.add(new Student("Shubham","B.Com"));
        list.add(new Student("Pranav","Cse"));
        
        // when we are printing the object automatically toString method call which is from Object class which is global parent of all the class
        // if student class does not have toSTring method overridden then the parent toSttring is like this 
        // getClass().getName() + "@" + Integer.toHexString(hashCode()) 
        // System.out.println(list);

    //     Map<String, List<Student>> result = list.stream()
    // .collect(Collectors.groupingBy(n -> n.department));

    // System.out.println(result);
    // }

    // write a programme to partition the elements by even and odd 
List<Integer> li= Arrays.asList(1,2,3,4,5,6,7,8);

// Map<Boolean, List<Integer>> result = li.stream()
//         .collect(Collectors.partitioningBy(n -> n % 2 == 0));

Map<String, List<Integer>> result = li.stream()
        .collect(Collectors.groupingBy(n -> (n%2==0)? "even":"Odd"));

System.out.println(result);

    }
}
