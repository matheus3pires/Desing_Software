package br.com.pires.builder.after;

import br.com.pires.builder.after.builder.FastFoodMealBuilder;
import br.com.pires.builder.after.builder.FatMealBuilder;
import br.com.pires.builder.after.builder.JustFriesBuilder;
import br.com.pires.builder.after.builder.Menu1Builder;
import br.com.pires.builder.after.builder.Menu2Builder;
import br.com.pires.builder.after.director.MealDirector;

public class Client {
	
	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.constructCombo();
		System.out.println(director.getCombo());
		
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		order("Burguer", new Menu1Builder());
		order("Veggie Burguer", new Menu2Builder());
		order("Just Fries", new JustFriesBuilder());
		order("Heart Atack", new FatMealBuilder());
	}
}