package video;

public class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    public Video(String videoName) {
        this.videoName = videoName;
        checkout = false;
        rating = 0;
    }

    public String getVideoName() {
        return videoName;
    }

    public boolean getCheckout() {
        return checkout;
    }

    public int getRating() {
        return rating;
    }

    public void doCheckout() {
        checkout = true;
    }

    public void doReturn() {
        checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }
}