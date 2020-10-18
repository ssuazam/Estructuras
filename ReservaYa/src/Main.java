import java.util.Scanner;
import java.util.Stack;

public class Main {



    public static void main(String[] args) {
        restaurantes[0] = "KFC";
        restaurantes[1] = "McDonalds";
        restaurantes[2] = "Burger King";
        for (int i =1; i <= c1.size();i++) {
            p1.push(i);
            p2.push(i);
            p3.push(i);
        }
        menuPrincipal();
        


        }
        private static int nRes = 3;
        private static int sizeMesas = 10;
        private static StackSLL<Integer> p1 = new StackSLL<Integer>();
        private static Cola c1 = new Cola(sizeMesas);
        private static StackSLL<Integer> p2 = new StackSLL<Integer>();
        private static Cola c2 = new Cola(sizeMesas);
        private static StackSLL<Integer> p3 = new StackSLL<Integer>();
        private static Cola c3 = new Cola(sizeMesas);
        private static String[] restaurantes = new String[nRes];





    public static void reserva(StackSLL<Integer> p1, Cola c1, int numeroRestaurante ) {
        Scanner entrada = new Scanner(System.in);



        System.out.printf("\nReserva en " + restaurantes[numeroRestaurante-1] );
        System.out.printf("\nMesas disponibles: " + "%d", p1.size());

        if (!p1.isEmpty()) {
            System.out.println("\nCuantas mesas desea reservar?");

            int mesasAReservar = entrada.nextInt();
            if (mesasAReservar <= p1.size){
                for (int j = 0; j < mesasAReservar; j++) {
                    int mesaP = p1.pop();
                    c1.enQueue(mesaP);


                }System.out.println("Gracias por reservar en " + restaurantes[numeroRestaurante-1]);


            }else{
                System.out.println("No hay tantas mesas disponibles");
                reserva(p1, c1, numeroRestaurante);
            }

        }



        else{
            System.out.println("Todas las mesas estan ocupadas");
            int mesaC = c1.deQueue();
            p1.push(mesaC);
        }
        menuPrincipal();
    }
        /*
        public static void crearPC(StackSLL<Integer> p1, Cola c1){

            StackSLL<Integer> p1 = new StackSLL<Integer>();
            Cola c1 = new Cola(sizeMesas);
            StackSLL<Integer> p2 = new StackSLL<Integer>();
            Cola c2 = new Cola(sizeMesas);
            StackSLL<Integer> p3 = new StackSLL<Integer>();
            Cola c3 = new Cola(sizeMesas);


            for (int i =1; i <= c1.size();i++) {
                p1.push(i);
                p2.push(i);
                p3.push(i);
            }

        }*/
        /*
        switch(){
            case 1:
            {
                System.out.println("Bienvenido a KFC");
                System.out.printf("Mesas disponibles: " + "%d", p1.size());

                    if(!p1.isEmpty()) {
                        System.out.println("\nCuantas mesas desea reservar?");

                        int mesasAReservar = entrada.nextInt();
                        for(int j = 0; j<mesasAReservar; j++){
                            int mesaP = p1.pop();
                            c1.enQueue(mesaP);

                    } if(p1.isEmpty()) {
                        System.out.println("no hay Mesas disponibles");
                    }

                    if(p1.isEmpty()){
                        int mesaC = c1.deQueue();
                        p1.push(mesaC);
                    }
                    break;

                }

            }
            case 2:
            {
                break;
            }
            case 3:
            {
                break;
            }
        }*/






    public static void menuPrincipal(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nBienvenido a ReservaYa");

        System.out.println("En cual restuarante desea reservar?");

        for(int i = 0; i < nRes; i++) {
            System.out.println(i + 1 + ". " + restaurantes[i]);
        }
        int n = entrada.nextInt();
        switch(n){
            case 1:
            {
                reserva(p1, c1, 1);
                break;

            }
            case 2:
            {
                reserva(p2, c2, 2);
                break;

            }
            case 3:
            {
                reserva(p3, c3, 3);
                break;
            }

        }


        }







    }

















