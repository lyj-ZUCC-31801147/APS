import java.util.Date;
import java.util.List;

public class BeanOrder {
    private String OrderID;
    private String OrderName;
    private Date StartTime;
    private Date DeadLine;
    private List<BeanProduct> allProducts;

    public BeanOrder setOrderID(String orderID) {
        OrderID = orderID;
        return this;
    }

    public BeanOrder setOrderName(String orderName) {
        OrderName = orderName;
        return this;
    }

    public BeanOrder setStartTime(Date startTime) {
        StartTime = startTime;
        return this;
    }

    public BeanOrder setDeadLine(Date deadLine) {
        DeadLine = deadLine;
        return this;
    }

    public String getOrderID() {
        return OrderID;
    }

    public String getOrderName() {
        return OrderName;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public Date getDeadLine() {
        return DeadLine;
    }

    public List<BeanProduct> getAllProducts() {
        return allProducts;
    }

    public BeanOrder setAllProducts(List<BeanProduct> allProducts) {
        this.allProducts = allProducts;
        return this;
    }

    public BeanOrder() {

    }
}
