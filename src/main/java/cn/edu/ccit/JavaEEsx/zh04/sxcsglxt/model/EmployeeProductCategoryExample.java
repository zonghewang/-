package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeProductCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeProductCategoryExample() {
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

        public Criteria andPkEpcidIsNull() {
            addCriterion("pk_epcid is null");
            return (Criteria) this;
        }

        public Criteria andPkEpcidIsNotNull() {
            addCriterion("pk_epcid is not null");
            return (Criteria) this;
        }

        public Criteria andPkEpcidEqualTo(Long value) {
            addCriterion("pk_epcid =", value, "pkEpcid");
            return (Criteria) this;
        }

        public Criteria andPkEpcidNotEqualTo(Long value) {
            addCriterion("pk_epcid <>", value, "pkEpcid");
            return (Criteria) this;
        }

        public Criteria andPkEpcidGreaterThan(Long value) {
            addCriterion("pk_epcid >", value, "pkEpcid");
            return (Criteria) this;
        }

        public Criteria andPkEpcidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_epcid >=", value, "pkEpcid");
            return (Criteria) this;
        }

        public Criteria andPkEpcidLessThan(Long value) {
            addCriterion("pk_epcid <", value, "pkEpcid");
            return (Criteria) this;
        }

        public Criteria andPkEpcidLessThanOrEqualTo(Long value) {
            addCriterion("pk_epcid <=", value, "pkEpcid");
            return (Criteria) this;
        }

        public Criteria andPkEpcidIn(List<Long> values) {
            addCriterion("pk_epcid in", values, "pkEpcid");
            return (Criteria) this;
        }

        public Criteria andPkEpcidNotIn(List<Long> values) {
            addCriterion("pk_epcid not in", values, "pkEpcid");
            return (Criteria) this;
        }

        public Criteria andPkEpcidBetween(Long value1, Long value2) {
            addCriterion("pk_epcid between", value1, value2, "pkEpcid");
            return (Criteria) this;
        }

        public Criteria andPkEpcidNotBetween(Long value1, Long value2) {
            addCriterion("pk_epcid not between", value1, value2, "pkEpcid");
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

        public Criteria andPkPcidIsNull() {
            addCriterion("pk_pcid is null");
            return (Criteria) this;
        }

        public Criteria andPkPcidIsNotNull() {
            addCriterion("pk_pcid is not null");
            return (Criteria) this;
        }

        public Criteria andPkPcidEqualTo(Long value) {
            addCriterion("pk_pcid =", value, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidNotEqualTo(Long value) {
            addCriterion("pk_pcid <>", value, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidGreaterThan(Long value) {
            addCriterion("pk_pcid >", value, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_pcid >=", value, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidLessThan(Long value) {
            addCriterion("pk_pcid <", value, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidLessThanOrEqualTo(Long value) {
            addCriterion("pk_pcid <=", value, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidIn(List<Long> values) {
            addCriterion("pk_pcid in", values, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidNotIn(List<Long> values) {
            addCriterion("pk_pcid not in", values, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidBetween(Long value1, Long value2) {
            addCriterion("pk_pcid between", value1, value2, "pkPcid");
            return (Criteria) this;
        }

        public Criteria andPkPcidNotBetween(Long value1, Long value2) {
            addCriterion("pk_pcid not between", value1, value2, "pkPcid");
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