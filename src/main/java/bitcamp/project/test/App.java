package bitcamp.project.test;

import bitcamp.project.test.service.StudyService;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }
  
  public static void main(String[] args) {
  System.out.println("--------------------------------------");
  StudyService studentService = new StudyService();
  studentService.list("스프링ㅎㅎ");
  System.out.println("--------------------------------------");
  }
}
