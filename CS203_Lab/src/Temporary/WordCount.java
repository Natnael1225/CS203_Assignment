package Temporary;

public class WordCount {

	private String text;
	private int count;

	public WordCount(String text) {
		this.text = text;
	}

	public void increaseCount() {
		count++;
	}
	public void decreaseCount() {
		count --;
	}

	public void reset() {
		count = 0;
	}
	public void printCount() {
		System.out.println(count);;
	}

	public int getCount() {
		return count;
	}

	public int wordCount() {
		 count = 0;
		if (this.text == null || this.text.isEmpty()) {
            return 0;
		}
		String[] word = text.split(" ");
		count = word.length;
		for (int i = 0; i < word.length; i++) {
			if (word[i].charAt(0) == 'A' || word[i].charAt(0) == 'a')
				count--;
		}
		return count;
	}

}
