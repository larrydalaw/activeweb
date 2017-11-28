package app.config;

import org.javalite.activeweb.AbstractDBConfig;
import org.javalite.activeweb.AppContext;

public class DbConfig extends AbstractDBConfig {

    public void init(AppContext context) {

        environment("development").jdbc("org.postgresql.Driver", "jdbc:postgres://mgfkasvd:C4XOgRFCkSEk_R7MJTMCzAPwbsrA4yQ5@stampy.db.elephantsql.com:5432/mgfkasvd",  "mgfkasvd", "mgfkasvd");
        
        environment("development").testing().jdbc("org.postgresql.Driver", "jdbc:postgres://mgfkasvd:C4XOgRFCkSEk_R7MJTMCzAPwbsrA4yQ5@stampy.db.elephantsql.com:5432/mgfkasvd",  "mgfkasvd", "mgfkasvd");

        environment("production").jndi("jdbc/datasource_name_production");
    }
}
