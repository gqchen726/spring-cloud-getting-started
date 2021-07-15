package com.example.commons.entity;

import java.util.Date;

public class Employee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.EMPLOYEE_ID
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    private Long employeeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.FIRST_NAME
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.LAST_NAME
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.EMAIL
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.PHONE_BIGINT
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    private String phoneBigint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.HIRE_DATE
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    private Date hireDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.JOB_ID
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    private String jobId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.SALARY
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    private Long salary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.COMMISSION_PCT
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    private Long commissionPct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.MANAGER_ID
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    private Long managerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.DEPARTMENT_ID
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    private Long departmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.SAL_LIMIT_INDICATE
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    private String salLimitIndicate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.EMPLOYEE_ID
     *
     * @return the value of employees.EMPLOYEE_ID
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public Long getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.EMPLOYEE_ID
     *
     * @param employeeId the value for employees.EMPLOYEE_ID
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.FIRST_NAME
     *
     * @return the value of employees.FIRST_NAME
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.FIRST_NAME
     *
     * @param firstName the value for employees.FIRST_NAME
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.LAST_NAME
     *
     * @return the value of employees.LAST_NAME
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.LAST_NAME
     *
     * @param lastName the value for employees.LAST_NAME
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.EMAIL
     *
     * @return the value of employees.EMAIL
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.EMAIL
     *
     * @param email the value for employees.EMAIL
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.PHONE_BIGINT
     *
     * @return the value of employees.PHONE_BIGINT
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public String getPhoneBigint() {
        return phoneBigint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.PHONE_BIGINT
     *
     * @param phoneBigint the value for employees.PHONE_BIGINT
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public void setPhoneBigint(String phoneBigint) {
        this.phoneBigint = phoneBigint == null ? null : phoneBigint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.HIRE_DATE
     *
     * @return the value of employees.HIRE_DATE
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.HIRE_DATE
     *
     * @param hireDate the value for employees.HIRE_DATE
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.JOB_ID
     *
     * @return the value of employees.JOB_ID
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.JOB_ID
     *
     * @param jobId the value for employees.JOB_ID
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.SALARY
     *
     * @return the value of employees.SALARY
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public Long getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.SALARY
     *
     * @param salary the value for employees.SALARY
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public void setSalary(Long salary) {
        this.salary = salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.COMMISSION_PCT
     *
     * @return the value of employees.COMMISSION_PCT
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public Long getCommissionPct() {
        return commissionPct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.COMMISSION_PCT
     *
     * @param commissionPct the value for employees.COMMISSION_PCT
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public void setCommissionPct(Long commissionPct) {
        this.commissionPct = commissionPct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.MANAGER_ID
     *
     * @return the value of employees.MANAGER_ID
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public Long getManagerId() {
        return managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.MANAGER_ID
     *
     * @param managerId the value for employees.MANAGER_ID
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.DEPARTMENT_ID
     *
     * @return the value of employees.DEPARTMENT_ID
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.DEPARTMENT_ID
     *
     * @param departmentId the value for employees.DEPARTMENT_ID
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.SAL_LIMIT_INDICATE
     *
     * @return the value of employees.SAL_LIMIT_INDICATE
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public String getSalLimitIndicate() {
        return salLimitIndicate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.SAL_LIMIT_INDICATE
     *
     * @param salLimitIndicate the value for employees.SAL_LIMIT_INDICATE
     *
     * @mbg.generated Wed Jul 14 10:17:11 CST 2021
     */
    public void setSalLimitIndicate(String salLimitIndicate) {
        this.salLimitIndicate = salLimitIndicate == null ? null : salLimitIndicate.trim();
    }
}