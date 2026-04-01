class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(0, quantity);
    }

    public void delivery() {
        this.quantity++;
        System.out.println("Delivery received. Quantity increased.");
    }

    public void sell() {
        if (this.quantity > 0) {
            this.quantity--;
            System.out.println("Car sold. Quantity decreased.");
        } else {
            System.out.println("Cannot sell. The car is out of stock!");
        }
    }

    @Override
    public String toString() {
        return "Car Details [" +
                "Brand: '" + brand + '\'' +
                ", Model: '" + model + '\'' +
                ", Year: " + year +
                ", Price: $" + price +
                ", Color: '" + color + '\'' +
                ", Quantity in stock: " + quantity +
                ']';
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Mustang", "Ford", 2023, 55000.00, "Red", 5);

        System.out.println("--- 1. Initial State of the Object ---");
        System.out.println(myCar.toString());

        System.out.println("\n--- 2. Simulating a Sale ---");
        myCar.sell();

        System.out.println("\n--- 3. Field values after sale (Using Getters) ---");
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: $" + myCar.getPrice());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Quantity: " + myCar.getQuantity());

        System.out.println("\n--- 4. Updating fields ---");
        System.out.println("Applying a discount and changing the color...");
        myCar.setPrice(52000.00);
        myCar.setColor("Matte Black");

        System.out.println("\n--- 5. Final State of the Object ---");
        System.out.println(myCar.toString());
    }
}