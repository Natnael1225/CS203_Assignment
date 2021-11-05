package myutil;

public class WordCount {


	private int count;

	public WordCount(int count) {
		this.count = count;
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
	public void setCount( int count) {
		if(count >= 0)	
		this.count = count;
	}

}
