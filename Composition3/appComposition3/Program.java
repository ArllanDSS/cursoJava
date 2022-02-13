package appComposition3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import composition3Entities.Comment;
import composition3Entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date moment;
		String title;
		String content;
		Integer likes;

		
		//Post 1
		
		moment = sdf.parse("21/06/2018 13:05:44");
		title = "Traveling to New Zealand";
		content = "I'm going to visit this wonderful country!";
		likes = 12;

		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");

		Post p1 = new Post(moment, title, content, likes);
		p1.addComment(c1);
		p1.addComment(c2);
		
		//Post 2
		
		moment = sdf.parse("28/07/2018 23:14:19");
		title = "Good night guys";
		content = "See you tomorrow";
		likes = 5;

		c1 = new Comment("Good night");
		c2 = new Comment("May the force be with you");

		Post p2 = new Post(moment, title, content, likes);
		p2.addComment(c1);
		p2.addComment(c2);
		
		System.out.println();
		System.out.println(p1);
		System.out.println(p2);

	}

}
