package carrental.microservice.searchservice.Domain;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/*import javax.persistence.Entity;
import javax.persistence.Id;*/
import java.io.Serializable;

@Document(indexName="erental")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchItem implements Serializable {

    @Id
    private String id;
    private String yearOfManufacture;
    private String brand;
    private String model;
    private double price;

    private String userId;
    private String userName;




    public SearchItem(String yearOfManufacture, String brand, String model, String userId, String userName,double price) {
        this.yearOfManufacture = yearOfManufacture;
        this.brand = brand;
        this.model = model;
        this.userId = userId;
        this.userName = userName;
        this.price = price;
    }

    private static final long serialVersionUID = 7156526077883281623L;
/*
    public long getId() {
        return id;
    }

    public void setId(String id) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }*/


}
