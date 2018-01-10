/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables.records;


import com.oneops.crawler.jooq.cms.tables.DjDeployment;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DjDeploymentRecord extends UpdatableRecordImpl<DjDeploymentRecord> implements Record17<Long, Long, Long, String, String, Short, Integer, String, String, Timestamp, Timestamp, String, String, String, Integer, Short, String> {

    private static final long serialVersionUID = 1191030228;

    /**
     * Setter for <code>kloopzcm.dj_deployment.deployment_id</code>.
     */
    public void setDeploymentId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.deployment_id</code>.
     */
    public Long getDeploymentId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.ns_id</code>.
     */
    public void setNsId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.ns_id</code>.
     */
    public Long getNsId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.release_id</code>.
     */
    public void setReleaseId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.release_id</code>.
     */
    public Long getReleaseId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.updated_by</code>.
     */
    public void setUpdatedBy(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.release_revision</code>.
     */
    public void setReleaseRevision(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.release_revision</code>.
     */
    public Short getReleaseRevision() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.state_id</code>.
     */
    public void setStateId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.state_id</code>.
     */
    public Integer getStateId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.process_id</code>.
     */
    public void setProcessId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.process_id</code>.
     */
    public String getProcessId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.description</code>.
     */
    public void setDescription(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.description</code>.
     */
    public String getDescription() {
        return (String) get(8);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.comments</code>.
     */
    public void setComments(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.comments</code>.
     */
    public String getComments() {
        return (String) get(11);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.ops</code>.
     */
    public void setOps(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.ops</code>.
     */
    public String getOps() {
        return (String) get(12);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.auto_pause_exec_orders</code>.
     */
    public void setAutoPauseExecOrders(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.auto_pause_exec_orders</code>.
     */
    public String getAutoPauseExecOrders() {
        return (String) get(13);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.flags</code>.
     */
    public void setFlags(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.flags</code>.
     */
    public Integer getFlags() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.current_step</code>.
     */
    public void setCurrentStep(Short value) {
        set(15, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.current_step</code>.
     */
    public Short getCurrentStep() {
        return (Short) get(15);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment.exec_model</code>.
     */
    public void setExecModel(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment.exec_model</code>.
     */
    public String getExecModel() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Long, Long, Long, String, String, Short, Integer, String, String, Timestamp, Timestamp, String, String, String, Integer, Short, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Long, Long, Long, String, String, Short, Integer, String, String, Timestamp, Timestamp, String, String, String, Integer, Short, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return DjDeployment.DJ_DEPLOYMENT.DEPLOYMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return DjDeployment.DJ_DEPLOYMENT.NS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return DjDeployment.DJ_DEPLOYMENT.RELEASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DjDeployment.DJ_DEPLOYMENT.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DjDeployment.DJ_DEPLOYMENT.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return DjDeployment.DJ_DEPLOYMENT.RELEASE_REVISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return DjDeployment.DJ_DEPLOYMENT.STATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DjDeployment.DJ_DEPLOYMENT.PROCESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return DjDeployment.DJ_DEPLOYMENT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return DjDeployment.DJ_DEPLOYMENT.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return DjDeployment.DJ_DEPLOYMENT.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return DjDeployment.DJ_DEPLOYMENT.COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return DjDeployment.DJ_DEPLOYMENT.OPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return DjDeployment.DJ_DEPLOYMENT.AUTO_PAUSE_EXEC_ORDERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return DjDeployment.DJ_DEPLOYMENT.FLAGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field16() {
        return DjDeployment.DJ_DEPLOYMENT.CURRENT_STEP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return DjDeployment.DJ_DEPLOYMENT.EXEC_MODEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getDeploymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getNsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getReleaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getReleaseRevision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getProcessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getOps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getAutoPauseExecOrders();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getFlags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component16() {
        return getCurrentStep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getExecModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getDeploymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getNsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getReleaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getReleaseRevision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getProcessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getOps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getAutoPauseExecOrders();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getFlags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value16() {
        return getCurrentStep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getExecModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value1(Long value) {
        setDeploymentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value2(Long value) {
        setNsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value3(Long value) {
        setReleaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value5(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value6(Short value) {
        setReleaseRevision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value7(Integer value) {
        setStateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value8(String value) {
        setProcessId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value9(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value10(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value11(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value12(String value) {
        setComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value13(String value) {
        setOps(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value14(String value) {
        setAutoPauseExecOrders(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value15(Integer value) {
        setFlags(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value16(Short value) {
        setCurrentStep(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord value17(String value) {
        setExecModel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRecord values(Long value1, Long value2, Long value3, String value4, String value5, Short value6, Integer value7, String value8, String value9, Timestamp value10, Timestamp value11, String value12, String value13, String value14, Integer value15, Short value16, String value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DjDeploymentRecord
     */
    public DjDeploymentRecord() {
        super(DjDeployment.DJ_DEPLOYMENT);
    }

    /**
     * Create a detached, initialised DjDeploymentRecord
     */
    public DjDeploymentRecord(Long deploymentId, Long nsId, Long releaseId, String createdBy, String updatedBy, Short releaseRevision, Integer stateId, String processId, String description, Timestamp created, Timestamp updated, String comments, String ops, String autoPauseExecOrders, Integer flags, Short currentStep, String execModel) {
        super(DjDeployment.DJ_DEPLOYMENT);

        set(0, deploymentId);
        set(1, nsId);
        set(2, releaseId);
        set(3, createdBy);
        set(4, updatedBy);
        set(5, releaseRevision);
        set(6, stateId);
        set(7, processId);
        set(8, description);
        set(9, created);
        set(10, updated);
        set(11, comments);
        set(12, ops);
        set(13, autoPauseExecOrders);
        set(14, flags);
        set(15, currentStep);
        set(16, execModel);
    }
}
