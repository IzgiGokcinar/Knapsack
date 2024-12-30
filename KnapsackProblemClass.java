package KnapsackProblem;

import java.util.ArrayList;
import java.util.List;

public class KnapsackProblemClass {
	
	    private final List<Item> items;
	    private final long capacity;

	    public KnapsackProblemClass(List<Item> items, long capacity) {
	        this.items = new ArrayList<>(items);
	        this.capacity = capacity;
	    }

	    public KnapsackProblemClass(String filePath) {
			this.items = null;
			this.capacity = 0;
		}

		public List<Item> getItems() {
	        return items; 
	    }

	    public long getCapacity() {
	        return capacity;
	    }
	}

