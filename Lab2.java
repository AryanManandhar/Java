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
  if (marks>90) 
  {
    grade= "A+";
  }
  else if (marks>=80) 
  {
    grade= "A";  
  }
  else if (marks>=70) 
  {
    grade= "B+";
  }
  else if (marks>=60) 
  {
    grade= "B";
  }
  else if (marks>=50) 
  {
    grade= "C";
  }
  else if (marks>=40) 
  {
    grade= "D";
  }
  else 
  {
    grade= "NG";
  }
  System.out.println("Name = "+name);
  System.out.println("Roll No = "+roll_no);
  System.out.println("Marks = "+marks);
  System.out.println("Grade = "+grade);
  scanner.close();
}
}
