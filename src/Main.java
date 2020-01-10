import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        Persona persona1 = new Persona();


        //Escribir datos
        System.out.println("El nombre de la persona es: " + "Eldigan");
        System.out.println("Cual es su peso: ");
        persona1.peso = teclado.nextDouble();
        System.out.println("Cual es su estatura: ");
        persona1.altura = teclado.nextDouble();

        //Formulas
        //Peso
        persona1.imc = persona1.peso/(persona1.altura*persona1.altura);
        System.out.println("Su imc es: " +persona1.imc);
        if (persona1.imc<20){
            System.out.println("Bajo peso");
        } else if (persona1.imc>=20 && persona1.imc<=25){
            System.out.println("Peso promedio");
        } else if (persona1.imc>25){
            System.out.println("Sobrepeso");
        }
        //Edad
        System.out.println("Ingrese su edad:");
        persona1.edad = teclado.nextDouble();
        if (persona1.edad>18){
            System.out.println("Es mayor de edad");
        } else{
            System.out.println("Es menor de edad");
        }
        System.out.println("Indicar sexo: ");
        persona1.sexo = teclado.next();
        if(persona1.sexo=="M"){
            System.out.println("Es mujer");
        } else if (persona1.sexo=="H") {
            System.out.println("Es hombre");
        }
        //Instancionamos la clase randon para generar numeros aleatorios
        Random randon = new Random();
        //Creamos una matriz cuadrada de tamanio 5 x 5, es decir, 5 filas y 5 columnas
        double [][] matriz = new double [5][5];
        // dos for para recorrer cada posicion de la matriz y agregar el numero
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //asignacion de numero aleatorio
                matriz[i][j] = randon.nextInt() +randon.nextDouble();
            }
        }
        //imprimir respuesta
        String respuesta = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                respuesta = respuesta +" "+ matriz[i][j];
            }
            respuesta = respuesta + "\n";
        }
        System.out.println(respuesta);
    }
}
