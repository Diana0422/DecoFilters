package logic.decorations;

import java.util.ArrayList;
import java.util.List;

import logic.Category;
import logic.Component;
import logic.Decorator;
import logic.TripBean;

public class FunDecorator extends Decorator {

	protected FunDecorator(Component component) {
		super(component);
	}
	
	@Override
	public List<TripBean> applyFilter() {
		List<TripBean> trips = super.applyFilter();
		return this.applyFunFilter(trips);
	}
	
	public List<TripBean> applyFunFilter(List<TripBean> list) {
		List<TripBean> filtered = new ArrayList<>();
		for (TripBean bean: list) {
			if (bean.getCat1().equals(Category.FUN) || bean.getCat2().equals(Category.FUN)) filtered.add(bean);
		}
		
		return filtered;
	}

	
}
