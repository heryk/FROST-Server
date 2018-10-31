package de.fraunhofer.iosb.ilt.sta.persistence.postgres.uuidid.relationalpaths;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import static com.querydsl.core.types.PathMetadataFactory.forVariable;
import com.querydsl.core.types.dsl.ComparablePath;
import com.querydsl.sql.ColumnMetadata;
import de.fraunhofer.iosb.ilt.sta.persistence.postgres.relationalpaths.AbstractQThingsLocations;
import java.sql.Types;
import java.util.UUID;

/**
 * QThingsLocations is a Querydsl query type for QThingsLocations
 */
public class QThingsLocations extends AbstractQThingsLocations<QThingsLocations, ComparablePath<UUID>, UUID> {

    private static final long serialVersionUID = -1915253573;

    public static final QThingsLocations thingsLocations = new QThingsLocations("THINGS_LOCATIONS");

    public final ComparablePath<UUID> locationId = createComparable("locationId", UUID.class);

    public final ComparablePath<UUID> thingId = createComparable("thingId", UUID.class);

    public final com.querydsl.sql.PrimaryKey<QThingsLocations> thingsLocationsPkey = createPrimaryKey(locationId, thingId);

    public final com.querydsl.sql.ForeignKey<QLocations> thingsLocationsLocationIdFkey = createForeignKey(locationId, "ID");

    public final com.querydsl.sql.ForeignKey<QThings> thingsLocationsThingIdFkey = createForeignKey(thingId, "ID");

    public QThingsLocations(String variable) {
        super(QThingsLocations.class, forVariable(variable), "PUBLIC", "THINGS_LOCATIONS");
        addMetadata();
    }

    public QThingsLocations(String variable, String schema, String table) {
        super(QThingsLocations.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QThingsLocations(String variable, String schema) {
        super(QThingsLocations.class, forVariable(variable), schema, "THINGS_LOCATIONS");
        addMetadata();
    }

    public QThingsLocations(Path<? extends QThingsLocations> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "THINGS_LOCATIONS");
        addMetadata();
    }

    public QThingsLocations(PathMetadata metadata) {
        super(QThingsLocations.class, metadata, "PUBLIC", "THINGS_LOCATIONS");
        addMetadata();
    }

    private void addMetadata() {
        addMetadata(locationId, ColumnMetadata.named("LOCATION_ID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(thingId, ColumnMetadata.named("THING_ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

    @Override
    public ComparablePath<UUID> getLocationId() {
        return locationId;
    }

    @Override
    public ComparablePath<UUID> getThingId() {
        return thingId;
    }

    @Override
    public QThingsLocations newWithAlias(String variable) {
        return new QThingsLocations(variable);
    }

}