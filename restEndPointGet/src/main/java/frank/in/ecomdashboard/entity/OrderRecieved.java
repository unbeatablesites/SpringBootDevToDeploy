package frank.in.ecomdashboard.entity;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Order_Recieved", schema = "ecomDashApp")
public class OrderRecieved extends KeyEntity{

    private int orderRecieved;
    private String dateRecieved;

    public int getOrderRecieved() {
        return orderRecieved;
    }

    public void setOrderRecieved(int orderRecieved) {
        this.orderRecieved = orderRecieved;
    }

    public String getDateRecieved() {
        return dateRecieved;
    }

    public void setDateRecieved(String dateRecieved) {
        this.dateRecieved = dateRecieved;
    }
}
