package logic.decorations;

import java.util.ArrayList;
import java.util.List;

import logic.Category;
import logic.Component;
import logic.Decorator;
import logic.TripBean;

public class RelaxDecorator extends Decorator{

	public RelaxDecorator(Component component) {
		super(component);
	}

	@Override
	public List<TripBean> applyFilter() {
		List<TripBean> trips = super.applyFilter();
		return this.applyRelaxFilter(trips);
	}
	
	protected List<TripBean> applyRelaxFilter(List<TripBean> list) {
		List<TripBean> filtered = new ArrayList<>();
		for (TripBean bean: list) {
			if (bean.getCat1().equals(Category.RELAX) || bean.getCat2().equals(Category.RELAX)) filtered.add(bean);
		}
		
		return filtered;
	}

}
