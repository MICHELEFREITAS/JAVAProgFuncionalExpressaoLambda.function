package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//função map aplica função em cada elemento de uma stream(seq. de dados), gerando elementos transformados
		// converter list para stream: .stream()
		// converter stream para list: .collect(Collectors.toList())
		
		//obter o stream a partir dessa lista
		//cada elemento da lista aplicar uma instancia do UpperCaseName
		//atribui para uma nova lista de String. O map aplica uma nova lista(só funciona para stream)
		
		
		
		//expressaoo lambida inline passada direto dentro do map 
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		
		//imprimir a lista
		names.forEach(System.out::println);
	}

}
