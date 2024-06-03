package utilidades;

import java.util.Random;

public abstract class Vector {
	private static Random random = new Random();
	
	public static int[] generarAleatorio(int nElementos, int min, int max) {
		int[] vec = new int[nElementos];
		for (int i = 0; i < nElementos; i++) {
			vec[i] = random.nextInt(max - min + 1) + min;
		}    
		return vec;
	}
	
	public static int[] generarOrdenado(int nElementos) {
		int[] vec = new int[nElementos];
		for (int i = 0; i < nElementos; i++) {
			vec[i] = i+1;
		}    
		return vec;
	}
	
	public static int[] generarOrdenadoInverso(int nElementos) {
		int[] vec = new int[nElementos];
		for (int i = 0; i < nElementos; i++) {
			vec[i] = (nElementos) - i;
		}    
		return vec;
	}
	
	public static int[] generarElementosIdenticos(int nElementos) {
		int r = random.nextInt(100 - 0 + 1) + 0;
		int[] vec = new int[nElementos];
		for (int i = 0; i < nElementos; i++) {
			vec[i] = r;
		}    
		return vec;
	}
	
	public static void mostrar(int[] vec) {
		System.out.println(toString(vec));
	}
	
	public static String toString(int[] vec) {
		String sVec = "[";
		for (int i = 0; i < vec.length; i++) {
			sVec += vec[i];
			if(i < vec.length-1) {
				sVec += ",";
			}
		}
		sVec += "]";
		return sVec;
	}
}
