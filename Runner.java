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
    // Shahil --> I learned how to use lambda notion in java 8 via use of method declaration within a function declaration and learned how to use return statements within Lambda notion. I also learned how to commit, push and pull edits to github from a remote locatino and how to clone, and work simultaneously with another person on a github/coding project.
    boolean checkPerfectSquare(int n);
}