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
    void print_quotient(float a, float b);
}

interface PerfectSquare {
    boolean checkPerfectSquare(int n);
}