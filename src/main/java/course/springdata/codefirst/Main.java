package course.springdata.codefirst;

import course.springdata.codefirst.entity.Car;
import course.springdata.codefirst.entity.Truck;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("vehicles");
        EntityManager entityManager = factory.createEntityManager();
        Car car = new Car("vel satis", new BigDecimal(5000), "diesel", 5);
        Truck truck = new Truck("kamion", new BigDecimal(10000), "benzin", 3500);

        entityManager.getTransaction().begin();
        entityManager.persist(car);
        entityManager.persist(truck);
        entityManager.getTransaction().commit();
    }
}
