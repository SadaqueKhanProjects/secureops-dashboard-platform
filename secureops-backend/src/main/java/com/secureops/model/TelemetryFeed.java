package com.secureops.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Document(collection = "telemetry")
public class TelemetryFeed {

    @Id
    private String id;

    @NotBlank(message = "Drone ID must not be blank")
    private String droneId;

    @DecimalMin(value = "-90.0", message = "Latitude too low")
    @DecimalMax(value = "90.0", message = "Latitude too high")
    private double latitude;

    @DecimalMin(value = "-180.0", message = "Longitude too low")
    @DecimalMax(value = "180.0", message = "Longitude too high")
    private double longitude;

    @Min(value = 0, message = "Battery cannot be negative")
    @Max(value = 100, message = "Battery cannot exceed 100")
    private int battery;

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDroneId() {
        return droneId;
    }

    public void setDroneId(String droneId) {
        this.droneId = droneId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

}