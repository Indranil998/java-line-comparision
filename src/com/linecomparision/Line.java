package com.linecomparision;

public class Line {
	public double x1;
	public double y1;
	public double x2;
	public double y2;
	public double calculatedLength = 0;
	
	Line (double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public double length () {
		if (this.calculatedLength != 0) {
			return this.calculatedLength;
		} else {
			double diff_x = (this.x2 - this.x1);
			double diff_y = (this.y2 - this.y1);
			this.calculatedLength = Math.sqrt(Math.pow(diff_x, 2) + Math.pow(diff_y, 2));
			return this.calculatedLength;
		}
	}}
