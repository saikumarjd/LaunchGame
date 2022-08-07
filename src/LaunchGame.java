import java.util.Scanner;

class Player{
	int p[];
	Scanner s=new Scanner(System.in);
	Player() {
		System.out.println("Enter number of players");
		p=new int[s.nextInt()];
		
	}
	public int[] PlayerValues() {
		System.out.println("Players Please guess the values");
		for(int i = 0;i < p.length; i++) {
			p[i]=s.nextInt();
		}
		return  p;
	}
	
}

class Guesser{
	int g;
	Scanner s=new Scanner(System.in);
	public int guesserValue() {
		System.out.println("Gueseer please guess the value");
		g=s.nextInt();
		return g;
	}
	
}

class Umpire{
	Player p1=new Player();
	Guesser g=new Guesser();
	
	public void compare() {
		int pla[]=new int[p1.p.length];
		pla=p1.PlayerValues();
		int gue=g.guesserValue();
		int count=0;
		
		for(int i=1;i<=pla.length;i++) {
			if(pla[i-1] == gue) {
				System.out.print("Player "+i+" ");
				count++;
			}
		}
		if(count == 0)
			System.out.println("No Player Guessed Correctly");
		else
			System.out.println("Guessed correctly");
		
	}
	
}


public class LaunchGame {

	public static void main(String[] args) {
		
		Umpire u = new Umpire();
		u.compare();
		
		
	}
}
