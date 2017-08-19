package com.hd.rdcenter.thinkinjava;

public class OuterClass01 {
  class InnerClass {
    private String name;

    public InnerClass(String name) {
      this.name = name;
      System.out.println(name);
    }
  }

  public static void main(String[] args) {
    OuterClass01 oc = new OuterClass01();
    OuterClass01.InnerClass ic = oc.new InnerClass("I'm inner class!");
  }
}
