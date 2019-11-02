import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
public class DisplayString {

	public static void main(String[] args) 
	{
		try {
		    Scanner scanner = new Scanner(System.in);
		    int testCases = scanner.nextInt();
		    
		    while(testCases-- > 0) {
		        char character = scanner.next().charAt(0);
		        if(character == 'B' || character == 'b') {
		            System.out.println("BattleShip");
		        } else if(character == 'C' || character == 'c') {
		            System.out.println("Cruiser");
		        } else if(character == 'D' || character == 'd') {
		            System.out.println("Destroyer");
		        } else if(character == 'F' || character == 'f') {
		            System.out.println("Frigate");
		        }
		    }
		} catch(Exception e) {
		    
		}
	}

}
	
