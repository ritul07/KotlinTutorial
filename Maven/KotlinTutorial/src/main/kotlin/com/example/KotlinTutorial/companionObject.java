package com.example.KotlinTutorial;

public class companionObject {
    public static void main(String[] args){
        D.show();   // we can use the class name directly here as an object, so by using the annotation
        // @JvmStatic on companion object, it'll be considered as a static method
    }
}
