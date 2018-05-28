package the.heap.and.the.stack;

public class ClassA {

  public String instVar1;
  public String instVar2;
  
  public static void main(String [] args) {
    ClassA localRef1 = null;
    localRef1 = new ClassA();
    localRef1.setInstVars(localRef1);
  }

  void setInstVars (ClassA localRef2) {
    localRef2.instVar1 = "aaaaaa";
    localRef2.setInstVar2("bbbbbb");
  }

  void setInstVar2(String localRef3) { 
    this.instVar2 = localRef3;
    String localRef4 = "cccccc";
    this.instVar2 = localRef4;
  }
}

