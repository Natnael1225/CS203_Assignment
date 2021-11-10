package midtermProject_CS203_2;

public abstract class Video implements Comparable<Video>{

	
	private String title;
    private double durationInMinutes;
    private int views;
    private int likes;
    private double watchTime;


    public Video(){
        this.title = "Cute cat Video";
        this.durationInMinutes = 7.0;
        this.views = 943;
        this.likes = 231;
        this.watchTime = 8655838;
    }

    public Video(String title, double durationInMinutes, int views, int likes, double watchTime) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.views = views;
        this.likes = likes;
        this.watchTime = watchTime;
    }

    public String getTitle() {
        return title;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getViews() {
        return views;
    }

    public int getLikes() {
        return likes;
    }

    public double getWatchTime() {
        return watchTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setWatchTime(double watchTime) {
        this.watchTime = watchTime;
    }

	@Override
	public int compareTo(Video o) {
		
		return (int)(watchTime - o.watchTime);
	}
@Override
public boolean equals(Object obj) {
	if(obj == null ) return false;
	if(!(obj instanceof Video)) return false;
	Video video = (Video) obj;
	
	return watchTime == video.watchTime;
}

@Override
public String toString() {
	return "\nTitle:" + title + "\nDurationInMinutes: " + durationInMinutes + "\nViews: " + views + "\nLikes: "
			+ likes + "\nWatchTime: " + watchTime ;
}


   
}
