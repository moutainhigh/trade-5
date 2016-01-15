package com.hbc.data.trade.transfer.mapping.pay.gen;

import com.hbc.data.trade.transfer.mapping.pay.gen.bean.PayQueue;
import com.hbc.data.trade.transfer.mapping.pay.gen.bean.PayQueueCriteria.Criteria;
import com.hbc.data.trade.transfer.mapping.pay.gen.bean.PayQueueCriteria.Criterion;
import com.hbc.data.trade.transfer.mapping.pay.gen.bean.PayQueueCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PayQueueSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    public String countByExample(PayQueueCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("`pay_queue`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    public String deleteByExample(PayQueueCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("`pay_queue`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    public String insertSelective(PayQueue record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("`pay_queue`");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getQueueName() != null) {
            sql.VALUES("queue_name", "#{queueName,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=CHAR}");
        }
        
        if (record.getAttempts() != null) {
            sql.VALUES("attempts", "#{attempts,jdbcType=INTEGER}");
        }
        
        if (record.getFireon() != null) {
            sql.VALUES("fireon", "#{fireon,jdbcType=BIGINT}");
        }
        
        if (record.getPayload() != null) {
            sql.VALUES("payload", "#{payload,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    public String selectByExampleWithBLOBs(PayQueueCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("queue_name");
        sql.SELECT("status");
        sql.SELECT("attempts");
        sql.SELECT("fireon");
        sql.SELECT("payload");
        sql.FROM("`pay_queue`");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
         String sqlStr = sql.toString();
        if(example.getPage()!=null){
            sqlStr = sqlStr+" limit "+example.getPage().getOffset()+","+example.getPage().getLimit()+"";
             }
            return sqlStr;
        }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    public String selectByExample(PayQueueCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("queue_name");
        sql.SELECT("status");
        sql.SELECT("attempts");
        sql.SELECT("fireon");
        sql.FROM("`pay_queue`");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
         String sqlStr = sql.toString();
        if(example.getPage()!=null){
            sqlStr = sqlStr+" limit "+example.getPage().getOffset()+","+example.getPage().getLimit()+"";
             }
            return sqlStr;
        }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        PayQueue record = (PayQueue) parameter.get("record");
        PayQueueCriteria example = (PayQueueCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("`pay_queue`");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getQueueName() != null) {
            sql.SET("queue_name = #{record.queueName,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=CHAR}");
        }
        
        if (record.getAttempts() != null) {
            sql.SET("attempts = #{record.attempts,jdbcType=INTEGER}");
        }
        
        if (record.getFireon() != null) {
            sql.SET("fireon = #{record.fireon,jdbcType=BIGINT}");
        }
        
        if (record.getPayload() != null) {
            sql.SET("payload = #{record.payload,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("`pay_queue`");
        
        sql.SET("ID = #{record.id,jdbcType=BIGINT}");
        sql.SET("queue_name = #{record.queueName,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=CHAR}");
        sql.SET("attempts = #{record.attempts,jdbcType=INTEGER}");
        sql.SET("fireon = #{record.fireon,jdbcType=BIGINT}");
        sql.SET("payload = #{record.payload,jdbcType=LONGVARCHAR}");
        
        PayQueueCriteria example = (PayQueueCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("`pay_queue`");
        
        sql.SET("ID = #{record.id,jdbcType=BIGINT}");
        sql.SET("queue_name = #{record.queueName,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=CHAR}");
        sql.SET("attempts = #{record.attempts,jdbcType=INTEGER}");
        sql.SET("fireon = #{record.fireon,jdbcType=BIGINT}");
        
        PayQueueCriteria example = (PayQueueCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(PayQueue record) {
        SQL sql = new SQL();
        sql.UPDATE("`pay_queue`");
        
        if (record.getQueueName() != null) {
            sql.SET("queue_name = #{queueName,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=CHAR}");
        }
        
        if (record.getAttempts() != null) {
            sql.SET("attempts = #{attempts,jdbcType=INTEGER}");
        }
        
        if (record.getFireon() != null) {
            sql.SET("fireon = #{fireon,jdbcType=BIGINT}");
        }
        
        if (record.getPayload() != null) {
            sql.SET("payload = #{payload,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("ID = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, PayQueueCriteria example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}