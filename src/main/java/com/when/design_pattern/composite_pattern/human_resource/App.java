package com.when.design_pattern.composite_pattern.human_resource;

import java.util.List;

/**
 * @author: when
 * @create: 2020-03-18  10:26
 * <p>
 * * table structure
 * *
 * * table_department
 * * 部门id   上级部门id
 * * id        parent_department_id ...
 * *
 * * table_employee
 * * 员工id   隶属部门id         薪资
 * * id        department_id    salary ...
 **/
public class App {
    private static final long ORGANIZATION_ROOT_ID = 1001;
    private DepartmentRepo departmentRepo;
    private EmployeeRepo employeeRepo;


    public void buildOrganization() {
        Department rootDepartment = new Department(ORGANIZATION_ROOT_ID);
        buildOrganization(rootDepartment);
    }

    public void buildOrganization(Department department) {
        List<Long> subDepartmentIds = departmentRepo.getSubDepartmentIds(department);
        for (Long subDepartmentId : subDepartmentIds) {
            Department subDepartment = new Department(subDepartmentId);
            department.addSubNode(subDepartment);
            buildOrganization(subDepartment);
        }

        List<Long> employeeIds = employeeRepo.getDepartmentEmployeeIds(department);
        for (Long employeeId : employeeIds) {
            double salary = employeeRepo.getEmployeeSalary(employeeId);
            department.addSubNode(new Employee(employeeId, salary));
        }
    }
}
