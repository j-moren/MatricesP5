import java.util.Scanner;

public class Metodos {
    
    public int[][] solicitarDimensión() {
        Scanner sc = new Scanner(System.in);// Crear Objeto para Leer Entrada de datos

        System.out.println("Ingrese el Número de Filas de la Matriz: ");// Solicitar el Número de Filas
        int i = sc.nextInt();// Lee el Número de Filas

        System.out.println("Ingrese el Número de Columnas: ");// Solicitar el Número de Columnas
        int j = sc.nextInt();// Lee el Número de Columnas

        int [][] matriz = new int[i][j];// Crea Matriz con las Dimensiones Ingresadas

        sc.close();

    }
}
