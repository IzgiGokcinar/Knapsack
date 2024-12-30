package KnapsackProblem;

import java.io.IOException;

public class KnapsackSolver {

	    public static void main(String[] args) throws IOException {
	        String filePath = "test.in"; 
	        KnapsackProblemClass problem = new KnapsackProblemClass(filePath);

	        
	        GreedySolver greedySolver = new GreedySolver();
	        Solution greedySolution = greedySolver.solve(problem);
	        System.out.println("Greedy Solution:");
	        greedySolution.print();

	        
	        RandomSolver randomSolver = new RandomSolver();
	        long maxProfit = Long.MIN_VALUE;
	        int betterCount = 0;

	        for (int i = 0; i < 1_000_000; i++) {
	            Solution randomSolution = randomSolver.solve(problem);
	            if (randomSolution.getTotalProfit() > maxProfit) {
	                maxProfit = randomSolution.getTotalProfit();
	            }
	            if (randomSolution.getTotalProfit() > greedySolution.getTotalProfit()) {
	                betterCount++;
	            }
	        }

	        System.out.println("\nRandom Solution Stats:");
	        System.out.println("Maximum Random Profit: " + maxProfit);
	        System.out.println("Random Solutions Better than Greedy: " + betterCount + "/1,000,000");
	    }
	}
