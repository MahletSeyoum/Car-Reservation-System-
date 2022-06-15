//package carrental.microservice.searchservice.Domain;
//
//
//
//import javax.persistence.*;
//@Entity
//@Table(name="userT")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long userId;
//    private String userName;
//
//    public User(long userId, String userName) {
//        this.userId = userId;
//        this.userName = userName;
//    }
//
//    public User() {
//    }
//
//    public long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(long userId) {
//        this.userId = userId;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    @Entity
//    public static class SearchItem {
//
//        @Id
//        private long id;
//        private String yearOfManufacture;
//        private String brand;
//        private String model;
//        private long userId;
//        private String userName;
//
//        public SearchItem() {
//        }
//
//        public SearchItem(long id, String yearOfManufacture, String brand, String model, long userId, String userName) {
//            this.id = id;
//            this.yearOfManufacture = yearOfManufacture;
//            this.brand = brand;
//            this.model = model;
//            this.userId = userId;
//            this.userName = userName;
//        }
//
//        public long getId() {
//            return id;
//        }
//
//        public void setId(long id) {
//            this.id = id;
//        }
//
//        public String getYearOfManufacture() {
//            return yearOfManufacture;
//        }
//
//        public void setYearOfManufacture(String yearOfManufacture) {
//            this.yearOfManufacture = yearOfManufacture;
//        }
//
//        public String getBrand() {
//            return brand;
//        }
//
//        public void setBrand(String brand) {
//            this.brand = brand;
//        }
//
//        public String getModel() {
//            return model;
//        }
//
//        public void setModel(String model) {
//            this.model = model;
//        }
//
//        public long getUserId() {
//            return userId;
//        }
//
//        public void setUserId(long userId) {
//            this.userId = userId;
//        }
//
//        public String getUserName() {
//            return userName;
//        }
//
//        public void setUserName(String userName) {
//            this.userName = userName;
//        }
//    }
//}
