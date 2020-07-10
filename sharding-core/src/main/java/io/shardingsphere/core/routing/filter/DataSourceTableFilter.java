package io.shardingsphere.core.routing.filter;

import java.util.Collection;

/**
 * @author BG388812
 **/
public interface DataSourceTableFilter {

    /**
     * filter tables that belong to the datasource
     * @param dataSourceName datasource name
     * @param tableNames table name list
     * @param logicTableName logic table name
     * @return tables that belong to the datasource
     */
    Collection<String> filter(String dataSourceName, Collection<String> tableNames, String logicTableName);
}
