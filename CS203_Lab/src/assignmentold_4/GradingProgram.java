package assignmentold_4;

public class GradingProgram {

	private int quiz1;
	private int quiz2;
	private int quiz3;
	private int mid;
	private int finalExam;
	private int finalResult = 0;

	public GradingProgram(int quiz1, int quiz2, int quiz3, int mid, int finalExam) {

		this.quiz1 = quiz1;
		this.quiz2 = quiz2;
		this.quiz3 = quiz3;
		this.mid = mid;
		this.finalExam = finalExam;
	}

	public void  perc(){ 
	 
	         double quiz= (((double)(quiz1+quiz2+quiz3)/30)*100)*0.25; 
	 
	         double midS=mid*0.35; 
	        double finS=finalExam*0.4; 
	         double finMark=quiz+midS+finS; 
	        System.out.println("quiz score is "+quiz+ " midScore is "+midS+"Final score is "+finS); 
	        System.out.println(); 
	        System.out.println("The final result is: "+finMark); 
	 
	         char grading =(finMark>=90)? 'A':(finMark>=80)? 'B':(finMark>=70)? 'C':(finMark>=60)? 'D':'F'; 
	        System.out.println("the grade score "+ grading); 
	
//	        public char getGrade(){
//	            char grade;
//	            if(finalResult>=90){
//	                grade='A';
//	            }
//	            else if(finalResult>=80){
//	                grade='B';
//	            }
//	            else if(finalResult>=70){
//	                grade='C';
//	            }
//	            else if(finalResult>=60){
//	                grade='D';
//	            }
//	            else grade='F';
//	            return grade;
//
//	        }
//
//	        public String checkResult(){
//	            String result = "Quiz1: "+getQuiz1()+"\nQuiz2: "+getQuiz2()+"\nQuiz3 "+getQuiz3()+"\nmidTerm: "+ getMidTerm()+ "\nfinal: "+getFinalExam();
//	            return result;
	    }	
	public static void main(String[] args) {
		GradingProgram g1=new GradingProgram(9,8,7,80,90); 
        g1.perc(); 

		

	}

}
