package OnePract5;

public class StudentTester {
	
	public static void main (String args[]){
		
		//Name, number of Exams, Initial Score;
		Student s1 = new Student ("Brendan", 5, 0);
		
		System.out.println("The students name is: " + s1.getName());
		
		
		System.out.println(s1.getName() + " initial score is " + s1.getTotal());
		s1.setExamScore(55);
		
		System.out.println(s1.getName() + " did maths and got: " + s1.getTotal());
		s1.setExamScore(45);
		s1.setExamScore(55);
		s1.setExamScore(99);
		
		
		System.out.println(s1.getName() + " after two exams out of 100, he is on: " + s1.getTotal());
		System.out.println(s1.getName() + " average over " + s1.getNoOfExams() + " exams is " + s1.getAvg());
		s1.failExam(15);
		System.out.println(s1.getName() + " failed exam, score is now " + s1.getTotal());
		
	

}
	
}
