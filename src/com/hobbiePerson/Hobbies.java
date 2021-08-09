package com.hobbiePerson;

public class Hobbies {
    Integer idHobbie;
    String nameHobbie;

    public Hobbies(Integer idHobbie, String nameHobbie) {
        this.idHobbie = idHobbie ;
        this.nameHobbie = nameHobbie;
    }

    public Integer getIdHobbie() {
        return idHobbie;
    }

    public void setIdHobbie(Integer idHobbie) {
        this.idHobbie = idHobbie;
    }

    public String getNameHobbie() {
        return nameHobbie;
    }

    public void setNameHobbie(String nameHobbie) {
        this.nameHobbie = nameHobbie;
    }
}
