package warehouse.model;

/**
 * Created by berloc on 2016.12.22..
 */
public class SupplyChainPartner {

    private int partnerID;
    private String partnerName;
    private String partnerLocation;


    public SupplyChainPartner() {

    }

    public SupplyChainPartner(int partnerID, String partnerName, String partnerLocation) {

        this.partnerID = partnerID;
        this.partnerName = partnerName;
        this.partnerLocation = partnerLocation;
    }

    public int getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(int partnerID) {
        this.partnerID = partnerID;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getPartnerLocation() {
        return partnerLocation;
    }

    public void setPartnerLocation(String partnerLocation) {
        this.partnerLocation = partnerLocation;
    }
}
