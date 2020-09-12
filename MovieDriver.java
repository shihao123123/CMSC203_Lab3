
	package Movie;
	import java.util.Scanner;
	public class MovieDriver {

		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			Movie mov=new Movie();
			
			char answer;
			do {
			System.out.println("Enter the title of a movie.");
			String movietitle=input.nextLine();
			mov.setTitle(movietitle);
			System.out.println("Enter the movie's rating.");
			
			String movierating=input.nextLine();
			mov.setRating(movierating);
			System.out.println("Enter the number of tickets sold for this movie.");
			int soldtickets=input.nextInt();
			mov.setSoldTickets(soldtickets);
			System.out.println(mov.toString());
			input.nextLine();
			System.out.println("Do you want to enter another?(y or no)");
			answer=input.next().charAt(0);
			input.nextLine();
			}while(Character.toLowerCase(answer)!='n');
			System.out.println("Goodbye");
			input.close();
		}

	}


