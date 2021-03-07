public class BeanRescourse {

    private String ID;
    private String Name;
    private Util.RescourseType ResType;
    private Util.WorkSpace ResWorkSpace;
    private Integer ResAmount;

    public BeanRescourse setID(String ID) {
        this.ID = ID;
        return this;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public Util.RescourseType getResType() {
        return ResType;
    }

    public Util.WorkSpace getResWorkSpace() {
        return ResWorkSpace;
    }

    public Integer getResAmount() {
        return ResAmount;
    }

    public BeanRescourse setName(String name) {
        Name = name;
        return this;
    }

    public BeanRescourse setResType(Util.RescourseType resType) {
        ResType = resType;
        return this;
    }

    public BeanRescourse setResWorkSpace(Util.WorkSpace resWorkSpace) {
        ResWorkSpace = resWorkSpace;
        return this;
    }

    public BeanRescourse setResAmount(Integer resAmount) {
        ResAmount = resAmount;
        return this;
    }

}
