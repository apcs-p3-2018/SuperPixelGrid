package org.asl.superpixelgrid;
import java.awt.Color;

/***
 * A pixel is a dot that makes up part of an image.
 * 
 * A superpixel has two attributes: a color and a size.
 * 
 * When working with a grid of superpixels, an image can be formed by
 * traversing the grid and drawing a circle having the size and color
 * of the superpixel at that location.
 * 
 * @author kentcollins
 *
 */
public class SuperPixel {

	private Color color;
	private float size;
	
	public static final SuperPixel RED = new SuperPixel(new Color(255, 0, 0));
	public static final SuperPixel GREEN = new SuperPixel(new Color(0, 255, 0));
	public static final SuperPixel BLUE = new SuperPixel(new Color(0, 0, 255));
	public static final SuperPixel WHITE = new SuperPixel(new Color(255, 255, 255));
	public static final SuperPixel BLACK = new SuperPixel(new Color(0, 0, 0));

	/**
	 * Create a superpixel by specifying its color. A default size of
	 * 15 is assigned.
	 * 
	 * @param color
	 *            java.awt.Color to be assigned
	 */
	public SuperPixel(Color color) {
		this.color = color;
		this.size = 15;
	}

	/**
	 * Get the color that should be used when coloring this pixel.
	 * 
	 * @return java.awt.Color the color of this superpixel
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Change the color associated with this superpixel.
	 * 
	 * @param color
	 *            the new color to assign
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Get the size at which this superpixel should be drawn.
	 * 
	 * @return the size
	 */
	public float getSize() {
		return size;
	}

	/**
	 * Set the size of this superpixel.
	 * 
	 * @param size
	 *            the intended size
	 */
	public void setSize(float size) {
		this.size = size;
	}

}
