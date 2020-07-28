package com.relationships.domain.OneToOneBi;

import javax.persistence.*;

@Entity(name = "Person")
public class Person {
    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    @JoinColumn(name = "license_id")
    private DrivingLicense drivingLicense;

    public DrivingLicense getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(DrivingLicense drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
}
