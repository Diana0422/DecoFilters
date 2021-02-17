package logic.decorations;

import java.util.ArrayList;
import java.util.List;

import logic.Category;
import logic.Component;
import logic.Decorator;
import logic.TripBean;

public class AdventureDecorator extends Decorator{

	public AdventureDecorator(Component component) {
		super(component);
	}
	
	@Override
	public List<TripBean> applyFilter() {
		List<TripBean> trips = super.applyFilter();
		return this.applyAdventureFilter(trips);
	}
	
	public List<TripBean> applyAdventureFilter(List<TripBean> list) {
		List<TripBean> filtered = new ArrayList<>();
		for (TripBean bean: list) {
			if (bean.getCat1().equals(Category.ADVENTURE) || bean.getCat2().equals(Category.ADVENTURE)) filtered.add(bean);
		}
		
		return filtered;
	}

}
