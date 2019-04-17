package bitcamp.project.test;

<<<<<<< HEAD
import bitcamp.project.test.service.StudyService;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }
=======
import bitcamp.project.test.service.StudyMemberService;
>>>>>>> branch 'master' of https://github.com/ppappikko/bitcamp-project-test.git

<<<<<<< HEAD
    public static void main(String[] args) {
      System.out.println("--------------------------------------");
      StudyService studentService = new StudyService();
      studentService.list("스프링");
      System.out.println("--------------------------------------");
    }
=======
public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    
    System.out.println("***********************");
    StudyMemberService sms = new StudyMemberService();
    sms.list();
    System.out.println("***********************");
  }
}
