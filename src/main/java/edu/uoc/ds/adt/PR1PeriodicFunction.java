package edu.uoc.ds.adt;

public class PR1PeriodicFunction {

        private final int PeriodicNumber;

        public PR1PeriodicFunction(int previousPeriodic){
                this.PeriodicNumber = (previousPeriodic % 4)*(previousPeriodic % 4);
        }

        public int getPeriodicNumber() {
                return PeriodicNumber;
        }
}
