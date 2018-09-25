package com.kaiote.pm25monitor.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "anchors")
public class Anchor {


    @Id
    private Long anchorId;
    private Long userLocationId;

    public Long getAnchorId() {
        return anchorId;
    }

    public void setAnchorId(Long anchorId) {
        this.anchorId = anchorId;
    }

    public Long getUserLocationId() {
        return userLocationId;
    }

    public void setUserLocationId(Long userLocationId) {
        this.userLocationId = userLocationId;
    }
}
