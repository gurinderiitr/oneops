/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables;


import com.oneops.crawler.jooq.cms.Indexes;
import com.oneops.crawler.jooq.cms.Keys;
import com.oneops.crawler.jooq.cms.Kloopzcm;
import com.oneops.crawler.jooq.cms.tables.records.MdClassRelationsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class MdClassRelations extends TableImpl<MdClassRelationsRecord> {

    private static final long serialVersionUID = 1271298893;

    /**
     * The reference instance of <code>kloopzcm.md_class_relations</code>
     */
    public static final MdClassRelations MD_CLASS_RELATIONS = new MdClassRelations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MdClassRelationsRecord> getRecordType() {
        return MdClassRelationsRecord.class;
    }

    /**
     * The column <code>kloopzcm.md_class_relations.link_id</code>.
     */
    public final TableField<MdClassRelationsRecord, Integer> LINK_ID = createField("link_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.md_class_relations.from_class_id</code>.
     */
    public final TableField<MdClassRelationsRecord, Integer> FROM_CLASS_ID = createField("from_class_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.md_class_relations.relation_id</code>.
     */
    public final TableField<MdClassRelationsRecord, Integer> RELATION_ID = createField("relation_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.md_class_relations.to_class_id</code>.
     */
    public final TableField<MdClassRelationsRecord, Integer> TO_CLASS_ID = createField("to_class_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.md_class_relations.is_strong</code>.
     */
    public final TableField<MdClassRelationsRecord, Boolean> IS_STRONG = createField("is_strong", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.md_class_relations.link_type</code>.
     */
    public final TableField<MdClassRelationsRecord, String> LINK_TYPE = createField("link_type", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>kloopzcm.md_class_relations.description</code>.
     */
    public final TableField<MdClassRelationsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(2000).nullable(false), this, "");

    /**
     * The column <code>kloopzcm.md_class_relations.created</code>.
     */
    public final TableField<MdClassRelationsRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>kloopzcm.md_class_relations</code> table reference
     */
    public MdClassRelations() {
        this(DSL.name("md_class_relations"), null);
    }

    /**
     * Create an aliased <code>kloopzcm.md_class_relations</code> table reference
     */
    public MdClassRelations(String alias) {
        this(DSL.name(alias), MD_CLASS_RELATIONS);
    }

    /**
     * Create an aliased <code>kloopzcm.md_class_relations</code> table reference
     */
    public MdClassRelations(Name alias) {
        this(alias, MD_CLASS_RELATIONS);
    }

    private MdClassRelations(Name alias, Table<MdClassRelationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private MdClassRelations(Name alias, Table<MdClassRelationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Kloopzcm.KLOOPZCM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MD_CLASS_RELATIONS_F_IDX1, Indexes.MD_CLASS_RELATIONS_IDX, Indexes.MD_CLASS_RELATIONS_PK, Indexes.MD_CLASS_RELATIONS_R_IDX1, Indexes.MD_CLASS_RELATIONS_T_IDX1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MdClassRelationsRecord> getPrimaryKey() {
        return Keys.MD_CLASS_RELATIONS_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MdClassRelationsRecord>> getKeys() {
        return Arrays.<UniqueKey<MdClassRelationsRecord>>asList(Keys.MD_CLASS_RELATIONS_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MdClassRelationsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MdClassRelationsRecord, ?>>asList(Keys.MD_CLASS_RELATIONS__MD_CLASS_RELATIONS_FRCL_FK, Keys.MD_CLASS_RELATIONS__MD_CLASS_RELATIONS_MDRID_FK, Keys.MD_CLASS_RELATIONS__MD_CLASS_RELATIONS_TOCL_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdClassRelations as(String alias) {
        return new MdClassRelations(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdClassRelations as(Name alias) {
        return new MdClassRelations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MdClassRelations rename(String name) {
        return new MdClassRelations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MdClassRelations rename(Name name) {
        return new MdClassRelations(name, null);
    }
}
