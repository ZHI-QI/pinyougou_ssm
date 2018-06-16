package com.pinyougou.mapper;

import com.pinyougou.pojo.TbProvinces;
import com.pinyougou.pojo.TbProvincesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProvincesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int countByExample(TbProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int deleteByExample(TbProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int insert(TbProvinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int insertSelective(TbProvinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    List<TbProvinces> selectByExample(TbProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    TbProvinces selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbProvinces record, @Param("example") TbProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbProvinces record, @Param("example") TbProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbProvinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbProvinces record);
}