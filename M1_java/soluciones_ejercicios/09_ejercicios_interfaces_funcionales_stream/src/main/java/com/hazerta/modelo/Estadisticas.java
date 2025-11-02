package com.hazerta.modelo;

public class Estadisticas {

        private final double min;
        private final double max;
        private final double mean;

        public Estadisticas(double min, double max, double mean) {
            this.min = min;
            this.max = max;
            this.mean = mean;
        }

        public double getMin() { return min; }
        public double getMax() { return max; }
        public double getMean() { return mean; }

        @Override
        public String toString() {
            return String.format("Stats{min=%.2f, max=%.2f, mean=%.2f}", min, max, mean);
        }
    }

