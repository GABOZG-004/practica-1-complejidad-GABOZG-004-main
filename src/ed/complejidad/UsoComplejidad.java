package ed.complejidad;

public class UsoComplejidad{

    public static void main(String[] args){

        //Triángulo Pascal Rec

        Complejidad comp1 = new Complejidad();
        //Ejemplo de uso para la implementación recursiva
        int fila = 4;
        int columna = 2;

        try{

            int resultado = comp1.tPascalRec(fila, columna);
            System.out.println("Elemento en la fila " + fila + ", columna " + columna + ": " + resultado);

            long contadorPascalRec = comp1.leeContador();
            System.out.println("Número de operaciones realizadas: " + contadorPascalRec);

        } catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        //Triangulo Pascal It

         //Ejemplo de uso para la implementación iterativa
        try{

            int resultado = comp1.tPascalIt(fila, columna);
            System.out.println("Elemento en la fila " + fila + ", columna " + columna + ": " + resultado);

            long contadorPascalIt = comp1.leeContador();
            System.out.println("Número de operaciones realizadas: " + contadorPascalIt);

        } catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        //Fibonacci Rec

         //Ejemplo de uso para la implementación recursiva
        Complejidad comp2 = new Complejidad();
        int n = -8;

        try{

            int resultado = comp2.fibonacciRec(n);
            System.out.println("Término " + n + " de la secuencia de Fibonacci: " + resultado);

            long contadorFibonacciRec = comp2.leeContador();
            System.out.println("Número de operaciones realizadas: " + contadorFibonacciRec);

        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //Fibonacci It

         //Ejemplo de uso para la implementación iterativa

        try{

            int resultado = comp2.fibonacciRec(n);
            System.out.println("Término " + n + " de la secuencia de Fibonacci: " + resultado);

            long contadorFibonacciIt = comp2.leeContador();
            System.out.println("Número de operaciones realizadas: " + contadorFibonacciIt);

        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}