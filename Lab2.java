//Lab 2
import java.util.Scanner;
public class Lab2 {
public static void main(String[] args)
{
    int roll,marks;
    String name,grade;
  Scanner scanner= new Scanner(System.in);
  System.out.println("Enter name");
  name = scanner.nextLine();
  System.out.println("Enter roll number");
  roll = scanner.nextInt(); 
  scanner.nextLine();
  System.out.println("Enter marks");
  marks = scanner.nextInt();
  if (marks>=80) 
  {
    grade= "A";
  }
  else if (marks>=70) 
  {
    grade= "B";
  }
  else if (marks>=60) 
  {
    grade= "C";
  }
  else if (marks>=45) 
  {
    grade= "D";
  }
  else 
  {
    grade= "F";
  }
  System.out.println("Name :" +name);
  System.out.println("Roll number :" +roll);
  System.out.println("Marks :" +marks);
  System.out.println("Grade :" +grade);
  scanner.close();
}
}
