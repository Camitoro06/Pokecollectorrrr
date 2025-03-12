package model;

public class Controller {

    private PokemonCard[] collection;

    public Controller(){
        collection = new PokemonCard[200];
    }

    /**
     * Descripción: 
     * pre: El arreglo debe estar inicializado
     * pos: Pokemoncard queda añadido al arreglo
     * @param name String El nombre de la carta a registrar
     * @param hP int La vida de la carta a registrar
     * @param pokemonType String El tipo de pokemon de la carta a registrar
     * @param attackPower int El ataque que tiene la carta pokemon
     * @return boolean true si se añade, false si no
     */

    public boolean savePokemonCard(String name, int hP, String pokemonType, int attackPower){

        PokemonCard newCard = new PokemonCard(name , hP, pokemonType, attackPower);

        for (int i = 0; i < collection.length; i++) {
            
            if(collection[i]==null){
                collection[i]=newCard;
                return true;
            }
        }

        return false;
    }

    /**
     * Despcripción:
     * pre: El arreglo collection debe estar inicializado
     * @return
     */

    public String getCollection(){
        String list="";
        for (int i = 0; i < collection.length; i++) {
            if(collection[i]!=null){
                list+=(i+1)+"|"+collection[i].getName(); //collection[i] es un objeto pokemoncard

            }else{
                System.out.println("gay jaja");
            }
        }
        return list;
        
    }
    
}
