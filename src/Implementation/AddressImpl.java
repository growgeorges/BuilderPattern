package Implementation;

import API.Address;
import API.Name;

import java.util.List;

public class AddressImpl implements Address {
    private final int houseNumber;
    private final String street;
    private final String zipCode;
    private final String city;

    private AddressImpl(Builder builder){
        this.houseNumber = builder.houseNumber;
        this.street = builder.street;
        this.zipCode = builder.zipCode;
        this.city = builder.city;
    }

    public static class Builder {
        private int houseNumber;
        private String street;
        private String zipCode;
        private String city;

        public Builder setHouseNumber(int houseNumber){
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder setStreet(String street){
            this.street = street;
            return this;
        }

        public Builder setZipCode(String zipCode){
            this.zipCode = zipCode;
            return this;
        }

        public Builder setCity(String city){
            this.city = city;
            return this;
        }

        public Address build(){
            return new AddressImpl(this);
        }
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }
}
