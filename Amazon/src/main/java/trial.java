import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class trial {
	
	

	public static void main(String[] args) {
		
		int p=12;
		boolean flag=false;
		for(int i=2;i<=p/2;i++) {
			if(p%2==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("prime");
		}
		else {
			System.out.println("not");
		}
		
		
		
		/*
		 * String s="ummul"; StringBuffer b=new StringBuffer(s);
		 * System.out.println(b.insert(3,"D"));
		 * System.out.println(b.reverse().toString());
		 */
		
		
		/*
		 * Map<Integer,String>map=new HashMap<>(); map.put(1,"m"); map.put(3,"n");
		 * Set<Entry<Integer,String>>set=map.entrySet(); Iterator it=set.iterator();
		 * while(it.hasNext()) { Map.Entry m=(Map.Entry)it.next();
		 * System.out.println(m.getKey()+"  ");System.out.println(m.getValue()+"  "); }
		 */
		//System.out.println(map.get(key));
		
		
		/*
		 * map.put(4,"g"); Set<Entry<Integer, String>> set=map.entrySet(); Iterator
		 * it=set.iterator(); while(it.hasNext()) { Map.Entry m=(Map.Entry)it.next();
		 * System.out.print(m.getKey()); System.out.print(m.getValue()); }
		 * 
		 */
		
		
		
		
	}
}