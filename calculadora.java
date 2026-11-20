import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        String operador="";
        double operando1 , operando2;

    do{
        System.out.println("que opcion deseas realizar?");
        System.out.println("A) suma de dos numeros");
        System.out.println("B) resta de dos numeros");
        System.out.println("C) multiplicacion de dos numeros");
        System.out.println("D) division de dos numeros");
        System.out.println("E) modulo de dos numero");
        System.out.println("F) suma de matrices");
        System.out.println("G) resta de matrices");
        System.out.println("H) salir");
        operador = usuario.next();

        switch (operador) {
            case "A":
                System.out.println("ingresa el primer numero");
                operando1 = usuario.nextDouble();
                System.out.println("ingresa el segundo numero");
                operando2 = usuario.nextDouble();
                System.out.println("la suma es: " + (operando1 + operando2));
                System.out.println();
                break;

            case "B":
                System.out.println("ingresa el primer numero");
                operando1 = usuario.nextDouble();
                System.out.println("ingresa el segundo numero");
                operando2 = usuario.nextDouble();
                System.out.println("la resta es: " + (operando1 - operando2));
                System.out.println();
                break;


            case "C":
                System.out.println("ingresa el primer numero");
                operando1 = usuario.nextDouble();
                System.out.println("ingresa el segundo numero");
                operando2 = usuario.nextDouble();
                System.out.println("la multiplicacion es: " + (operando1 * operando2));
                System.out.println();
                break;

            case "D":
                System.out.println("ingresa el primer numero");
                operando1 = usuario.nextDouble();
                System.out.println("ingresa el segundo numero");
                operando2 = usuario.nextDouble();
                System.out.println("la division es: " + (operando1 / operando2));
                System.out.println();
                break;

            case "E":
                System.out.println("ingresa el primer numero");
                operando1 = usuario.nextDouble();
                System.out.println("ingresa el segundo numero");
                operando2 = usuario.nextDouble();
                System.out.println("el modulo es: " + (operando1 % operando2));
                System.out.println();
                break;

            case "F":
                System.out.println("cuantas filas tendran las matrices?");
                int filas = usuario.nextInt();
                System.out.println("cuantas columnas tendran las matrices?");
                int columnas = usuario.nextInt();

                int[][] matrizA = new int[filas][columnas];
                int[][] matrizB = new int[filas][columnas];
                int[][] matrizC = new int[filas][columnas];

                System.out.println("ingresa los valores de la primera matriz");

                for (int i = 0; i < filas; i++) {

                    for (int j = 0; j < columnas; j++) {

                        matrizA[i][j] = usuario.nextInt();

                    }
                }


                System.out.println("Ingresa los valores de la segunda matriz");

                for (int i = 0; i < filas; i++) {

                    for (int j = 0; j < columnas; j++) {

                        matrizB[i][j] = usuario.nextInt();

                    }   
                }
                for (int i = 0; i < filas; i++) {

                    for (int j = 0; j < columnas; j++) {

                        matrizC[i][j] = matrizA[i][j] + matrizB[i][j];

                    }
                }

                System.out.println("Resultado de la suma:");

                for (int i = 0; i < filas; i++) {

                    for (int j = 0; j < columnas; j++) {

                        System.out.print(matrizC[i][j] + " ");

                    }

                    System.out.println();
                }
                System.out.println();
                break;

            case "G":
                System.out.println("cuantas filas tendran las matrices?");
                int filas2 = usuario.nextInt();
                System.out.println("cuantas columnas tendran las matrices?");
                int columnas2 = usuario.nextInt();

                int[][] matrizA2 = new int[filas2][columnas2];
                int[][] matrizB2 = new int[filas2][columnas2];
                int[][] matrizC2 = new int[filas2][columnas2];

                System.out.println("ingresa los valores de la primera matriz");

                for (int i = 0; i < filas2; i++) {

                    for (int j = 0; j < columnas2; j++) {

                        matrizA2[i][j] = usuario.nextInt();

                    }
                }


                System.out.println("Ingresa los valores de la segunda matriz");

                for (int i = 0; i < filas2; i++) {

                    for (int j = 0; j < columnas2; j++) {

                        matrizB2[i][j] = usuario.nextInt();

                    }   
                }
                for (int i = 0; i < filas2; i++) {

                    for (int j = 0; j < columnas2; j++) {

                        matrizC2[i][j] = matrizA2[i][j] - matrizB2[i][j];

                    }
                }

                System.out.println("Resultado de la resta:");

                for (int i = 0; i < filas2; i++) {

                    for (int j = 0; j < columnas2; j++) {

                        System.out.print(matrizC2[i][j] + " ");

                    }

                    System.out.println();
                }
                System.out.println();
                break;

            case "H":
                operador = "H";
                break;

            default:
                System.out.println("opcion no valida");
                operador = "H";
                System.out.println();
                break;
        }




    } while (!operador.equalsIgnoreCase("H")); 


    usuario.close();
}
}