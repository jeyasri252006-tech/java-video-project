package video;

	

	import java.util.ArrayList;

	public class VideoStore {

	    ArrayList<Video> store = new ArrayList<>();

	    public void addVideo(String name) {
	        store.add(new Video(name));
	        System.out.println("Video added successfully.");
	    }

	    public void doCheckout(String name) {
	        for (Video v : store) {
	            if (v.getVideoName().equalsIgnoreCase(name)) {
	                v.doCheckout();
	                System.out.println("Video checked out successfully.");
	                return;
	            }
	        }
	        System.out.println("Video not found.");
	    }

	    public void doReturn(String name) {
	        for (Video v : store) {
	            if (v.getVideoName().equalsIgnoreCase(name)) {
	                v.doReturn();
	                System.out.println("Video returned successfully.");
	                return;
	            }
	        }
	        System.out.println("Video not found.");
	    }

	    public void receiveRating(String name, int rating) {
	        for (Video v : store) {
	            if (v.getVideoName().equalsIgnoreCase(name)) {
	                v.receiveRating(rating);
	                System.out.println("Rating updated successfully.");
	                return;
	            }
	        }
	        System.out.println("Video not found.");
	    }

	    public void listInventory() {
	        System.out.println("\nVideo Name\tCheckout Status\tRating");

	        for (Video v : store) {
	            System.out.println(v.getVideoName() + "\t\t"
	                    + v.getCheckout() + "\t\t"
	                    + v.getRating());
	        }
	    }
	}


