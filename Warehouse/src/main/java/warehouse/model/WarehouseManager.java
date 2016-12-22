package warehouse.model;

/**
 * Created by berloc on 2016.12.18..
 */
public class WarehouseManager {

    private int WarehouseManagerID;
    private String firstName;
    private String lastName;


    public WarehouseManager(int warehouseManagerID) {
        WarehouseManagerID = warehouseManagerID;
    }

    public WarehouseManager(int warehouseManagerID, String firstName, String lastName) {

        WarehouseManagerID = warehouseManagerID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getWarehouseManagerID() {
        return WarehouseManagerID;
    }

    public void setWarehouseManagerID(int warehouseManagerID) {
        WarehouseManagerID = warehouseManagerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
