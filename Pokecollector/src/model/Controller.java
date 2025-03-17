package model;

public class Controller {

    private PokemonCard[] collection;

    public Controller(){
        collection = new PokemonCard[200];
        testData();
    }

    public void testData(){
        savePokemonCard("Pikachu", 70, 4, 50);
        savePokemonCard("Charizard", 120, 2, 70);

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

    public boolean savePokemonCard(String name, int hP, int pokemonType, int attackPower){

        PokemonType temp = PokemonType.AGUA;

        switch (pokemonType) {
            case 1:
                temp = PokemonType.AGUA;
                break;
            
            case 2:
                temp = PokemonType.FUEGO;
                break;
            
            case 3:
                temp = PokemonType.PLANTA;
                break;
            
            case 4:
                temp = PokemonType.ELECTRICO;
                break;
        
            default:
                temp = PokemonType.AGUA;
                break;
        }
        PokemonCard newCard = new PokemonCard(name , hP, temp, attackPower);

        for (int i = 0; i < collection.length; i++) {
            
            if(collection[i]==null){
                collection[i]=newCard;
                return true;
            }
        }

        return false;
    }

    public String getPokemonTypeList(){
        
        String msg = "Los tipos registrados son: ";

        PokemonType[] types = PokemonType.values();

        for (int i = 0; i < types.length; i++) {
            
            msg+=(i+1)+"-->"+types[i];
        }

        return msg;

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
                list+="|"+(i+1)+"|"+collection[i].getName()+"\n"; //collection[i] es un objeto pokemoncard

            }
        }
        return list;
        
    }
    
}
