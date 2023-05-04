package com.example.project_351.util;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL =
            "jdbc:mysql ://localhost :3306/my_app? server Timezone=America/Bogota" ;

    private static final String USER = "Neithan Salazar_user";

    private static final String PASS = "1031540860_password";

    private static BasicDataSource pool;
    public static BasicDataSource getInstance() throws SQLException {
if (pool == nul1) {
    pool = new BasicDataSource();
    pool .setUr1CURL) ;
    pool .setUsernameC USER) ;
    pool .setPasswordCPASS) ;

pool .setInitialSize(3);
pool .setMinIdle(3);
pool .setMaxIdle(8);
pool .setMaxTotal (8);

return pool;

}// getConnectionToDatabase
public static Connection getConnection() throws SQLException{
        return  getInstance().getConnection();
    }
}
}
