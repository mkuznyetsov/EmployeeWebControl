package com.ztaticvienn.controller.comparator;

import com.ztaticvienn.controller.entities.Employee;

import java.util.Comparator;

/**
 * Created by mike on 03.06.14.
 */
public class EmployeeDateComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }


}
