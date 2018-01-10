/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables.records;


import com.oneops.crawler.jooq.cms.tables.DjReleases;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class DjReleasesRecord extends UpdatableRecordImpl<DjReleasesRecord> implements Record12<Long, Long, Long, String, String, String, Integer, String, String, Short, Timestamp, Timestamp> {

    private static final long serialVersionUID = -554663508;

    /**
     * Setter for <code>kloopzcm.dj_releases.release_id</code>.
     */
    public void setReleaseId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_releases.release_id</code>.
     */
    public Long getReleaseId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>kloopzcm.dj_releases.ns_id</code>.
     */
    public void setNsId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_releases.ns_id</code>.
     */
    public Long getNsId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>kloopzcm.dj_releases.parent_release_id</code>.
     */
    public void setParentReleaseId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_releases.parent_release_id</code>.
     */
    public Long getParentReleaseId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>kloopzcm.dj_releases.release_name</code>.
     */
    public void setReleaseName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_releases.release_name</code>.
     */
    public String getReleaseName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>kloopzcm.dj_releases.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_releases.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>kloopzcm.dj_releases.commited_by</code>.
     */
    public void setCommitedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_releases.commited_by</code>.
     */
    public String getCommitedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>kloopzcm.dj_releases.release_state_id</code>.
     */
    public void setReleaseStateId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_releases.release_state_id</code>.
     */
    public Integer getReleaseStateId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>kloopzcm.dj_releases.release_type</code>.
     */
    public void setReleaseType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_releases.release_type</code>.
     */
    public String getReleaseType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>kloopzcm.dj_releases.description</code>.
     */
    public void setDescription(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_releases.description</code>.
     */
    public String getDescription() {
        return (String) get(8);
    }

    /**
     * Setter for <code>kloopzcm.dj_releases.revision</code>.
     */
    public void setRevision(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_releases.revision</code>.
     */
    public Short getRevision() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>kloopzcm.dj_releases.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_releases.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>kloopzcm.dj_releases.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_releases.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, Long, String, String, String, Integer, String, String, Short, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, Long, String, String, String, Integer, String, String, Short, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return DjReleases.DJ_RELEASES.RELEASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return DjReleases.DJ_RELEASES.NS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return DjReleases.DJ_RELEASES.PARENT_RELEASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DjReleases.DJ_RELEASES.RELEASE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DjReleases.DJ_RELEASES.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DjReleases.DJ_RELEASES.COMMITED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return DjReleases.DJ_RELEASES.RELEASE_STATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DjReleases.DJ_RELEASES.RELEASE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return DjReleases.DJ_RELEASES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return DjReleases.DJ_RELEASES.REVISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return DjReleases.DJ_RELEASES.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return DjReleases.DJ_RELEASES.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getReleaseId();
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
        return getParentReleaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getReleaseName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCommitedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getReleaseStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getReleaseType();
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
    public Short component10() {
        return getRevision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getReleaseId();
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
        return getParentReleaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getReleaseName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCommitedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getReleaseStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getReleaseType();
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
    public Short value10() {
        return getRevision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleasesRecord value1(Long value) {
        setReleaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleasesRecord value2(Long value) {
        setNsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleasesRecord value3(Long value) {
        setParentReleaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleasesRecord value4(String value) {
        setReleaseName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleasesRecord value5(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleasesRecord value6(String value) {
        setCommitedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleasesRecord value7(Integer value) {
        setReleaseStateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleasesRecord value8(String value) {
        setReleaseType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleasesRecord value9(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleasesRecord value10(Short value) {
        setRevision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleasesRecord value11(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleasesRecord value12(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleasesRecord values(Long value1, Long value2, Long value3, String value4, String value5, String value6, Integer value7, String value8, String value9, Short value10, Timestamp value11, Timestamp value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DjReleasesRecord
     */
    public DjReleasesRecord() {
        super(DjReleases.DJ_RELEASES);
    }

    /**
     * Create a detached, initialised DjReleasesRecord
     */
    public DjReleasesRecord(Long releaseId, Long nsId, Long parentReleaseId, String releaseName, String createdBy, String commitedBy, Integer releaseStateId, String releaseType, String description, Short revision, Timestamp created, Timestamp updated) {
        super(DjReleases.DJ_RELEASES);

        set(0, releaseId);
        set(1, nsId);
        set(2, parentReleaseId);
        set(3, releaseName);
        set(4, createdBy);
        set(5, commitedBy);
        set(6, releaseStateId);
        set(7, releaseType);
        set(8, description);
        set(9, revision);
        set(10, created);
        set(11, updated);
    }
}
