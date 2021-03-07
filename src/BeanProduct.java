import java.util.List;

public class BeanProduct {
    private String ID;
    private String ProductName;
    private List<BeanSemiProduct> allSemiProducts;
    private BeanAssemble Assemble;

    public String getID() {
        return ID;
    }

    public String getProductName() {
        return ProductName;
    }

    public List<BeanSemiProduct> getAllSemiProducts() {
        return allSemiProducts;
    }

    public BeanAssemble getAssemble() {
        return Assemble;
    }

    public BeanProduct setID(String ID) {
        this.ID = ID;
        return this;
    }

    public BeanProduct setProductName(String productName) {
        ProductName = productName;
        return this;
    }

    public BeanProduct setAllSemiProducts(List<BeanSemiProduct> allSemiProducts) {
        this.allSemiProducts = allSemiProducts;
        return this;
    }

    public BeanProduct setAssemble(BeanAssemble assemble) {
        Assemble = assemble;
        return this;
    }


}
