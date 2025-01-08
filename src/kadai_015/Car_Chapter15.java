package kadai_015;

public class Car_Chapter15 {
	public int gear = 1;
	public int speed = 10;
	
	public Car_Chapter15(int gear) {
		this.gear = gear;
	}
	
	public void gearChange(int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		if (afterGear <= 5 && afterGear >= 1) {
			this.speed = afterGear * 10;
		}else {
			this.speed = 10;
		}
	}
	
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
}
