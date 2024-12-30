/*package KnapsackProblem;

import java.util.Objects;

public class Item {
	 private final long id;
	    private final long profit;
	    private final long weight;

	    public Item(long id, long profit, long weight) {
	        this.id = id;
	        this.profit = profit;
	        this.weight = weight;
	    }

	    public long getId() {
	        return id;
	    }

	    public long getProfit() {
	        return profit;
	    }

	    public long getWeight() {
	        return weight;
	    }

	   
	    public double getProfitWeightRatio() {
	        return (double) profit / weight;
	    }

	    @Override
	    public String toString() {
	        return "Item{id=" + id + ", profit=" + profit + ", weight=" + weight + "}";
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Item item = (Item) o;
	        return id == item.id && profit == item.profit && weight == item.weight;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id, profit, weight);
	    }

}*/ 
package KnapsackProblem;

public class Item {
    private final long id;
    private final long profit;
    private final long weight;

    public Item(long id, long profit, long weight) {
        this.id = id;
        this.profit = profit;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public long getProfit() {
        return profit;
    }

    public long getWeight() {
        return weight;
    }

    // Override the toString method to format the Item as a string
    @Override
    public String toString() {
        return "Item{id=" + id + ", profit=" + profit + ", weight=" + weight + "}";
    }
}

