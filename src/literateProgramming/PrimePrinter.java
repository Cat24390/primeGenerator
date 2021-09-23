package literateProgramming;

public class PrimePrinter {
    public static void main(String[] args) {

        final int numPrimes = 1000;
        PrimeGenerator generate = new PrimeGenerator(numPrimes);
        NumberPrinter print = new NumberPrinter(4, 50);
        print.printNumbers(numPrimes, generate.generatePrimes());
    }

}
