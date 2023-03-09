package com.librerianacional.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserModel {
    private String email;
    private String name;
    private String lastName;
    private String documentType;
    private String documentNumber;
    private String cellPhone;
    private String phoneNumber;
    private String password;

    public UserModel(List<String> logData) {
        this.email = logData.get(0);
        this.name = logData.get(1);
        this.lastName = logData.get(2);
        this.documentType = logData.get(3);
        this.documentNumber = logData.get(4);
        this.cellPhone = logData.get(5);
        this.phoneNumber = logData.get(6);
        this.password = logData.get(7);
    }

    public UserModel(ArrayList<Map<String, String>> logData) {
        this.email = logData.get(0).get("email ");
        this.name = logData.get(0).get("name");
        this.lastName = logData.get(0).get("lastName");
        this.documentType = logData.get(0).get("documentType");
        this.documentNumber = logData.get(0).get("documentNumber");
        this.cellPhone = logData.get(0).get("cellPhone");
        this.phoneNumber = logData.get(0).get("phoneNumber");
        this.password = logData.get(0).get("password");
    }

    public UserModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }
}