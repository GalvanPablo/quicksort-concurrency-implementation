package test;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import algoritmos.SecuencialQucikSort;
import datos.Casos;
import datos.VolumenesDeDatos;
import algoritmos.ConcurrentQucikSort;
import utilidades.Cronometro;
import utilidades.Vector;

public class Pruebas {

	public static void main(String[] args) {
		Cronometro cron = new Cronometro(TimeUnit.MILLISECONDS,4);
		
		int[] arrS = null, arrC = null;
		
		Casos caso = Casos.ELEMENTOS_IDENTICOS;	// Elegir el caso
		VolumenesDeDatos volumen = VolumenesDeDatos.DIEZ;	// Elegir el volumen de datos (n)
		
		
		switch (caso) {
			case ALEATORIO:
				arrS = Vector.generarAleatorio(volumen.getN(), -1000, 1000);
			break;
			case ORDENADO:
				arrS = Vector.generarOrdenado(volumen.getN());
			break;
			case ORDENADO_INVERSO:
				arrS = Vector.generarOrdenadoInverso(2500);
			break;
			case ELEMENTOS_IDENTICOS:
				arrS = Vector.generarElementosIdenticos(1200);
			break;
		}
		
		arrC = Arrays.copyOf(arrS, arrS.length);
		
		System.out.println("------------ CASO ------------");
		System.out.println(caso.getNombre() + "\nn = " + (new DecimalFormat("#,###").format(volumen.getN())) + " (" + volumen.getDescripcion() + ")");
		
		System.out.println("\n--------- Secuencial ---------");
		cron.iniciar();
		SecuencialQucikSort.sort(arrS);
		cron.detener();
		System.out.println("Demoró: " + cron.obtenerTiempo());
		
		cron.reiniciar();
		
		System.out.println("\n--------- Concurrente ---------");
		cron.iniciar();
		ConcurrentQucikSort.sort(arrC);
		cron.detener();
		System.out.println("Demoró: " + cron.obtenerTiempo());

	}

}
