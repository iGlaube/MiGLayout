package OnePract5;

public class Student {
	
	private String sName;
	private int noOfExams;
	private double oScore, average;
	
	
	
	public Student(String name, int sExams, double oScore){
		
	sName = name;
	noOfExams = sExams;
	
		
	}
	
	
	public String getName(){
		//return the students name
		return sName;
	}
	
	public int getNoOfExams(){
		return noOfExams;
	}
	
	
	public void setExamScore(double score){
		oScore = oScore + score;
		
	}
	
	public void failExam(double score){
		oScore = oScore - score;
	}
	
	public double getTotal(){
		
		return oScore;
		
	}
	
	
	public double getAvg(){
		average = oScore / noOfExams;
		return average;
	}
	
	
	
	
	

}
