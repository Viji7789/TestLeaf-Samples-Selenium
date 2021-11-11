package com.viji.javalearning;
/* if and if else condition
public class PlayOutside {

	boolean IsRaining;//default boolean value is false
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlayOutside play=new PlayOutside();
		
		if(play.IsRaining){
			System.out.println("Its raining.You cannot play outside.");
		}
		else {
			System.out.println("Its not raining.You can outside play");
		}
	}

}*/

/*if-else-if
public class PlayOutside {

	String weather="Sunny";
	//to ignore case sensitive ,we need to use equalsIgnoreCase
	public void weather_Check() {
		if(weather.equals("Windy")) {
			System.out.println("Its windy outside.");
		}else if(weather.equals("Rain")) {
			System.out.println("Its raining outside");
		}else if(weather.equals("Sunny")) {
			System.out.println("Its sunny outside");
		}else if(weather.equals("Snowny")) {
			System.out.println("Its snowny outside");
		}else {
			System.out.println("Weather unpredicted");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlayOutside weather=new PlayOutside();
		weather.weather_Check();
		
	}
}*/

public class PlayOutside {

	String weather="Sunny";
	
	public void weather_check() {
		switch (weather) {
		case "Windy": 
			System.out.println("Its windy outside.");
			break;
		case "Sunny":
			System.out.println("Its sunny outside.");
			break;
		case "Snowy":
			System.out.println("Its snowy outside.");
			break;
		default:
			System.out.println("Weather unpredicted");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlayOutside weather=new PlayOutside();
		weather.weather_check();
		
	}

}