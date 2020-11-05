package course.springdata.codefirst.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "cars")
public class Car extends Vehicle{
    private int seats;

    public Car() {

    }

    public Car(String model, BigDecimal price, String fuelType, int seats) {
        super(model, price, fuelType);
        this.seats = seats;
    }

    public Car(Long id, String model, BigDecimal price, String fuelType, int seats) {
        super(id, model, price, fuelType);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return super.toString()+"Car{" +
                "seats=" + seats +
                '}';
    }
}