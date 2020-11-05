package course.springdata.codefirst.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "planes")
public class Plane extends Vehicle{
    @Column(name = "passenger_capacity")
    private int passengerCapacity;

    public Plane() {

    }

    public Plane(String model, BigDecimal price, String fuelType, int passengerCapacity) {
        super(model, price, fuelType);
        this.passengerCapacity = passengerCapacity;
    }

    public Plane(Long id, String model, BigDecimal price, String fuelType, int passengerCapacity) {
        super(id, model, price, fuelType);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString()+"Car{" +
                "seats=" + passengerCapacity +
                '}';
    }
}
