package EnemyCombat.src;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author Yoon_914745
 * @version 3/17/19
 */
public class Menu {
	Message menu;
	
	/**
	 * The constructor for menu class.
	 * Instantiates an instance of Message interface that can accept Collection(classes that implemented Collection interface: like array, arraylist,etc)
	 * to print out a message.
	 */
	public Menu() {
		menu = collection -> {
			Iterator<?> iter = collection.iterator();
			String s = addMultiple("-", 40) + "\n";
			int count = 1, index = 1;
			while(iter.hasNext()) {
				s += String.format("%2d. %-15s\t", index++, iter.next());
				if(count == 2) {
					s += "\n";
					count = 0;
				}
				count++;
			}
			s += addMultiple("-", 40);
			return s;
		};
	}
	
	/**
	 * @param collection The collection for the instance menu to iterate through.
	 * @return The string representation of menu.
	 */
	public String message(Collection<?> collection) {
		return menu.message(collection);
	}
	
	/**
	 * @param segment The segment to repeated.
	 * @param occurrence The number of repetition.
	 * @return The string with the segment repeated #occurrence time.
	 */
	private String addMultiple(String segment, int occurrence) {
		String result = "";
		for(int i = 0; i < occurrence; i++) {
			result += segment;
		}
		return result;
	}
	
}
