package model;

public class PokemonCard {

    private String name;
    private int hP;
    private String pokemonType;
    private int attackPower;

    public PokemonCard(String name, int hP, String pokemonType, int attackPower){
        this.name=name;
        this.hP=hP;
        this.pokemonType=pokemonType;
        this.attackPower=attackPower;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int gethP(){
        return hP;
    }

    public void setHP(int hP){
        this.hP=hP;
    }

    public String getPokemonType(){
        return pokemonType;
    }

    public void setPokemonType(String pokemonType){
        this.pokemonType=pokemonType;
    }

    public int getAttackPower(){
        return attackPower;
    }

    public void setAttackPower(int attackPower){
        this.attackPower=attackPower;
    }
}   
