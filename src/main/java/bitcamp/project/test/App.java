package bitcamp.project.test;

import bitcamp.project.test.service.StudyMemberService;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }
  public static void main(String[] args) {
    System.out.println("------------------------------");
    StudyMemberService s = new StudyMemberService();
    s.list();
    System.out.println("------------------------------");
  }
}
