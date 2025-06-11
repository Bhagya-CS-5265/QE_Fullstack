package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
	private List<String> passengers;
	private final int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;

	
	public Plane(int maxPassengers) {
		super();
		this.passengers = new ArrayList<>();
		this.maxPassengers = maxPassengers;
		
	}


	public void onboard(String passengerName)
	{
		if(passengers.size() <= maxPassengers)
		{
			this.passengers.add(passengerName);
		}
		else 
		{
			System.out.println("Plane is full");
		}
	}
	public Date takeOff()
	{
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
		
	}
	public void setland()
	{
		this.lastTimeLanded = new Date();
		this.passengers.clear();
		
	}
	public Date getLastTimeLanded()
	{
		return lastTimeLanded;
		
	}
	public List<String> getPassengers()
	{
		return passengers;
		
	}

}
public class Activity6 {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane = new Plane(10);
		plane.onboard("bhagya");
		plane.onboard("Chetan");
		plane.onboard("madan");
		
		System.out.println("plane took off at :" + plane.takeOff());
		System.out.println("people on the plane :" + plane.getPassengers());
		Thread.sleep(5000);
		plane.setland();
		
		System.out.println("plane landed at:" + plane.getLastTimeLanded());
		System.out.println("people on the plane after landing:" + plane.getPassengers());
		
		
		
		
		

	}

}
