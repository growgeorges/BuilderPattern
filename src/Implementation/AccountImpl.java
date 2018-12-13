package Implementation;

import API.Account;
import API.Address;
import API.Name;

public class AccountImpl implements Account {
    private final int id;
    private final String mail;
    private final Address address;
    private final Name name;


    private AccountImpl(Builder builder) {
        this.id = builder.id;
        this.mail = builder.mail;
        this.address = builder.address;
        this.name = builder.name;
    }

    public static class Builder{
        private int id;
        private String mail;
        private Address address;
        private Name name;

        public Builder setid(final int id){
            this.id = id;
            return this;
        }

        public Builder setmail(final String mail){
            this.mail = mail;
            return this;
        }

        public Builder setaddress(final Address address){
            this.address = address;
            return this;
        }

        public Builder setname(final Name name){
            this.name = name;
            return this;
        }

        public Account build(){
            return new AccountImpl(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public Address getAddress() {
        return address;
    }

    public Name getName() {
        return name;
    }

}
