package cn.dhx.api.entity;

import java.io.Serializable;


public class Dept implements Serializable {
    private Integer deptNo; //主键
    private String dName; //部门名称
    private String dbSource; //来自哪个数据库

    public Dept(Integer deptNo, String dName, String dbSource) {
        this.deptNo = deptNo;
        this.dName = dName;
        this.dbSource = dbSource;
    }

    public Dept() {
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", dName='" + dName + '\'' +
                ", dbSource='" + dbSource + '\'' +
                '}';
    }
}
