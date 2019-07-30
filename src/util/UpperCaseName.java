package util;

import java.util.function.Function;

import entities.Product;

//tipo de entrada o Product e saída String que é a resposta
public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
