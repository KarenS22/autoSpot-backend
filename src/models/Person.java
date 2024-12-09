/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Person {
    private int id;
    private String  documentID;
    private String name;
    private String lastName;
    private String mail;
    private char role;
    private char status;
    private Date birthDay;
    private String mailS;
    private String location;
    private List<Automobile> listAutomobiles;
    private List<Contract> listContracts;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public char getRole() {
        return role;
    }

    public void setRole(char role) {
        this.role = role;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getMailS() {
        return mailS;
    }

    public void setMailS(String mailS) {
        this.mailS = mailS;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Automobile> getListAutomobiles() {
        return listAutomobiles;
    }

    public void setListAutomobiles(List<Automobile> listAutomobiles) {
        this.listAutomobiles = listAutomobiles;
    }

    public List<Contract> getListContracts() {
        return listContracts;
    }

    public void setListContracts(List<Contract> listContracts) {
        this.listContracts = listContracts;
    }    
}
