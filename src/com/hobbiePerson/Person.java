package com.hobbiePerson;

public class Person {
    Integer idPerson;
    String name;
    String lastName;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }
}
