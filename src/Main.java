import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        FileWriter fileWriter = new FileWriter("students.txt");
        Map<String, Integer>  studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("menu:");
            System.out.println("1 add grade");
            System.out.println("2 remove grade");
            System.out.println("3 find grade");
            System.out.println("4 exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("enter student name");
                    String name = scanner.nextLine();
                    System.out.println("enter the grade");
                    int grade = scanner.nextInt();


                    studentGrades.put(name, grade);
                    break;

                case 2:
                    System.out.println("enter student name to remove grade");
                    String studentName = scanner.nextLine();
                    if (studentGrades.containsKey(studentName)){
                        studentGrades.remove(studentName);
                    }else {
                        System.out.println("no such student");
                    }
                    break;

                case 3:
                    System.out.println("enter student name to search");
                    String searchName = scanner.nextLine();
                    if (studentGrades.containsKey(searchName)){
                        int studentGrade = studentGrades.get(searchName);
                        System.out.println("student with name: " + searchName + " with grade " + studentGrade);

                    }else {
                        System.out.println("no such student");
                    }
                    break;
                case 4:

                    System.out.println("closing program");
                    scanner.close();
                    fileWriter.write(String.valueOf(studentGrades));
                    fileWriter.close();
                    Path path = Paths.get("C:\\Users\\Roman\\Desktop\\MapPR\\students.txt");
                    List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
                    System.out.println(lines);
                    System.exit(0);
                    break;

                default:
                    System.out.println("incorrect input!");

            }
        }


    }

}
