package week4;
/*Program 2: Write an employee class Marketer to accompany the other employees. 
Marketers make $50,000 ($10,000 more than general employees), and they have an 
additional method named advertise that prints "Act now, while supplies last!" Use 
the super keyword to interact with the Employee superclass as appropriate. */
class employee {
    int generalEmployeeSalary;
    employee(){
        generalEmployeeSalary = 40000;
        System.out.println("salary of the generalEmployee is: " + generalEmployeeSalary);
    }
    

}

class Marketer extends employee {
    int marketerEmployeeSalary;
    Marketer(){
        super();
         marketerEmployeeSalary=50000;
         System.out.println("salary of the MarketerEmployee is: " + marketerEmployeeSalary);
    }
    public void advertise(){
        System.out.println("Act now, while supplies last!");
    }
}


public class program2 {
    public static void main(String[] args) {
        Marketer m1 = new Marketer();
    }
}
