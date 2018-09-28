package observerPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observer;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		// ���еĹ۲�����һ�� ArrayList
		observer = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		// ע��۲���		
		observer.add(o);
	}

	public void removeOberver(Observer o) {
		// �Ƴ��۲���
		int i = observer.indexOf(o);
		if ( i >= 0 ) {
			observer.remove(i);
		}
	}
	
	public void notifyOberver() {
		// ֪ͨ�۲��ߺ�۲��߻����update()
		for ( Observer o : observer ) {
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		// ���ݸ���ʱ����ô˷���֪ͨ���еĹ۲���	
		notifyOberver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		// ��������		
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
