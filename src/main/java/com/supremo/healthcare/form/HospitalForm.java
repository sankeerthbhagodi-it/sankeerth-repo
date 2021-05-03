package com.supremo.healthcare.form;

public class HospitalForm {

    private Integer id;
    private String hospital_Name;
    private Integer gen;
    private Integer hdu;
    private Integer icu;

    @Override
    public String toString() {
        return "HospitalForm{" +
                "id=" + id +
                ", hospital_Name='" + hospital_Name + '\'' +
                ", gen=" + gen +
                ", hdu=" + hdu +
                ", icu=" + icu +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getIcu() {
        return icu;
    }

    public void setIcu(Integer icu) {
        this.icu = icu;
    }
}
