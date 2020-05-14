package lab3.network3;

public class EventPost extends Post {
	
	private String eventType;
	
	//Constructor for objects of class EventPost
	public EventPost(String author, String event) {
		super(author);
		eventType = event;
	}
	
	/*Return the event Type
	 * 
	 * Returns The STring of the event title
	*/
	public String getEvent() {
	return eventType;
	}
	
	//Displays the details of this post
	
	public void display()
	{
		super.display();
		System.out.println(eventType);
	}

}
