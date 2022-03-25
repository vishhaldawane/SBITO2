
public abstract class Flight {

	int flightNumber;
	String flightName;
	String source;
	String destination;
	
	
	public Flight() {
		System.out.println("Flight()...");
	}


	public Flight(int flightNumber) {
		super();
		this.flightNumber = flightNumber;
	}


	public Flight(int flightNumber, String flightName) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
	}


	public Flight(int flightNumber, String flightName, String source) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.source = source;
	}


	public Flight(int flightNumber, String flightName, String source, String destination) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
	}


	public Flight(String flightName) {
		super();
		this.flightName = flightName;
	}


	public Flight(String flightName, String source, String destination) {
		super();
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
	}


	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", source=" + source
				+ ", destination=" + destination + "]";
	}

	
}
