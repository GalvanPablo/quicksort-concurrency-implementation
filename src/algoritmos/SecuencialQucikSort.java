package algoritmos;

public abstract class SecuencialQucikSort {
	public static void sort(int[] arr) {
		quickSort(arr, 0, arr.length-1); // Empieza el ordenamiento
	}
	
	private static void quickSort(int[] arr, int low, int high) {
		if(low < high) {	// Condicón de parada - asegura que el algoritmo continúe dividiendo y ordenando subarreglos mientras haya elementos sin ordenar
			// PASO 1 - ELECCIÓN DEL PIVOTE
			int pivotIndex = medianOfThree(arr, low, high);	// Trata de obtener el mejor pivote posible en base a la mediana de los elementos en las posiciones "0" "n/2" y "n"
			int pivot = arr[pivotIndex];	// Obtiene el valor del pivote
			swap(arr, pivotIndex, high);	// Intercambia el pivote con el elemento en la posición high
			
			// PASO 2 - PARTICIÓN 
            int partitionIndex = partition(arr, low, high, pivot);	// Particiona el arreglo y obtiene el índice de partición
            
            // PASO 3 - ORDENAMIENTO RECURSIVO
            quickSort(arr, low, partitionIndex - 1);	// Ordeno recursivamente el segmento Izquierdo (elementos menores al pivote)
            quickSort(arr, partitionIndex + 1, high);	// Ordeno recursivamente el segmento Derecho (elementos mayores al pivote)
		}
		// Si low no es menor que high, la recursión termina.
	}
	
	private static int partition(int[] arr, int low, int high, int pivot) {
        int i = low;	// Inicializa el índice i con el valor de low
        for (int j = low; j < high; j++) {	// Recorre el arreglo desde low hasta high - 1
            if (arr[j] < pivot) {	 // Si el elemento actual es menor que el pivote
                swap(arr, i, j);	// Intercambia el elemento en la posición i con el elemento en la posición j
                i++;	// Incrementa i
            }
        }
        swap(arr, i, high);	// Intercambia el elemento en la posición i con el elemento en la posición high (el pivote)
        return i;	// Devuelve el índice de partición.
    }
	
	
	private static void swap(int[] arr, int i, int j) {
		// Intercambia los elementos en las posiciones i y j del arreglo.
		int temp = arr[i];	// Guardo el valor del elemento i en un auxiliar
		arr[i] = arr[j];	// El valor de la posicion i ahora es igual al de la posicion j
		arr[j] = temp;		// Asigno el valor en el auxiliar a la posicion j
	}
	
	
	private static int medianOfThree(int[] arr, int low, int high) {
		int mid = (low + high) / 2;	// Calcula el índice medio del arreglo.
        int a = arr[low], b = arr[mid], c = arr[high]; // Almacena los valores de los elementos en low, mid y high.
        
        if(b < a && a < c) return low;		// Si el valor del elemento en low esta entre el de mid y high
        if(a < b && b < c) return mid;	// Si el valor del elemento en mid esta entre el de low y high
        return high;	// El valor del elemento high esta entre el de low y mid
	}
}
