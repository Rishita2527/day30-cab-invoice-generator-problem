package com.bridgelabz1;
/*
 *  UC1 : Given Distance and Time ,the invoice generator should return total fare of the journey
 */
public class CabCalculateFare {

        private static final int COST_PER_MINUTE = 1;
        private static final double MINIMUM_COST_PER_KM = 10;
        private static final double MINIMUM_FARE = 5.0;

        //To Calculate total fare
        public double calculateFare(double distance, int time) {

            double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_MINUTE;

            if(totalFare < MINIMUM_FARE)
                return MINIMUM_FARE;
            return totalFare;
        }
}
