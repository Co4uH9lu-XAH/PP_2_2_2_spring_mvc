package web.model;

public class Car {

    private long id;
    private String manufacturer;
    private String model;

    public Car() {
    }

    public Car(long id, String manufacturer, String model) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
