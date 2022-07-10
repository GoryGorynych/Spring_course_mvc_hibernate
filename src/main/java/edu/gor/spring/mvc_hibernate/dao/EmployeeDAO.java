package edu.gor.spring.mvc_hibernate.dao;

import edu.gor.spring.mvc_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
