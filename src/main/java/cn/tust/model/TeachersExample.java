package cn.tust.model;

import java.util.ArrayList;
import java.util.List;

public class TeachersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public TeachersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
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
     * This method corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
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

        public Criteria andTnumberIsNull() {
            addCriterion("tNumber is null");
            return (Criteria) this;
        }

        public Criteria andTnumberIsNotNull() {
            addCriterion("tNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTnumberEqualTo(Integer value) {
            addCriterion("tNumber =", value, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberNotEqualTo(Integer value) {
            addCriterion("tNumber <>", value, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberGreaterThan(Integer value) {
            addCriterion("tNumber >", value, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tNumber >=", value, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberLessThan(Integer value) {
            addCriterion("tNumber <", value, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberLessThanOrEqualTo(Integer value) {
            addCriterion("tNumber <=", value, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberIn(List<Integer> values) {
            addCriterion("tNumber in", values, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberNotIn(List<Integer> values) {
            addCriterion("tNumber not in", values, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberBetween(Integer value1, Integer value2) {
            addCriterion("tNumber between", value1, value2, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("tNumber not between", value1, value2, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("tName is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tName is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tName =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tName <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tName >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tName >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tName <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tName <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tName like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tName not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tName in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tName not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tName between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tName not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTmajorIsNull() {
            addCriterion("tMajor is null");
            return (Criteria) this;
        }

        public Criteria andTmajorIsNotNull() {
            addCriterion("tMajor is not null");
            return (Criteria) this;
        }

        public Criteria andTmajorEqualTo(String value) {
            addCriterion("tMajor =", value, "tmajor");
            return (Criteria) this;
        }

        public Criteria andTmajorNotEqualTo(String value) {
            addCriterion("tMajor <>", value, "tmajor");
            return (Criteria) this;
        }

        public Criteria andTmajorGreaterThan(String value) {
            addCriterion("tMajor >", value, "tmajor");
            return (Criteria) this;
        }

        public Criteria andTmajorGreaterThanOrEqualTo(String value) {
            addCriterion("tMajor >=", value, "tmajor");
            return (Criteria) this;
        }

        public Criteria andTmajorLessThan(String value) {
            addCriterion("tMajor <", value, "tmajor");
            return (Criteria) this;
        }

        public Criteria andTmajorLessThanOrEqualTo(String value) {
            addCriterion("tMajor <=", value, "tmajor");
            return (Criteria) this;
        }

        public Criteria andTmajorLike(String value) {
            addCriterion("tMajor like", value, "tmajor");
            return (Criteria) this;
        }

        public Criteria andTmajorNotLike(String value) {
            addCriterion("tMajor not like", value, "tmajor");
            return (Criteria) this;
        }

        public Criteria andTmajorIn(List<String> values) {
            addCriterion("tMajor in", values, "tmajor");
            return (Criteria) this;
        }

        public Criteria andTmajorNotIn(List<String> values) {
            addCriterion("tMajor not in", values, "tmajor");
            return (Criteria) this;
        }

        public Criteria andTmajorBetween(String value1, String value2) {
            addCriterion("tMajor between", value1, value2, "tmajor");
            return (Criteria) this;
        }

        public Criteria andTmajorNotBetween(String value1, String value2) {
            addCriterion("tMajor not between", value1, value2, "tmajor");
            return (Criteria) this;
        }

        public Criteria andTcontactIsNull() {
            addCriterion("tContact is null");
            return (Criteria) this;
        }

        public Criteria andTcontactIsNotNull() {
            addCriterion("tContact is not null");
            return (Criteria) this;
        }

        public Criteria andTcontactEqualTo(String value) {
            addCriterion("tContact =", value, "tcontact");
            return (Criteria) this;
        }

        public Criteria andTcontactNotEqualTo(String value) {
            addCriterion("tContact <>", value, "tcontact");
            return (Criteria) this;
        }

        public Criteria andTcontactGreaterThan(String value) {
            addCriterion("tContact >", value, "tcontact");
            return (Criteria) this;
        }

        public Criteria andTcontactGreaterThanOrEqualTo(String value) {
            addCriterion("tContact >=", value, "tcontact");
            return (Criteria) this;
        }

        public Criteria andTcontactLessThan(String value) {
            addCriterion("tContact <", value, "tcontact");
            return (Criteria) this;
        }

        public Criteria andTcontactLessThanOrEqualTo(String value) {
            addCriterion("tContact <=", value, "tcontact");
            return (Criteria) this;
        }

        public Criteria andTcontactLike(String value) {
            addCriterion("tContact like", value, "tcontact");
            return (Criteria) this;
        }

        public Criteria andTcontactNotLike(String value) {
            addCriterion("tContact not like", value, "tcontact");
            return (Criteria) this;
        }

        public Criteria andTcontactIn(List<String> values) {
            addCriterion("tContact in", values, "tcontact");
            return (Criteria) this;
        }

        public Criteria andTcontactNotIn(List<String> values) {
            addCriterion("tContact not in", values, "tcontact");
            return (Criteria) this;
        }

        public Criteria andTcontactBetween(String value1, String value2) {
            addCriterion("tContact between", value1, value2, "tcontact");
            return (Criteria) this;
        }

        public Criteria andTcontactNotBetween(String value1, String value2) {
            addCriterion("tContact not between", value1, value2, "tcontact");
            return (Criteria) this;
        }

        public Criteria andTclassIsNull() {
            addCriterion("tClass is null");
            return (Criteria) this;
        }

        public Criteria andTclassIsNotNull() {
            addCriterion("tClass is not null");
            return (Criteria) this;
        }

        public Criteria andTclassEqualTo(String value) {
            addCriterion("tClass =", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassNotEqualTo(String value) {
            addCriterion("tClass <>", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassGreaterThan(String value) {
            addCriterion("tClass >", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassGreaterThanOrEqualTo(String value) {
            addCriterion("tClass >=", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassLessThan(String value) {
            addCriterion("tClass <", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassLessThanOrEqualTo(String value) {
            addCriterion("tClass <=", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassLike(String value) {
            addCriterion("tClass like", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassNotLike(String value) {
            addCriterion("tClass not like", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassIn(List<String> values) {
            addCriterion("tClass in", values, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassNotIn(List<String> values) {
            addCriterion("tClass not in", values, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassBetween(String value1, String value2) {
            addCriterion("tClass between", value1, value2, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassNotBetween(String value1, String value2) {
            addCriterion("tClass not between", value1, value2, "tclass");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table teachers
     *
     * @mbg.generated do_not_delete_during_merge Sun May 19 21:25:25 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table teachers
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
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
    }
}