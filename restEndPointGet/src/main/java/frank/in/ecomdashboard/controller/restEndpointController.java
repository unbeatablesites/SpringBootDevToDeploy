package frank.in.ecomdashboard.controller;

import frank.in.ecomdashboard.entity.EmployeeInformation;
import frank.in.ecomdashboard.service.impl.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class restEndpointController {

    @Autowired
    private DashboardService dashboardService;


    @RequestMapping(value = "/employees")
    public List<EmployeeInformation> getAllEmp(){
        return dashboardService.getAllEmployee();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/employee/add")
    public String saveEmployee(@RequestBody EmployeeInformation employeeInformation){
        if(dashboardService.addEmployee(employeeInformation)!=null){
            return "Employee data saved successfully";
        }else{
            return "Error saving employee INFo";
        }
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/employee/delete")
    public String deletion(@RequestParam(name = "empId",required = true) String pk) {
        try {
            dashboardService.deleteEmployee(dashboardService.getEmployee(pk));
            return "deleted";
        } catch (Exception e) {
            return "error";
        }
    }



}
