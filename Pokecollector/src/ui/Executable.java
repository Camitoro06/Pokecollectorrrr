package ui;

import java.util.Scanner;
import model.PokemonCard;

public class Executable{

    private static Scanner input;
    private static PokemonCard[] collection;
    public static void main(String[] args) {
        
        initializer();
        menu();
    }

    public static void initializer(){

        input = new Scanner(System.in);
        collection = new PokemonCard[200];

    }

    public static void registerPokemonCard(){

        System.out.println("Digite el nombre");
        String name = input.nextLine();

        System.out.println("Digite los puntos de vida (HP)");
        int hp = input.nextInt();

        input.nextLine();

        System.out.println("Digite el tipo de pokemon");
        String type = input.nextLine();

        System.out.println("Digite el poder de ataque");
        int aP = input.nextInt();

        PokemonCard newPoke = new PokemonCard(name, hp, type, aP);

        if(savePokemonCard(newPoke)){
            System.out.println("Carta registrada exitosamente");
        }else{
            System.out.println("Colección llena");
        }
    }

    public static boolean savePokemonCard(PokemonCard newCard){

        for (int i = 0; i < collection.length; i++) {
            
            if(collection[i]==null){
                collection[i]=newCard;
                return true;
            }
        }

        return false;
    }

    public static String getCollection(){
        String list="";
        for (int i = 0; i < collection.length; i++) {
            if(collection[i]!=null){
                list+=(i+1)+"|"+collection[i].getName(); //collection[i] es un objeto pokemoncard

            }
        }
        return list;
    }

    public static void menu(){
        registerPokemonCard();
        System.out.println(getCollection());
        
    }
}