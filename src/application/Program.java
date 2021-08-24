package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("Faça uma boa viagem!");
		Comment c2 = new Comment("Uau essa viagem é incrivel!");
		Post p1 = new Post(
				sdf.parse("21/08/2021 13:05:44"), "Viajar para Coreia do Sul", 
				"Indo visitar a Coreia do Sul", 
				15);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good Morning!");
		Comment c4 = new Comment("Very good tour!");
		Post p2 = new Post(
				sdf.parse("21/08/2021 13:05:44"),"Good Morning people", 
				"Good weekend", 
				8);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
