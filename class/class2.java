import java.util.*;
import java.util.stream.*;
class class2{

    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,7));
        // List<Integer> result= list.stream().filter(n->n%2==0).collect(Collectors.toList());
        ArrayList<Integer> result= list.stream().filter(n->n%2==0).collect(Collectors.toCollection(ArrayList::new));

        // System.out.println(result);

        // programme to add all the elements in a list
        // int ans= list.stream().reduce(0,(a,b)->a+b);
        // System.out.println(ans);
        // without reduce 
        // int ans= list.stream().mapToInt(n->n).sum();
        // System.out.println(ans);
        // int max = list.stream()
        //       .mapToInt(n->n)
        //       .max()
        //       .orElse(0); // without orElse it will return Optional Int 
        // System.out.println(max);

        // double mean = list.stream()
        //       .mapToInt(n->n)
        //       .average()
        //       .orElse(0);
        // System.out.println(mean);


        Optional<Integer> res= list.stream().findFirst(); // it return Optional List 

        // System.out.println(res.get()); // but it will give error if optional list is empty 

        // Optional<Integer> res2= list.stream().filter(n-> n>=70).findFirst();
        // System.out.println(res2.get()); // error 

        // int res3= list.stream().findFirst().orElse(0);
        // System.out.println(res3); // error 


        // List<String> li= Arrays.asList("munna","Amit","Khusi","ashish");

        // String ans= li.stream().filter(n-> n.charAt(0)=='A' || n.charAt(0)=='a').findFirst().orElse("**");
        // System.out.println(ans);


        // To check weather number is present in the list or not 
        List<Integer> li= Arrays.asList(10,20,-30,40,50);
        // boolean ans= li.stream().anyMatch(n-> n<0);
        // System.out.println(ans);

        // to print the first 3 element 
        // li.stream().limit(3).forEach(System.out::println);

        // print first 3 and skip first 2 element 
        // li.stream().skip(2).limit(3).forEach(System.out::println);

        // sort all element in ascending order 

        // li.stream().sorted().forEach(System.out::println); // ascending order
        // li.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // descending order


        // write programe to find out second largest element 
        li.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
    }
}