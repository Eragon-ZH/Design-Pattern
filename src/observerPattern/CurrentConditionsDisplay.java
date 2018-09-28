package observerPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		// 构造函数传入主题来注册观察者		
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		System.out.println("Current conditions:" + temperature
				+ "F degree and " + humidity + "% humidity");
	}

	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
