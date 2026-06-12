package com.atomikos.jdbc;

import com.newrelic.api.agent.weaver.SkipIfPresent;

/**
 * This class exists in transactions-jdbc 3.x but was removed in 4.0.0.
 * If present on the classpath, this module will be skipped,
 * preventing double instrumentation with the atomikos-cp module.
 */
@SkipIfPresent
public class HeuristicDataSource {
}
