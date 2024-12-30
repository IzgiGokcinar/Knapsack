package KnapsackProblem;

import java.util.*;

public class GreedySolver {
	
	    public Solution solve(KnapsackProblemClass  problem) {

	    List<Item> items = new ArrayList<>((Collection<Item>) problem.getItems());


        long capacity = problem.getCapacity();

        
        items.sort(Comparator.comparingDouble(item -> -((double) item.getProfit() / item.getWeight())));

        List<Item> selectedItems = new ArrayList<>();
        long totalWeight = 0, totalProfit = 0;

        for (Item item : items) {
            if (totalWeight + item.getWeight() <= capacity) {
                selectedItems.add(item);
                totalWeight += item.getWeight();
                totalProfit += item.getProfit();
            }
        }

        return new Solution(selectedItems, totalProfit, totalWeight);
    }

}
	
