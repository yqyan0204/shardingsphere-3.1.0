package io.shardingsphere.core.routing.filter;

import java.util.Collection;

/**
 * @author BG388812
 **/
public final class DefaultDataSourceTableFilter implements DataSourceTableFilter{

    @Override
    public Collection<String> filter(String dataSourceName, Collection<String> tableNames, String logicTableName) {
        return tableNames;
    }
}
