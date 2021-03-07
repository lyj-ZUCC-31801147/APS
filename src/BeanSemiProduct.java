import java.util.List;

public class BeanSemiProduct {
    private String ID;

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public List<BeanTechnology> getAllTechnologies() {
        return allTechnologies;
    }

    private String Name;
    private List<BeanTechnology> allTechnologies;

    public BeanSemiProduct setID(String ID) {
        this.ID = ID;
        return this;
    }

    public BeanSemiProduct setName(String name) {
        Name = name;
        return this;
    }

    public BeanSemiProduct setAllTechnologies(List<BeanTechnology> allTechnologies) {
        this.allTechnologies = allTechnologies;
        return this;
    }
}
