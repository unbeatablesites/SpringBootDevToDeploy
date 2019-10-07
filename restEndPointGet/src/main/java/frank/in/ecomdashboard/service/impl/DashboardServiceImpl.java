package frank.in.ecomdashboard.service.impl;

import frank.in.ecomdashboard.entity.*;
import frank.in.ecomdashboard.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private CompanyRevenueRepository companyRevenueRepository;

    @Autowired
    private EmployeeInformationRepository employeeInformationRepository;

    @Autowired
    private OrderCollectionStatusRepository orderCollectionStatusRepository;

    @Autowired
    private OrderRecievedRepository orderRecievedRepository;

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<CompanyRevenue> getTodayRevenueDash() {
        return companyRevenueRepository.findAll();
    }

    @Override
    public List<ProductCategory> getBestCategory() {
        return productCategoryRepository.findByBestCategoy(true);
    }

    @Override
    public List<OrderRecieved> getAllOrdersRecieved() {
        return orderRecievedRepository.findAll();
    }

    @Override
    public List<OrderCollectionStatus> getOrderCollection() {
        return orderCollectionStatusRepository.findAll();
    }

    @Override
    public List<EmployeeInformation> getAllEmployee() {
        return employeeInformationRepository.findAll();
    }
}
