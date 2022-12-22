package hiber.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "car")
public class Car implements Serializable {
    @Id
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;


    public Car() {}



    public Car(User user, String model, int series) {
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" + "\n" +
                ", model = " + model + "\n" +
                ", series = " + series + "\n" +
                " }";
    }
}
