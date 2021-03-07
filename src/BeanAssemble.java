public class BeanAssemble {
    private String ID;
    private String Name;
    private Integer WorkerAmount;
    private Integer SeniorWorkerAmount;
    private Integer MachineAmount;
    private Integer SeniorMachineAmount;
    private Integer EquipmentAmount;
    private Integer SeniorTimeCost;
    private Util.Production_Mode ProductionMode;
    private Integer MinProductionAmount;
    private Integer MaxProductionAmount;

    public BeanAssemble setID(String ID) {
        this.ID = ID;
        return this;
    }

    public BeanAssemble setName(String name) {
        Name = name;
        return this;
    }

    public BeanAssemble setWorkerAmount(Integer workerAmount) {
        WorkerAmount = workerAmount;
        return this;
    }

    public BeanAssemble setSeniorWorkerAmount(Integer seniorWorkerAmount) {
        SeniorWorkerAmount = seniorWorkerAmount;
        return this;
    }

    public BeanAssemble setMachineAmount(Integer machineAmount) {
        MachineAmount = machineAmount;
        return this;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public Integer getWorkerAmount() {
        return WorkerAmount;
    }

    public Integer getSeniorWorkerAmount() {
        return SeniorWorkerAmount;
    }

    public Integer getMachineAmount() {
        return MachineAmount;
    }

    public Integer getSeniorMachineAmount() {
        return SeniorMachineAmount;
    }

    public Integer getEquipmentAmount() {
        return EquipmentAmount;
    }

    public Integer getSeniorTimeCost() {
        return SeniorTimeCost;
    }

    public Util.Production_Mode getProductionMode() {
        return ProductionMode;
    }

    public Integer getMinProductionAmount() {
        return MinProductionAmount;
    }

    public Integer getMaxProductionAmount() {
        return MaxProductionAmount;
    }

    public BeanAssemble setSeniorMachineAmount(Integer seniorMachineAmount) {
        SeniorMachineAmount = seniorMachineAmount;
        return this;
    }

    public BeanAssemble setEquipmentAmount(Integer equipmentAmount) {
        EquipmentAmount = equipmentAmount;
        return this;
    }

    public BeanAssemble setSeniorTimeCost(Integer seniorTimeCost) {
        SeniorTimeCost = seniorTimeCost;
        return this;
    }

    public BeanAssemble setProductionMode(Util.Production_Mode productionMode) {
        ProductionMode = productionMode;
        return this;
    }

    public BeanAssemble setMinProductionAmount(Integer minProductionAmount) {
        MinProductionAmount = minProductionAmount;
        return this;
    }

    public BeanAssemble setMaxProductionAmount(Integer maxProductionAmount) {
        MaxProductionAmount = maxProductionAmount;
        return this;
    }
}
