package com.linecomparision;

public class LineComparision {
	import com.linecomparision.Line;

	public class LineComparision {
		public static void main(String[] args) {
			System.out.println("Welcome to Line Comparison Computation");
			
			Line line1 = new Line(1.5, 1.2, 8.1, 9.3);
			Line line2 = new Line(8.1, 9.3, 1.8, 1.2);
					
			System.out.println("first line start point is ("+line1.x1+", "+line1.y1+"), end point is ("+line1.x2+", "+line1.y2+") and length of line is "+line1.length());
			System.out.println("second line start point is ("+line2.x1+", "+line2.y1+"), end point is ("+line2.x2+", "+line2.y2+") and length of line is "+line2.length());

			if (line1.length() == line2.length()) {
				System.out.println("both lines are equal in length");
			} else if (line1.length() > line2.length()) {
				System.out.println("first line's length is greater than second line's length");
			} else {
				System.out.println("first line's length is less than second line's length");
			}
		}
}
