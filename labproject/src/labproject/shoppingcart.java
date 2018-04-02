package labproject;
import java.util.ArrayList;
public class shoppingcart {

	 private static ArrayList<String> items;
	    double total;

	    public shoppingcart(){
	        items = new ArrayList<String>();
	    }

	    public void addItems(String item){
	        items.add(item);
	    }

	    public void removeItems(String item){
	        items.remove(item);
	    }

	    public void getNumberOfItems(){
	        System.out.println(items.size());
	    }

	    public String getItemName(int index){
	        return items.get(index);
	    }

	
	}
