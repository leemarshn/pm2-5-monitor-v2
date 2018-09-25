package com.kaiote.pm25monitor.Model;

import javax.persistence.*;
import javax.xml.stream.Location;


@Entity
@Table(name = "tags")
public class UserTag {


    @Id
    private Long userLocationId;
    private Location location;


    public Long getUserLocationId() {
        return userLocationId;
    }

    public void setUserLocationId(Long userLocationId) {
        this.userLocationId = userLocationId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
