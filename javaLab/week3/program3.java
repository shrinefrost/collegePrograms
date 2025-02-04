package week3;


class Box {

    private double length;
    private double breadth;
    private double height;

    public Box() {
        this.length = 0;
        this.breadth = 0;
        this.height = 0;
    }


    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

  
    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        this.height = 0;
    }

    
    public Box(double length) {
        this.length = length;
        this.breadth = 0;
        this.height = 0;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same object
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Not the same class or null object
        }

        Box otherBox = (Box) obj;
        return this.length == otherBox.length &&
               this.breadth == otherBox.breadth &&
               this.height == otherBox.height;
    }

   
    @Override
    public String toString() {
        return "Box [Length=" + length + ", Breadth=" + breadth + ", Height=" + height + "]";
    }

    // Main method to test the class functionality
    public static void main(String[] args) {

        Box box1 = new Box(5.0, 3.0, 2.0);
        Box box2 = new Box(5.0, 3.0, 2.0);
        Box box3 = new Box(4.0, 4.0);
        Box box4 = new Box(5.0);


        if (box1.equals(box2)) {
            System.out.println("Box1 and Box2 are equal.");
            System.out.println("Box1: " + box1);
            System.out.println("Box2: " + box2);
        }

        if (!box1.equals(box3)) {
            System.out.println("Box1 and Box3 are not equal.");
        }

        if (!box1.equals(box4)) {
            System.out.println("Box1 and Box4 are not equal.");
        }
    }
}
