package com.codeup.springblog.model;


import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "INT(11) UNSIGNED", name = "USER_ID")
    private long id;

    @Column(nullable = false, name = "USERNAME")
    private String userName;

    @Column(nullable = false)
    private boolean isAdmin;

    @Column(nullable = false)
    private String email;

    private String firstName;
    private String lastName;
    private String userAvatar;
    private String socialOneURL;
    private String socialTwoURL;
    private String socialThreeURL;

    public User() {
    }

    public User(String userName, Boolean isAdmin, String email, String firstName, String lastName, String userAvatar, String socialOneURL, String socialTwoURL, String socialThreeURL) {
        this.isAdmin = isAdmin;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userAvatar = userAvatar;
        this.socialOneURL = socialOneURL;
        this.socialTwoURL = socialTwoURL;
        this.socialThreeURL = socialThreeURL;
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public String getSocialOneURL() {
        return socialOneURL;
    }

    public String getSocialTwoURL() {
        return socialTwoURL;
    }

    public String getSocialThreeURL() {
        return socialThreeURL;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public void setSocialOneURL(String socialOneURL) {
        this.socialOneURL = socialOneURL;
    }

    public void setSocialTwoURL(String socialTwoURL) {
        this.socialTwoURL = socialTwoURL;
    }

    public void setSocialThreeURL(String socialThreeURL) {
        this.socialThreeURL = socialThreeURL;
    }

}