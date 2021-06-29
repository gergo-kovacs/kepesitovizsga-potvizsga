package hu.nive.ujratervezes.kepesitovizsga.webshop;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WebshopService {

    DataSource dataSource;

    public WebshopService(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<String> getValuableCustomers() {
        List<String> customers = new ArrayList<>();
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select customer_name from orders where total > 1000 order by customer_name")
        ) {

            while (rs.next()) {
                String name = rs.getString("customer_name");
                customers.add(name);
            }
            return customers;
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select customers", se);
        }

    }
}
