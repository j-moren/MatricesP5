public class MatricesP5 {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();

        int[][] matriz = metodos.solicitarDimensión();// Solicitar Dimensiones de la Matriz

        metodos.llenarMatriz(matriz);// Llenar Matriz con Valores Aleatorios

        System.out.println("Matriz Original:");// Mostrar Matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println();// Salto de línea después de cada fila
        }
        int[] vector = metodos.matrizAVector(matriz);// Convertir la Matriz en Vctor

        metodos.imprimirVector(vector);
    }
}