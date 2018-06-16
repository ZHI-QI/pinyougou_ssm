package com.pinyougou.mapper;

import com.pinyougou.pojo.TbSpecificationOption;
import com.pinyougou.pojo.TbSpecificationOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSpecificationOptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated
     */
    int countByExample(TbSpecificationOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated
     */
    int deleteByExample(TbSpecificationOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated
     */
    int insert(TbSpecificationOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated
     */
    int insertSelective(TbSpecificationOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated
     */
    List<TbSpecificationOption> selectByExample(TbSpecificationOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated
     */
    TbSpecificationOption selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbSpecificationOption record, @Param("example") TbSpecificationOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbSpecificationOption record, @Param("example") TbSpecificationOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbSpecificationOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbSpecificationOption record);
}