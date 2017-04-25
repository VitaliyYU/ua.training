package ua.training.model;

import java.time.LocalDate;

/**
 * Created by vitaliy on 22.04.17.
 */
public class Note {
    private String  nickname;
    private String phoneNumbers;
    private String email;
    private String address;
    private LocalDate createTime;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime() {
        createTime=LocalDate.now();
    }

    public String toString(){
        return nickname+" "+
                email+" "+
                address+" "+
                phoneNumbers;
    }

}
