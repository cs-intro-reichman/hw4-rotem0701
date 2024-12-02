public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];
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
                     for (int p = 2; p <= n; p++) { 
                        if (isPrime[p]) { 
                            System.out.print(p + " "); 
                        } 
                    }
    }
}