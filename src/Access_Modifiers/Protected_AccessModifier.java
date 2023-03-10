package Access_Modifiers;
/*
The protected access modifier is accessible within package and outside the package but through inheritance only.

The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.
 */
public class Protected_AccessModifier {

    //save by A.java
//package pack;
//    public class A{
//        protected void msg(){System.out.println("Hello");}
//    }


//save by B.java
//package mypack;
//import pack.*;
//
//    class B extends A{
//        public static void main(String args[]){
//            B obj = new B();
//            obj.msg();
//        }
//    }
}

//In this example, we have created the two packages pack and mypack. The A class of pack package is public, so can be accessed from outside the package.
// But msg method of this package is declared as protected, so it can be accessed from outside the class only through inheritance.