package cn.tust.model;

import java.util.ArrayList;
import java.util.List;

public class CoursesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public CoursesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
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
     * This method corresponds to the database table courses
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
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
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
     * This class corresponds to the database table courses
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

        public Criteria andCnumberIsNull() {
            addCriterion("cNumber is null");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNotNull() {
            addCriterion("cNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCnumberEqualTo(Integer value) {
            addCriterion("cNumber =", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotEqualTo(Integer value) {
            addCriterion("cNumber <>", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThan(Integer value) {
            addCriterion("cNumber >", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("cNumber >=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThan(Integer value) {
            addCriterion("cNumber <", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThanOrEqualTo(Integer value) {
            addCriterion("cNumber <=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberIn(List<Integer> values) {
            addCriterion("cNumber in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotIn(List<Integer> values) {
            addCriterion("cNumber not in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberBetween(Integer value1, Integer value2) {
            addCriterion("cNumber between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("cNumber not between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cName is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cName is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cName =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cName <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cName >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cName >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cName <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cName <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cName like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cName not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cName in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cName not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cName between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cName not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCteacherIsNull() {
            addCriterion("cTeacher is null");
            return (Criteria) this;
        }

        public Criteria andCteacherIsNotNull() {
            addCriterion("cTeacher is not null");
            return (Criteria) this;
        }

        public Criteria andCteacherEqualTo(String value) {
            addCriterion("cTeacher =", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherNotEqualTo(String value) {
            addCriterion("cTeacher <>", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherGreaterThan(String value) {
            addCriterion("cTeacher >", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherGreaterThanOrEqualTo(String value) {
            addCriterion("cTeacher >=", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherLessThan(String value) {
            addCriterion("cTeacher <", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherLessThanOrEqualTo(String value) {
            addCriterion("cTeacher <=", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherLike(String value) {
            addCriterion("cTeacher like", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherNotLike(String value) {
            addCriterion("cTeacher not like", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherIn(List<String> values) {
            addCriterion("cTeacher in", values, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherNotIn(List<String> values) {
            addCriterion("cTeacher not in", values, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherBetween(String value1, String value2) {
            addCriterion("cTeacher between", value1, value2, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherNotBetween(String value1, String value2) {
            addCriterion("cTeacher not between", value1, value2, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCweekIsNull() {
            addCriterion("cWeek is null");
            return (Criteria) this;
        }

        public Criteria andCweekIsNotNull() {
            addCriterion("cWeek is not null");
            return (Criteria) this;
        }

        public Criteria andCweekEqualTo(String value) {
            addCriterion("cWeek =", value, "cweek");
            return (Criteria) this;
        }

        public Criteria andCweekNotEqualTo(String value) {
            addCriterion("cWeek <>", value, "cweek");
            return (Criteria) this;
        }

        public Criteria andCweekGreaterThan(String value) {
            addCriterion("cWeek >", value, "cweek");
            return (Criteria) this;
        }

        public Criteria andCweekGreaterThanOrEqualTo(String value) {
            addCriterion("cWeek >=", value, "cweek");
            return (Criteria) this;
        }

        public Criteria andCweekLessThan(String value) {
            addCriterion("cWeek <", value, "cweek");
            return (Criteria) this;
        }

        public Criteria andCweekLessThanOrEqualTo(String value) {
            addCriterion("cWeek <=", value, "cweek");
            return (Criteria) this;
        }

        public Criteria andCweekLike(String value) {
            addCriterion("cWeek like", value, "cweek");
            return (Criteria) this;
        }

        public Criteria andCweekNotLike(String value) {
            addCriterion("cWeek not like", value, "cweek");
            return (Criteria) this;
        }

        public Criteria andCweekIn(List<String> values) {
            addCriterion("cWeek in", values, "cweek");
            return (Criteria) this;
        }

        public Criteria andCweekNotIn(List<String> values) {
            addCriterion("cWeek not in", values, "cweek");
            return (Criteria) this;
        }

        public Criteria andCweekBetween(String value1, String value2) {
            addCriterion("cWeek between", value1, value2, "cweek");
            return (Criteria) this;
        }

        public Criteria andCweekNotBetween(String value1, String value2) {
            addCriterion("cWeek not between", value1, value2, "cweek");
            return (Criteria) this;
        }

        public Criteria andCpartIsNull() {
            addCriterion("cPart is null");
            return (Criteria) this;
        }

        public Criteria andCpartIsNotNull() {
            addCriterion("cPart is not null");
            return (Criteria) this;
        }

        public Criteria andCpartEqualTo(String value) {
            addCriterion("cPart =", value, "cpart");
            return (Criteria) this;
        }

        public Criteria andCpartNotEqualTo(String value) {
            addCriterion("cPart <>", value, "cpart");
            return (Criteria) this;
        }

        public Criteria andCpartGreaterThan(String value) {
            addCriterion("cPart >", value, "cpart");
            return (Criteria) this;
        }

        public Criteria andCpartGreaterThanOrEqualTo(String value) {
            addCriterion("cPart >=", value, "cpart");
            return (Criteria) this;
        }

        public Criteria andCpartLessThan(String value) {
            addCriterion("cPart <", value, "cpart");
            return (Criteria) this;
        }

        public Criteria andCpartLessThanOrEqualTo(String value) {
            addCriterion("cPart <=", value, "cpart");
            return (Criteria) this;
        }

        public Criteria andCpartLike(String value) {
            addCriterion("cPart like", value, "cpart");
            return (Criteria) this;
        }

        public Criteria andCpartNotLike(String value) {
            addCriterion("cPart not like", value, "cpart");
            return (Criteria) this;
        }

        public Criteria andCpartIn(List<String> values) {
            addCriterion("cPart in", values, "cpart");
            return (Criteria) this;
        }

        public Criteria andCpartNotIn(List<String> values) {
            addCriterion("cPart not in", values, "cpart");
            return (Criteria) this;
        }

        public Criteria andCpartBetween(String value1, String value2) {
            addCriterion("cPart between", value1, value2, "cpart");
            return (Criteria) this;
        }

        public Criteria andCpartNotBetween(String value1, String value2) {
            addCriterion("cPart not between", value1, value2, "cpart");
            return (Criteria) this;
        }

        public Criteria andCclassroomIsNull() {
            addCriterion("cClassroom is null");
            return (Criteria) this;
        }

        public Criteria andCclassroomIsNotNull() {
            addCriterion("cClassroom is not null");
            return (Criteria) this;
        }

        public Criteria andCclassroomEqualTo(Integer value) {
            addCriterion("cClassroom =", value, "cclassroom");
            return (Criteria) this;
        }

        public Criteria andCclassroomNotEqualTo(Integer value) {
            addCriterion("cClassroom <>", value, "cclassroom");
            return (Criteria) this;
        }

        public Criteria andCclassroomGreaterThan(Integer value) {
            addCriterion("cClassroom >", value, "cclassroom");
            return (Criteria) this;
        }

        public Criteria andCclassroomGreaterThanOrEqualTo(Integer value) {
            addCriterion("cClassroom >=", value, "cclassroom");
            return (Criteria) this;
        }

        public Criteria andCclassroomLessThan(Integer value) {
            addCriterion("cClassroom <", value, "cclassroom");
            return (Criteria) this;
        }

        public Criteria andCclassroomLessThanOrEqualTo(Integer value) {
            addCriterion("cClassroom <=", value, "cclassroom");
            return (Criteria) this;
        }

        public Criteria andCclassroomIn(List<Integer> values) {
            addCriterion("cClassroom in", values, "cclassroom");
            return (Criteria) this;
        }

        public Criteria andCclassroomNotIn(List<Integer> values) {
            addCriterion("cClassroom not in", values, "cclassroom");
            return (Criteria) this;
        }

        public Criteria andCclassroomBetween(Integer value1, Integer value2) {
            addCriterion("cClassroom between", value1, value2, "cclassroom");
            return (Criteria) this;
        }

        public Criteria andCclassroomNotBetween(Integer value1, Integer value2) {
            addCriterion("cClassroom not between", value1, value2, "cclassroom");
            return (Criteria) this;
        }

        public Criteria andCcountIsNull() {
            addCriterion("cCount is null");
            return (Criteria) this;
        }

        public Criteria andCcountIsNotNull() {
            addCriterion("cCount is not null");
            return (Criteria) this;
        }

        public Criteria andCcountEqualTo(Integer value) {
            addCriterion("cCount =", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountNotEqualTo(Integer value) {
            addCriterion("cCount <>", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountGreaterThan(Integer value) {
            addCriterion("cCount >", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("cCount >=", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountLessThan(Integer value) {
            addCriterion("cCount <", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountLessThanOrEqualTo(Integer value) {
            addCriterion("cCount <=", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountIn(List<Integer> values) {
            addCriterion("cCount in", values, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountNotIn(List<Integer> values) {
            addCriterion("cCount not in", values, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountBetween(Integer value1, Integer value2) {
            addCriterion("cCount between", value1, value2, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountNotBetween(Integer value1, Integer value2) {
            addCriterion("cCount not between", value1, value2, "ccount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table courses
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
     * This class corresponds to the database table courses
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