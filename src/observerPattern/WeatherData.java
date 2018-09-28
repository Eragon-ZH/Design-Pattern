package observerPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observer;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		// 所有的观察者是一个 ArrayList
		observer = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		// 注册观察者		
		observer.add(o);
	}

	public void removeOberver(Observer o) {
		// 移除观察者
		int i = observer.indexOf(o);
		if ( i >= 0 ) {
			observer.remove(i);
		}
	}
	
	public void notifyOberver() {
		// 通知观察者后观察者会调用update()
		for ( Observer o : observer ) {
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		// 数据更新时会调用此方法通知所有的观察者	
		notifyOberver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		// 更新数据		
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
