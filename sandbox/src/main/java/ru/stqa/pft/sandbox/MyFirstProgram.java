package ru.stqa.pft.sandbox;

public class MyFirstProgram{

  public static void main (String[] args) {
    hello("world");
    hello ("everyone");
    hello ("Viktor");

    double l = 5;
    System.out.println("Square for " + l + " equal " + area(l));

    double a = 5, b = 7;
    System.out.println("Square for " + a + " and " + b + " equal " + area(a,b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody +"!!!");
  }

  public static double area (double l){
    return l * l;
  }

  public static double area (double a, double b){
    return a * b;
  }



}