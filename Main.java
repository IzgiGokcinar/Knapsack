package KnapsackProblem;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            
            String filePath = "test.in";
          

            
            File file = new File(filePath);
            if (!file.exists()) {
                System.err.println("File not found: " + file.getAbsolutePath());
                return;
            }

           
            KnapsackProblemClass problem = readFromFile(filePath);

            GreedySolver greedySolver = new GreedySolver();
            Solution greedySolution = greedySolver.solve(problem);

            
            System.out.println("Greedy Algorithm Result:");
            System.out.println("Total Profit: " + greedySolution.getTotalProfit());
            System.out.println("Total Weight: " + greedySolution.getTotalWeight());
            System.out.println("Selected Items: " + greedySolution.getSelectedItems());
        } catch (IOException e) {
            System.err.println("Error reading the problem file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    
    public static KnapsackProblemClass readFromFile(String filepath) throws IOException {
        Scanner scanner = new Scanner(Path.of(filepath));
        long numberOfItems = scanner.nextLong();

        List<Item> items = new ArrayList<>();
        for (int i = 0; i < numberOfItems; i++) {
            items.add(new Item(scanner.nextLong(), scanner.nextLong(), scanner.nextLong()));
        }

        long capacity = scanner.nextLong();
        scanner.close();

        return new KnapsackProblemClass(items, capacity);
    }
}
