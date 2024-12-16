/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        int count = 0;
        printAnimal();
        greeting("Giuseppe");
        greeting("Anything");
        double pay = raiseSalary(1000.42, 14);
        System.out.println(pay);
        pay = raiseSalary(pay, 43);
        System.out.println(pay);
	}
	public static void printAnimal(){
	    System.out.println("\\(\")/");
	    System.out.println("-( )-");
	    System.out.println("/(_)\\");
	    return;
	}
	public static void greeting(String name){
	    System.out.println("Yo " + name);
	}
	public static double raiseSalary(double salary, int percent){
	    double raisedSalary = salary + (salary * (percent/100.0));
	    return raisedSalary;
	}
}