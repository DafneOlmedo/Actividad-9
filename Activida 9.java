import java.util.*;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.newBaraja();

        String repetir; //Uso de String por su capacidad para el manejo de cadenas dentro de sus clases
        do {

            int opc = 8;
            boolean validar = true;


                do{    //Menu para la elección de la función que desea realizar el usuario
                System.out.println("Menu");
                System.out.println("1. Mezclar deck");
                System.out.println("2. Sacar una carta");
                System.out.println("3. Carta al azar");
                System.out.println("4. Generar una mano de 5 cartas");
                System.out.println("5. Salir");

                try {
                    System.out.print("Opcion: ");
                    Scanner scanner = new Scanner(System.in);
                    opc = scanner.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Solo admite valores numericos"); //Impresión de error en caso de que el usurio no presione un numero
                }

                if (opc >= 6 || opc <= 0) {
                    System.out.println("Digite un numero entre los rangos correctos"); // en caso de que el usuario digite un numero que no está el menú
                    validar = true;
                } else {
                    validar = false;
                }


            } while (validar);

            // Uso de switch a manera de tomar una decisión a partir de un valor dado, con varios resultados posibles.
            switch (opc) {   
                case 1:
                    System.out.println("1. Mezclar deck");
                    deck.shhuffle();

                    break;
                case 2:
                    System.out.println("2. Sacar una carta");
                    deck.head();

                    break;
                case 3:
                    System.out.println("3. Carta al azar");
                    deck.pick();

                    break;
                case 4:
                    System.out.println("Generar una mano de 5 cartas");
                    deck.hand();

                    break;
                case 5:
                    System.exit(0);
                    break;

            }

            Scanner scanner = new Scanner(System.in);

            System.out.println("¿Deseas hacer algo mas? (s/n)");
            repetir = scanner.nextLine();
            repetir.toLowerCase();


        } while (repetir.equals("s"));

    }


}