package observerPattern;

public class WeatherStation {
//	ģ������վ

	public static void main(String[] args) {
		// ��������		
		WeatherData weatherData = new WeatherData();
		
		// ��ģ��һ������չʾ��
		CurrentConditionsDisplay currentDisplay = 
				new CurrentConditionsDisplay(weatherData);
		
		// ģ���������ݸı�
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(80, 70, 29.2f);
		weatherData.setMeasurements(80, 90, 30.4f);
	}

}
