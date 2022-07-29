package com.example.selenium;

public class C_Loc {
    private Integer c_loc;
    private Integer parent_id;
    private String name;
    private Boolean is_country;
    private Boolean is_region;
    private Boolean is_city;
    private Integer c_country;
    private Boolean is_deleted;
    private Boolean is_village;
    private Boolean is_settlement;
    private Boolean is_station;
    private Boolean is_aul;
    private Boolean is_grp;
    private Double lat;
    private Double lon;
    private Double ne_lat;
    private Double ne_lon;
    private Double sw_lat;
    private Double sw_lon;

    // transiend
    public String parent_id_str;

    public Integer getC_loc() {
        return c_loc;
    }

    public void setC_loc(Integer c_loc) {
        this.c_loc = c_loc;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIs_country() {
        return is_country;
    }

    public void setIs_country(Boolean is_country) {
        this.is_country = is_country;
    }

    public Boolean getIs_region() {
        return is_region;
    }

    public void setIs_region(Boolean is_region) {
        this.is_region = is_region;
    }

    public Boolean getIs_city() {
        return is_city;
    }

    public void setIs_city(Boolean is_city) {
        this.is_city = is_city;
    }

    public Integer getC_country() {
        return c_country;
    }

    public void setC_country(Integer c_country) {
        this.c_country = c_country;
    }

    public Boolean getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public Boolean getIs_village() {
        return is_village;
    }

    public void setIs_village(Boolean is_village) {
        this.is_village = is_village;
    }

    public Boolean getIs_settlement() {
        return is_settlement;
    }

    public void setIs_settlement(Boolean is_settlement) {
        this.is_settlement = is_settlement;
    }

    public Boolean getIs_station() {
        return is_station;
    }

    public void setIs_station(Boolean is_station) {
        this.is_station = is_station;
    }

    public Boolean getIs_aul() {
        return is_aul;
    }

    public void setIs_aul(Boolean is_aul) {
        this.is_aul = is_aul;
    }

    public Boolean getIs_grp() {
        return is_grp;
    }

    public void setIs_grp(Boolean is_grp) {
        this.is_grp = is_grp;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getNe_lat() {
        return ne_lat;
    }

    public void setNe_lat(Double ne_lat) {
        this.ne_lat = ne_lat;
    }

    public Double getNe_lon() {
        return ne_lon;
    }

    public void setNe_lon(Double ne_lon) {
        this.ne_lon = ne_lon;
    }

    public Double getSw_lat() {
        return sw_lat;
    }

    public void setSw_lat(Double sw_lat) {
        this.sw_lat = sw_lat;
    }

    public Double getSw_lon() {
        return sw_lon;
    }

    public void setSw_lon(Double sw_lon) {
        this.sw_lon = sw_lon;
    }

    public String getParent_id_str() {
        return parent_id_str;
    }

    public void setParent_id_str(String parent_id_str) {
        this.parent_id_str = parent_id_str;
    }

    @Override
    public String toString() {
        return "C_Loc{" +
                "c_loc=" + c_loc +
                ", parent_id=" + parent_id +
                ", name='" + name + '\'' +
                ", is_country=" + is_country +
                ", is_region=" + is_region +
                ", is_city=" + is_city +
                ", c_country=" + c_country +
                ", is_deleted=" + is_deleted +
                ", is_village=" + is_village +
                ", is_settlement=" + is_settlement +
                ", is_station=" + is_station +
                ", is_aul=" + is_aul +
                ", is_grp=" + is_grp +
                ", lat=" + lat +
                ", lon=" + lon +
                ", ne_lat=" + ne_lat +
                ", ne_lon=" + ne_lon +
                ", sw_lat=" + sw_lat +
                ", sw_lon=" + sw_lon +
                ", parent_id_str='" + parent_id_str + '\'' +
                '}';
    }
}
