public class RunnerSquare{
		public static void main(String[] args){
			PerfectSquare ps=(int perfectSquare)->{for(int x=0;x<perfectSquare;x++){
	    	if(x*x==perfectSquare)
	    	    return true;
	        }
	    	    return false;
			};
			System.out.println(ps.perfectSquare(16));
		}
}