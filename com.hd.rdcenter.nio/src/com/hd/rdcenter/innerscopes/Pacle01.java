package com.hd.rdcenter.innerscopes;

public class Pacle01 {

  public Destination dest(String s) {

    class Pdestination implements Destination {
      private String label;

      @Override
      public String readLabel() {
        return label;
      }

      private Pdestination(String whereTo) {
        label = whereTo;
      }

    }
    return new Pdestination(s);
  }
  
  public static void main(String[] args) {
    Pacle01 p1=new Pacle01();
    Destination d = p1.dest("Pdestation");
    
  }
}
