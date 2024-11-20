/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.bussiness;

import java.io.Serializable;
/**
 *
 * @author Duy Thanh
 */
public class User implements Serializable{
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String hearAbout;
    private String receive;
    private String contact;
    
    public User(){
        firstName = "";
        lastName = "";
        email = "";
        dateOfBirth = "";
        hearAbout = "";
        receive = "";
        contact = "";
    }
    
    public User(String firstName, String lastName, String email, String dateOfBirth, String hearAbout, String receive, String contact){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.hearAbout = hearAbout;
        this.receive = receive;
        this.contact = contact;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
      public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }    
    
    public String getHearAbout() {
        return hearAbout;
    }

    public void setHearAbout(String hearAbout) {
        this.hearAbout = hearAbout;
    }

    public String getReceive() {
        return receive;
    }

    public void setReceive(String receive) {
        this.receive = receive;
    }
    
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
