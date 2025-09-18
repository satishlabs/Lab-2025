package com.dp.builder;

public class User {
    //Required
    private int id;
    private String name;

    //Optional
    private String eamil;
    private String address;

    private User(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.eamil = builder.eamil;
        this.address = builder.address;
    }

    public static class Builder{
        private int id;
        private String name;
        private String eamil;
        private String address;

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public  Builder email(String email){
            this.eamil = email;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eamil='" + eamil + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
