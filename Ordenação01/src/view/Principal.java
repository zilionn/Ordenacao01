package view;

import controller.Ordena;

public class Principal {

	public static void main(String[] args) {
		Ordena ord = new Ordena();
		
		int[] vet = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		ord.ordenaBubble(vet);
		ord.ordenaMerge(vet);
	}
}
