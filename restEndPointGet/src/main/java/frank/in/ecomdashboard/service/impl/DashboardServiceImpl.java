package frank.in.ecomdashboard.service.impl;

import frank.in.ecomdashboard.entity.*;
import frank.in.ecomdashboard.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

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
    public HashMap<String,Object> getTodayRevenueDash() {

        HashMap<String,Object> populateCompnyRev = new HashMap<>();

        List<CompanyRevenue> companyRevenueList = companyRevenueRepository.findAll();

        List<String> label = new ArrayList<>();
        List<String> _revenue = new ArrayList<>();

        double totalMargin = 0;
        double totalExpense =0;
        double totalRevenue =0;
        Locale locale = new Locale("en","US");
        NumberFormate currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        for (CompanyRevenue companyRevenue : companyRevenueList)

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
