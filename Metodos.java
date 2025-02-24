import java.util.Random;
import java.util.Scanner;

public class Metodos {
    
    public int[][] solicitarDimensión() {
        Scanner sc = new Scanner(System.in);// Crear Objeto para Leer Entrada de datos

        System.out.println("Ingrese el Número de Filas de la Matriz: ");// Solicitar el Número de Filas
        int i = sc.nextInt();// Lee el Número de Filas

        System.out.println("Ingrese el Número de Columnas: ");// Solicitar el Número de Columnas
        int j = sc.nextInt();// Lee el Número de Columnas

        int [][] matriz = new int[i][j];// Crea Matriz con las Dimensiones Ingresadas

        sc.close();// Cierre Objeto Scanner

        return matriz;

    }
    public void llenarMatriz(int[][] matriz){
        Random rand = new Random();// Llenr Matriz con Valores Aleatorios

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][i] = rand.nextInt(101);// GEnera Números entre 0 a 100
            }
        }
    }
    public int[] matrizAVector(int[][] matriz) {
        int[] vector = new int[matriz.length * matriz[0].length];// Crear Vector con el Tamaño total de la Matriz (Columnas*Filas)
        int index =0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                vector [index++] = matriz[i][j];
            }
        }
        return vector;
    }
}
