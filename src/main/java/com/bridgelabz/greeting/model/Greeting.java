package com.bridgelabz.greeting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Greeting {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String messages;

    public Greeting(int id, String name, String messages) {
        this.id = id;
        this.name = name;
        this.messages = messages;
    }

    public Greeting() {

    }

    public Greeting(int incrementAndGet, String messages) {
        this.id = incrementAndGet;
        this.messages = messages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }
}
