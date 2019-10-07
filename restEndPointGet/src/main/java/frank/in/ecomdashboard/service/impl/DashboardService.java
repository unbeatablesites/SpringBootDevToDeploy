package frank.in.ecomdashboard.service.impl;

import frank.in.ecomdashboard.entity.*;

import java.util.List;

public interface DashboardService {
    List<CompanyRevenue> getTodayRevenueDash();

    List<ProductCategory> getBestCategory();

    List<OrderRecieved> getAllOrdersRecieved();

    List<OrderCollectionStatus> getOrderCollection();

    List<EmployeeInformation> getAllEmployee();
}
