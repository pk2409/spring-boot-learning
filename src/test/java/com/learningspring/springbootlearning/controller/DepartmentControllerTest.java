package com.learningspring.springbootlearning.controller;

import com.learningspring.springbootlearning.entity.Department;
import com.learningspring.springbootlearning.error.DepartmentNotFoundException;
import com.learningspring.springbootlearning.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(DepartmentControllerTest.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    //mocking the service layer
    @MockBean
    private DepartmentService departmentService;

    private Department department;




    //created test for only two methods
    //controller layer is called when we hit any of the endpoints

    @BeforeEach
    void setUp() {
        Department department=Department.builder()
                .departmentName("Aerospace")
                .departmentAddress("Bangalore")
                .departmentCode("AE-07")
                .departmentid(1L)
                .build();
    }
    //we will be using this object in the testcases

//    @Test
//    void saveDepartment() throws Exception {
//        Department inputDepartment=Department.builder()
//                .departmentName("Aerospace")
//                .departmentAddress("Bangalore")
//                .departmentCode("AE-07")
//                .build();
//
//        Mockito.when(departmentService.saveDepartment(inputDepartment))
//                .thenReturn(department);//not equal as departmentid property is not added here
//
//        //need to call the endpoint
//        mockMvc.perform(post("/departments")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\n" +
//                        "\t\"departmentName\":\"Aerospace\",\n" +
//                        "\t\"departmentAddress\":\"Bangalore\",\n" +
//                        "\t\"departmentCode\":\"AE-07\"\n" +
//                        "}\n"))
//                .andExpect(status().isOk());
//
//
//    }
//
//    @Test
//    void fetchDepartmentById() throws DepartmentNotFoundException {
//
//        Mockito.when(departmentService.fetchDepartmentById(1L))
//                .thenReturn(department);
//        MockMvc.perform(get("/departments/1")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.departmentName").value(department.getDepartmentName()));
//    }
}