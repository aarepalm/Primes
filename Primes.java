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
		primes.calculatePrimes(100000);
	}
}
