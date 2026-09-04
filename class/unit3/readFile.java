
import java.nio.file.*;
import java.util.stream.*;
import java.io.IOException;
public class readFile {
    public static void main(String[] args) {
        try {
            // Path p= Paths.get("student.txt");
            // Stream<String> s= Files.lines(p);
            // // s.forEach(System.out::println);
            // s.forEach(x->System.out.println(x)); // second format to print 
            // s.close();  // close the stream 

            // if we do not want to use s.close means close the stream then 

            // try(Stream<String> s= Files.lines(p)){
            //     s.forEach(System.out::println);
            // }


            // read the line starts with 'A' only 

            // try(Stream<String> s= Files.lines(p)){
            //     s.filter(x -> x.startsWith("A")).forEach(System.out::println);
            // }

            // count the number of lines 
            // try(Stream<String> s= Files.lines(p)){
            //     long lines= s.count();
            //     System.out.println(lines);
            // }

            // try(Stream<String> s= Files.lines(p)){
            //     s.filter(x->x.contains("java")).forEach(System.out::println);
            // }

            // inside abc what are the files and  folder present 

            Path p= Paths.get("abc");
            // try(Stream<Path> s=  Files.list(p)){  // returns the Path type stream 
            //     s.forEach(System.out::println);
            // }

            // want to check all the file inside abc directory even directory inside directry inside file 
            // try(Stream<Path> s=  Files.walk(p)){  // returns the Path type stream 
            //     s.forEach(System.out::println);
            // }

            // want to print only the different file not directory 
             try(Stream<Path> s=  Files.list(p)){  // returns the Path type stream 
                // s.filter(x -> Files.isRegularFile(x)).forEach(System.out::println);
                // if we want to peint only the directory 

                s.filter(x -> Files.isDirectory(x)).forEach(System.out::println);
            }

        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}