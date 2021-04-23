import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("123");
        ds.setServerName("DESKTOP-0L66HQK\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("NHATPRO");
        try (Connection conn = ds.getConnection())
        {
            System.out.println("Connection success");
            System.out.println(conn.getMetaData());
        }catch (SQLServerException throwables)
        {
            throwables.printStackTrace();
        }catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
}
