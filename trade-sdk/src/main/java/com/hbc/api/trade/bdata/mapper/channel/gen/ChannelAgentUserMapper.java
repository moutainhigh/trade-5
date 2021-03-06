package com.hbc.api.trade.bdata.mapper.channel.gen;

import com.hbc.api.trade.bdata.mapper.channel.gen.bean.ChannelAgentUser;
import com.hbc.api.trade.bdata.mapper.channel.gen.bean.ChannelAgentUserExample;
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

public interface ChannelAgentUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent_user`
     *
     * @mbggenerated
     */
    @SelectProvider(type=ChannelAgentUserSqlProvider.class, method="countByExample")
    int countByExample(ChannelAgentUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent_user`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=ChannelAgentUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(ChannelAgentUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent_user`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `channel_agent_user`",
        "where agent_user_id = #{agentUserId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long agentUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent_user`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `channel_agent_user` (agent_user_id, role_id, ",
        "role_name, agent_id, ",
        "agent_name, login_name, ",
        "agent_user_name, password, ",
        "encrypted_pwd, phone, ",
        "email, expire_time, ",
        "quota, login_num, ",
        "order_num, last_login_time, ",
        "total_price, type, ",
        "status, update_time, ",
        "create_time)",
        "values (#{agentUserId,jdbcType=BIGINT}, #{roleId,jdbcType=INTEGER}, ",
        "#{roleName,jdbcType=VARCHAR}, #{agentId,jdbcType=VARCHAR}, ",
        "#{agentName,jdbcType=VARCHAR}, #{loginName,jdbcType=VARCHAR}, ",
        "#{agentUserName,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{encryptedPwd,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{expireTime,jdbcType=DATE}, ",
        "#{quota,jdbcType=VARCHAR}, #{loginNum,jdbcType=INTEGER}, ",
        "#{orderNum,jdbcType=INTEGER}, #{lastLoginTime,jdbcType=TIMESTAMP}, ",
        "#{totalPrice,jdbcType=DOUBLE}, #{type,jdbcType=TINYINT}, ",
        "#{status,jdbcType=TINYINT}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(ChannelAgentUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent_user`
     *
     * @mbggenerated
     */
    @InsertProvider(type=ChannelAgentUserSqlProvider.class, method="insertSelective")
    int insertSelective(ChannelAgentUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent_user`
     *
     * @mbggenerated
     */
    @SelectProvider(type=ChannelAgentUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="agent_user_id", property="agentUserId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER),
        @Result(column="role_name", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_id", property="agentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_name", property="agentName", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_name", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_user_name", property="agentUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="encrypted_pwd", property="encryptedPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="expire_time", property="expireTime", jdbcType=JdbcType.DATE),
        @Result(column="quota", property="quota", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_num", property="loginNum", jdbcType=JdbcType.INTEGER),
        @Result(column="order_num", property="orderNum", jdbcType=JdbcType.INTEGER),
        @Result(column="last_login_time", property="lastLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="total_price", property="totalPrice", jdbcType=JdbcType.DOUBLE),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ChannelAgentUser> selectByExample(ChannelAgentUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent_user`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "agent_user_id, role_id, role_name, agent_id, agent_name, login_name, agent_user_name, ",
        "password, encrypted_pwd, phone, email, expire_time, quota, login_num, order_num, ",
        "last_login_time, total_price, type, status, update_time, create_time",
        "from `channel_agent_user`",
        "where agent_user_id = #{agentUserId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="agent_user_id", property="agentUserId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER),
        @Result(column="role_name", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_id", property="agentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_name", property="agentName", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_name", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_user_name", property="agentUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="encrypted_pwd", property="encryptedPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="expire_time", property="expireTime", jdbcType=JdbcType.DATE),
        @Result(column="quota", property="quota", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_num", property="loginNum", jdbcType=JdbcType.INTEGER),
        @Result(column="order_num", property="orderNum", jdbcType=JdbcType.INTEGER),
        @Result(column="last_login_time", property="lastLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="total_price", property="totalPrice", jdbcType=JdbcType.DOUBLE),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    ChannelAgentUser selectByPrimaryKey(Long agentUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent_user`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=ChannelAgentUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ChannelAgentUser record, @Param("example") ChannelAgentUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent_user`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=ChannelAgentUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ChannelAgentUser record);
}