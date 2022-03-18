package com.example.form.model;

import java.nio.channels.SocketChannel;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name="person")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String occupation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public user() {

    }

    public user(String name,String occupation){
        this.name = name;
        this.occupation= occupation;
    }


    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String name) {
        this.name = occupation;
    }


    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
