package com.darkshadow.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "room_key")
public class RoomKey implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String barCode;
    private boolean active;
    private boolean masterKey;
    private Date issuedAt;

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isMasterKey() {
        return masterKey;
    }

    public void setMasterKey(boolean masterKey) {
        this.masterKey = masterKey;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    public RoomKey() {
    }

    public RoomKey(String barCode, boolean active, boolean masterKey, Date issuedAt) {
        this.barCode = barCode;
        this.active = active;
        this.masterKey = masterKey;
        this.issuedAt = issuedAt;
    }
}
