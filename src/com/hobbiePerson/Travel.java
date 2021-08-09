package com.hobbiePerson;

public class Travel extends Hobbies{
    Integer idTravel;
    String typeTravel;

    public Travel(Integer idTravel, String typeTravel, Integer idHobbie, String nameHobbie) {
        super(idHobbie, nameHobbie);
        this.idTravel= idTravel;
        this.typeTravel=typeTravel;
    }

    public Integer getIdTravel() {
        return idTravel;
    }

    public void setIdTravel(Integer idTravel) {
        this.idTravel = idTravel;
    }

    public String getTypeTravel() {
        return typeTravel;
    }

    public void setTypeTravel(String typeTravel) {
        this.typeTravel = typeTravel;
    }
}
