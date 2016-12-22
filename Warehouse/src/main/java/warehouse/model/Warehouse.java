package warehouse.model;

/**
 * Created by berloc on 2016.12.18..
 */
public class Warehouse {

    private int warehouseID;
    private String LocationState;
    private String LocationCity;
    private int ZIP;


    public Warehouse() {

    }

    public Warehouse(int warehouseID, String locationState, String locationCity, int ZIP) {
        this.warehouseID = warehouseID;
        LocationState = locationState;
        LocationCity = locationCity;
        this.ZIP = ZIP;
    }

    public int getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(int warehouseID) {
        this.warehouseID = warehouseID;
    }

    public String getLocationState() {
        return LocationState;
    }

    public void setLocationState(String locationState) {
        LocationState = locationState;
    }

    public String getLocationCity() {
        return LocationCity;
    }

    public void setLocationCity(String locationCity) {
        LocationCity = locationCity;
    }

    public int getZIP() {
        return ZIP;
    }

    public void setZIP(int ZIP) {
        this.ZIP = ZIP;
    }
}
