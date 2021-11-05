package testpackage;

import myutil.WordCount;

public class CountTest {

	public static void main(String[] args) {
		// TO test the word count class
		
		String word = "programming";
		WordCount wc = new WordCount(word.length());
		
		System.out.println(wc.getCount());

		wc.increaseCount();
		wc.increaseCount();
		System.out.println(wc.getCount());

		wc.decreaseCount();
		wc.decreaseCount();
		wc.decreaseCount();
		wc.printCount();

		wc.reset();
		System.out.println(wc.getCount());

		wc.increaseCount();
		wc.increaseCount();
		System.out.println(wc.getCount());

	}

}
