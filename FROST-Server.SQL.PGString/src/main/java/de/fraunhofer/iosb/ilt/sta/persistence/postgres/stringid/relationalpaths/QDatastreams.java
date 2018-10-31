package de.fraunhofer.iosb.ilt.sta.persistence.postgres.stringid.relationalpaths;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import static com.querydsl.core.types.PathMetadataFactory.*;
import com.querydsl.core.types.dsl.*;
import com.querydsl.sql.ColumnMetadata;
import de.fraunhofer.iosb.ilt.sta.persistence.postgres.relationalpaths.AbstractQDatastreams;
import java.sql.Types;

/**
 * QDatastreams is a Querydsl query type for QDatastreams
 */
public class QDatastreams extends AbstractQDatastreams<QDatastreams, StringPath, String> {

    private static final long serialVersionUID = -546602411;

    public static final QDatastreams datastreams = new QDatastreams("DATASTREAMS");

    public final StringPath id = createString("id");

    public final StringPath obsPropertyId = createString("obsPropertyId");

    public final StringPath sensorId = createString("sensorId");

    public final StringPath thingId = createString("thingId");

    public final com.querydsl.sql.PrimaryKey<QDatastreams> datastreamsPkey = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QObsProperties> datastreamsObsPropertyIdFkey = createForeignKey(obsPropertyId, "ID");

    public final com.querydsl.sql.ForeignKey<QThings> datastreamsThingIdFkey = createForeignKey(thingId, "ID");

    public final com.querydsl.sql.ForeignKey<QSensors> datastreamsSensorIdFkey = createForeignKey(sensorId, "ID");

    public final com.querydsl.sql.ForeignKey<QObservations> _observationsDatastreamIdFkey = createInvForeignKey(id, "DATASTREAM_ID");

    public QDatastreams(String variable) {
        super(QDatastreams.class, forVariable(variable), "PUBLIC", "DATASTREAMS");
        addMetadata();
    }

    public QDatastreams(String variable, String schema, String table) {
        super(QDatastreams.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDatastreams(String variable, String schema) {
        super(QDatastreams.class, forVariable(variable), schema, "DATASTREAMS");
        addMetadata();
    }

    public QDatastreams(Path<? extends QDatastreams> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "DATASTREAMS");
        addMetadata();
    }

    public QDatastreams(PathMetadata metadata) {
        super(QDatastreams.class, metadata, "PUBLIC", "DATASTREAMS");
        addMetadata();
    }

    private void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(obsPropertyId, ColumnMetadata.named("OBS_PROPERTY_ID").withIndex(9).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(sensorId, ColumnMetadata.named("SENSOR_ID").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(thingId, ColumnMetadata.named("THING_ID").withIndex(10).ofType(Types.BIGINT).withSize(19).notNull());
    }

    /**
     * @return the id
     */
    @Override
    public StringPath getId() {
        return id;
    }

    /**
     * @return the obsPropertyId
     */
    @Override
    public StringPath getObsPropertyId() {
        return obsPropertyId;
    }

    /**
     * @return the sensorId
     */
    @Override
    public StringPath getSensorId() {
        return sensorId;
    }

    /**
     * @return the thingId
     */
    @Override
    public StringPath getThingId() {
        return thingId;
    }

    @Override
    public QDatastreams newWithAlias(String variable) {
        return new QDatastreams(variable);
    }

}