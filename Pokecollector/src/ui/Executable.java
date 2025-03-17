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

        input.nextLine();

        System.out.println("Digite el nombre");
        String name = input.nextLine();

        System.out.println("Digite los puntos de vida (HP)");
        int hp = input.nextInt();

        System.out.println(ctrl.getPokemonTypeList());

        
        
        int type = input.nextInt();
        
        if(type<1 || type>4){
            System.out.println("No hay un tipo asociado a ese dígito");
        }

        System.out.println("Digite el poder de ataque");
        int aP = input.nextInt();

        if(ctrl.savePokemonCard(name, hp, type, aP)){
            System.out.println("Carta registrada exitosamente");
        }else{
            System.out.println("Colección llena");
        }
    }

    

    

    public static void menu(){
        int option = -1;
        do{
            System.out.println("1-->Registrar carta pokemon");
            System.out.println("2-->Conultar coleccion");
            System.out.println("3-->Modificar");
            System.out.println("4-->Borrar");
            System.out.println("0-->Salir");
        option = input.nextInt();
        switch (option) {
            case 1:
                registerPokemonCard();
                break;
                
            case 2:
                System.out.println(ctrl.getCollection());
                break;
            
            case 3:
                
                break;
            
            case 4:
                
                break;

            case 0:
                System.out.println("Adiós, vuelve pronto!");
                break;
                
            default:
                System.out.println("# Opción no valida, vuelve a intentarlo!");
                break;
        }
        }while(option != 0);

      
    }

    public static void modifyPokemonCard(){

    }

    public static void deletePokemonCard(){

    }
} 