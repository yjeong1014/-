package Border;

public class Post {
	String id;
	int no;
	String con;
	String title;
	String time;
	public Post(String id, int no, String con, String title,String time) {

		this.id = id;
		this.no = no;
		this.con = con;
		this.title = title;
		this.time=time;
	}
	
	public void setData(String Title1,String Con1) {
		title = Title1;
		con=Con1;
	}
	
}
