public class RandomDataClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i=1; i<=100; i++)
			System.out.print(RandomData.getInt('U', 1, 6) + " ");
		System.out.print("\n");

		for (i=1; i<=100; i++)
			System.out.print(RandomData.getInt('E', 2, 0) + " ");
		System.out.print("\n");		
		
		for (i=1; i<=100; i++)
			System.out.print(RandomData.getInt('N', 5, 2) + " ");
		System.out.print("\n");
	}
}