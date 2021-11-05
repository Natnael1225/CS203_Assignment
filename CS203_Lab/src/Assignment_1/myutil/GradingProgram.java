package myutil;

public class GradingProgram {

	private  int quiz1Grade;// grading 10 points
	private  int quiz2Grade;
	private  int quiz3Grade;
	private  int  midTermGrade;// grading 100
	private  int finalGrade; //grading 100
	private double overallGrade;
	private char letterGrade;
 // 10

public GradingProgram(int quiz1Grade, int quiz2Grade, int quiz3Grade, int midTermGrade, int finalGrade) {
		this.quiz1Grade = quiz1Grade;
		this.quiz2Grade = quiz2Grade;
		this.quiz3Grade = quiz3Grade;
		this.midTermGrade = midTermGrade;
		this.finalGrade = finalGrade;
	}

public int getQuiz1Grade() {
		return quiz1Grade;
	}

	public void setQuiz1(int quiz1Grade) {
		if(quiz1Grade<0 || quiz1Grade>10) {
			return;
		}
		this.quiz1Grade = quiz1Grade;
		
	}

	public int getQuiz2Grade() {
		return quiz2Grade;
	}

	public void setQuiz2Grade(int quiz2Grade) {
		if(quiz1Grade<0 || quiz1Grade>10) {
			return;
		}
		this.quiz2Grade = quiz2Grade;
	}

	public int getQuiz3Grade() {
		return quiz3Grade;
	}

	public void setQuiz3Grade(int quiz3Grade) {
		if(quiz1Grade<0 || quiz1Grade>10) {
			return;
		}
		this.quiz3Grade = quiz3Grade;
	}

	public int getMidTermGrade() {
		return midTermGrade;
	}

	public void setMidTermGrade(int midTermGrade) {
		if(midTermGrade<0|| midTermGrade >100) {
			return;
		}
		this.midTermGrade = midTermGrade;
	}

	public int getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(int finalGrade) {
		if(finalGrade < 0|| finalGrade > 100) {
			return;
		}
		this.finalGrade = finalGrade;
	}
	
public double getOverallGrade() {
		return overallGrade;
	}
	public char getLetterGrade() {
		return letterGrade;
	}

public double calculateOverallGrade() {
	
	this.overallGrade=(((quiz1Grade + quiz2Grade + quiz3Grade)*100)/30)/4 + 
	(midTermGrade * 35)/100	+ (finalGrade * 40)/100	; 
	
	return overallGrade;		
}
	public  char  calculateLetterGrade() { 
		
    if(overallGrade>=90){
    	letterGrade='A';
    }
    else if(overallGrade>=80){
    	letterGrade='B';
    }
    else if(overallGrade>=70){
    	letterGrade='C';
    }
    else if(overallGrade>=60){
    	letterGrade='D';
    }
    else letterGrade='F';
    return letterGrade;
}
	 public String printGradeReport(){
	        String result = "Quiz1: "+getQuiz1Grade() +"\nQuiz2: "+getQuiz2Grade() +"\nQuiz3 "+getQuiz3Grade()
	        +"\nmidTerm: "+ getMidTermGrade()+ "\nfinal: "
	        +getFinalGrade() + " \nOverAllGrade: "+ calculateLetterGrade() ;
	        return result;
	    }


}
