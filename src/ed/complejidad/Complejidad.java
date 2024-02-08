package ed.complejidad;

public class Complejidad implements IComplejidad {

    private long contador;

    // Constructor
    public Complejidad(){
        // Inicializa el contador en 0 al crear una instancia de la clase
        contador = 0;
    }
    
    /**
	 * Devuelve el número de operaciones acumuladas desde la última vez que se
	 * reinició el contador.
	 *
	 * @return número de operaciones.
	 */
    public long leeContador(){
        return contador;
    }

    /**
	 * Método para calcular, de forma recursiva, el elemento en la fila
	 * <code>i</code>, en la columna <code>j</code> del triangulo de Pascal
	 *
	 * @param ren el numero de fila
	 * @param col el numero de columna Si es <code>null</code> no se realizará
	 * este cálculo.
	 * @return El elemento en la <code>i</code>-esima fila y la
	 * <code>j</code>-esima columna del triangulo de Pascal.
	 * @throws IndexOutOfBoundsException Si los indices <code>i</code> o
	 * <code>j</code> son inválidos
	 */
    public int tPascalRec(int ren, int col){

        // Incrementa el contador cada vez que se llama al método
        contador ++;

        // Verifica si los índices son inválidos
        if(ren < 0 || col < 0 || col > ren){
            throw new IndexOutOfBoundsException("Índices inválidos: ren=" + ren + ", col=" + col);
        }

        // Caso base: los elementos en los botes siemore son 1
        if(col == 0 || col == ren){
            return 1;
        }

        // Cálculo recursivo del elemento en el triángulo de Pascal
        return tPascalRec(ren - 1, col- 1) + tPascalRec(ren - 1, col);
    }

    /**
	 * Metodo para calcular, iterativamente, el elemento en la fila
	 * <code>i</code> y la columna <code>j</code> del triangulo de Pascal
	 *
	 * @param ren el numero de fila
	 * @param col el numero de columna
	 * @return El elemento en la i-esima fila y la j-esima columna del triangulo
	 * de Pascal.
	 * @throws IndexOutOfBoundsException Si los indices <code>i</code> o
	 * <code>j</code> son inválidos
	 */
    public int tPascalIt(int ren, int col){

        // Verifica si los índices son inválidos
        if(ren < 0 || col < 0 || col > ren){
            throw new IndexOutOfBoundsException("Índices inválidos: ren=" + ren + ", col=" + col);
        }

        // Inicializa un arreglo para almacenar las filas del triangulo de Pascal
        int[][] triangulo = new int[ren + 1][ren + 1];

        // Llena el triángulo de Pascal iterativamente
        for(int i = 0; i <= ren; i++){
            for(int j = 0; j <= i; j++){

                // Incrementa el contador cada vez que se llama al método
                contador ++;

                // Los elementos en los bordes siempre son 1
                if(j == 0 || j == i){
                    triangulo[i][j] = 1;
                }

                else{
                    // Cálculo del elemento en el interior del triángulo
                    triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
                }
            }
        }

        // Devuelve el elemento calculado
        return triangulo[ren][col];
    }

    /**
	 * Devuelve el n-esimo elemento, calculado de forma recursiva, de la
	 * sucesion de Fibonacci.  Por conveción fibonacci(0) = 0, fibonacci(1) = 1.
	 *
	 * @param n el indice del elemento que se desea calcular
	 * @return el n-esimo elemento de la sucesion de Fibonacci
	 * @throws IndexOutOfBoundsException Si el valor de <code>n</code>es
	 * inválido
	 */
    public int fibonacciRec(int n){

        // Verifica si el índice es inválido
        if(n < 0){
            throw new IndexOutOfBoundsException("Índice inválido: " + n);
        }

        // Caso base: los primeros dos términos de la secuencia son 0 y 1
        if(n == 0){
            return 0;
        }

        else if(n == 1){
            return 1;
        }

        // Incrementa el contador cada vez que se llama al método
        contador ++;

        //Cálculo recursivo del término en la secuencia de Fibonacci
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

    /**
	 * Devuelve el n-esimo elemento, calculado de forma iterativa, de la
	 * sucesion de Fibonacci.  Por conveción fibonacci(0) = 0, fibonacci(1) = 1.
	 *
	 * @param n el indice del elemento que se desea calcular
	 * @return el n-esimo elemento de la sucesiond de Fibonacci
	 * @throws IndexOutOfBoundsException Si el valor de <code>n</code>es
	 * inválido
	 */
    public int fibonacciIt(int n){

        // Verifica si el índice es inválido
        if(n < 0){
            throw new IndexOutOfBoundsException("Índice inválido: " + n);
        }

         // Caso base: los primeros dos términos de la secuencia son 0 y 1
        if(n == 0){
            return 0;
        }

        else if(n == 1){
            return 1;
        }

        // Inicializa los primeros dos términos
        int a = 0;
        int b = 1;

         // Calcula los términos sucesivos iterativamente
        for(int i = 2; i <= n; i++){
            int temp = a + b;
            a = b;
            b = temp;
            // Incrementa el contador cada vez que se llama al método
            contador ++;
        }

          // Devuelve el n-ésimo término
        return b;
    }
}
