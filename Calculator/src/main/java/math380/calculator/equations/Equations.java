/*
 * Class: MATH 380-001
 * Project: Calculator
 */
package math380.calculator.equations;

/**
 *
 * @author Jonathan Butler <https://github.com/jackal390iv>
 */
public class Equations {

    public Equations() {
        System.out.println();
    }

    public double factorial(double num) {
        double temp = 1;
        for (int i = 1; i <= num; i++) {
            temp = temp * i;
        }
        return temp;
    }

    public double permutationsNOreplacement(double n, double r) {
        return ((factorial(n)) / (factorial(n - r)));
    }

    public double combinationsNOreplacement(double n, double r) {
        return ((factorial(n)) / ((factorial(r)) * (factorial(n - r))));
    }

    public double permutationsWITHreplacement(double n, double r) {
        return (Math.pow(n, r));
    }

    public double combinationsWITHreplacement(double n, double r) {
        return ((factorial(n + r - 1)) / ((factorial(r)) * (factorial(n - 1))));
    }

    public double binomialProbabilityDistribution(double n, double x, double p) {
        return ((combinationsNOreplacement(n, x)) * (Math.pow(p, x)) * (Math.pow((1 - p), (n - x))));
    }

    public double hypergeometricProbabilityDistribution(double N, double k, double n, double x) {
        return (((combinationsNOreplacement(k, x)) * (combinationsNOreplacement((N - k), (n - x)))) / (combinationsNOreplacement(N, n)));
    }

    public double poissonProbabilityDistribution(double x, double u) {
        return (((Math.exp(-u)) * (Math.pow(u, x))) / (factorial(x)));
    }

}
