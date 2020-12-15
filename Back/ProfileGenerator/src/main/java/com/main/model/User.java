package com.main.model;

import javax.persistence.*;


@Entity
@Table(name = "PP_Users")
public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    private long dt_create;
    @Temporal(TemporalType.TIMESTAMP)
    private long dt_update;

    public User(){}

    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    @Column(name = "username", nullable = false)
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "dt_create")
    public long getDt_create() {
        return dt_create;
    }

    public void setDt_create(long dt_create) {
        this.dt_create = dt_create;
    }

    @Column(name = "dt_update")
    public long getDt_update() {
        return dt_update;
    }

    public void setDt_update(long dt_update) {
        this.dt_update = dt_update;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dt_create=" + dt_create +
                ", dt_update=" + dt_update +
                '}';
    }
}
