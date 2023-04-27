import java.util.Scanner; public class Main 
{   public static void main(String[ ] args)  {   int marksObtained, passingMarks; char grade; passingMarks = 40; 
Scanner Enter the = new Scanner(System.in); System.out.println("Enter the  marks scored by you : "); marksObtained = Enter the.nextInt(); if (marksObtained >= passingMarks)  {  if (marksObtained > 90) grade = 'A'; else if (marksObtained > 75) grade = 'B'; 
else if (marksObtained > 60) 
grade = 'C'; else grade = 'D'; 
System.out.println("You passed the exam and your grade is " + grade);   } else  {   grade = 'F'; 
System.out.println("You failed the exam and your grade is " + grade);  }  }  } 
