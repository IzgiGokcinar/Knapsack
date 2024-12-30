package KnapsackProblem;

import java.util.*;

public class RandomSolver {
	
	    public Solution solve(KnapsackProblemClass problem) {
	        Random random = new Random();
	        List<Item> items = problem.getItems();
	        long capacity = problem.getCapacity();

	        List<Item> selectedItems = new ArrayList<>();
	        long totalWeight = 0, totalProfit = 0;

	        while (true) {
	            Item item = items.get(random.nextInt(items.size()));
	            if (totalWeight + item.getWeight() > capacity) {
	                break;
	            }
	            if (!selectedItems.contains(item)) { 
	                selectedItems.add(item);
	                totalWeight += item.getWeight();
	                totalProfit += item.getProfit();
	            }
	        }

	        return new Solution(selectedItems, totalProfit, totalWeight);
	    }
	}

