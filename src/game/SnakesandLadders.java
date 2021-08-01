package game;
import java.util.*;
import java.io.*;
public class SnakesandLadders {
public static void main(String args[])throws IOException{
	
	Scanner sc=new Scanner(System.in);
	
	int a,i,j;
	
	//setting up of game board
	LinkedList<Integer> gameboard=new LinkedList<Integer>();
	
	for(i=1;i<=30;i++)
	{
		gameboard.add(i);
	}
	
	//setting up ladders on the game board *101=ladders
	gameboard.set(2, 101);
	gameboard.set(4, 101);
	gameboard.set(10, 101);
	gameboard.set(19, 101);
	
	//setting up snakes on the game board *-101=snakes
	
	gameboard.set(16, 101);
	gameboard.set(18, 101);
	gameboard.set(20, 101);
	gameboard.set(26, 101);
	
    //setting up of dice
	
	int dice;
	
	
	//game logic
	System.out.println("Would you like to continue the game?\n1.Yes\n2.No\n");
	
	int n=sc.nextInt();
	
	switch(n)
	{
	
	
	case 1:	System.out.println("[___Snakes And Ladder___]");
	for(a=0;a<gameboard.size();a++)
	{
	//logic for player 1
		i=-1;
		System.out.println("\n\nPlayer 1 turn");
		System.out.println("\nEnter the number:\n");
		dice=sc.nextInt();
		
	        i+=dice;
	        
	     	if(i==gameboard.size()-1)
		    {
			System.out.println("\nPlayer 1 is the winner!");
			break;
	    	}
	     	else if(i==2)
	     	{
	     		i+=19;
	     		System.out.println("\nLadder! player 1 position:"+" "+(i+1));
	     	}
	     	else if(i==4)
	     	{
	     		i+=3;
	     		System.out.println("\nLadder! player 1 position:"+" "+(i+1));
	     	}
	     	else if(i==10)
	     	{
	     		i+=15;
	     		System.out.println("\nLadder! player 1 position:"+" "+(i+1));
	     	}
	     	else if(i==19)
	     	{
	     		i+=9;
	     		System.out.println("\nLadder! player 1 position:"+" "+(i+1));
	     	}
	     	else if(i==16)
	     	{
	     		i-=13;
	     		System.out.println("\nSnake! player 1 position:"+" "+(i+1));
	     	}
	     	else if(i==18)
	     	{
	     		i-=12;
	     		System.out.println("\nSnake! player 1 position:"+" "+(i+1));
	     	}
	     	else if(i==20)
	     	{
	     		i-=12;
	     		System.out.println("\nSnake! player 1 position:"+" "+(i+1));
	     	}
	     	else if(i==26)
	     	{
	     		i-=26;
	     		System.out.println("\nSnake! player 1 position:"+" "+(i+1));
	     	}
	     	else
	     	{
	     		System.out.println("\nPlayer 1 position:"+" "+(i+1));
	     	}
			
		//logic for player 2
	     	j=-1;
	     	System.out.println("\n\nPlayer 2 turn");
	     	System.out.println("\nEnter the number:\n");
			dice=sc.nextInt();
			
			
			j+=dice;
			
			  
	     	if(j==gameboard.size()-1)
		    {
			System.out.println("\nPlayer 2 is the winner!");
			break;
	    	}
	     	else if(j==2)
	     	{
	     		j+=19;
	     		System.out.println("\nLadder! player 2 position:"+" "+(j+1));
	     	}
	     	else if(j==4)
	     	{
	     		j+=3;
	     		System.out.println("\nLadder! player 2 position:"+" "+(j+1));
	     	}
	     	else if(j==10)
	     	{
	     		j+=15;
	     		System.out.println("\nLadder! player 2 position:"+" "+(j+1));
	     	}
	     	else if(j==19)
	     	{
	     		j+=9;
	     		System.out.println("\nLadder! player 2 position:"+" "+(j+1));
	     	}
	     	else if(j==16)
	     	{
	     		j-=13;
	     		System.out.println("\nSnake! player 2 position:"+" "+(j+1));
	     	}
	     	else if(j==18)
	     	{
	     		j-=12;
	     		System.out.println("\nSnake! player 2 position:"+" "+(j+1));
	     	}
	     	else if(j==20)
	     	{
	     		j-=12;
	     		System.out.println("\nSnake! player 2 position:"+" "+(j+1));
	     	}
	     	else if(j==26)
	     	{
	     		j-=26;
	     		System.out.println("\nSnake! player 2 position:"+" "+(j+1));
	     	}
	     	else
	     	{
	     		System.out.println("\nPlayer 2 position:"+" "+(j+1));
	     	}
		
		
		
	}
	break;
	default:System.out.println("\nThanks for visiting!");
	}
    
    
    
	
	
	
}
	
}
