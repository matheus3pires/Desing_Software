package br.com.pires.builder.before;

import br.com.pires.builder.before.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal burguerCombo = new FastFoodMeal("Coke", "CheeseBurguer", "Fries");
		System.out.println(burguerCombo);
		
		FastFoodMeal justFries = new FastFoodMeal(null, null, "Fries");
		System.out.println(justFries);
		
		FastFoodMeal heartAtackCombo = new FastFoodMeal("Milk Shake", "Monster Burguer", "Large Fries", "Fudge Cake", "2 Kilograms");
		System.out.println(heartAtackCombo);
	}
}
