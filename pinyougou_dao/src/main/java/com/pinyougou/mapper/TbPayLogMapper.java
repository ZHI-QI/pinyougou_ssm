package com.pinyougou.mapper;

import com.pinyougou.pojo.TbPayLog;
import com.pinyougou.pojo.TbPayLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPayLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pay_log
     *
     * @mbggenerated
     */
    int countByExample(TbPayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pay_log
     *
     * @mbggenerated
     */
    int deleteByExample(TbPayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pay_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String outTradeNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pay_log
     *
     * @mbggenerated
     */
    int insert(TbPayLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pay_log
     *
     * @mbggenerated
     */
    int insertSelective(TbPayLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pay_log
     *
     * @mbggenerated
     */
    List<TbPayLog> selectByExample(TbPayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pay_log
     *
     * @mbggenerated
     */
    TbPayLog selectByPrimaryKey(String outTradeNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pay_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbPayLog record, @Param("example") TbPayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pay_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbPayLog record, @Param("example") TbPayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pay_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbPayLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pay_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbPayLog record);
}