package observerPattern;

public class WeatherStation {
//	模拟气象站

	public static void main(String[] args) {
		// 气象数据		
		WeatherData weatherData = new WeatherData();
		
		// 先模拟一块气象展示板
		CurrentConditionsDisplay currentDisplay = 
				new CurrentConditionsDisplay(weatherData);
		
		// 模拟气象数据改变
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(80, 70, 29.2f);
		weatherData.setMeasurements(80, 90, 30.4f);
	}

}
