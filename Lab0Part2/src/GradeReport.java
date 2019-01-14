import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		System.out.println(name+", what is your score for Quiz 1 (out of 100)?");
		int Quiz1 = input.nextInt();
		
		System.out.println(name+", what is your score for Quiz 2 (out of 100)?");
		int Quiz2 = input.nextInt();
		
		System.out.println(name+", what is your score for Quiz 3 (out of 100)?");
		int Quiz3 = input.nextInt();
		
		System.out.println(name+", what is your score for Quiz 4 (out of 100)?");
		int Quiz4 = input.nextInt();
		
		System.out.println(name+", what is your score for Quiz 5 (out of 100)?");
		int Quiz5 = input.nextInt();
		
		System.out.println(name+", what is your score for Quiz 6 (out of 100)?");
		int Quiz6 = input.nextInt();
		
		System.out.println(name+", what is your score for Quiz 7 (out of 100)?");
		int Quiz7 = input.nextInt();
		
		System.out.println(name+", what is your score for Quiz 8 (out of 100)?");
		int Quiz8 = input.nextInt();
		
		System.out.println(name+", what is your score for Quiz 9 (out of 100)?");
		int Quiz9 = input.nextInt();
		
		System.out.println(name+", what is your score for Assignment 1 (out of 100)?");
		int Assignment1 = input.nextInt();
		
		System.out.println(name+", what is your score for Assignment 2 (out of 100)?");
		int Assignment2 = input.nextInt();
		
		System.out.println(name+", what is your score for Assignment 3 (out of 100)?");
		int Assignment3 = input.nextInt();
		
		System.out.println(name+", what is your score for Assignment 4 (out of 100)?");
		int Assignment4 = input.nextInt();
		
		System.out.println(name+", what is your score for Assignment 5 (out of 100)?");
		int Assignment5 = input.nextInt();
		
		System.out.println(name+", what is your score for Assignment 6 (out of 100)?");
		int Assignment6 = input.nextInt();
		
		System.out.println(name+", what is your score for Assignment 7 (out of 100)?");
		int Assignment7 = input.nextInt();
		
		System.out.println(name+", what is your score for Assignment 8 (out of 100)?");
		int Assignment8 = input.nextInt();
		
		System.out.println(name+", what is your score for Assignment 9 (out of 100)?");
		int Assignment9 = input.nextInt();
		
		System.out.println(name+", what is your score for Assignment 10 (out of 100)?");
		int Assignment10 = input.nextInt();
		
		System.out.println(name+", what is your score for Lab Test 1 (out of 100)?");
		int LabTest1 = input.nextInt();
		
		System.out.println(name+", what is your score for Lab Test 2 (out of 100)?");
		int LabTest2 = input.nextInt();
		
		System.out.println(name+", what is your score for Lab Test 3 (out of 100)?");
		int LabTest3 = input.nextInt();
		
		System.out.println(name+", what is your midterm score (out of 100)?");
		int midterm = input.nextInt();
		
		System.out.println(name+", what is your final exam score (out of 100)?");
		int FinalExam = input.nextInt();
		
		System.out.println(name+", which course are you talking about?");
		String c = input.nextLine();
		String course = input.nextLine();
		
		
		System.out.println(name+", here is your grading report for "+course+":");
		System.out.println("----------------------------------------");
		
		System.out.println("Quiz 1: "+Quiz1);
		System.out.println("Quiz 2: "+Quiz2);
		System.out.println("Quiz 3: "+Quiz3);
		System.out.println("Quiz 4: "+Quiz4);
		System.out.println("Quiz 5: "+Quiz5);
		System.out.println("Quiz 6: "+Quiz6);
		System.out.println("Quiz 7: "+Quiz7);
		System.out.println("Quiz 8: "+Quiz8);
		System.out.println("Quiz 9: "+Quiz9);
		
		System.out.println("----------------------------------------");
		System.out.println("Assignment 1: "+Assignment1);
		System.out.println("Assignment 2: "+Assignment2);
		System.out.println("Assignment 3: "+Assignment3);
		System.out.println("Assignment 4: "+Assignment4);
		System.out.println("Assignment 5: "+Assignment5);
		System.out.println("Assignment 6: "+Assignment6);
		System.out.println("Assignment 7: "+Assignment7);
		System.out.println("Assignment 8: "+Assignment8);
		System.out.println("Assignment 9: "+Assignment9);
		System.out.println("Assignment 10: "+Assignment10);
		
		System.out.println("----------------------------------------");
		System.out.println("Lab Test 1: "+LabTest1);
		System.out.println("Lab Test 2: "+LabTest2);
		System.out.println("Lab Test 3: "+LabTest3);
		
		System.out.println("----------------------------------------");
		System.out.println("Midterm Test: "+midterm);
		System.out.println("Final Exam:"+FinalExam);
		
		System.out.println("----------------------------------------");
		
		double QuizAvg=(Quiz1+Quiz2+Quiz3+Quiz4+Quiz5+Quiz6+Quiz7+Quiz8+Quiz9)/9;
		double AssignmentAvg=(Assignment1+Assignment2+Assignment3+Assignment4+Assignment5+Assignment6+Assignment7+Assignment8+Assignment9+Assignment10)/10;
		double LabTestAvg=(LabTest1+LabTest2+LabTest3)/3;
		double rawMarks= QuizAvg*0.18+AssignmentAvg*0.2+LabTestAvg*0.12+midterm*0.15+FinalExam*0.35;
		
		System.out.println("Average of quizzes: "+QuizAvg);
		System.out.println("Average of assignments: "+AssignmentAvg);
		System.out.println("Average of lab tests: "+LabTestAvg);
		System.out.println("Final raw marks: "+rawMarks);
		
		input.close();

	}

}


