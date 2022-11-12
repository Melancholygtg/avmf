package org.avmframework.localsearch;

import org.avmframework.objective.ObjectiveValue;
import org.avmframework.TerminationException;
import java.util.*;


public class HillClimbingSearch extends LocalSearch {

    private ObjectiveValue neighborVal;
    private ObjectiveValue currentVal;

    public HillClimbingSearch() {}

    protected void performSearch() throws TerminationException {

        boolean continue_searching = true;
        int bestVal = var.getValue();
        while (continue_searching) {
            // Storing generated data from getNeighbors() function
            ArrayList<Integer> neighbors = getNeighbors(var.getValue());
            continue_searching = false;
            currentVal = objFun.evaluate(vector);
            for (Integer neighborNumber : neighbors) {
                var.setValue(neighborNumber);
                neighborVal = objFun.evaluate(vector);

                // Update the best solution and keep searching better solution
                if (neighborVal.betterThan(currentVal)) {
                    currentVal = neighborVal;
                    continue_searching = true;
                    bestVal = neighborNumber;
                }
            }
            // Stop searching when the iterative finishes and return the best result
            if (!continue_searching) {
                var.setValue(bestVal);
                break;
            }
        }
    }

    private ArrayList<Integer> getNeighbors(int current) {
        ArrayList<Integer> neighbors = new ArrayList<Integer>();
        // A neighbor size of 1000 is the best through our preliminary testing
        for (int i = 0; i < 1000; i++) {
            // Get new neighbors
            int neighbor = (int) Math.round((current * Math.random() + current / 2));
            // Add the neighbor to the list if not in the list
            if (!neighbors.contains(neighbor)) {
                neighbors.add(neighbor);
            }
        }

        return neighbors;
    }
}