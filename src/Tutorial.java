

public class Tutorial {
    public static void main(String[] args) {
        Box b1 = new Box(20,40);
        Box b2 = new Box(50,75);

        Box b3 = new Box(b1);

        Box b4 = b2.duplicate();

        b1.display();
        b3.display();

        b2.display();
        b4.display();

        if(b1.isEqual(b2)){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }

        if(Box.isTwoObjectsEqual(b1, b3)){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }
    }
}

