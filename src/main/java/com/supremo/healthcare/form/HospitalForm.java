package com.supremo.healthcare.form;

public class HospitalForm {

    private Integer id;
    private Integer serial_number;
    private String hospital_Name;
    private Integer suspected_with_O2;
    private Integer suspected_without_O2;
    private Integer positive_with_O2;
    private Integer positive_without_O2;
    private Integer hdu;
    private Integer positive_icu;
    private Integer sari_icu;

    @Override
    public String toString() {
        return "HospitalForm{" +
                "id=" + id +
                ", serial_number=" + serial_number +
                ", hospital_Name='" + hospital_Name + '\'' +
                ", suspected_with_O2=" + suspected_with_O2 +
                ", suspected_without_O2=" + suspected_without_O2 +
                ", positive_with_O2=" + positive_with_O2 +
                ", positive_without_O2=" + positive_without_O2 +
                ", hdu=" + hdu +
                ", positive_icu=" + positive_icu +
                ", sari_icu=" + sari_icu +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(Integer serial_number) {
        this.serial_number = serial_number;
    }

    public String getHospital_Name() {
        return hospital_Name;
    }

    public void setHospital_Name(String hospital_Name) {
        this.hospital_Name = hospital_Name;
    }

    public Integer getSuspected_with_O2() {
        return suspected_with_O2;
    }

    public void setSuspected_with_O2(Integer suspected_with_O2) {
        this.suspected_with_O2 = suspected_with_O2;
    }

    public Integer getSuspected_without_O2() {
        return suspected_without_O2;
    }

    public void setSuspected_without_O2(Integer suspected_without_O2) {
        this.suspected_without_O2 = suspected_without_O2;
    }

    public Integer getPositive_with_O2() {
        return positive_with_O2;
    }

    public void setPositive_with_O2(Integer positive_with_O2) {
        this.positive_with_O2 = positive_with_O2;
    }

    public Integer getPositive_without_O2() {
        return positive_without_O2;
    }

    public void setPositive_without_O2(Integer positive_without_O2) {
        this.positive_without_O2 = positive_without_O2;
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
}
