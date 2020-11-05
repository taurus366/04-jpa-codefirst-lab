package course.springdata.codefirst.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "trucks")
public class Truck extends Vehicle{
    @Column(name = "load_capacity")
    private double loadCapacity;

    public Truck() {

    }

    public Truck(String model, BigDecimal price, String fuelType, int loadCapacity) {
        super(model, price, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public Truck(Long id, String model, BigDecimal price, String fuelType, int sears) {
        super(id, model, price, fuelType);
        this.loadCapacity = sears;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double seats) {
        this.loadCapacity = seats;
    }

    @Override
    public String toString() {
        return super.toString()+"Car{" +
                "seats=" + loadCapacity +
                '}';
    }
}
