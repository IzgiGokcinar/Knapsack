package KnapsackProblem;

import java.util.*;

public class Solution {
    private final List<Item> items;
    private final long totalProfit;
    private final long totalWeight;

    public Solution(List<Item> items, long totalProfit, long totalWeight) {
        this.items = items;
        this.totalProfit = totalProfit;
        this.totalWeight = totalWeight;
    }

    public long getTotalProfit() {
        return totalProfit;
    }

    public long getTotalWeight() {
        return totalWeight;
    }

    public List<Item> getSelectedItems() {
        return items;
    }

    public void print() {
        System.out.println("Total Profit: " + totalProfit);
        System.out.println("Total Weight: " + totalWeight);
        System.out.println("Selected Items:");
        for (Item item : items) {
            System.out.println(item);  // This automatically calls item.toString()
        }
    }

    }

    

