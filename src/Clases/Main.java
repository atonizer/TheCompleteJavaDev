package Clases;


// https://docs.oracle.com/javase/tutorial/java/index.html - The Java™ Tutorials

public class Main {
    public static void main(String[] args){
        Car porsche = new Car();
        Car holden = new Car();
        //System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
// 037 Constructors - Part 1 Challenge Exercise