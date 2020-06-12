package com.test.singletonpattern;

import java.io.Serializable;

public class SingletonDemo implements Serializable, Cloneable {

       private static final long serialVersionUID = 1L;
       private static SingletonDemo instance;

       private SingletonDemo() {
             // no-code
       }

       public static SingletonDemo getInstance() {
             if (instance == null) {
                    synchronized (SingletonDemo.class) {
                          if (instance == null) {
                                 instance = new SingletonDemo();
                          }
                    }
             }
             return instance;
       }

       protected Object readResolved() {
             return instance;
       }

       protected Object clone() throws CloneNotSupportedException {
             throw new CloneNotSupportedException();
       }

       // added main method to test singleton
       public static void main(String[] args) {
             SingletonDemo obj1 = getInstance();
             SingletonDemo obj2 = getInstance();

             System.out.println(obj1.hashCode() + "....." + obj2.hashCode());
       }
}
