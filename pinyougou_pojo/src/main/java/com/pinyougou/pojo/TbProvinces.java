package com.pinyougou.pojo;

import java.io.Serializable;

public class TbProvinces implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_provinces.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_provinces.provinceid
     *
     * @mbggenerated
     */
    private String provinceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_provinces.province
     *
     * @mbggenerated
     */
    private String province;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_provinces.id
     *
     * @return the value of tb_provinces.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_provinces.id
     *
     * @param id the value for tb_provinces.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_provinces.provinceid
     *
     * @return the value of tb_provinces.provinceid
     *
     * @mbggenerated
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_provinces.provinceid
     *
     * @param provinceid the value for tb_provinces.provinceid
     *
     * @mbggenerated
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_provinces.province
     *
     * @return the value of tb_provinces.province
     *
     * @mbggenerated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_provinces.province
     *
     * @param province the value for tb_provinces.province
     *
     * @mbggenerated
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }
}