package jp.co.rakus.git_sample_honma2;

public class Car {
	private int speed;
	private int tire;
	
	public void run() {
		this.speed += 50;
		
	}
	
	public void stop(){
		this.speed = 0;
	}
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	
}
