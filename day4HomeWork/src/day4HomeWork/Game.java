package day4HomeWork;

public class Game {

	private String id;
	private String name;
	private String year;
	private String producerCompany;
	private double price;
	
	public Game(String id, String name, String year, String producerCompany, double price) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.producerCompany = producerCompany;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getProducerCompany() {
		return producerCompany;
	}

	public void setProducerCompany(String producerCompany) {
		this.producerCompany = producerCompany;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
