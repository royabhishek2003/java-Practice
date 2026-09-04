import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
public class writeFile {
    
    public static void main(String args[]) throws Exception {

        List<String> li= Arrays.asList("Rahul","Amit is good student ","Anas loves priya","Priya is very bad girl");
        Path p= Paths.get("student.txt");
        Files.write(p,li);
    }
}
