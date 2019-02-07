class Primes {
	public static void main(String[] args) {
		final long max = 1000000;
		long counter = 0;
		boolean notAPrime = false;
		for (int i = 2; i < max; ++i)
		{
			notAPrime = false;
			for (int j = 2; j < i; ++j)
			{
				if (((i % j) == 0) && (i != j))
				{
					notAPrime = true;
					break;
				}
			}
			if (notAPrime)
				continue;

			++counter;
			if ((counter % 1000) == 0)
				System.out.println("Already found " + counter + " primes");
		}

	}
}
