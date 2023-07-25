package com.SimbadMart.maven.simbadMart.customer;

public enum UserRole {
    MANAGER,CUSTOMER;
    @Override
    public String toString() {
        return  this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}
