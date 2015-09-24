package practice.exams.java.chapter2.question4;

public class WeatherTest {

	static Weather w;
	
	public static void main(String[] args) {
		System.out.print(w.RAINNY.count + " " + w.SUNNY.count);
	}
	
	enum Weather {
		RAINNY, SUNNY;
		int count = 0;
		
		private Weather() {
			System.out.print("c ");
			count++;
		}
	}
	
}
