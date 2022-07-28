package Border;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	
		ArrayList<Post>posts=new ArrayList<>();
		
		//현재시간날짜표시
				MyDate date=new MyDate();
				date.date();
				date.time();
		
		System.out.println("========================");
		System.out.println("======FREE BORDER=======");
	
		
		posts.add(new Post("아이디1",1,"집에 너무너무 가고싶어ㅠㅠ","집에가고싶다","2시 14분 05초"));
		posts.add(new Post("아이디2",2,"오늘 너무 놀고싶다 공부하기싫어","공부하기싫다","17시 25분 34초"));
		posts.add(new Post("아이디3",3,"아ㅏㅏㅏㅏ진짜하기싫어","어떡하지ㅠㅠ","21시 40분 57초"));
		
		Scanner sc = new Scanner(System.in);
		loop:
		while(true) {
			System.out.println("========================");
		
			System.out.println("▶Please select the action you want.."+"\n"
						+"[1.WIRTE/2.LIST/3.READ/4.DELETE/5.FIX/6.EXIT]");
			String cmd = sc.next();
			switch(cmd) {
			
			//글작성
			case "1":	
				System.out.println("========================");
				System.out.println("▶Please enter a TITLE");
				String title = sc.next();
				System.out.println("▶Please enter the CONTENTS");
				String con= sc.next();
				System.out.println("▶Please enter the ID of the author");
				String id = sc.next();
				System.out.println("▶Please enter the NUMBER of the text");
				int no = sc.nextInt();
				
				String time=date.time();
				posts.add(new Post(title,no,id,con,time));
				break;
			//글목록보기
			case "2":	
				System.out.println("========================");
				for(int i=0;i<posts.size();i++) {
					System.out.print(posts.get(i).no+".");
					System.out.print("["+posts.get(i).title+"]");
					System.out.println("▶Writing time:"+posts.get(i).time);
					System.out.println("▶Writer:"+posts.get(i).id);
					
				}
				break;
				
			//글불러오기
			case "3":	
				System.out.println("========================");
				System.out.println("▶Please enter the NUMBER of the text you are looking for");
				int readNo = sc.nextInt();
				for(int i=0;i<posts.size();i++) {
					if(posts.get(i).no == readNo) {
						System.out.print(posts.get(i).no+".");
						System.out.println("["+posts.get(i).title+"]");
						System.out.println("ID:"+posts.get(i).id);
						System.out.println("time:"+posts.get(i).time);
						System.out.println(posts.get(i).con);
						
					}
				}
				break;
				
			//글 삭제
			case "4":	
				System.out.println("========================");
				System.out.println("❌Warning❌"+"\n"+"▶deleted text CANNOT BE RECOVERD AGAIN!");
				System.out.println("▶Please enter the AUTHOR ID of the post to be DELETED"
									+"\n"+"(If you enter a ID, it will be deleted immediately.)");
				String ur_id = sc.next();
				for(int i=0;i<posts.size();i++) {
					if(posts.get(i).id.equals(ur_id)) {
						if(true) {
							posts.remove(i);	
						}
					}
				}
				System.out.println("▶deletion is complete.");
		
				break;
			//글 수정
			case"5":
				System.out.println("▶Please enter the AUTHOR ID of the article to be modified");
				String edit_id = sc.next();
				for(int i=0; i< posts.size();i++) {
				if(posts.get(i).id.equals(edit_id)) {
					System.out.println("▶Please enter a TITLE");
					String title1 = sc.next();
					System.out.println("▶Please enter the CONTENTS");
					String con1= sc.next();
					posts.get(i).setData(title1,con1);
					}
				}
					break;
			
			//나가기
			case "6":
				System.out.println("========================");
				System.out.println("THANK YOU FOR USING IT!");
				break loop;
			}
			
			
		}
	}
}





