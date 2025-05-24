package JavaPracticeprograms;

import java.util.stream.Stream;

public class StreamsPractice1 {

	public static void main(String[] args) {
	long num=	Stream.of("Apple", "Banana", "Orange").count();
	System.out.println(num);
	Stream<String> fruits=Stream.of("Apple", "Banana", "Orange","Apple",   "Cat",    "Ball","Cartoon", "Banana", "Avocado");
	boolean flag=fruits.anyMatch(s->s.equalsIgnoreCase("Ball"));
	System.out.println(flag);
	Stream<String> fruits1=Stream.of("Apple", "Banana", "Orange","Apple",   "Cat",    "Ball","Cartoon", "Banana", "Avocado");
	fruits1.sorted().forEach(s->System.out.println(s+ " "));
	Stream<String> fruits2=Stream.of("Apple", "Banana", "Orange","Apple",   "Cat",    "Ball","Cartoon", "Banana", "Avocado");
	fruits2.distinct().map(s->s.toUpperCase()).forEach(s->System.out.println(s+ " "));
	}

}
