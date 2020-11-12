public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[1];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    if(initialCapacity<0){throw new IllegalArgumentException("No negative values please");}
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

  public String remove(int index){
    String temp = data[index];
    String[] d = new String[data.length];
    add(null);
    if(index!=0){d[0]=data[0];}
    boolean gone = false;
    for(int i=1;i+1<size;i++){
      if(gone){d[i]=data[i+1];}
      if(i-1==index){d[i-1]=data[i]; d[i]=data[i+1]; gone=true;}
      if(!gone){d[i]=data[i];}
    }
    size-=2;
    data = d;
    return temp;
  }

  public String get(int index){
    if(index<0||index>=size()){throw new IndexOutOfBoundsException("Invalid index");}
    return data[index];
  }

  public String set(int index, String element){
    if(index<0||index>=size()){throw new IndexOutOfBoundsException("Invalid index");}
    String temp = data[index];
    data[index] = element;
    return temp;
  }

  private void resize(){
    String[] b = new String[2*(1 + data.length)];
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
    String sentence = "[";
    for(int i=0;i<size;i++){
      sentence = sentence + (data[i]);
      if(i!=size-1){sentence = sentence + ", ";}
    }
    sentence = sentence + "]";
    return sentence;
  }

  public boolean contains(String s){
    boolean found = false;
    for(int i=0;i<size;i++){
      if(data[i].equals(s)){found=true;}
    }
    return found;
  }

  public int indexOf(String s){
    for(int i=0;i<size;i++){
      if(data[i].equals(s)){return i;}
    }
    return -1;
  }

  public String[] toArray(){
    String[] e = new String[size];
    for(int i=0;i<size;i++){
      e[i]=data[i];
    }
    return e;
  }

  public int lastIndexOf(String value){
    if(!contains(value)){return -1;}
    int ans = 0;
    for(int i=0;i<size;i++){
      if(data[i]==value){ans=i;}
    }
    return ans;
  }

  public boolean equals(SuperArray other){
    boolean ans = true;
    if(size==0&&other.size()==0){return true;}
    if(size==0){return false;}
    if(other.size()==0){return false;}
    if(other.size()!=size){return false;}
    for(int i=0;i<size;i++){
      if(data[i]!=other.get(i)){ans=false;}
    }
    return ans;
  }
}
