package Inheritance;

public class BasedPlusComTest {
	public static void main(String[] args) {
		BasePlusCommisionEmployee emp=new BasePlusCommisionEmployee("Tolga", "Medeni","111111111",23456,.5,10000);
		System.out.printf("The Employee Information:\n%s",emp);
		System.out.println("\nThe payment to the Employee"+emp.callculatePayment());
	}

}