package controller;

import java.util.Iterator;

import bilbioteca.fila.dinamica.generica.model.Lista;
import model.Barra;

public class ControllerBarras {
	Lista<Barra>[] barras = new Lista[5];

	public ControllerBarras() {
		int tamanho = barras.length;
		for (int i = 0; i < tamanho; i++) {
			barras[i] = new Lista<Barra>();
		}
	}

	private int hashCode(double volume) {
		int hash = (int) (volume / 50) - 1;
		return hash;
	}

	public void add(Barra barra) throws Exception {
		if (VerificaVolume(barra.volume) == true) {
			int hash = hashCode(barra.volume);
			Lista<Barra> l = barras[hash];
			if (l.isEmpty()) {
				l.addFirst(barra);
			} else {
				l.addLast(barra);
			}
		} else {
			System.err.println("Volume" +  barra.volume + " não pode ser adicionado ao sistema pois é inválido");
		}

	}

	private boolean VerificaVolume(double volume) {
		if (volume <= 50 || volume >= 60 && volume <= 100 || volume >= 110 && volume <= 150
				|| volume >= 165 && volume <= 200 || volume >= 220 && volume <= 260 || volume >= 280) {
			return false;
		} else {
			return true;
		}

	}

	public void conta() throws Exception {
		int total = 0;
		String [] doce = {"Bombons","Pavês", "Brigadeiros", "Bolos", "Ovos de Páscoa"};
				
		for (int i = 0; i < barras.length; i++) {
			Lista<Barra> l = barras[i];
			int tamanho = l.size();
			System.out.println("Para o preparo de " + doce[i] + " temos " + tamanho + " unidade(s) de chocolate");
			total = total + tamanho;
		}
		System.out.println("Total: " + total);
		
	}

}
