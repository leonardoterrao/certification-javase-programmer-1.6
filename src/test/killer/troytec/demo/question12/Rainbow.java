package test.killer.troytec.demo.question12;

public class Rainbow {

	public enum MyColor {
		RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
		
		private final int rgb;
		private MyColor(int rgb) {
			this.rgb = rgb;
		}
		
		public int getRgb() {
			return rgb;
		}
	}
	
	public static void main(String[] args) {
		MyColor mc = MyColor.BLUE;
	}
	
}
