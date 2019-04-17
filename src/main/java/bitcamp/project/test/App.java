package bitcamp.project.test;

import service.Jihwan;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    System.out.println("졸립다..");
    Jihwan jihwan = new Jihwan();
    jihwan.list();
    System.out.println("졸립다..");
  }
}
