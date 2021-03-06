package com.jiahe.ssmcrud.Bean;

public class Student {
    private Integer stuId;

    private String stuName;

    private String gender;

    private String email;

    private Integer dId;

    private Department department;



    public Student() {
        super();
    }

    public Student(Integer stuId, String stuName, String gender, String email, Integer dId) {
        super();
        this.stuId = stuId;
        this.stuName = stuName;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}