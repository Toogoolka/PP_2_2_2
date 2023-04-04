package web.models;

public class Car {
    private Long id;
    private String model;
    private String series;
    private String licensePlate;

    public Car() {
    }

    public Car(Long id, String model, String series, String licensePlate) {
        this.id = id;
        this.model = model;
        this.series = series;
        this.licensePlate = licensePlate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
