import java.util.*;
public class Student_grade_calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of subjects: ");
		int total_subjects = sc.nextInt();
		
		int marks[] = new int[total_subjects];
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter the marks obtained in subject "+(i+1)+" out of 100 :" );
			marks[i] = sc.nextInt();
		}
		
		int Totalmarks=0;
		for(int i=0;i<marks.length;i++) {
			Totalmarks+=marks[i];
		}
		
		double Avg_percentage  = (double) Totalmarks / (total_subjects* 100) * 100;
		
		char grade;
		if(Avg_percentage >= 90) {
			grade = 'A';
		}
		else if(Avg_percentage>=80) {
			grade ='B';
		}
		else if(Avg_percentage>=70) {
			grade ='C';
		}
		else if(Avg_percentage>=60) {
			grade ='D';
		}
		else if(Avg_percentage>=50) {
			grade ='E';
		}
		else {
			grade ='F';
		}
		
		System.out.println("Total marks: "+Totalmarks);
		System.out.println("Average percentage: "+Avg_percentage);
		System.out.println("Grade obtained: "+grade);
	}

}
