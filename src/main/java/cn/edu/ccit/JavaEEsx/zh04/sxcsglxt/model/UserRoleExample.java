package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.List;

public class UserRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andPkUridIsNull() {
            addCriterion("pk_urid is null");
            return (Criteria) this;
        }

        public Criteria andPkUridIsNotNull() {
            addCriterion("pk_urid is not null");
            return (Criteria) this;
        }

        public Criteria andPkUridEqualTo(Long value) {
            addCriterion("pk_urid =", value, "pkUrid");
            return (Criteria) this;
        }

        public Criteria andPkUridNotEqualTo(Long value) {
            addCriterion("pk_urid <>", value, "pkUrid");
            return (Criteria) this;
        }

        public Criteria andPkUridGreaterThan(Long value) {
            addCriterion("pk_urid >", value, "pkUrid");
            return (Criteria) this;
        }

        public Criteria andPkUridGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_urid >=", value, "pkUrid");
            return (Criteria) this;
        }

        public Criteria andPkUridLessThan(Long value) {
            addCriterion("pk_urid <", value, "pkUrid");
            return (Criteria) this;
        }

        public Criteria andPkUridLessThanOrEqualTo(Long value) {
            addCriterion("pk_urid <=", value, "pkUrid");
            return (Criteria) this;
        }

        public Criteria andPkUridIn(List<Long> values) {
            addCriterion("pk_urid in", values, "pkUrid");
            return (Criteria) this;
        }

        public Criteria andPkUridNotIn(List<Long> values) {
            addCriterion("pk_urid not in", values, "pkUrid");
            return (Criteria) this;
        }

        public Criteria andPkUridBetween(Long value1, Long value2) {
            addCriterion("pk_urid between", value1, value2, "pkUrid");
            return (Criteria) this;
        }

        public Criteria andPkUridNotBetween(Long value1, Long value2) {
            addCriterion("pk_urid not between", value1, value2, "pkUrid");
            return (Criteria) this;
        }

        public Criteria andPkUidIsNull() {
            addCriterion("pk_uid is null");
            return (Criteria) this;
        }

        public Criteria andPkUidIsNotNull() {
            addCriterion("pk_uid is not null");
            return (Criteria) this;
        }

        public Criteria andPkUidEqualTo(Long value) {
            addCriterion("pk_uid =", value, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidNotEqualTo(Long value) {
            addCriterion("pk_uid <>", value, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidGreaterThan(Long value) {
            addCriterion("pk_uid >", value, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_uid >=", value, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidLessThan(Long value) {
            addCriterion("pk_uid <", value, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidLessThanOrEqualTo(Long value) {
            addCriterion("pk_uid <=", value, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidIn(List<Long> values) {
            addCriterion("pk_uid in", values, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidNotIn(List<Long> values) {
            addCriterion("pk_uid not in", values, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidBetween(Long value1, Long value2) {
            addCriterion("pk_uid between", value1, value2, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkUidNotBetween(Long value1, Long value2) {
            addCriterion("pk_uid not between", value1, value2, "pkUid");
            return (Criteria) this;
        }

        public Criteria andPkRidIsNull() {
            addCriterion("pk_rid is null");
            return (Criteria) this;
        }

        public Criteria andPkRidIsNotNull() {
            addCriterion("pk_rid is not null");
            return (Criteria) this;
        }

        public Criteria andPkRidEqualTo(Long value) {
            addCriterion("pk_rid =", value, "pkRid");
            return (Criteria) this;
        }

        public Criteria andPkRidNotEqualTo(Long value) {
            addCriterion("pk_rid <>", value, "pkRid");
            return (Criteria) this;
        }

        public Criteria andPkRidGreaterThan(Long value) {
            addCriterion("pk_rid >", value, "pkRid");
            return (Criteria) this;
        }

        public Criteria andPkRidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_rid >=", value, "pkRid");
            return (Criteria) this;
        }

        public Criteria andPkRidLessThan(Long value) {
            addCriterion("pk_rid <", value, "pkRid");
            return (Criteria) this;
        }

        public Criteria andPkRidLessThanOrEqualTo(Long value) {
            addCriterion("pk_rid <=", value, "pkRid");
            return (Criteria) this;
        }

        public Criteria andPkRidIn(List<Long> values) {
            addCriterion("pk_rid in", values, "pkRid");
            return (Criteria) this;
        }

        public Criteria andPkRidNotIn(List<Long> values) {
            addCriterion("pk_rid not in", values, "pkRid");
            return (Criteria) this;
        }

        public Criteria andPkRidBetween(Long value1, Long value2) {
            addCriterion("pk_rid between", value1, value2, "pkRid");
            return (Criteria) this;
        }

        public Criteria andPkRidNotBetween(Long value1, Long value2) {
            addCriterion("pk_rid not between", value1, value2, "pkRid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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