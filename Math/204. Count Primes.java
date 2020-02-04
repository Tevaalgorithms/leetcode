// Helpful URL :https://www.youtube.com/watch?v=eKp56OLhoQs&list=PL2_aWCzGMAwLL-mEB4ef20f3iqWMGWa25&index=4
class Solution {
public int countPrimes(int n) {
    if(n < 3) {
        return 0;
    }
    
    int[] primes = new int[n + 1];
    
    for(int i = 0; i < n; i++) {
       primes[i] = 1; 
    }
    
    primes[0] = 0;
    primes[1] = 0;
    
    for(int j = 2; j < n; j++) {
        if(primes[j] == 1){
            for(int i = 2; i * j <= n; i++) {
                primes[i * j] = 0;
            }
        }
    }
    
    int counter = 0;
    
    for(int k = 0; k < n; k++) {
        if(primes[k] == 1) {
           counter ++; 
        }
    }
    
    return counter;        
   }
}
