package week1;
class Bikes {
    int speed;

    Bikes(int speed) {
        this.speed = speed;
    }
    Bikes(){
        this.speed = 0;
    }

    void swapping(Bikes bike2){
        int temp;
        temp = bike2.speed;
        bike2.speed = this.speed;
        this.speed = temp;
        
    }

    void swapping(int speed1 , int speed2){
        int temp;
        temp = speed1;
        speed1 = speed2;
        speed2=temp;

        System.out.println("after swapping speed is now: ");
        System.out.println("speed after swapping:");
        System.out.println("speed of bike1 is: "+ speed1);
        System.out.println("speed of bike2 is: " + speed2);

    }

}



public class program7 {
    public static void main(String[] args) {
        
        int speedBike1 =50;
        int speedBike2 =60;

        Bikes bike1 = new Bikes(speedBike1);
        Bikes bike2 = new Bikes(speedBike2);

        System.out.println("call by value");
        System.out.println("speed of bike1 is: "+ bike1.speed);
        System.out.println("speed of bike2 is: "+ bike2.speed);
        bike1.swapping(speedBike1, speedBike2);

        System.out.println("call by refrence: ");
        System.out.println("speed before swapping:");
        System.out.println("speed of bike1 is "+bike1.speed);
        System.out.println("speed of bike2 is "+bike2.speed);
        bike1.swapping(bike2);

        System.out.println("speed after swapping:");
        System.out.println("speed of bike1 is "+bike1.speed);
        System.out.println("speed of bike2 is "+bike2.speed);



    }
}
