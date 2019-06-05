public class Runner {

    public static void main(String[] args) {
        PrintQuotient pq = (float a, float b) -> System.out.printf("Quotient: %f", a/b);
        pq.print_quotient(1.5f, 0.3f);

        System.out.println();
        System.out.println();

        PerfectSquare ps = (int n) -> {
            for(int x=0;x<perfectSquare;x++){
	    	if(x*x==perfectSquare)
	    	    return true;
	        }
	    	    return false;
        };
        System.out.println("Perfect Square: " + ps.checkPerfectSquare(16));
    }

}

interface PrintQuotient {
    // Sai --> I learned how to use multiple branches to separate my code and merge this branches once everything is completed. I also learned how to use lambda functions and add interfaces inside the same class.
    void print_quotient(float a, float b);
}

interface PerfectSquare {
    boolean checkPerfectSquare(int n);
}