package frank.in.ecomdashboard.service.impl;

import frank.in.ecomdashboard.entity.*;
import frank.in.ecomdashboard.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
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
        return productCategoryRepository.findBybestCategory(true);
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

    @Override
    public EmployeeInformation getEmployee(String pk) {
        return employeeInformationRepository.findByPk(pk);
    }

    @Override
    public EmployeeInformation addEmployee(EmployeeInformation employeeInformation) {
      return employeeInformationRepository.save(employeeInformation);
    }

    @Override
    public void deleteEmployee(EmployeeInformation employeeInformation) {

        employeeInformationRepository.delete(employeeInformation);
    }

    @Override
    public EmployeeInformation updateEmployee(EmployeeInformation employeeInformation) {
        return employeeInformationRepository.save(employeeInformation);
    }
}
