package io.shardingsphere.core.routing.filter;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author BG388812
 **/
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DataSourceTableFilterFactory {

    public static DataSourceTableFilter newInstance(final String dataSourceTableFilterClassName) {
        try {
            return (DataSourceTableFilter) Class.forName(dataSourceTableFilterClassName).newInstance();
        }catch (final ReflectiveOperationException ex) {
            throw new IllegalArgumentException(String.format("Class %s should have public privilege and no argument constructor", dataSourceTableFilterClassName));
        }
    }

}
