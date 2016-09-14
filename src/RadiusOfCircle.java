import java.lang.Math;
import java.io.*;
import java.util.*;
public class RadiusOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbReader = new Scanner(System.in);
		System.out.print("What is the area?");
		double i = kbReader.nextDouble();
		System.out.println("Radius of your circle is: " + Math.sqrt(i/Math.PI));

	}

}
