

public class BeanTechnology {
    private String ID;
    private String Name;
    private BeanTechnology PreTechnology;
    private Integer WorkerAmount;
    private Integer SeniorWorkerAmount;
    private Integer MachineAmount;
    private Integer SeniorMachineAmount;
    private Integer EquipmentAmount;
    private Integer SeniorTimeCost;
    private Util.Production_Mode ProductionMode;
    private Integer MinProductionAmount;
    private Integer MaxProductionAmount;

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public BeanTechnology getPreTechnology() {
        return PreTechnology;
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

    public BeanTechnology setID(String ID) {
        this.ID = ID;
        return this;
    }

    public BeanTechnology setName(String name) {
        Name = name;
        return this;
    }

    public BeanTechnology setPreTechnology(BeanTechnology preTechnology) {
        PreTechnology = preTechnology;
        return this;
    }

    public BeanTechnology setWorkerAmount(Integer workerAmount) {
        WorkerAmount = workerAmount;
        return this;
    }

    public BeanTechnology setSeniorWorkerAmount(Integer seniorWorkerAmount) {
        SeniorWorkerAmount = seniorWorkerAmount;
        return this;
    }

    public BeanTechnology setMachineAmount(Integer machineAmount) {
        MachineAmount = machineAmount;
        return this;
    }

    public BeanTechnology setSeniorMachineAmount(Integer seniorMachineAmount) {
        SeniorMachineAmount = seniorMachineAmount;
        return this;
    }

    public BeanTechnology setEquipmentAmount(Integer equipmentAmount) {
        EquipmentAmount = equipmentAmount;
        return this;
    }

    public BeanTechnology setSeniorTimeCost(Integer seniorTimeCost) {
        SeniorTimeCost = seniorTimeCost;
        return this;
    }

    public BeanTechnology setProductionMode(Util.Production_Mode productionMode) {
        ProductionMode = productionMode;
        return this;
    }

    public BeanTechnology setMinProductionAmount(Integer minProductionAmount) {
        MinProductionAmount = minProductionAmount;
        return this;
    }

    public BeanTechnology setMaxProductionAmount(Integer maxProductionAmount) {
        MaxProductionAmount = maxProductionAmount;
        return this;
    }
}
