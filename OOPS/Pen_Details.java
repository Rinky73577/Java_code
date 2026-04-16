class Pen_Details{
    public static void main(String[] args) {
        
        // Initilizing using object refrence

        Pen p1 = new Pen();
        p1.brand="camlin"; p1.color="black"; p1.price=65;
        System.out.println(p1.brand + p1.color + p1.price);

        Pen p2 = new Pen();
        p2.brand="camlin"; p2.color="blue"; p2.price=56;
        System.out.println(p2.brand + p2.color + p2.price);

        Pen p3 = new Pen();
        p3.brand="camlin"; p3.color="red"; p3.price=23;
        System.out.println(p3.brand + p3.color + p3.price);
    }
}

// if an attribute have same value for all the object we can initilize it directly

/*
        Pen p1 = new Pen();
        p1.color="black";
        System.out.println(p1.brand + p1.color + p1.price);

        Pen p2 = new Pen();
        p2.color="blue";
        System.out.println(p2.brand + p2.color + p2.price);

        Pen p3 = new Pen();
        p3.color="red";
        System.out.println(p3.brand + p3.color + p3.price);
 */