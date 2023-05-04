package CollectionFramework;

import java.util.*;

public class MoneyComparator implements Comparator<GeniusStudent>  {

	@Override
	public int compare(GeniusStudent o1, GeniusStudent o2) {
		
		if(o1.money > o2.money)
		{
			return -1;
		}
		else if(o1.money < o2.money)
		{
			return 1;
		}
		else
		{
		   return 0;	
		}
		
	}
	
	

}
