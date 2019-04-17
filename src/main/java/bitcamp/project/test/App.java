package bitcamp.project.test;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
      System.out.println("------------------------------");
      StudyMemberService s = new StudyMemberService();
      s.List();
      System.out.println("------------------------------");
    }
}
