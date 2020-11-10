public class Demo{
  public static void main(String[] args){
    SuperArray words = new SuperArray();
   words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
   words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
   words.add("una");    words.add("ebi");     words.add("toro");

   System.out.println(words);
   removeDuplicates(words);
   System.out.println(words);
   SuperArray second = new SuperArray(1);
   second.add("kani");
   second.add("ansible");
   second.add("una");
   second.add("ebi");
   System.out.println(second);
   System.out.println(findOverlap(words, second));
   System.out.println("\n");
   words.add("lol");
   words.add("I");
   words.add("ruined");
   words.add("your");
   words.add("theme");
   System.out.println(words);
   System.out.println(second);
   System.out.println(zip(words, second));
 }

  public static void removeDuplicates(SuperArray s){
    for(int i=0;i<s.size();i++){
      if(i!=s.indexOf(s.get(i))){s.remove(i); i--;}
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    int size=0;
    if(a.size()>b.size()){size=b.size();}else{size=a.size();}
    SuperArray c = new SuperArray(size);
    for(int i=0;i<size+1;i++){
      if(b.contains(a.get(i))){c.add(a.get(i));}
    }
    removeDuplicates(c);
    return c;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    int smaller = 0;
    int temp = 0;
    SuperArray c = new SuperArray(a.size() + b.size());
    if(a.size()<b.size()){smaller=a.size();}else{smaller=b.size();}
    for(int i=0;i<smaller;i++){
      c.add(a.get(i));
      c.add(b.get(i));
      temp++;
    }
    if(a.size()>b.size()){
      for(int j=temp;j<a.size();j++){
        c.add(a.get(j));
      }
    }
    if(b.size()>a.size()){
      for(int k=temp;k<b.size();k++){
        c.add(b.get(k));
      }
    }
    return c;
  }
}
