package ui;

import java.util.Scanner;
import model.Controller;


public class Executable{

    private static Scanner input;
    private static Controller ctrl;

    public static void main(String[] args) {
        
        initializer();
        menu();
    }

    public static void initializer(){

        input = new Scanner(System.in);
        ctrl = new Controller();

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

        if(ctrl.savePokemonCard(name, hp, type, aP)){
            System.out.println("Carta registrada exitosamente");
        }else{
            System.out.println("Colección llena");
        }
    }

    

    

    public static void menu(){
        registerPokemonCard();
        System.out.println(ctrl.getCollection());
        
    }
}