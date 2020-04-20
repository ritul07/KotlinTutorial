package com.example.KotlinTutorial;

//  anonymous inner class
interface Human2{
    void think();
}

public class anonymousInnerClass {
    public static void main (String[] args){

        Human2 programmer = new Human2() {      //  here "new" will not work bcoz, Human2 is an interface
//            to make it work we can directly make an anonymous inner class
            public void think() {
                System.out.println("Think virtually...");
            }
        };

        programmer.think();
    }
}
