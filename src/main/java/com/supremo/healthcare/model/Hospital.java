package com.supremo.healthcare.model;

import javax.persistence.*;

@Entity
@Table(name = "facility")
public class Hospital {

    @Id
    @GeneratedValue()
    @Column(name = "id")
    private int id;

    @Column(name = "hospital_Name", columnDefinition = "varchar(128)", nullable = false)
    private String hospital_Name;

    @Column(name = "gen", nullable = false)
    private Integer gen;

    @Column(name = "hdu", nullable = false)
    private Integer hdu;

    @Column(name = "positive_icu", nullable = false)
    private Integer positive_icu;

    @Column(name = "sari_icu", nullable = false)
    private Integer sari_icu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHospital_Name() {
        return hospital_Name;
    }

    public void setHospital_Name(String hospital_Name) {
        this.hospital_Name = hospital_Name;
    }

    public Integer getGen() {
        return gen;
    }

    public void setGen(Integer gen) {
        this.gen = gen;
    }

    public Integer getHdu() {
        return hdu;
    }

    public void setHdu(Integer hdu) {
        this.hdu = hdu;
    }

    public Integer getPositive_icu() {
        return positive_icu;
    }

    public void setPositive_icu(Integer positive_icu) {
        this.positive_icu = positive_icu;
    }

    public Integer getSari_icu() {
        return sari_icu;
    }

    public void setSari_icu(Integer sari_icu) {
        this.sari_icu = sari_icu;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", hospital_Name='" + hospital_Name + '\'' +
                ", gen=" + gen +
                ", hdu=" + hdu +
                ", positive_icu=" + positive_icu +
                ", sari_icu=" + sari_icu +
                '}';
    }
}
