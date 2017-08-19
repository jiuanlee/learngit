package com.hd.rdcenter.innerscopes;

public class Characteristic {
  String s;

  public Characteristic(String c) {
    s = c;
    System.out.println("Create Characteristic" + s);
  }

  protected void finalize() {
    System.out.println("finalize Characteristic" + s);
  }
}
