package com.company.collection;
class Alphabets
{
    void A(){
        System.out.println("AA AA AA AA");
        System.out.println("AA       AA");
        System.out.println("AA AA AA AA");
        System.out.println("AA       AA");
        System.out.println("AA       AA");
    }
    void B(){
        System.out.println("B");
    }
    void C(){
        System.out.println("C");
    }
    void D(){
        System.out.println("DD DD DD ");
        System.out.println("DD       DD");
        System.out.println("DD       DD");
        System.out.println("DD       DD");
        System.out.println("DD DD DD ");
    }
    void E(){
        System.out.println("EE EE EE EE");
        System.out.println("EE ");
        System.out.println("EE EE EE EE");
        System.out.println("EE");
        System.out.println("EE EE EE EE");
    }
    void F(){
        System.out.println("F");
    }
    void G(){
        System.out.println("G");
    }
    void H(){
        System.out.println("HH       HH");
        System.out.println("HH       HH");
        System.out.println("HH HH HH HH");
        System.out.println("HH       HH");
        System.out.println("HH       HH");
    }
    void I(){
        System.out.println("II II III II II");
        System.out.println("      III");
        System.out.println("      III");
        System.out.println("      III");
        System.out.println("II II III II II");
    }
    void J() {
        System.out.println("J");
    }
    void K(){
        System.out.println("K");
    }
    void L(){
        System.out.println("L");
    }
    void M(){
        System.out.println("M");
    }
    void N() {
        System.out.println("NN NN        NN");
        System.out.println("NN   NN      NN");
        System.out.println("NN     NN    NN");
        System.out.println("NN       NN  NN");
        System.out.println("NN        NN NN");
    }
    void O(){
        System.out.println("OO OO OO OO");
        System.out.println("OO       OO");
        System.out.println("OO       OO");
        System.out.println("OO       OO");
        System.out.println("OO OO OO OO");

     }
    void P(){
        System.out.println("PP PP PP PP");
        System.out.println("PP       PP");
        System.out.println("PP PP PP PP");
        System.out.println("PP");
        System.out.println("PP");
    }
    void Q(){
        System.out.println("Q");
    }
    void R(){
        System.out.println("RR RR RR RR");
        System.out.println("RR       RR");
        System.out.println("RR RR RR RR");
        System.out.println("RR   RR ");
        System.out.println("RR     RR");
        System.out.println("RR       RR");
    }
    void S(){
        System.out.println("SS SS SS SS");
        System.out.println("SS");
        System.out.println("SS SS SS SS");
        System.out.println("         SS");
        System.out.println("SS SS SS SS");
    }
    void T(){
        System.out.println("T");
    }
    void U(){
        System.out.println("U");
    }
    void V(){
        System.out.println("VV            VV");
        System.out.println(" VV         VV");
        System.out.println("  VV      VV");
        System.out.println("    VV  VV");
        System.out.println("     VVV");
    }
    void W(){
        System.out.println("W");
    }
    void X(){
        System.out.println("X");
    }
    void Y(){
        System.out.println("YY        YY");
        System.out.println("  YY    YY");
        System.out.println("    YYY ");
        System.out.println("  YY");
        System.out.println("YY");
    }
    void Z(){
        System.out.println("Z");
    }
}
class Happy implements Runnable
{
    @Override
    public void run() {
     Alphabets obj=new Alphabets();
        System.out.println();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     obj.H();
        System.out.println();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj.A();
        System.out.println();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     obj.P();
        System.out.println();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     obj.P();
        System.out.println();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     obj.Y();
        System.out.println();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Aniversary implements Runnable{
  public void run(){
        Alphabets obj=new Alphabets();
        obj.A();
      System.out.println();
      try {
          Thread.sleep(1500);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
        obj.N();
      System.out.println();
      try {
          Thread.sleep(1500);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
        obj.I();
      System.out.println();
      try {
          Thread.sleep(1500);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
        obj.V();
      System.out.println();
      try {
          Thread.sleep(1500);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
        obj.E();
      System.out.println();
      try {
          Thread.sleep(1500);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

      obj.R();
      System.out.println();
      try {
          Thread.sleep(1500);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

        obj.S();
      System.out.println();
      try {
          Thread.sleep(1500);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
        obj.A();
      System.out.println();
      try {
          Thread.sleep(1500);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
        obj.R();
      System.out.println();
      try {
          Thread.sleep(1500);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
        obj.Y();
    }

}

class Dear implements Runnable{
    public void run(){
        Alphabets obj=new Alphabets();
        obj.D();
        System.out.println();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj.E();
        System.out.println();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj.A();
        System.out.println();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj.R();
        System.out.println();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class dearMammaAndMammiJi {

    public static void main(String args[]) throws InterruptedException {
         Happy happy=new Happy();
         Thread happy1=new Thread(happy);
         Aniversary aniversary=new Aniversary();
         Thread aniversary1=new Thread(aniversary);
         Dear dear=new Dear();
         Thread dear1=new Thread(dear);

       //  happy1.start();
      //   happy1.join();
       //  System.out.println();
       //  aniversary1.start();
       //  aniversary1.join();
       // System.out.println();
      //    dear1.start();
      //    dear1.join();
        //System.out.println("Mamma and Mammi Ji ");
    }
}
