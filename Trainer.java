package cheannai;

public class Trainer {
	String dept= "java";
	String  institute="payilagam";
	String tranierName;
	private int salary=10000;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void training(String trainerName,String dept) {
		this.tranierName=trainerName;
		this.dept=dept;
		
	}
	public static void main(String args[]) {
		Trainer trainer=new Trainer();
		trainer.training("Rangarajan", "java Devoloper");
		System.out.println(trainer.dept);
		System.out.println(trainer.tranierName);
	trainer.training("vijay", "HTML");
	System.out.println(trainer.dept);
	System.out.println(trainer.tranierName);
	}
	
}
