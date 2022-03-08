package models;

import java.time.LocalDateTime;

public class Customer {

    private Integer id;
    private String firstName;
    private String lastName;
    private Boolean isParticipant;
    private LocalDateTime createdAt;

    public Customer(Integer id, String firstName, String lastName, Boolean isParticipant, LocalDateTime createdAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isParticipant = isParticipant;
        this.createdAt = LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getParticipant() {
        return isParticipant;
    }

    public void setParticipant(Boolean participant) {
        isParticipant = participant;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
