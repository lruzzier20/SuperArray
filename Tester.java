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
    System.out.println(a.isEmpty());
    System.out.println(a);
    a.clear();
    System.out.println(a.isEmpty());
    System.out.println(a.add("Ciao"));
    System.out.println(a.contains("Ciao"));
    System.out.println(a.contains("Nihao"));
    System.out.println(a);
    a.add("pos1");
    a.add("pos2");
    a.add("pos3");
    System.out.println(a);
    a.add(4, "Hola");
    System.out.println(a);
    System.out.println(a.remove(3));
    System.out.println(a);
    System.out.println(a.indexOf("Hola"));
    System.out.println(a.indexOf("Zdravstvuyte"));
    System.out.println(a);
    a.toArray();
    System.out.println(a);
    System.out.println(a.lastIndexOf("Hola"));
    a.add("Hola");
    System.out.println(a);
    System.out.println(a.lastIndexOf("Hola"));
    System.out.println(a.lastIndexOf("Konichiwa"));
    SuperArray b = new SuperArray();
    SuperArray c = new SuperArray();
    System.out.println(b.equals(c));
    b.add("tired");
    System.out.println(b.equals(c));
    c.add("tired");
    System.out.println(b.equals(c));
    System.out.println("\n");
    System.out.println(a);
    System.out.println(b);
    a.remove(0);
    System.out.println(a);
    System.out.println(a.equals(b));
    System.out.println(b.equals(a));
    SuperArray E = new SuperArray(-1);
  }
}
