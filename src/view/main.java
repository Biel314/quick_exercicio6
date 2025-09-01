package view;

import controller.difSorts;

public class main {

	public static void main(String[] args) {
		difSorts dif = new difSorts();
		
		int j = 1499;
		int[] arr = new int[1500];
		int fim = arr.length - 1;
		
		for(int i = 0; i < fim; i++) {
			arr[i] = j;
			j--;
		}
		
		dif.tempoRespostaBubble(arr);
		dif.tempoRespostaMerge(arr, 0, fim);
		dif.tempoRespostaQuick(arr, 0, fim);
		
	}

}
