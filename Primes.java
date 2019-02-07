class Primes {

	long nofPrimes;
	long startTime;

	Primes() {
		nofPrimes = 0;
		startTime = System.currentTimeMillis();
	}

	void printInfo() {
		long elapsedTime = System.currentTimeMillis() - startTime;
		if (elapsedTime < 1000) {
			System.out.println("Already found " + nofPrimes + " primes, time spent in milliseconds " + elapsedTime);
		}
		else {
			elapsedTime /=1000;
			System.out.println("Already found " + nofPrimes + " primes, time spent less than " + (elapsedTime+1) + "seconds");
		}
		startTime = System.currentTimeMillis();
	}

	void calculatePrimes(int nofPrimesGoal) {
		boolean notAPrime = false;
		for (int i = 2; nofPrimes < nofPrimesGoal ; ++i) {
			notAPrime = false;
			for (int j = 2; j < i; ++j)	{
				if (((i % j) == 0) && (i != j))	{
					notAPrime = true;
					break;
				}
			}
			if (notAPrime)
				continue;

			++nofPrimes;
			if ((nofPrimes % 1000) == 0)
				printInfo();
		}
	}

	public static void main(String[] args) {
		Primes primes = new Primes();
		System.out.println("This program calculates 50000 prime numbers and prints info messages after every 1000");
		final int nofPrimesGoal = 50000;
		long totalStartTime = System.currentTimeMillis();
		primes.calculatePrimes(nofPrimesGoal);
		System.out.println("Total time spent " + (System.currentTimeMillis() - totalStartTime)/1000 + "seconds");
	}
}
