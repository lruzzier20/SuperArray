public class Tester{
  public static void main(String[] args){
    SuperArray a = new SuperArray();
    System.out.println(a.size());
    System.out.println(a.add("hey"));
    System.out.println(a.get(0));
    System.out.println(a.set(0, "hello"));
    System.out.println(a.set(0, "what's up"));
  }
}
