package com.hbc.data.trade.transfer.mapping.hbcbasedata.gen;

import com.hbc.data.trade.transfer.mapping.hbcbasedata.gen.bean.FinalAgentuser;
import com.hbc.data.trade.transfer.mapping.hbcbasedata.gen.bean.FinalAgentuserCriteria;
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
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface FinalAgentuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `agentuser`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalAgentuserSqlProvider.class, method="countByExample")
    int countByExample(FinalAgentuserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `agentuser`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=FinalAgentuserSqlProvider.class, method="deleteByExample")
    int deleteByExample(FinalAgentuserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `agentuser`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `agentuser`",
        "where agentUserId = #{agentuserid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer agentuserid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `agentuser`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `agentuser` (agentUserId, roleId, ",
        "roleName, agentId, ",
        "loginName, name, ",
        "password, encryptedPwd, ",
        "mobile, email, expireTime, ",
        "quota, loginNum, ",
        "orderNum, lastLogin, ",
        "totalPrice, type, ",
        "status, updated_at, ",
        "created_at)",
        "values (#{agentuserid,jdbcType=INTEGER}, #{roleid,jdbcType=INTEGER}, ",
        "#{rolename,jdbcType=VARCHAR}, #{agentid,jdbcType=INTEGER}, ",
        "#{loginname,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{encryptedpwd,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{expiretime,jdbcType=DATE}, ",
        "#{quota,jdbcType=INTEGER}, #{loginnum,jdbcType=INTEGER}, ",
        "#{ordernum,jdbcType=INTEGER}, #{lastlogin,jdbcType=TIMESTAMP}, ",
        "#{totalprice,jdbcType=INTEGER}, #{type,jdbcType=INTEGER}, ",
        "#{status,jdbcType=INTEGER}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(FinalAgentuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `agentuser`
     *
     * @mbggenerated
     */
    @InsertProvider(type=FinalAgentuserSqlProvider.class, method="insertSelective")
    int insertSelective(FinalAgentuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `agentuser`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalAgentuserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="agentUserId", property="agentuserid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR),
        @Result(column="agentId", property="agentid", jdbcType=JdbcType.INTEGER),
        @Result(column="loginName", property="loginname", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="encryptedPwd", property="encryptedpwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="expireTime", property="expiretime", jdbcType=JdbcType.DATE),
        @Result(column="quota", property="quota", jdbcType=JdbcType.INTEGER),
        @Result(column="loginNum", property="loginnum", jdbcType=JdbcType.INTEGER),
        @Result(column="orderNum", property="ordernum", jdbcType=JdbcType.INTEGER),
        @Result(column="lastLogin", property="lastlogin", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="totalPrice", property="totalprice", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FinalAgentuser> selectByExampleWithRowbounds(FinalAgentuserCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `agentuser`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalAgentuserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="agentUserId", property="agentuserid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR),
        @Result(column="agentId", property="agentid", jdbcType=JdbcType.INTEGER),
        @Result(column="loginName", property="loginname", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="encryptedPwd", property="encryptedpwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="expireTime", property="expiretime", jdbcType=JdbcType.DATE),
        @Result(column="quota", property="quota", jdbcType=JdbcType.INTEGER),
        @Result(column="loginNum", property="loginnum", jdbcType=JdbcType.INTEGER),
        @Result(column="orderNum", property="ordernum", jdbcType=JdbcType.INTEGER),
        @Result(column="lastLogin", property="lastlogin", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="totalPrice", property="totalprice", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FinalAgentuser> selectByExample(FinalAgentuserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `agentuser`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "agentUserId, roleId, roleName, agentId, loginName, name, password, encryptedPwd, ",
        "mobile, email, expireTime, quota, loginNum, orderNum, lastLogin, totalPrice, ",
        "type, status, updated_at, created_at",
        "from `agentuser`",
        "where agentUserId = #{agentuserid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="agentUserId", property="agentuserid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR),
        @Result(column="agentId", property="agentid", jdbcType=JdbcType.INTEGER),
        @Result(column="loginName", property="loginname", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="encryptedPwd", property="encryptedpwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="expireTime", property="expiretime", jdbcType=JdbcType.DATE),
        @Result(column="quota", property="quota", jdbcType=JdbcType.INTEGER),
        @Result(column="loginNum", property="loginnum", jdbcType=JdbcType.INTEGER),
        @Result(column="orderNum", property="ordernum", jdbcType=JdbcType.INTEGER),
        @Result(column="lastLogin", property="lastlogin", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="totalPrice", property="totalprice", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    FinalAgentuser selectByPrimaryKey(Integer agentuserid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `agentuser`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalAgentuserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FinalAgentuser record, @Param("example") FinalAgentuserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `agentuser`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalAgentuserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FinalAgentuser record, @Param("example") FinalAgentuserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `agentuser`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalAgentuserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FinalAgentuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `agentuser`
     *
     * @mbggenerated
     */
    @Update({
        "update `agentuser`",
        "set roleId = #{roleid,jdbcType=INTEGER},",
          "roleName = #{rolename,jdbcType=VARCHAR},",
          "agentId = #{agentid,jdbcType=INTEGER},",
          "loginName = #{loginname,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "encryptedPwd = #{encryptedpwd,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "expireTime = #{expiretime,jdbcType=DATE},",
          "quota = #{quota,jdbcType=INTEGER},",
          "loginNum = #{loginnum,jdbcType=INTEGER},",
          "orderNum = #{ordernum,jdbcType=INTEGER},",
          "lastLogin = #{lastlogin,jdbcType=TIMESTAMP},",
          "totalPrice = #{totalprice,jdbcType=INTEGER},",
          "type = #{type,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where agentUserId = #{agentuserid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FinalAgentuser record);
}