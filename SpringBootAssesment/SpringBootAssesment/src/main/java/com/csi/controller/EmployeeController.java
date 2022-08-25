package com.csi.controller;

import com.csi.dao.EmployeeDao;
import com.csi.exception.InvalidContactNoException;
import com.csi.exception.InvalidEmailAddress;
import com.csi.exception.InvalidNameException;
import com.csi.exception.InvalidPass;
import com.csi.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @PostMapping("/savedata")
    public ResponseEntity<String> signup(@RequestBody Employee employee){



       int ss= 12345;

       String aa=String.valueOf(ss);

        try {
            employeeDao.signup(employee);

        } catch (InvalidNameException e) {
          aa = e.getMessage();
        } catch (InvalidEmailAddress e) {
            aa= e.getMessage();
        } catch (InvalidContactNoException e) {
            aa = e.getMessage();
        } catch (InvalidPass e) {
            aa = e.getMessage();
        }

  return  ResponseEntity.ok(aa);

    }
}
