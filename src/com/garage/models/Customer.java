package com.garage.models;

import java.time.LocalDateTime;
import java.util.UUID;

public class Customer {

    private UUID id;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setParticipant(Boolean participant) {
        isParticipant = participant;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    private String firstName;
    private String lastName;
    private Boolean isParticipant;
    private LocalDateTime createdAt;

    public UUID getId() {
        return id;
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

    public Boolean getIsParticipant() {
        return isParticipant;
    }

    public void setIsParticipant(Boolean participant) {
        isParticipant = participant;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isParticipant=" + isParticipant +
                ", createdAt=" + createdAt +
                '}';
    }
}
