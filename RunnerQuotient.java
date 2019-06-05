public class RunnerQuotient {

    public static void main (String[]args) {
        PrintQuotient pq = (float a, float b) -> System.out.printf("Quotient: %.3f", a/b);
        pq.printQuotient(1.5f, 3.0f);
    }
    
}