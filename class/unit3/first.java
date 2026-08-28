// Throwable class is parent of Exception class 

import java.nio.file.*;
public class first {
    
    public static void main(String args[]) throws Exception{
        Path folder = Paths.get("E:\\fs");
        if(!Files.exists(folder)){
            Files.createDirectory(folder);
            System.out.println("Directory created");
        }
        Path f = Paths.get("E:\\fs\\student.txt");;
        if(!Files.exists(f)){
            Files.createFile(f);
            System.out.println("File Created");
        }

        // important Paths methods 
        System.out.println(f.getFileName()); // student.txt
        System.out.println(f.getParent());  // "E:\\fs
        System.out.println(f.getRoot()); //E:\

        // How to create a relative path 
        Path p1= Paths.get("lpunew.txt"); // relative path 
        Path p2= Paths.get("New Folder","file.txt"); // relative apth  folder inside that file in pwd

        // System.out.println(p1);

        // Convert Relative path to Absolute path 
        p1= p1.toAbsolutePath();
        System.out.println(p1);

        // Check weather it is file or directoy  

        System.out.println(Files.isRegularFile(folder));  // false
        System.out.println(Files.isDirectory(folder));  // true

        // create a directory in current working folder 
        Path newp= Paths.get("MYFolder");
        Files.createDirectory(newp);
        // delte a fiule 
        Files.delete(f);// for file only 

        // delete a file of only exits 
        Files.deleteIfExists(f);
        





    }
}
