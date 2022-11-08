package com.bridgelabz.greeting.model;

public class Greeting {
    private String id;
    private String name;
    private String messages;

    public Greeting(String id, String name, String messages) {
        this.id = id;
        this.name = name;
        this.messages = messages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
