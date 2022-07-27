package main.java;

import main.java.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape ellipse = new Ellipse();
        Shape quad = new Quad();
        Shape diamond = new Diamond();
        Shape triangle = new Triangle();
		Shape rectangle = new Rectangle();


        ShowName showName = new ShowName();
        System.out.println(showName.getName(circle));
        System.out.println(showName.getName(ellipse));
        System.out.println(showName.getName(quad));
        System.out.println(showName.getName(diamond));
        System.out.println(showName.getName(triangle));
		System.out.println(showName.getName(rectangle));
    }
}