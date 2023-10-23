package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "model", nullable = false)
    private String model;
    @Column(name = "series", nullable = false)
    private int series;

    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Car{" +
               "id=" + id +
               ", model='" + model + '\'' +
               ", series=" + series +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (series != car.series) return false;
        if (!id.equals(car.id)) return false;
        return model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + series;
        return result;
    }
}
