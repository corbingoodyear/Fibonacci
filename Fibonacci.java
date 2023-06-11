
class Fibonacci { 
    static int recursive(int n) //Fibonacci sequence using recursion
    { 
        if (n <= 1) 
            return n; 
        return recursive(n - 1) + recursive(n - 2); 
    } 
    
   static int iterative(int n)  //Fibonacci sequence using iteration
    { 
    //Creates an array to store Fibonacci numbers.
    int z[] = new int[n+2];
    int i; 
       
    // Sets 0th and 1st number of the series to 0 and 1
    z[0] = 0; 
    z[1] = 1; 
      
    for (i = 2; i <= n; i++) 
    { 
       // Add the previous 2 numbers in the series and store it
        z[i] = z[i-1] + z[i-2]; 
    } 
       
    return z[n]; 
    } 
  
    public static void main(String args[]) 
    { 
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, rf, itf; //sets what points to check
        long startTime, endTime, totalTime; //variables to time runtime
        
        for(int r = 0; r < 10; r++) //prints iteration results
        { 
            startTime = System.nanoTime();
             itf=iterative(a[r]);
             endTime   = System.nanoTime();
             totalTime = endTime - startTime;
             System.out.println(a[r]+"th fibonacci term using iteration is " + itf + " and excution time is " + totalTime);

        } 
        
        System.out.println("\n\n\n"); //formatting new lines
        
        for(int r = 0; r < 10; r++) //prints recursive results
        { 
             startTime = System.nanoTime();
             rf=recursive(a[r]);
             endTime   = System.nanoTime();
             totalTime = endTime - startTime;
             System.out.println(a[r] + "th fibonacci term using recursion is " + rf + " and excution time is " + totalTime);
             

        } 
        
        
    
    } 
} 