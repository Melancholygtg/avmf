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
            //Construct  a Vector to store generated data from getNeighbors() function
            Vector<Integer> neighbors = getNeighbors(var.getValue());
            continue_searching = false;
            currentVal = objFun.evaluate(vector);
            for (Integer neighborNumber : neighbors) {
                var.setValue(neighborNumber);
                neighborVal = objFun.evaluate(vector);

                //Update the best solution and keep searching better solution
                if (neighborVal.betterThan(currentVal)) {
                    currentVal = neighborVal;
                    continue_searching = true;
                    bestVal = neighborNumber;
                }
            }
            //Stop searching when the iterative finishes and return the best result
            if (!continue_searching) {
                var.setValue(bestVal);
                break;
            }
        }
    }

    private Vector<Integer> getNeighbors(int current) {
        Vector<Integer> neighbors = new Vector<Integer>();
        //Enter the iterative process.
        //The program becomes the most efficiency when the iterative times is 1000 by testing
        for (int i = 0; i < 1000; i++) {
            //get a new neighbor
            int neighbor = (int) ((current) * Math.random()+(current) / 2);
            //add the neighbor to the list if not in the list
            if (!neighbors.contains(neighbor)) {
                neighbors.addElement(neighbor);
            }
        }
        //return all neighbors found!
        return neighbors;
    }
}