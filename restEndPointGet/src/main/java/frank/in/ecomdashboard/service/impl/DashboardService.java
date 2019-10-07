package frank.in.ecomdashboard.service.impl;

import frank.in.ecomdashboard.entity.*;

import java.util.List;

public interface DashboardService {
    List<CompanyRevenue> getTodayRevenueDash();

    List<ProductCategory> getBestCategory();

    List<OrderRecieved> getAllOrdersRecieved();

    List<OrderCollectionStatus> getOrderCollection();

    List<EmployeeInformation> getAllEmployee();

    EmployeeInformation getEmployee(final String pk);

    EmployeeInformation addEmployee(EmployeeInformation employeeInformation);
    void deleteEmployee(EmployeeInformation employeeInformation);

    EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);
}
