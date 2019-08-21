import java.util.Scanner;

public class AdivinaElNumero {

    private Scanner entrada = new Scanner(System.in);
    private boolean juegoActivo = true;

    public void jugar() {
        System.out.println("Hola, ¿cuál es tu nombre?");
        String nombreJugador = entrada.nextLine();
        System.out.printf("Bienvenido %s, vamos a comenzar\n", nombreJugador);

        while (juegoActivo) {
            int intentos = 0;
            int min = 0;
            int max = 20;
            int numeroJuego = (int) (Math.random() * ((max - min) + 1));


            System.out.printf("%s he escogido un número entre %d y %d, adivínalo\n", nombreJugador, min, max);
            int numeroJugador;


            do {
                System.out.println("Escoge un número");
                numeroJugador = entrada.nextInt();

                if (numeroJuego < numeroJugador) {
                    System.out.println("Muy alto, adivina otra vez");
                } else if (numeroJuego > numeroJugador) {
                    System.out.println("Muy bajo, adivina otra vez");
                }
                intentos++;

            } while (numeroJuego != numeroJugador);

            System.out.printf("Has ganado, intentos %d", intentos);

            juegoActivo = false;
        }

    }
}
