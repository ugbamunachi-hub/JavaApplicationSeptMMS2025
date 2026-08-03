/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter8;


import java.time.LocalDateTime;

public class Emergency {
    // Reporting Source Info
    private String reporterName;
    private String reporterPhoneNumber;
    private LocalDateTime reportTime;

    // Location Info (Enhanced 9-1-1 / Phase II GPS data)
    private String physicalAddress;
    private double GPSLatitude;
    private double GPSLongitude;

    // Nature of Incident
    private String incidentType; // e.g., "Fire", "Medical", "Crime in Progress"
    private int severityLevel;   // 1 to 5 numeric priority scale
    private boolean weaponsInvolved;

    // Response Tracking
    private String dispatchedUnits; // e.g., "Ambulance 4, Engine Company 12"
    private LocalDateTime dispatchTime;
    private LocalDateTime arrivalTime;
    private String currentStatus;  // e.g., "Reported", "Dispatched", "On-Scene", "Resolved"

    public Emergency(String reporterName, String reporterPhoneNumber, String physicalAddress, String incidentType) {
        this.reporterName = reporterName;
        this.reporterPhoneNumber = reporterPhoneNumber;
        this.physicalAddress = physicalAddress;
        this.incidentType = incidentType;
        this.reportTime = LocalDateTime.now();
        this.currentStatus = "Reported";
    }

    public String getReporterName() { return reporterName; }
    public void setReporterName(String reporterName) { this.reporterName = reporterName; }

    public String getReporterPhoneNumber() { return reporterPhoneNumber; }
    public void setReporterPhoneNumber(String reporterPhoneNumber) { this.reporterPhoneNumber = reporterPhoneNumber; }

    public LocalDateTime getReportTime() { return reportTime; }

    public String getPhysicalAddress() { return physicalAddress; }
    public void setPhysicalAddress(String physicalAddress) { this.physicalAddress = physicalAddress; }

    public double getGPSLatitude() { return GPSLatitude; }
    public double getGPSLongitude() { return GPSLongitude; }
    public void setGPSCoordinates(double latitude, double longitude) {
        this.GPSLatitude = latitude;
        this.GPSLongitude = longitude;
    }

    public String getIncidentType() { return incidentType; }
    public void setIncidentType(String incidentType) { this.incidentType = incidentType; }

    public int getSeverityLevel() { return severityLevel; }
    public void setSeverityLevel(int severityLevel) { this.severityLevel = severityLevel; }

    public boolean isWeaponsInvolved() { return weaponsInvolved; }
    public void setWeaponsInvolved(boolean weaponsInvolved) { this.weaponsInvolved = weaponsInvolved; }

    public String getDispatchedUnits() { return dispatchedUnits; }
    public LocalDateTime getDispatchTime() { return dispatchTime; }
    public void dispatchUnits(String units) {
        this.dispatchedUnits = units;
        this.dispatchTime = LocalDateTime.now();
        this.currentStatus = "Dispatched";
    }

    public LocalDateTime getArrivalTime() { return arrivalTime; }
    public void markUnitsArrived() {
        this.arrivalTime = LocalDateTime.now();
        this.currentStatus = "On-Scene";
    }

    public String getCurrentStatus() { return currentStatus; }
    public void setResolved() { this.currentStatus = "Resolved"; }

    @Override
    public String toString() {
        return String.format("Incident: %s | Status: %s | Location: %s | Time: %s", 
            incidentType, currentStatus, physicalAddress, reportTime);
    }
}
    

