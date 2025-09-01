package controller;

import libQuick.Quick;
import br.edu.fatec.ordem.Crescente;

public class difSorts {
	Quick quick = new Quick();
	Crescente cresc = new Crescente();
	
	public difSorts() {
		super();
	}

	
	public void tempoRespostaBubble(int[] arr) {
		double tInicial = System.nanoTime();
		cresc.bubble(arr);
		double tFinal = System.nanoTime();
		
		double tTotal = tFinal - tInicial;
		
		tTotal = (tTotal / Math.pow(10, 9));
		
		System.out.println("BubbleSort = "+tTotal +"s. ");
		
	}
	
	
	public void tempoRespostaMerge(int[] arr, int inicio, int fim) {
		double tInicial = System.nanoTime();
		cresc.merge(arr, inicio, fim);
		double tFinal = System.nanoTime();
		
		double tTotal = tFinal - tInicial;
		
		tTotal = (tTotal / Math.pow(10, 9));
		
		System.out.println("MergeSort = "+tTotal +"s. ");
		
	}
	
	
	public void tempoRespostaQuick(int[] arr, int inicio, int fim) {
		double tInicial = System.nanoTime();
		quick.sort(arr, inicio, fim);
		double tFinal = System.nanoTime();
		
		double tTotal = tFinal - tInicial;
		
		tTotal = (tTotal / Math.pow(10, 9));
		
		System.out.println("Quick = " + tTotal +"s. ");
		
	}
	
}
