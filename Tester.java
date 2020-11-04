public class Tester{
  public static void main(String[] args){
    SuperArray a = new SuperArray();
    System.out.println(a.size());
    System.out.println(a.add("hey"));
    System.out.println(a.get(0));
    System.out.println(a.set(0, "hello"));
    System.out.println(a.set(0, "what's up"));
    System.out.println(a.add("bonjour"));
    System.out.println(a.size());
    for(int i=0;i<100;i++){
      a.add(i + "");
    }
    System.out.println(a.size());
    System.out.println(a.get(1));
    for(int i=0;i<a.size();i++){
      System.out.println(a.get(i));
    }
  }
}
