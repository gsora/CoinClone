package gsora.xyz.coinclone;

/**
 * Created by Gianguido Sorà on 25/09/2016.
 */

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Coin {

    private Boolean published;
    private Integer time;
    private String vwapDataBTC;
    private String vwapData;
    private String cap24hrChange;
    private String _short;
    private String position24;
    private String _long;
    private String perc;
    private String supply;
    private Double price;
    private String volume;
    private String usdVolume;
    private Double mktcap;
    private String cap24hrChangePercent;
    private String capPercent;
    private Boolean isBuy;
    private Boolean shapeshift;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Coin() {
    }

    /**
     *
     * @param position24
     * @param isBuy
     * @param cap24hrChangePercent
     * @param shapeshift
     * @param usdVolume
     * @param cap24hrChange
     * @param time
     * @param price
     * @param _long
     * @param capPercent
     * @param vwapDataBTC
     * @param vwapData
     * @param _short
     * @param volume
     * @param supply
     * @param perc
     * @param published
     * @param mktcap
     */
    public Coin(Boolean published, Integer time, String vwapDataBTC, String vwapData, String cap24hrChange, String _short, String position24, String _long, String perc, String supply, Double price, String volume, String usdVolume, Double mktcap, String cap24hrChangePercent, String capPercent, Boolean isBuy, Boolean shapeshift) {
        this.published = published;
        this.time = time;
        this.vwapDataBTC = vwapDataBTC;
        this.vwapData = vwapData;
        this.cap24hrChange = cap24hrChange;
        this._short = _short;
        this.position24 = position24;
        this._long = _long;
        this.perc = perc;
        this.supply = supply;
        this.price = price;
        this.volume = volume;
        this.usdVolume = usdVolume;
        this.mktcap = mktcap;
        this.cap24hrChangePercent = cap24hrChangePercent;
        this.capPercent = capPercent;
        this.isBuy = isBuy;
        this.shapeshift = shapeshift;
    }

    public Coin(JSONObject object) {
        this.published = object.optBoolean("published");
        this.time = object.optInt("time");
        this.vwapDataBTC = object.optString("vwapDataBTC");
        this.vwapData = object.optString("vwapData");
        this.cap24hrChange = object.optString("cap24hrChange");
        this._short = object.optString("short");
        this.position24 = object.optString("position24");
        this._long = object.optString("long");
        this.perc = object.optString("perc");
        this.supply = object.optString("supply");
        this.price = object.optDouble("price");
        this.volume = object.optString("volume");
        this.usdVolume = object.optString("usdVolume");
        this.mktcap = object.optDouble("mktcap");
        this.cap24hrChangePercent = object.optString("cap24hrChangePercent");
        this.capPercent = object.optString("capPercent");
        this.isBuy = object.optBoolean("isBuy");
        this.shapeshift = object.optBoolean("shapeshift");
    }

    public static ArrayList<Coin> fromJson(JSONArray jsonObjects) {
        ArrayList<Coin> coins = new ArrayList<Coin>();
        for (int i = 0; i < jsonObjects.length(); i++) {
            try {
                coins.add(new Coin(jsonObjects.getJSONObject(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return coins;
    }


    /**
     *
     * @return
     *     The published
     */
    public Boolean getPublished() {
        return published;
    }

    /**
     *
     * @param published
     *     The published
     */
    public void setPublished(Boolean published) {
        this.published = published;
    }

    /**
     *
     * @return
     *     The time
     */
    public Integer getTime() {
        return time;
    }

    /**
     *
     * @param time
     *     The time
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     *
     * @return
     *     The vwapDataBTC
     */
    public String getVwapDataBTC() {
        return vwapDataBTC;
    }

    /**
     *
     * @param vwapDataBTC
     *     The vwapDataBTC
     */
    public void setVwapDataBTC(String vwapDataBTC) {
        this.vwapDataBTC = vwapDataBTC;
    }

    /**
     *
     * @return
     *     The vwapData
     */
    public String getVwapData() {
        return vwapData;
    }

    /**
     *
     * @param vwapData
     *     The vwapData
     */
    public void setVwapData(String vwapData) {
        this.vwapData = vwapData;
    }

    /**
     *
     * @return
     *     The cap24hrChange
     */
    public String getCap24hrChange() {
        return cap24hrChange;
    }

    /**
     *
     * @param cap24hrChange
     *     The cap24hrChange
     */
    public void setCap24hrChange(String cap24hrChange) {
        this.cap24hrChange = cap24hrChange;
    }

    /**
     *
     * @return
     *     The _short
     */
    public String getShort() {
        return _short;
    }

    /**
     *
     * @param _short
     *     The short
     */
    public void setShort(String _short) {
        this._short = _short;
    }

    /**
     *
     * @return
     *     The position24
     */
    public String getPosition24() {
        return position24;
    }

    /**
     *
     * @param position24
     *     The position24
     */
    public void setPosition24(String position24) {
        this.position24 = position24;
    }

    /**
     *
     * @return
     *     The _long
     */
    public String getLong() {
        return _long;
    }

    /**
     *
     * @param _long
     *     The long
     */
    public void setLong(String _long) {
        this._long = _long;
    }

    /**
     *
     * @return
     *     The perc
     */
    public String getPerc() {
        return perc;
    }

    /**
     *
     * @param perc
     *     The perc
     */
    public void setPerc(String perc) {
        this.perc = perc;
    }

    /**
     *
     * @return
     *     The supply
     */
    public String getSupply() {
        return supply;
    }

    /**
     *
     * @param supply
     *     The supply
     */
    public void setSupply(String supply) {
        this.supply = supply;
    }

    /**
     *
     * @return
     *     The price
     */
    public Double getPrice() {
        return price;
    }

    /**
     *
     * @param price
     *     The price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     *
     * @return
     *     The volume
     */
    public String getVolume() {
        return volume;
    }

    /**
     *
     * @param volume
     *     The volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     *
     * @return
     *     The usdVolume
     */
    public String getUsdVolume() {
        return usdVolume;
    }

    /**
     *
     * @param usdVolume
     *     The usdVolume
     */
    public void setUsdVolume(String usdVolume) {
        this.usdVolume = usdVolume;
    }

    /**
     *
     * @return
     *     The mktcap
     */
    public Double getMktcap() {
        return mktcap;
    }

    /**
     *
     * @param mktcap
     *     The mktcap
     */
    public void setMktcap(Double mktcap) {
        this.mktcap = mktcap;
    }

    /**
     *
     * @return
     *     The cap24hrChangePercent
     */
    public String getCap24hrChangePercent() {
        return cap24hrChangePercent;
    }

    /**
     *
     * @param cap24hrChangePercent
     *     The cap24hrChangePercent
     */
    public void setCap24hrChangePercent(String cap24hrChangePercent) {
        this.cap24hrChangePercent = cap24hrChangePercent;
    }

    /**
     *
     * @return
     *     The capPercent
     */
    public String getCapPercent() {
        return capPercent;
    }

    /**
     *
     * @param capPercent
     *     The capPercent
     */
    public void setCapPercent(String capPercent) {
        this.capPercent = capPercent;
    }

    /**
     *
     * @return
     *     The isBuy
     */
    public Boolean getIsBuy() {
        return isBuy;
    }

    /**
     *
     * @param isBuy
     *     The isBuy
     */
    public void setIsBuy(Boolean isBuy) {
        this.isBuy = isBuy;
    }

    /**
     *
     * @return
     *     The shapeshift
     */
    public Boolean getShapeshift() {
        return shapeshift;
    }

    /**
     *
     * @param shapeshift
     *     The shapeshift
     */
    public void setShapeshift(Boolean shapeshift) {
        this.shapeshift = shapeshift;
    }

}
