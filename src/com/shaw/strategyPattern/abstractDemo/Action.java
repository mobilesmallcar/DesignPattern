package com.shaw.strategyPattern.abstractDemo;

public abstract class Action {
   public final static int EAT = 1;
   public static final int SLEEP = 3;
   public static final int WORK = 5;

   public abstract void eat();
   public abstract void sleep();
   public abstract void work();
   public void print(){
       System.out.println(this);
   }
   public void commond(int flag){
       switch(flag){
           case EAT:
               this.eat();
               break;
           case SLEEP:
               this.sleep();
               break;
           case WORK:
               this.work();
               break;
           default:
               break;
       }
   }
}
