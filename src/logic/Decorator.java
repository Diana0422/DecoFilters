package logic;

import java.util.List;

public abstract class Decorator extends Component{

	private Component comp;
	
	protected Decorator(Component component) {
		this.comp = component;
	}
	
	@Override
	public List<TripBean> applyFilter() {
		return this.comp.applyFilter();
	}
	
	
	
}
