package bitcamp.project.test;

import bitcamp.project.test.service.Heewook;
import bitcamp.project.test.service.Jihwan;
import bitcamp.project.test.service.StudyMemberService;
import bitcamp.project.test.service.StudyService;
import bitcamp.project.test.service.sangmin;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }
  public static void main(String[] args) {
    
    StudyService studyService = new StudyService();
    studyService.list("git");
    System.out.println("지우지 마세요ㅠㅠ..");
    
    System.out.println("졸립다..");
    Jihwan jihwan = new Jihwan();
    jihwan.list();
    System.out.println("졸립다..");
    /*---------------------------------------------------------*/
    System.out.println("-------------------------------------------");
    Heewook h = new Heewook();
    h.list();
    System.out.println("-------------------------------------------");
    /*---------------------------------------------------------*/
    System.out.println("⎝༼ ◕-д-◕ ༽⎠⎝༼ ◕-д-◕ ༽⎠");
    sangmin s = new sangmin();
    s.list();
    System.out.println("⎝༼ ◕-д-◕ ༽⎠⎝༼ ◕-д-◕ ༽⎠");
    /*---------------------------------------------------------*/

    System.out.println("***********************");
    StudyMemberService sms = new StudyMemberService();
    sms.list();
    System.out.println("***********************");
    /*---------------------------------------------------------*/
  }
    
}
