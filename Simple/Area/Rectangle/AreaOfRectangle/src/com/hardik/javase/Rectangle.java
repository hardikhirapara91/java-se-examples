package com.hardik.javase;

public class Rectangle {

	private int width;
	private int height;

	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int calculateArea() {
		return (this.width * this.height);
	}

	@Override
	public String toString() {
		return "Ractangle [width=" + this.width + ", height=" + this.height + "]";
	}
}
