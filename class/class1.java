import java.util.*;
class class1{
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(2,1,3,4));

        int sum= list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
        
        // find the larges element 
        int largest= list.stream().reduce(Integer.MIN_VALUE,(a,b)->Math.max(a,b));
        System.out.println(largest);

        // programme to concatinate all the string in the list

        ArrayList<String> list2= new ArrayList<>(Arrays.asList("A","B","C","D"));
        String concatinated= list2.stream().reduce("",(a,b)->a+b);
        System.out.println(concatinated);

        // programe to find out the average of all marks in the list

        ArrayList<Integer> list3= new ArrayList<>(Arrays.asList(2,1,3,4));

        // int totalsum= list3.stream().reduce(0,(a,b)->a+b);

        // double average= (double)totalsum/list3.size();

        // System.out.println(average);
        
        // 2nd approach 
        double average= list3.stream().mapToInt(n->n).average().orElse(0);
        System.out.println(average);

        
    }
}