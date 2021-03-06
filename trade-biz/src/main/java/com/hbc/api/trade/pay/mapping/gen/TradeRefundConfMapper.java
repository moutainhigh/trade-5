package com.hbc.api.trade.pay.mapping.gen;

import com.hbc.api.trade.pay.mapping.gen.bean.TradeRefundConf;
import com.hbc.api.trade.pay.mapping.gen.bean.TradeRefundConfExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TradeRefundConfMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund_conf`
     *
     * @mbggenerated
     */
    @SelectProvider(type=TradeRefundConfSqlProvider.class, method="countByExample")
    int countByExample(TradeRefundConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund_conf`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=TradeRefundConfSqlProvider.class, method="deleteByExample")
    int deleteByExample(TradeRefundConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund_conf`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `trade_refund_conf`",
        "where refund_conf_no = #{refundConfNo,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String refundConfNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund_conf`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `trade_refund_conf` (refund_conf_no, start_hour, ",
        "is_contain_start, end_hour, ",
        "is_contain_end, user_ratio, ",
        "guide_ratio, refund_type, ",
        "refund_type_name, city_id, ",
        "create_time, update_time)",
        "values (#{refundConfNo,jdbcType=VARCHAR}, #{startHour,jdbcType=INTEGER}, ",
        "#{isContainStart,jdbcType=TINYINT}, #{endHour,jdbcType=INTEGER}, ",
        "#{isContainEnd,jdbcType=TINYINT}, #{userRatio,jdbcType=DOUBLE}, ",
        "#{guideRatio,jdbcType=DOUBLE}, #{refundType,jdbcType=TINYINT}, ",
        "#{refundTypeName,jdbcType=VARCHAR}, #{cityId,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(TradeRefundConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund_conf`
     *
     * @mbggenerated
     */
    @InsertProvider(type=TradeRefundConfSqlProvider.class, method="insertSelective")
    int insertSelective(TradeRefundConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund_conf`
     *
     * @mbggenerated
     */
    @SelectProvider(type=TradeRefundConfSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="refund_conf_no", property="refundConfNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="start_hour", property="startHour", jdbcType=JdbcType.INTEGER),
        @Result(column="is_contain_start", property="isContainStart", jdbcType=JdbcType.TINYINT),
        @Result(column="end_hour", property="endHour", jdbcType=JdbcType.INTEGER),
        @Result(column="is_contain_end", property="isContainEnd", jdbcType=JdbcType.TINYINT),
        @Result(column="user_ratio", property="userRatio", jdbcType=JdbcType.DOUBLE),
        @Result(column="guide_ratio", property="guideRatio", jdbcType=JdbcType.DOUBLE),
        @Result(column="refund_type", property="refundType", jdbcType=JdbcType.TINYINT),
        @Result(column="refund_type_name", property="refundTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TradeRefundConf> selectByExample(TradeRefundConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund_conf`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "refund_conf_no, start_hour, is_contain_start, end_hour, is_contain_end, user_ratio, ",
        "guide_ratio, refund_type, refund_type_name, city_id, create_time, update_time",
        "from `trade_refund_conf`",
        "where refund_conf_no = #{refundConfNo,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="refund_conf_no", property="refundConfNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="start_hour", property="startHour", jdbcType=JdbcType.INTEGER),
        @Result(column="is_contain_start", property="isContainStart", jdbcType=JdbcType.TINYINT),
        @Result(column="end_hour", property="endHour", jdbcType=JdbcType.INTEGER),
        @Result(column="is_contain_end", property="isContainEnd", jdbcType=JdbcType.TINYINT),
        @Result(column="user_ratio", property="userRatio", jdbcType=JdbcType.DOUBLE),
        @Result(column="guide_ratio", property="guideRatio", jdbcType=JdbcType.DOUBLE),
        @Result(column="refund_type", property="refundType", jdbcType=JdbcType.TINYINT),
        @Result(column="refund_type_name", property="refundTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    TradeRefundConf selectByPrimaryKey(String refundConfNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund_conf`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=TradeRefundConfSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TradeRefundConf record, @Param("example") TradeRefundConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund_conf`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=TradeRefundConfSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TradeRefundConf record);
}