package logic;

import java.util.ArrayList;
import java.util.List;

import logic.decorations.AdventureDecorator;
import logic.decorations.RelaxDecorator;

public class Main {

	public static void main(String [] args) {
		List<TripBean> trips = new ArrayList<>();
		
		TripBean trip1 = new TripBean();
		trip1.setTitle("Viaggio1");
		trip1.setCat1(Category.RELAX);
		trip1.setCat2(Category.FUN);

		TripBean trip2 = new TripBean();
		trip2.setTitle("Viaggio2");
		trip2.setCat1(Category.ADVENTURE);
		trip2.setCat2(Category.RELAX);
		
		TripBean trip3 = new TripBean();
		trip3.setTitle("Viaggio3");
		trip3.setCat1(Category.FUN);
		trip3.setCat2(Category.CULTURE);
		
		TripBean trip4 = new TripBean();
		trip4.setTitle("Viaggio4");
		trip4.setCat1(Category.ADVENTURE);
		trip4.setCat2(Category.CULTURE);
		
		trips.add(trip1);
		trips.add(trip2);
		trips.add(trip3);
		trips.add(trip4);
		
		TripList tripsList = new TripList();
		tripsList.setList(trips);
		
		System.out.println("Applico filtro Avventura");
		AdventureDecorator advDeco = new AdventureDecorator(tripsList);
		System.out.println(advDeco.applyFilter());
		
		System.out.println("Applico filtro Avventura e Relax");
		Decorator deco = new AdventureDecorator(new RelaxDecorator(tripsList));
		System.out.println(deco.applyFilter());
		
		System.out.println("Applico filtro Relax");
		Decorator deco1 = new RelaxDecorator(tripsList);
		System.out.println(deco1.applyFilter());
		
		System.out.println("Applico filtro Avventura e Cultura");
		Decorator deco2 = new AdventureDecorator(new RelaxDecorator(tripsList));
		System.out.println(deco2.applyFilter());
	}
}
