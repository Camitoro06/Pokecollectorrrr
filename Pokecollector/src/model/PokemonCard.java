package model;

public class PokemonCard {

    private String name;
    private int hP;
    private PokemonType pokemonType;
    private int attackPower;

    public PokemonCard(String name, int hP, PokemonType pokemonType, int attackPower){
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

    public PokemonType getPokemonType(){
        return pokemonType;
    }

    public void setPokemonType(PokemonType pokemonType){
        this.pokemonType=pokemonType;
    }

    public int getAttackPower(){
        return attackPower;
    }

    public void setAttackPower(int attackPower){
        this.attackPower=attackPower;
    }

    
}   


