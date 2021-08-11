package com.hobbiePerson;

public class Person {
    Integer idPerson;
    String name;
    String lastName;
    int age;
public Person(Integer idPerson, String name, String lastName, int age){
    this.idPerson = idPerson;
    this.lastName = lastName;
    this.name = name;
    this.age=age;
}


    public String getName() {

        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

   /* public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public int getAge() {
        return age;
    }

    /* public void setAge(int age) {
        this.age = age;
    }*/
}
