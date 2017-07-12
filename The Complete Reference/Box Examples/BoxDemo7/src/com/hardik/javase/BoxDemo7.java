package com.hardik.javase;

import com.hardik.javase.model.BoxColor;

/**
 * Box Demo
 * @author HARDIK HIRAPARA
 *
 */
public class BoxDemo7 {

	public static void main(String[] args) {
		
		BoxColor box = new BoxColor();
		box.getBoxInfo();

		BoxColor box1 = new BoxColor(10, 20.35f, 125.90f, "Black");
		box1.getBoxInfo();
		
		BoxColor box2 = new BoxColor(12, 34, 45, 12.34f, 225.88f, "White");
		box2.getBoxInfo();
		
		BoxColor box3 = new BoxColor(box1);
		box3.getBoxInfo();
	}

}
