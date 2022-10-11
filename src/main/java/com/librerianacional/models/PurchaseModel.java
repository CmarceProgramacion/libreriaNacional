package com.librerianacional.models;

import java.util.List;

public class PurchaseModel {

    private String nameArticle;
    private String addressName;
    private String typeOfHousing;
    private String names;
    private String lastNames;
    private String phone;
    private String cellPhone;
    private String address;
    private String addressDescription;
    private String postalCode;
    private String country;
    private String department;
    private String city;

    public PurchaseModel(List<String> shoppingList) {
        this.nameArticle = shoppingList.get(2);
        this.addressName = shoppingList.get(3);
        this.typeOfHousing = shoppingList.get(4);
        this.names = shoppingList.get(5);
        this.lastNames = shoppingList.get(6);
        this.phone = shoppingList.get(7);
        this.cellPhone = shoppingList.get(8);
        this.address = shoppingList.get(9);
        this.addressDescription = shoppingList.get(10);
        this.postalCode = shoppingList.get(11);
        this.country = shoppingList.get(12);
        this.department = shoppingList.get(13);
        this.city = shoppingList.get(14);
    }

    public void setNameArticle(String nameArticle) {
        this.nameArticle = nameArticle;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public void setTypeOfHousing(String typeOfHousing) {
        this.typeOfHousing = typeOfHousing;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAddressDescription(String addressDescription) {
        this.addressDescription = addressDescription;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public String getAddressName() {
        return addressName;
    }

    public String getTypeOfHousing() {
        return typeOfHousing;
    }

    public String getNames() {
        return names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public String getPhone() {
        return phone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getAddress() {
        return address;
    }

    public String getAddressDescription() {
        return addressDescription;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getDepartment() {
        return department;
    }

    public String getCity() {
        return city;
    }
}
