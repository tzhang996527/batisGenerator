package cn.com.sm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TTourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTourExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTouridIsNull() {
            addCriterion("TOURID is null");
            return (Criteria) this;
        }

        public Criteria andTouridIsNotNull() {
            addCriterion("TOURID is not null");
            return (Criteria) this;
        }

        public Criteria andTouridEqualTo(String value) {
            addCriterion("TOURID =", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridNotEqualTo(String value) {
            addCriterion("TOURID <>", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridGreaterThan(String value) {
            addCriterion("TOURID >", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridGreaterThanOrEqualTo(String value) {
            addCriterion("TOURID >=", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridLessThan(String value) {
            addCriterion("TOURID <", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridLessThanOrEqualTo(String value) {
            addCriterion("TOURID <=", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridLike(String value) {
            addCriterion("TOURID like", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridNotLike(String value) {
            addCriterion("TOURID not like", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridIn(List<String> values) {
            addCriterion("TOURID in", values, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridNotIn(List<String> values) {
            addCriterion("TOURID not in", values, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridBetween(String value1, String value2) {
            addCriterion("TOURID between", value1, value2, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridNotBetween(String value1, String value2) {
            addCriterion("TOURID not between", value1, value2, "tourid");
            return (Criteria) this;
        }

        public Criteria andTourTypeIsNull() {
            addCriterion("TOUR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTourTypeIsNotNull() {
            addCriterion("TOUR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTourTypeEqualTo(String value) {
            addCriterion("TOUR_TYPE =", value, "tourType");
            return (Criteria) this;
        }

        public Criteria andTourTypeNotEqualTo(String value) {
            addCriterion("TOUR_TYPE <>", value, "tourType");
            return (Criteria) this;
        }

        public Criteria andTourTypeGreaterThan(String value) {
            addCriterion("TOUR_TYPE >", value, "tourType");
            return (Criteria) this;
        }

        public Criteria andTourTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TOUR_TYPE >=", value, "tourType");
            return (Criteria) this;
        }

        public Criteria andTourTypeLessThan(String value) {
            addCriterion("TOUR_TYPE <", value, "tourType");
            return (Criteria) this;
        }

        public Criteria andTourTypeLessThanOrEqualTo(String value) {
            addCriterion("TOUR_TYPE <=", value, "tourType");
            return (Criteria) this;
        }

        public Criteria andTourTypeLike(String value) {
            addCriterion("TOUR_TYPE like", value, "tourType");
            return (Criteria) this;
        }

        public Criteria andTourTypeNotLike(String value) {
            addCriterion("TOUR_TYPE not like", value, "tourType");
            return (Criteria) this;
        }

        public Criteria andTourTypeIn(List<String> values) {
            addCriterion("TOUR_TYPE in", values, "tourType");
            return (Criteria) this;
        }

        public Criteria andTourTypeNotIn(List<String> values) {
            addCriterion("TOUR_TYPE not in", values, "tourType");
            return (Criteria) this;
        }

        public Criteria andTourTypeBetween(String value1, String value2) {
            addCriterion("TOUR_TYPE between", value1, value2, "tourType");
            return (Criteria) this;
        }

        public Criteria andTourTypeNotBetween(String value1, String value2) {
            addCriterion("TOUR_TYPE not between", value1, value2, "tourType");
            return (Criteria) this;
        }

        public Criteria andSourceLocidIsNull() {
            addCriterion("SOURCE_LOCID is null");
            return (Criteria) this;
        }

        public Criteria andSourceLocidIsNotNull() {
            addCriterion("SOURCE_LOCID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceLocidEqualTo(String value) {
            addCriterion("SOURCE_LOCID =", value, "sourceLocid");
            return (Criteria) this;
        }

        public Criteria andSourceLocidNotEqualTo(String value) {
            addCriterion("SOURCE_LOCID <>", value, "sourceLocid");
            return (Criteria) this;
        }

        public Criteria andSourceLocidGreaterThan(String value) {
            addCriterion("SOURCE_LOCID >", value, "sourceLocid");
            return (Criteria) this;
        }

        public Criteria andSourceLocidGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_LOCID >=", value, "sourceLocid");
            return (Criteria) this;
        }

        public Criteria andSourceLocidLessThan(String value) {
            addCriterion("SOURCE_LOCID <", value, "sourceLocid");
            return (Criteria) this;
        }

        public Criteria andSourceLocidLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_LOCID <=", value, "sourceLocid");
            return (Criteria) this;
        }

        public Criteria andSourceLocidLike(String value) {
            addCriterion("SOURCE_LOCID like", value, "sourceLocid");
            return (Criteria) this;
        }

        public Criteria andSourceLocidNotLike(String value) {
            addCriterion("SOURCE_LOCID not like", value, "sourceLocid");
            return (Criteria) this;
        }

        public Criteria andSourceLocidIn(List<String> values) {
            addCriterion("SOURCE_LOCID in", values, "sourceLocid");
            return (Criteria) this;
        }

        public Criteria andSourceLocidNotIn(List<String> values) {
            addCriterion("SOURCE_LOCID not in", values, "sourceLocid");
            return (Criteria) this;
        }

        public Criteria andSourceLocidBetween(String value1, String value2) {
            addCriterion("SOURCE_LOCID between", value1, value2, "sourceLocid");
            return (Criteria) this;
        }

        public Criteria andSourceLocidNotBetween(String value1, String value2) {
            addCriterion("SOURCE_LOCID not between", value1, value2, "sourceLocid");
            return (Criteria) this;
        }

        public Criteria andDestLocidIsNull() {
            addCriterion("DEST_LOCID is null");
            return (Criteria) this;
        }

        public Criteria andDestLocidIsNotNull() {
            addCriterion("DEST_LOCID is not null");
            return (Criteria) this;
        }

        public Criteria andDestLocidEqualTo(String value) {
            addCriterion("DEST_LOCID =", value, "destLocid");
            return (Criteria) this;
        }

        public Criteria andDestLocidNotEqualTo(String value) {
            addCriterion("DEST_LOCID <>", value, "destLocid");
            return (Criteria) this;
        }

        public Criteria andDestLocidGreaterThan(String value) {
            addCriterion("DEST_LOCID >", value, "destLocid");
            return (Criteria) this;
        }

        public Criteria andDestLocidGreaterThanOrEqualTo(String value) {
            addCriterion("DEST_LOCID >=", value, "destLocid");
            return (Criteria) this;
        }

        public Criteria andDestLocidLessThan(String value) {
            addCriterion("DEST_LOCID <", value, "destLocid");
            return (Criteria) this;
        }

        public Criteria andDestLocidLessThanOrEqualTo(String value) {
            addCriterion("DEST_LOCID <=", value, "destLocid");
            return (Criteria) this;
        }

        public Criteria andDestLocidLike(String value) {
            addCriterion("DEST_LOCID like", value, "destLocid");
            return (Criteria) this;
        }

        public Criteria andDestLocidNotLike(String value) {
            addCriterion("DEST_LOCID not like", value, "destLocid");
            return (Criteria) this;
        }

        public Criteria andDestLocidIn(List<String> values) {
            addCriterion("DEST_LOCID in", values, "destLocid");
            return (Criteria) this;
        }

        public Criteria andDestLocidNotIn(List<String> values) {
            addCriterion("DEST_LOCID not in", values, "destLocid");
            return (Criteria) this;
        }

        public Criteria andDestLocidBetween(String value1, String value2) {
            addCriterion("DEST_LOCID between", value1, value2, "destLocid");
            return (Criteria) this;
        }

        public Criteria andDestLocidNotBetween(String value1, String value2) {
            addCriterion("DEST_LOCID not between", value1, value2, "destLocid");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNull() {
            addCriterion("VEHICLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNotNull() {
            addCriterion("VEHICLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdEqualTo(String value) {
            addCriterion("VEHICLE_ID =", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotEqualTo(String value) {
            addCriterion("VEHICLE_ID <>", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThan(String value) {
            addCriterion("VEHICLE_ID >", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_ID >=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThan(String value) {
            addCriterion("VEHICLE_ID <", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_ID <=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLike(String value) {
            addCriterion("VEHICLE_ID like", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotLike(String value) {
            addCriterion("VEHICLE_ID not like", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIn(List<String> values) {
            addCriterion("VEHICLE_ID in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotIn(List<String> values) {
            addCriterion("VEHICLE_ID not in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdBetween(String value1, String value2) {
            addCriterion("VEHICLE_ID between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_ID not between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNull() {
            addCriterion("DRIVER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("DRIVER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(String value) {
            addCriterion("DRIVER_ID =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(String value) {
            addCriterion("DRIVER_ID <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(String value) {
            addCriterion("DRIVER_ID >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(String value) {
            addCriterion("DRIVER_ID >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(String value) {
            addCriterion("DRIVER_ID <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(String value) {
            addCriterion("DRIVER_ID <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLike(String value) {
            addCriterion("DRIVER_ID like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotLike(String value) {
            addCriterion("DRIVER_ID not like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<String> values) {
            addCriterion("DRIVER_ID in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<String> values) {
            addCriterion("DRIVER_ID not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(String value1, String value2) {
            addCriterion("DRIVER_ID between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(String value1, String value2) {
            addCriterion("DRIVER_ID not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andShipToIsNull() {
            addCriterion("SHIP_TO is null");
            return (Criteria) this;
        }

        public Criteria andShipToIsNotNull() {
            addCriterion("SHIP_TO is not null");
            return (Criteria) this;
        }

        public Criteria andShipToEqualTo(String value) {
            addCriterion("SHIP_TO =", value, "shipTo");
            return (Criteria) this;
        }

        public Criteria andShipToNotEqualTo(String value) {
            addCriterion("SHIP_TO <>", value, "shipTo");
            return (Criteria) this;
        }

        public Criteria andShipToGreaterThan(String value) {
            addCriterion("SHIP_TO >", value, "shipTo");
            return (Criteria) this;
        }

        public Criteria andShipToGreaterThanOrEqualTo(String value) {
            addCriterion("SHIP_TO >=", value, "shipTo");
            return (Criteria) this;
        }

        public Criteria andShipToLessThan(String value) {
            addCriterion("SHIP_TO <", value, "shipTo");
            return (Criteria) this;
        }

        public Criteria andShipToLessThanOrEqualTo(String value) {
            addCriterion("SHIP_TO <=", value, "shipTo");
            return (Criteria) this;
        }

        public Criteria andShipToLike(String value) {
            addCriterion("SHIP_TO like", value, "shipTo");
            return (Criteria) this;
        }

        public Criteria andShipToNotLike(String value) {
            addCriterion("SHIP_TO not like", value, "shipTo");
            return (Criteria) this;
        }

        public Criteria andShipToIn(List<String> values) {
            addCriterion("SHIP_TO in", values, "shipTo");
            return (Criteria) this;
        }

        public Criteria andShipToNotIn(List<String> values) {
            addCriterion("SHIP_TO not in", values, "shipTo");
            return (Criteria) this;
        }

        public Criteria andShipToBetween(String value1, String value2) {
            addCriterion("SHIP_TO between", value1, value2, "shipTo");
            return (Criteria) this;
        }

        public Criteria andShipToNotBetween(String value1, String value2) {
            addCriterion("SHIP_TO not between", value1, value2, "shipTo");
            return (Criteria) this;
        }

        public Criteria andPlanDepartIsNull() {
            addCriterion("PLAN_DEPART is null");
            return (Criteria) this;
        }

        public Criteria andPlanDepartIsNotNull() {
            addCriterion("PLAN_DEPART is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDepartEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_DEPART =", value, "planDepart");
            return (Criteria) this;
        }

        public Criteria andPlanDepartNotEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_DEPART <>", value, "planDepart");
            return (Criteria) this;
        }

        public Criteria andPlanDepartGreaterThan(Date value) {
            addCriterionForJDBCDate("PLAN_DEPART >", value, "planDepart");
            return (Criteria) this;
        }

        public Criteria andPlanDepartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_DEPART >=", value, "planDepart");
            return (Criteria) this;
        }

        public Criteria andPlanDepartLessThan(Date value) {
            addCriterionForJDBCDate("PLAN_DEPART <", value, "planDepart");
            return (Criteria) this;
        }

        public Criteria andPlanDepartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_DEPART <=", value, "planDepart");
            return (Criteria) this;
        }

        public Criteria andPlanDepartIn(List<Date> values) {
            addCriterionForJDBCDate("PLAN_DEPART in", values, "planDepart");
            return (Criteria) this;
        }

        public Criteria andPlanDepartNotIn(List<Date> values) {
            addCriterionForJDBCDate("PLAN_DEPART not in", values, "planDepart");
            return (Criteria) this;
        }

        public Criteria andPlanDepartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLAN_DEPART between", value1, value2, "planDepart");
            return (Criteria) this;
        }

        public Criteria andPlanDepartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLAN_DEPART not between", value1, value2, "planDepart");
            return (Criteria) this;
        }

        public Criteria andPlanArrIsNull() {
            addCriterion("PLAN_ARR is null");
            return (Criteria) this;
        }

        public Criteria andPlanArrIsNotNull() {
            addCriterion("PLAN_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andPlanArrEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_ARR =", value, "planArr");
            return (Criteria) this;
        }

        public Criteria andPlanArrNotEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_ARR <>", value, "planArr");
            return (Criteria) this;
        }

        public Criteria andPlanArrGreaterThan(Date value) {
            addCriterionForJDBCDate("PLAN_ARR >", value, "planArr");
            return (Criteria) this;
        }

        public Criteria andPlanArrGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_ARR >=", value, "planArr");
            return (Criteria) this;
        }

        public Criteria andPlanArrLessThan(Date value) {
            addCriterionForJDBCDate("PLAN_ARR <", value, "planArr");
            return (Criteria) this;
        }

        public Criteria andPlanArrLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_ARR <=", value, "planArr");
            return (Criteria) this;
        }

        public Criteria andPlanArrIn(List<Date> values) {
            addCriterionForJDBCDate("PLAN_ARR in", values, "planArr");
            return (Criteria) this;
        }

        public Criteria andPlanArrNotIn(List<Date> values) {
            addCriterionForJDBCDate("PLAN_ARR not in", values, "planArr");
            return (Criteria) this;
        }

        public Criteria andPlanArrBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLAN_ARR between", value1, value2, "planArr");
            return (Criteria) this;
        }

        public Criteria andPlanArrNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLAN_ARR not between", value1, value2, "planArr");
            return (Criteria) this;
        }

        public Criteria andActDepartIsNull() {
            addCriterion("ACT_DEPART is null");
            return (Criteria) this;
        }

        public Criteria andActDepartIsNotNull() {
            addCriterion("ACT_DEPART is not null");
            return (Criteria) this;
        }

        public Criteria andActDepartEqualTo(Date value) {
            addCriterionForJDBCDate("ACT_DEPART =", value, "actDepart");
            return (Criteria) this;
        }

        public Criteria andActDepartNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACT_DEPART <>", value, "actDepart");
            return (Criteria) this;
        }

        public Criteria andActDepartGreaterThan(Date value) {
            addCriterionForJDBCDate("ACT_DEPART >", value, "actDepart");
            return (Criteria) this;
        }

        public Criteria andActDepartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACT_DEPART >=", value, "actDepart");
            return (Criteria) this;
        }

        public Criteria andActDepartLessThan(Date value) {
            addCriterionForJDBCDate("ACT_DEPART <", value, "actDepart");
            return (Criteria) this;
        }

        public Criteria andActDepartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACT_DEPART <=", value, "actDepart");
            return (Criteria) this;
        }

        public Criteria andActDepartIn(List<Date> values) {
            addCriterionForJDBCDate("ACT_DEPART in", values, "actDepart");
            return (Criteria) this;
        }

        public Criteria andActDepartNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACT_DEPART not in", values, "actDepart");
            return (Criteria) this;
        }

        public Criteria andActDepartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACT_DEPART between", value1, value2, "actDepart");
            return (Criteria) this;
        }

        public Criteria andActDepartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACT_DEPART not between", value1, value2, "actDepart");
            return (Criteria) this;
        }

        public Criteria andActArrIsNull() {
            addCriterion("ACT_ARR is null");
            return (Criteria) this;
        }

        public Criteria andActArrIsNotNull() {
            addCriterion("ACT_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andActArrEqualTo(Date value) {
            addCriterionForJDBCDate("ACT_ARR =", value, "actArr");
            return (Criteria) this;
        }

        public Criteria andActArrNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACT_ARR <>", value, "actArr");
            return (Criteria) this;
        }

        public Criteria andActArrGreaterThan(Date value) {
            addCriterionForJDBCDate("ACT_ARR >", value, "actArr");
            return (Criteria) this;
        }

        public Criteria andActArrGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACT_ARR >=", value, "actArr");
            return (Criteria) this;
        }

        public Criteria andActArrLessThan(Date value) {
            addCriterionForJDBCDate("ACT_ARR <", value, "actArr");
            return (Criteria) this;
        }

        public Criteria andActArrLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACT_ARR <=", value, "actArr");
            return (Criteria) this;
        }

        public Criteria andActArrIn(List<Date> values) {
            addCriterionForJDBCDate("ACT_ARR in", values, "actArr");
            return (Criteria) this;
        }

        public Criteria andActArrNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACT_ARR not in", values, "actArr");
            return (Criteria) this;
        }

        public Criteria andActArrBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACT_ARR between", value1, value2, "actArr");
            return (Criteria) this;
        }

        public Criteria andActArrNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACT_ARR not between", value1, value2, "actArr");
            return (Criteria) this;
        }

        public Criteria andEtaIsNull() {
            addCriterion("ETA is null");
            return (Criteria) this;
        }

        public Criteria andEtaIsNotNull() {
            addCriterion("ETA is not null");
            return (Criteria) this;
        }

        public Criteria andEtaEqualTo(Date value) {
            addCriterionForJDBCDate("ETA =", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotEqualTo(Date value) {
            addCriterionForJDBCDate("ETA <>", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaGreaterThan(Date value) {
            addCriterionForJDBCDate("ETA >", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ETA >=", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaLessThan(Date value) {
            addCriterionForJDBCDate("ETA <", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ETA <=", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaIn(List<Date> values) {
            addCriterionForJDBCDate("ETA in", values, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotIn(List<Date> values) {
            addCriterionForJDBCDate("ETA not in", values, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ETA between", value1, value2, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ETA not between", value1, value2, "eta");
            return (Criteria) this;
        }

        public Criteria andExeStatusIsNull() {
            addCriterion("EXE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andExeStatusIsNotNull() {
            addCriterion("EXE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andExeStatusEqualTo(String value) {
            addCriterion("EXE_STATUS =", value, "exeStatus");
            return (Criteria) this;
        }

        public Criteria andExeStatusNotEqualTo(String value) {
            addCriterion("EXE_STATUS <>", value, "exeStatus");
            return (Criteria) this;
        }

        public Criteria andExeStatusGreaterThan(String value) {
            addCriterion("EXE_STATUS >", value, "exeStatus");
            return (Criteria) this;
        }

        public Criteria andExeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("EXE_STATUS >=", value, "exeStatus");
            return (Criteria) this;
        }

        public Criteria andExeStatusLessThan(String value) {
            addCriterion("EXE_STATUS <", value, "exeStatus");
            return (Criteria) this;
        }

        public Criteria andExeStatusLessThanOrEqualTo(String value) {
            addCriterion("EXE_STATUS <=", value, "exeStatus");
            return (Criteria) this;
        }

        public Criteria andExeStatusLike(String value) {
            addCriterion("EXE_STATUS like", value, "exeStatus");
            return (Criteria) this;
        }

        public Criteria andExeStatusNotLike(String value) {
            addCriterion("EXE_STATUS not like", value, "exeStatus");
            return (Criteria) this;
        }

        public Criteria andExeStatusIn(List<String> values) {
            addCriterion("EXE_STATUS in", values, "exeStatus");
            return (Criteria) this;
        }

        public Criteria andExeStatusNotIn(List<String> values) {
            addCriterion("EXE_STATUS not in", values, "exeStatus");
            return (Criteria) this;
        }

        public Criteria andExeStatusBetween(String value1, String value2) {
            addCriterion("EXE_STATUS between", value1, value2, "exeStatus");
            return (Criteria) this;
        }

        public Criteria andExeStatusNotBetween(String value1, String value2) {
            addCriterion("EXE_STATUS not between", value1, value2, "exeStatus");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCreatedOnIsNull() {
            addCriterion("CREATED_ON is null");
            return (Criteria) this;
        }

        public Criteria andCreatedOnIsNotNull() {
            addCriterion("CREATED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedOnEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_ON =", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_ON <>", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATED_ON >", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_ON >=", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnLessThan(Date value) {
            addCriterionForJDBCDate("CREATED_ON <", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_ON <=", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnIn(List<Date> values) {
            addCriterionForJDBCDate("CREATED_ON in", values, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATED_ON not in", values, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATED_ON between", value1, value2, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATED_ON not between", value1, value2, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andDelIsNull() {
            addCriterion("DEL is null");
            return (Criteria) this;
        }

        public Criteria andDelIsNotNull() {
            addCriterion("DEL is not null");
            return (Criteria) this;
        }

        public Criteria andDelEqualTo(String value) {
            addCriterion("DEL =", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotEqualTo(String value) {
            addCriterion("DEL <>", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThan(String value) {
            addCriterion("DEL >", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThanOrEqualTo(String value) {
            addCriterion("DEL >=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThan(String value) {
            addCriterion("DEL <", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThanOrEqualTo(String value) {
            addCriterion("DEL <=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLike(String value) {
            addCriterion("DEL like", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotLike(String value) {
            addCriterion("DEL not like", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelIn(List<String> values) {
            addCriterion("DEL in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotIn(List<String> values) {
            addCriterion("DEL not in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelBetween(String value1, String value2) {
            addCriterion("DEL between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotBetween(String value1, String value2) {
            addCriterion("DEL not between", value1, value2, "del");
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