package com.hobbiePerson;

public class SingMusic extends Hobbies{
    Integer idMusic;
    String typeMusic;
    String genreMusic;
public SingMusic(Integer idMusic, String typeMusic, String genreMusic, Integer idHobbie, String nameHobbie){
super(idHobbie, nameHobbie);
this.idMusic=idMusic;
this.genreMusic=genreMusic;
this.typeMusic=typeMusic;
}
    public Integer getIdMusic() {
        return idMusic;
    }

    public void setIdMusic(Integer idMusic) {
        this.idMusic = idMusic;
    }

    public String getTypeMusic() {
        return typeMusic;
    }

    public void setTypeMusic(String typeMusic) {
        this.typeMusic = typeMusic;
    }

    public String getGenreMusic() {
        return genreMusic;
    }

    public void setGenreMusic(String genreMusic) {
        this.genreMusic = genreMusic;
    }
}
