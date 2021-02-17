package logic;

import java.util.List;

public class TripList extends Component{

	private List<TripBean> list;

	public List<TripBean> getList() {
		return list;
	}

	public void setList(List<TripBean> list) {
		this.list = list;
	}

	@Override
	public List<TripBean> applyFilter() {
		return this.list;
	}
}
