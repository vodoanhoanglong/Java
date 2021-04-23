package w6;

import java.util.Comparator;

public class ByCostAndDateOrder implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		int re = -Integer.compare(o1.cost(), o2.cost()); // sắp xếp giảm dần hoặc int re = Integer.compare(o2.cost(), o1.cost()); cũng giảm dần
		if(re==0) {
			return -o1.getDate().compareTo(o2.getDate()); // sắp xếp giảm dần hoăc return o2.getDate().compareTo(o1.getDate()); cũng giảm dần
		}
		return re;
	}

}
