package com.hobbiePerson;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Person personFirst = new Person(01,"pedro","Flores", 23);
       // personFirst.getName()= Keyboard.LeeCadena();
        System.out.println("I'm " + personFirst.getAge() + " years old ");
        System.out.println("I am " + personFirst.getName());
        Hobbies personHobbie = new Hobbies(02, "sing");
        System.out.println("My hobbie is:"+ personHobbie.getNameHobbie());
    }
}
