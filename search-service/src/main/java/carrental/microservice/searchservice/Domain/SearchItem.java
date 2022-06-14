package carrental.microservice.searchservice.Domain;



import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Document(indexName="erental")
public class SearchItem implements Serializable {

    @Id
    private long id;
    private String yearOfManufacture;
    private String brand;
    private String model;

    private long userId;
    private String userName;

    public SearchItem() {
    }

    public SearchItem(long id, String yearOfManufacture, String brand, String model, long userId, String userName) {
        this.id = id;
        this.yearOfManufacture = yearOfManufacture;
        this.brand = brand;
        this.model = model;
        this.userId = userId;
        this.userName = userName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private static final long serialVersionUID = 7156526077883281623L;
}
