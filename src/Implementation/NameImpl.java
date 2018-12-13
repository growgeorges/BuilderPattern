package Implementation;

import API.Name;

import java.util.List;

public class NameImpl implements Name {
    private final String firstName;
    private final List<String> middleNames;
    private final String lastName;

    private NameImpl(Builder builder){
        this.firstName = builder.firstName;
        this.middleNames = builder.middleNames;
        this.lastName = builder.lastName;
    }

    public static class Builder {
        private String firstName;
        private List<String> middleNames;
        private String lastName;

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleNames(List<String> middleNames){
            this.middleNames = middleNames;
            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Name build(){
            return new NameImpl(this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public List<String> getMiddleNames() {
        return middleNames;
    }

    public String getLastName() {
        return lastName;
    }
}
