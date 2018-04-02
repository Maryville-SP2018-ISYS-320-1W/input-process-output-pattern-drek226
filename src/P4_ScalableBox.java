/*
	ISYS 320
	Name(s):Derek Rieger
	Date: 4/1/18
	
	
	
	FYI.....The link provided in the assignment on canvas leads to a page that states "unauthorized access". 
	
	I'm not sure how to setup the input for this program and make it interactive.
	
	
*/
import java.util.Scanner;

public class P4_ScalableBox {
	
	// I don't understand how to make this part interactive ????????
public static final int height= 10;
public static final int width= 4;
	
	public static void main(String[] args) {
		drawBoxCap();
		drawBoxInsides();
		drawBoxCap();
		
	}
	
	public static void drawBoxCap() {
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= width - 2; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides() {
		for( int insideRowIndex = 1; insideRowIndex <= height - 2; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
	public static void drawBoxInsideLine() {
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= (width - 2); insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
