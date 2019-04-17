package bitcamp.project.test;

import bitcamp.project.test.service.Heewook;
import bitcamp.project.test.service.StudyMemberService;
import bitcamp.project.test.service.sangmin;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }
  public static void main(String[] args) {
    System.out.println("------------------------------");
    StudyMemberService s = new StudyMemberService();
    s.list();
    System.out.println("------------------------------");
    System.out.println("-------------------------------------------");
    Heewook h = new Heewook();
    h.list();
    System.out.println("-------------------------------------------");

    sangmin a = new sangmin();
    a.list();
    System.out.println("⎝༼ ◕-д-◕ ༽⎠⎝༼ ◕-д-◕ ༽⎠");

    System.out.println("***********************");
    StudyMemberService sms = new StudyMemberService();
    sms.list();
    System.out.println("***********************");
    
    System.out.println("1234");
  }
}
