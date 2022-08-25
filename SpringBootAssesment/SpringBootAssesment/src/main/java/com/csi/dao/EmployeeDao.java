package com.csi.dao;

import com.csi.exception.InvalidContactNoException;
import com.csi.exception.InvalidEmailAddress;
import com.csi.exception.InvalidNameException;
import com.csi.exception.InvalidPass;
import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

    @Autowired
    EmployeeRepository employeeRepository;

    public void signup(Employee employee) throws InvalidNameException, InvalidEmailAddress, InvalidContactNoException, InvalidPass {

        for (int i = 0; i < employee.getEmpName().length(); i++) {
            if (Character.isAlphabetic(employee.getEmpName().charAt(i)) || Character.isDigit(employee.getEmpName().charAt(i))) {

            } else {
                //exception
                throw new InvalidNameException("bhaii nav nit taak");
            }
        }
        if (employee.getEmailAddress().contains("@") && employee.getEmailAddress().contains(".")) {

        } else {

            throw new InvalidEmailAddress("bhai mail nit taak");


        }
        String ss= String.valueOf(employee.getContactno());

        if (ss.length()>=10){

        }else{
            //exception
            throw new InvalidContactNoException("bhai no nit taak");
        }
        if(employee.getEmpPass().length()>3){

        }else{
            //exception
            throw new InvalidPass("bhai password nit taak");
        }
        employeeRepository.save(employee);


    }
}