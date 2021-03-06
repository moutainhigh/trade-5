package com.hbc.api.trade.order.mapping.gen.bean;

import com.hbc.api.trade.bdata.common.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradePriceHistoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    public TradePriceHistoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPkidIsNull() {
            addCriterion("pkid is null");
            return (Criteria) this;
        }

        public Criteria andPkidIsNotNull() {
            addCriterion("pkid is not null");
            return (Criteria) this;
        }

        public Criteria andPkidEqualTo(Integer value) {
            addCriterion("pkid =", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotEqualTo(Integer value) {
            addCriterion("pkid <>", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidGreaterThan(Integer value) {
            addCriterion("pkid >", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pkid >=", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidLessThan(Integer value) {
            addCriterion("pkid <", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidLessThanOrEqualTo(Integer value) {
            addCriterion("pkid <=", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidIn(List<Integer> values) {
            addCriterion("pkid in", values, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotIn(List<Integer> values) {
            addCriterion("pkid not in", values, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidBetween(Integer value1, Integer value2) {
            addCriterion("pkid between", value1, value2, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotBetween(Integer value1, Integer value2) {
            addCriterion("pkid not between", value1, value2, "pkid");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andPriceSeqIsNull() {
            addCriterion("price_seq is null");
            return (Criteria) this;
        }

        public Criteria andPriceSeqIsNotNull() {
            addCriterion("price_seq is not null");
            return (Criteria) this;
        }

        public Criteria andPriceSeqEqualTo(Integer value) {
            addCriterion("price_seq =", value, "priceSeq");
            return (Criteria) this;
        }

        public Criteria andPriceSeqNotEqualTo(Integer value) {
            addCriterion("price_seq <>", value, "priceSeq");
            return (Criteria) this;
        }

        public Criteria andPriceSeqGreaterThan(Integer value) {
            addCriterion("price_seq >", value, "priceSeq");
            return (Criteria) this;
        }

        public Criteria andPriceSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_seq >=", value, "priceSeq");
            return (Criteria) this;
        }

        public Criteria andPriceSeqLessThan(Integer value) {
            addCriterion("price_seq <", value, "priceSeq");
            return (Criteria) this;
        }

        public Criteria andPriceSeqLessThanOrEqualTo(Integer value) {
            addCriterion("price_seq <=", value, "priceSeq");
            return (Criteria) this;
        }

        public Criteria andPriceSeqIn(List<Integer> values) {
            addCriterion("price_seq in", values, "priceSeq");
            return (Criteria) this;
        }

        public Criteria andPriceSeqNotIn(List<Integer> values) {
            addCriterion("price_seq not in", values, "priceSeq");
            return (Criteria) this;
        }

        public Criteria andPriceSeqBetween(Integer value1, Integer value2) {
            addCriterion("price_seq between", value1, value2, "priceSeq");
            return (Criteria) this;
        }

        public Criteria andPriceSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("price_seq not between", value1, value2, "priceSeq");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNull() {
            addCriterion("price_type is null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNotNull() {
            addCriterion("price_type is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeEqualTo(Integer value) {
            addCriterion("price_type =", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotEqualTo(Integer value) {
            addCriterion("price_type <>", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThan(Integer value) {
            addCriterion("price_type >", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_type >=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThan(Integer value) {
            addCriterion("price_type <", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("price_type <=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIn(List<Integer> values) {
            addCriterion("price_type in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotIn(List<Integer> values) {
            addCriterion("price_type not in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeBetween(Integer value1, Integer value2) {
            addCriterion("price_type between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("price_type not between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andSourcePriceIsNull() {
            addCriterion("source_price is null");
            return (Criteria) this;
        }

        public Criteria andSourcePriceIsNotNull() {
            addCriterion("source_price is not null");
            return (Criteria) this;
        }

        public Criteria andSourcePriceEqualTo(Double value) {
            addCriterion("source_price =", value, "sourcePrice");
            return (Criteria) this;
        }

        public Criteria andSourcePriceNotEqualTo(Double value) {
            addCriterion("source_price <>", value, "sourcePrice");
            return (Criteria) this;
        }

        public Criteria andSourcePriceGreaterThan(Double value) {
            addCriterion("source_price >", value, "sourcePrice");
            return (Criteria) this;
        }

        public Criteria andSourcePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("source_price >=", value, "sourcePrice");
            return (Criteria) this;
        }

        public Criteria andSourcePriceLessThan(Double value) {
            addCriterion("source_price <", value, "sourcePrice");
            return (Criteria) this;
        }

        public Criteria andSourcePriceLessThanOrEqualTo(Double value) {
            addCriterion("source_price <=", value, "sourcePrice");
            return (Criteria) this;
        }

        public Criteria andSourcePriceIn(List<Double> values) {
            addCriterion("source_price in", values, "sourcePrice");
            return (Criteria) this;
        }

        public Criteria andSourcePriceNotIn(List<Double> values) {
            addCriterion("source_price not in", values, "sourcePrice");
            return (Criteria) this;
        }

        public Criteria andSourcePriceBetween(Double value1, Double value2) {
            addCriterion("source_price between", value1, value2, "sourcePrice");
            return (Criteria) this;
        }

        public Criteria andSourcePriceNotBetween(Double value1, Double value2) {
            addCriterion("source_price not between", value1, value2, "sourcePrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceIsNull() {
            addCriterion("target_price is null");
            return (Criteria) this;
        }

        public Criteria andTargetPriceIsNotNull() {
            addCriterion("target_price is not null");
            return (Criteria) this;
        }

        public Criteria andTargetPriceEqualTo(Double value) {
            addCriterion("target_price =", value, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceNotEqualTo(Double value) {
            addCriterion("target_price <>", value, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceGreaterThan(Double value) {
            addCriterion("target_price >", value, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("target_price >=", value, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceLessThan(Double value) {
            addCriterion("target_price <", value, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceLessThanOrEqualTo(Double value) {
            addCriterion("target_price <=", value, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceIn(List<Double> values) {
            addCriterion("target_price in", values, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceNotIn(List<Double> values) {
            addCriterion("target_price not in", values, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceBetween(Double value1, Double value2) {
            addCriterion("target_price between", value1, value2, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceNotBetween(Double value1, Double value2) {
            addCriterion("target_price not between", value1, value2, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNull() {
            addCriterion("op_type is null");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNotNull() {
            addCriterion("op_type is not null");
            return (Criteria) this;
        }

        public Criteria andOpTypeEqualTo(Integer value) {
            addCriterion("op_type =", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotEqualTo(Integer value) {
            addCriterion("op_type <>", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThan(Integer value) {
            addCriterion("op_type >", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_type >=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThan(Integer value) {
            addCriterion("op_type <", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThanOrEqualTo(Integer value) {
            addCriterion("op_type <=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeIn(List<Integer> values) {
            addCriterion("op_type in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotIn(List<Integer> values) {
            addCriterion("op_type not in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeBetween(Integer value1, Integer value2) {
            addCriterion("op_type between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("op_type not between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpUidIsNull() {
            addCriterion("op_uid is null");
            return (Criteria) this;
        }

        public Criteria andOpUidIsNotNull() {
            addCriterion("op_uid is not null");
            return (Criteria) this;
        }

        public Criteria andOpUidEqualTo(String value) {
            addCriterion("op_uid =", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidNotEqualTo(String value) {
            addCriterion("op_uid <>", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidGreaterThan(String value) {
            addCriterion("op_uid >", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidGreaterThanOrEqualTo(String value) {
            addCriterion("op_uid >=", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidLessThan(String value) {
            addCriterion("op_uid <", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidLessThanOrEqualTo(String value) {
            addCriterion("op_uid <=", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidLike(String value) {
            addCriterion("op_uid like", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidNotLike(String value) {
            addCriterion("op_uid not like", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidIn(List<String> values) {
            addCriterion("op_uid in", values, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidNotIn(List<String> values) {
            addCriterion("op_uid not in", values, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidBetween(String value1, String value2) {
            addCriterion("op_uid between", value1, value2, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidNotBetween(String value1, String value2) {
            addCriterion("op_uid not between", value1, value2, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUnameIsNull() {
            addCriterion("op_uname is null");
            return (Criteria) this;
        }

        public Criteria andOpUnameIsNotNull() {
            addCriterion("op_uname is not null");
            return (Criteria) this;
        }

        public Criteria andOpUnameEqualTo(String value) {
            addCriterion("op_uname =", value, "opUname");
            return (Criteria) this;
        }

        public Criteria andOpUnameNotEqualTo(String value) {
            addCriterion("op_uname <>", value, "opUname");
            return (Criteria) this;
        }

        public Criteria andOpUnameGreaterThan(String value) {
            addCriterion("op_uname >", value, "opUname");
            return (Criteria) this;
        }

        public Criteria andOpUnameGreaterThanOrEqualTo(String value) {
            addCriterion("op_uname >=", value, "opUname");
            return (Criteria) this;
        }

        public Criteria andOpUnameLessThan(String value) {
            addCriterion("op_uname <", value, "opUname");
            return (Criteria) this;
        }

        public Criteria andOpUnameLessThanOrEqualTo(String value) {
            addCriterion("op_uname <=", value, "opUname");
            return (Criteria) this;
        }

        public Criteria andOpUnameLike(String value) {
            addCriterion("op_uname like", value, "opUname");
            return (Criteria) this;
        }

        public Criteria andOpUnameNotLike(String value) {
            addCriterion("op_uname not like", value, "opUname");
            return (Criteria) this;
        }

        public Criteria andOpUnameIn(List<String> values) {
            addCriterion("op_uname in", values, "opUname");
            return (Criteria) this;
        }

        public Criteria andOpUnameNotIn(List<String> values) {
            addCriterion("op_uname not in", values, "opUname");
            return (Criteria) this;
        }

        public Criteria andOpUnameBetween(String value1, String value2) {
            addCriterion("op_uname between", value1, value2, "opUname");
            return (Criteria) this;
        }

        public Criteria andOpUnameNotBetween(String value1, String value2) {
            addCriterion("op_uname not between", value1, value2, "opUname");
            return (Criteria) this;
        }

        public Criteria andOpCommentIsNull() {
            addCriterion("op_comment is null");
            return (Criteria) this;
        }

        public Criteria andOpCommentIsNotNull() {
            addCriterion("op_comment is not null");
            return (Criteria) this;
        }

        public Criteria andOpCommentEqualTo(String value) {
            addCriterion("op_comment =", value, "opComment");
            return (Criteria) this;
        }

        public Criteria andOpCommentNotEqualTo(String value) {
            addCriterion("op_comment <>", value, "opComment");
            return (Criteria) this;
        }

        public Criteria andOpCommentGreaterThan(String value) {
            addCriterion("op_comment >", value, "opComment");
            return (Criteria) this;
        }

        public Criteria andOpCommentGreaterThanOrEqualTo(String value) {
            addCriterion("op_comment >=", value, "opComment");
            return (Criteria) this;
        }

        public Criteria andOpCommentLessThan(String value) {
            addCriterion("op_comment <", value, "opComment");
            return (Criteria) this;
        }

        public Criteria andOpCommentLessThanOrEqualTo(String value) {
            addCriterion("op_comment <=", value, "opComment");
            return (Criteria) this;
        }

        public Criteria andOpCommentLike(String value) {
            addCriterion("op_comment like", value, "opComment");
            return (Criteria) this;
        }

        public Criteria andOpCommentNotLike(String value) {
            addCriterion("op_comment not like", value, "opComment");
            return (Criteria) this;
        }

        public Criteria andOpCommentIn(List<String> values) {
            addCriterion("op_comment in", values, "opComment");
            return (Criteria) this;
        }

        public Criteria andOpCommentNotIn(List<String> values) {
            addCriterion("op_comment not in", values, "opComment");
            return (Criteria) this;
        }

        public Criteria andOpCommentBetween(String value1, String value2) {
            addCriterion("op_comment between", value1, value2, "opComment");
            return (Criteria) this;
        }

        public Criteria andOpCommentNotBetween(String value1, String value2) {
            addCriterion("op_comment not between", value1, value2, "opComment");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table `trade_price_history`
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table `trade_price_history`
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}