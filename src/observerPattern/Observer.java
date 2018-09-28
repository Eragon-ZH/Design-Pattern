/*
	观察者模式
	一（主题）对多（观察者），当主题改变的时候所有的观察者进行相应的反应
	
	本例中主题为 WeatherData，实现 Subject 接口
	观察者为 各种布告板如 CurrentConditionsDisplay，实现观察者的 Observer 接口和布告板的 DisplayElement 接口
	
	java内置有主题（Observable）和观察者（Observer），在java.util包中
*/
package observerPattern;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
