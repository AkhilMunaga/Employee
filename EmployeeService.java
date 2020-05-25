package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class EmployeeService {

    private List<Employees> employees = new ArrayList<>(Arrays.asList(
            new Employees("01","Akhil","27-05-1998","40000","Kanigiri","False"),
            new Employees( "02","Kumar","30-05-1998","50000","Guntur","False"),
            new Employees("03", "Dinesh", "15-05-1998", "60000","Tirupati", "False"),
            new Employees( "04","Rohit","06-05-1998","70000","Ongole","False"),
            new Employees( "05","Praveen","18-05-1998","80000","Hyderabad","False")
    ));
    public List<Employees> getAllEmployees(){
        return employees;
    }
    public Employees getEmployees(String id){
        return employees.stream().filter(t->t.getEmpId().equals(id)).findFirst().get();
    }
    public void addEmployees(Employees employees1){

        employees.add(employees1);
    }
    public void updateEmployees(String id, Employees employees1){
        for(int i=0;i<employees.size();i++){
            Employees t=employees.get(i);
            if(t.getEmpId().equals(id)){
                employees.set(i,employees1);
                return;
            }
        }
    }
    public void deleteEmployees(String id){

        employees.removeIf(t->t.getEmpId().equals(id));
    }
}
