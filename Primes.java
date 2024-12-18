public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];
        int primesCounter = 0;
        
        //Initalize the isPrime arr
        for (int i = 2; i <= n; i++) { 
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p ++) { 
            if (isPrime[p]) { 
                for (int i = p * p; i <= n; i += p) {
                     isPrime[i] = false; 
                    } 
                } 
            } 
        System.out.println("Prime numbers up to " + n + ":");          
        for (int p = 2; p <= n; p++) { 
             if (isPrime[p]) { 
                System.out.println(p); 
                primesCounter ++;
                } 
            }
            int primePercentage = (primesCounter * 100) / n;
            System.out.println("There are " + primesCounter + " primes between 2 and " +
                               n + " (" + primePercentage + "% are primes)");

                                 
    }
}