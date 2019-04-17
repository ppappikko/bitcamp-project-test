
package bitcamp.project.test;

import bitcamp.project.test.service.Heewook;
import bitcamp.project.test.service.StudyMemberService;
import bitcamp.project.test.service.StudyService;
import bitcamp.project.test.service.sangmin;

public class App {

  public static void main(String[] args) {
  System.out.println("--------------------------------------");
  StudyService studentService = new StudyService();
  studentService.list("스프링");
  System.out.println("--------------------------------------");

  System.out.println("-------------------------------------------");
  Heewook h = new Heewook();
  h.list();
  System.out.println("-------------------------------------------");

  System.out.println("⎝༼ ◕-д-◕ ༽⎠⎝༼ ◕-д-◕ ༽⎠");
  sangmin s = new sangmin();
  s.list();
  System.out.println("⎝༼ ◕-д-◕ ༽⎠⎝༼ ◕-д-◕ ༽⎠");

  System.out.println("⎝༼ ◕-д-◕ ༽⎠⎝༼ ◕-д-◕ ༽⎠");
  s = new sangmin();
  s.list();
  System.out.println("⎝༼ ◕-д-◕ ༽⎠⎝༼ ◕-д-◕ ༽⎠");

  System.out.println("***********************");
  StudyMemberService sms = new StudyMemberService();
  sms.list();
  System.out.println("***********************");

    System.out.println("-------------------------------------------");
    h = new Heewook();
    h.list();
    System.out.println("-------------------------------------------");

    s = new sangmin();
    s.list();
    System.out.println("⎝༼ ◕-д-◕ ༽⎠⎝༼ ◕-д-◕ ༽⎠");

    System.out.println("***********************");
    sms = new StudyMemberService();
    sms.list();
    System.out.println("***********************");
  
    }


}