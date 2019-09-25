package cp1.primitives;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ex04_isRectangleIntersect {

	static class Rectangle{
		int x, y, width, height;
		public Rectangle(int x, int y, int width, int height) {
			super();
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + height;
			result = prime * result + width;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Rectangle other = (Rectangle) obj;
			if (height != other.height)
				return false;
			if (width != other.width)
				return false;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
	}
	
	public static Rectangle getIntersect(Rectangle r1, Rectangle r2){
		if(hasIntersect(r1,r2)) {
			return new Rectangle(
						Math.max(r1.x, r2.x),
						Math.max(r1.y, r2.y),
						Math.min(r1.x+r1.width, r2.x+r2.width)- Math.max(r1.x, r2.x),
						Math.min(r1.y+r1.height, r2.y+r2.height)- Math.max(r1.y, r2.y)
					);
		}else {
			return new Rectangle(0, 0, -1, -1);//invalid rectangle
		}
	}

	public static boolean hasIntersect(Rectangle r1, Rectangle r2) {
		return r1.x+r1.width>=r2.x && r2.x+r2.width>=r1.x
				&& r1.y+r1.height>=r2.y && r2.y+r2.height>=r1.y;
	}
	
	@Test
	public void has_intersect() {
		Rectangle r1 = new Rectangle(3,1,5,2);
		Rectangle r2 = new Rectangle(1,2,4,2);
		
		assertTrue(hasIntersect(r1,r2));
	}
	
	@Test
	public void validate_intersect_result() {
		Rectangle r1 = new Rectangle(3,1,5,2);
		Rectangle r2 = new Rectangle(1,2,4,2);
		
		Rectangle expected = new Rectangle(3, 2, 2, 1);
		
		assertEquals(expected, getIntersect(r1,r2));
	}
}