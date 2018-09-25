package com.kaiote.pm25monitor.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pmValues")
public class PMValue {

    @Id
    private Long pmValueId;
    private double pmValue;
    private Long anchorId;

    public Long getPmValueId() {
        return pmValueId;
    }

    public void setPmValueId(Long pmValueId) {
        this.pmValueId = pmValueId;
    }

    public double getPmValue() {
        return pmValue;
    }

    public void setPmValue(double pmValue) {
        this.pmValue = pmValue;
    }

    public Long getAnchorId() {
        return anchorId;
    }

    public void setAnchorId(Long anchorId) {
        this.anchorId = anchorId;
    }
}
