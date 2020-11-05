public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[1];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if(size>=data.length){resize();}
    data[size] = element;
    size++;
    return true;
  }

  public void add(int index, String element){
    String[] c = new String[data.length + 1];
    boolean beenHere=true;
    size++;
    for(int i=0;i<size;i++){
      int j=i;
      if(!beenHere){c[i]=data[i-1];}
      if(i==index){c[i]=element; beenHere=false;}
      if(i!=index&&beenHere){c[i]=data[i];}
    }
    data = c;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String temp = data[index];
    data[index] = element;
    return temp;
  }

  private void resize(){
    String[] b = new String[data.length + 10];
    for(int i=0;i<size;i++){
      b[i] = data[i];
    }
    data = b;
  }

  public boolean isEmpty(){
    if(size==0){return true;}else{return false;}
  }

  public void clear(){
    data = new String[1];
    size = 0;
  }

  public String toString(){
    String sentence = "{";
    for(int i=0;i<size;i++){
      sentence = sentence + (data[i]);
      if(i!=size-1){sentence = sentence + ", ";}
    }
    sentence = sentence + "}";
    return sentence;
  }

  public boolean contains(String s){
    boolean found = false;
    for(int i=0;i<size;i++){
      if(data[i].equals(s)){found=true;}
    }
    return found;
  }
}
