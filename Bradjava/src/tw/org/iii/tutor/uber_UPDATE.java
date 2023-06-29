package tw.org.iii.tutor;
import java.util.ArrayList;
import java.util.List;
public class uber_UPDATE {

	public static void main(String[] args) {
		

		class Customer {
		    private String name;
		    private String address;

		    public Customer(String name, String address) {
		        this.name = name;
		        this.address = address;
		    }

		    public String getName() {
		        return name;
		    }

		    public String getAddress() {
		        return address;
		    }
		}

		class Delivery {
		    private Customer customer;
		    private String item;
		    private double distance;

		    public Delivery(Customer customer, String item, double distance) {
		        this.customer = customer;
		        this.item = item;
		        this.distance = distance;
		    }

		    public Customer getCustomer() {
		        return customer;
		    }

		    public String getItem() {
		        return item;
		    }

		    public double getDistance() {
		        return distance;
		    }
		}

		class Driver {
		    private String name;
		    private double rating;

		    public Driver(String name) {
		        this.name = name;
		        this.rating = 5.0; // 默认评级为5.0
		    }

		    public String getName() {
		        return name;
		    }

		    public double getRating() {
		        return rating;
		    }

		    public void rateCustomer(Customer customer, double rating) {
		        // 在实际应用中，可能会将评级信息存储到数据库或记录文件中
		        System.out.println("Rating customer: " + customer.getName() + " with rating: " + rating);
		    }

		    public void deliver(Delivery delivery) {
		        System.out.println("Delivering " + delivery.getItem() + " to " + delivery.getCustomer().getName());
		        double earnings = calculateEarnings(delivery);
		        System.out.println("Earnings: $" + earnings);
		    }

		    private double calculateEarnings(Delivery delivery) {
		        // 在实际应用中，可能会根据距离、配送时间等因素计算配送收入
		        return 10.0; // 简单起见，收入固定为10美元
		    }
		}

		class UberEats {
		    private List<Driver> drivers;

		    public UberEats() {
		        this.drivers = new ArrayList<>();
		    }

		    public void addDriver(Driver driver) {
		        drivers.add(driver);
		    }

		    public void placeOrder(Customer customer, String item, double distance) {
		        Driver driver = findBestDriver(distance);
		        Delivery delivery = new Delivery(customer, item, distance);
		        driver.deliver(delivery);
		    }

		    private Driver findBestDriver(double distance) {
		        // 在实际应用中，可能会根据各种因素选择最佳司机（如距离、评级、可用性等）
		        return drivers.get(0); // 简单起见，始终返回第一个司机
		    }
		}

		public class Main {
		    public static void main(String[] args) {
		        UberEats uberEats = new UberEats();

		        // 创建两个司机
		        Driver driver1 = new Driver("John");
		        Driver driver2 = new Driver("Jane");

		        // 将司机添加到UberEats平台
		        uberEats.addDriver(driver1);
		        uberEats.addDriver(driver2);

		        // 创建一个顾客
		        Customer customer = new Customer("Alice", "123 Main St");

		        // 下单并配送
		        uberEats.placeOrder(customer, "Pizza", 5.0);
		    }
		}


	}

}
