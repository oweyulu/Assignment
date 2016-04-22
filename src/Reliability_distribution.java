
public class Reliability_distribution {
	
	/*
	 * 
	 * The program contains the Exponential distribution function implementations
	 * 
	 */

	public static void main(String[] args) {
		
		double EXPONENTIAL = 2.718282;
		double failure_rate;
		int time;
		double r_t;

		failure_rate = 1.5 * (Math.pow(10, -5));

		for (time = 0; time <= 1500; time += 150) {

			r_t = Math.pow(EXPONENTIAL, (-failure_rate * time));

			System.out.println(time + "\t" + r_t);

		}


	}

}
