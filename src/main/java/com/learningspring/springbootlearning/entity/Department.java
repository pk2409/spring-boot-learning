package com.learningspring.springbootlearning.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity  //marking as entity so it can interact with the database
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentid;

    @NotBlank(message = "please add department name over here")
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;



    public Long getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Long departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

//    public Department(Long departmentid, String departmentName, String departmentAddress, String departmentCode) {
//        this.departmentid = departmentid;
//        this.departmentName = departmentName;
//        this.departmentAddress = departmentAddress;
//        this.departmentCode = departmentCode;
//    }
//
//    public Department() {
//    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentid +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }
}
