public class BeerSong {

	public static void main (String[] args) {
		int beerNum = 99;
		String word = "bottles";

		while (beerNum >= 0) {
			if (beerNum == 1) {
				word = "bottle";
			}

			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall!");
				System.out.println(beerNum + " " + word + " of beer!");
				System.out.println("Take one down! Pass it around!");
			} else {
			System.out.println("No more bottles of beer on the wall!");
			}
			beerNum = (beerNum - 1);
		} 
	}

}