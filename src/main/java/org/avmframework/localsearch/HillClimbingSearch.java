package org.avmframework.localsearch;

import org.avmframework.objective.ObjectiveValue;
import org.avmframework.TerminationException;
import java.util.*;


public class HillClimbingSearch extends LocalSearch {

    //Initial parameters
    private ObjectiveValue currentVal;
    private ObjectiveValue neighborVal;
    // The program becomes the most efficiency when the iterative times is 1000 by testing
    private int Max_Count = 1000;

    public HillClimbingSearch() {}

    protected void performSearch() throws TerminationException {

        boolean still_searching = true;
        int bestVal = var.getValue();

        while (still_searching) {
            //Construct  a Vector to store generated data from getNeighbors() function
            Vector<Integer> neighbors = getNeighbors(var.getValue());
            still_searching = false;

            currentVal = objFun.evaluate(vector);

            for (Integer neighborNumber : neighbors) {
                var.setValue(neighborNumber);
                neighborVal = objFun.evaluate(vector);

                //Update the best solution and keep searching better solution
                if (neighborVal.betterThan(currentVal)) {
                    currentVal = neighborVal;
                    still_searching = true;
                    bestVal = neighborNumber;
                }
            }
            //Stop searching when the iterative finishes and return the best result
            if (!still_searching) {
                var.setValue(bestVal);
                break;
            }
        }
    }

    private Vector<Integer> getNeighbors(int currentVal) {
        Vector<Integer> neighbors = new Vector();
        //Enter the iterative process
        for (int i = 0; i < Max_Count; i++) {
            //generate a new solution
            int neighborVal = (int) ((currentVal / 2) + (currentVal * Math.random()));
            //Update the solution
            if (!neighbors.contains(neighborVal)) {
                neighbors.addElement(neighborVal);
            }
        }
        return neighbors;
    }
}