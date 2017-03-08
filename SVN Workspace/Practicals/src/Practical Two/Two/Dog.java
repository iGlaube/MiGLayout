package Two;

public class Dog {
	
	private String name, breed;
	private char gender;
	private double age, weight;
	
	private double foodBill, vet, petIn;
	public double billTotal;
	
	
	
	
	public Dog(String dName, String dBreed, char dGender, double dAge, double dWeight, double dVet){
		
		name = dName;
		breed = dBreed;
		gender = dGender;
		age = dAge;
		weight = dWeight;
		
		foodBill = 0;
		vet = dVet;
		petIn = 35.00;
		billTotal = 0;
		
	}
	
	public void finalBill(){
		billTotal = foodBill + vet;
	}
	
	public void foodCost(int weeks, double costPerWeek){
		foodBill = (double) weeks * costPerWeek;
		System.out.println("Total food bill for " + weeks + " week is " + foodBill);
		finalBill();
	}
	
	public void vet(){
		vet = vet - petIn;
		System.out.println("Vet bill is: " + vet);
		finalBill();
	}
	
	
	public String getName(){
		return name;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public char getGender(){
		return gender; 
	}
	
	public double getAge(){
		return age;
	}
	
	public double getWeight(){
		return weight;
	}
	
	

}
