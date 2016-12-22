package warehouse.model;

/**
 * Created by berloc on 2016.12.21..
 */
public class Goods {

    private int goodsID;
    private String name;
    private String type;


    public Goods(int goodsID, String name, String type) {

        this.goodsID = goodsID;
        this.name = name;
        this.type = type;
    }

    public Goods() {

    }

    public int getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(int goodsID) {
        this.goodsID = goodsID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
