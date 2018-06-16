package com.pinyougou.pojo;

import java.util.Date;

public class TbFreightTemplate {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.seller_id
     *
     * @mbggenerated
     */
    private String sellerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.is_default
     *
     * @mbggenerated
     */
    private String isDefault;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.send_time_type
     *
     * @mbggenerated
     */
    private String sendTimeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.price
     *
     * @mbggenerated
     */
    private Long price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.id
     *
     * @return the value of tb_freight_template.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.id
     *
     * @param id the value for tb_freight_template.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.seller_id
     *
     * @return the value of tb_freight_template.seller_id
     *
     * @mbggenerated
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.seller_id
     *
     * @param sellerId the value for tb_freight_template.seller_id
     *
     * @mbggenerated
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.is_default
     *
     * @return the value of tb_freight_template.is_default
     *
     * @mbggenerated
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.is_default
     *
     * @param isDefault the value for tb_freight_template.is_default
     *
     * @mbggenerated
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.name
     *
     * @return the value of tb_freight_template.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.name
     *
     * @param name the value for tb_freight_template.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.send_time_type
     *
     * @return the value of tb_freight_template.send_time_type
     *
     * @mbggenerated
     */
    public String getSendTimeType() {
        return sendTimeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.send_time_type
     *
     * @param sendTimeType the value for tb_freight_template.send_time_type
     *
     * @mbggenerated
     */
    public void setSendTimeType(String sendTimeType) {
        this.sendTimeType = sendTimeType == null ? null : sendTimeType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.price
     *
     * @return the value of tb_freight_template.price
     *
     * @mbggenerated
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.price
     *
     * @param price the value for tb_freight_template.price
     *
     * @mbggenerated
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.create_time
     *
     * @return the value of tb_freight_template.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.create_time
     *
     * @param createTime the value for tb_freight_template.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}