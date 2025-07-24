package com.arjita.SimpleAppApplication.infra;

import com.arjita.SimpleAppApplication.Controller.response.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class EmployeeRepository {

    private static final String JDBC_URL = "jdbc:h2:mem:testdb";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    public EmployeeRepository() {
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS employee (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(255), " +
                    "department VARCHAR(255))");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }

    // ✅ findById method
    public Employee findById(int id) {
        String sql = "SELECT * FROM employee WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // ✅ addEmployees method (batch insert)
    public void addEmployees(List<Employee> employees) {
        String sql = "INSERT INTO employee (id, name, department) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            for (Employee emp : employees) {
                ps.setInt(1, emp.getId());
                ps.setString(2, emp.getName());
                ps.setString(3, emp.getDepartment());
                ps.addBatch();
            }
            ps.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
