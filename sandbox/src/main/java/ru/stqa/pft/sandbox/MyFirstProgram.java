package ru.stqa.pft.sandbox;

public class MyFirstProgram{

  public static void main (String[] args) {
    hello("world");
    hello ("everyone");
    hello ("Viktor");

    Square s = new Square(5);
    System.out.println("Square for " + s.l + " equal " + s.area());

    Rectangle r = new Rectangle(5, 7);
    System.out.println("Square for " + r.a + " and " + r.b + " equal " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody +"!!!");
  }



}