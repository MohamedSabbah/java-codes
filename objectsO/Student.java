package objectsO;

public class Student {
	String name;
	double math;
	double arabic;
	double english;
	double score;
	String studentGrade ;
	double studentScore;
	// Method.............................
	void studentData(){
		System.out.printf("%s\t %.2f\t %.2f\t %.2f\t \n",name ,math ,arabic ,english );
		
	}
	
	void calScore(){
		double studentScore = math + arabic + english; 
		score =  studentScore/30*100;
		
	}
	 void calcGrade() {
		 if(score >= 90) {
			 studentGrade = "A";
			 
		 }else if(score >= 75) {
			 studentGrade = "B"; 
			 
	 	}else if(score >= 52) {
			 studentGrade = "C"; 
			 
		 }else { 
			 
			 studentGrade = "Fail";
		 } 
	 }
	 void printOut() {
		 System.out.println(studentGrade);
	 }
		
	
	
}	


