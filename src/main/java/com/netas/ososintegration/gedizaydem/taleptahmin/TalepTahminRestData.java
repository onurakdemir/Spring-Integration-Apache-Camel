
package com.netas.ososintegration.gedizaydem.taleptahmin;

import java.util.ArrayList;
import java.util.List;

public class TalepTahminRestData {

    private Object eic;
    private Integer meteringType;
    private List<TalepTahminMeteringData> data = new ArrayList<TalepTahminMeteringData>();

    /**
     * 
     * @return
     *     The eic
     */
    public Object getEic() {
        return eic;
    }

    /**
     * 
     * @param eic
     *     The eic
     */
    public void setEic(Object eic) {
        this.eic = eic;
    }

    /**
     * 
     * @return
     *     The meteringType
     */
    public Integer getMeteringType() {
        return meteringType;
    }

    /**
     * 
     * @param meteringType
     *     The meteringType
     */
    public void setMeteringType(Integer meteringType) {
        this.meteringType = meteringType;
    }

    /**
     * 
     * @return
     *     The data
     */
    public List<TalepTahminMeteringData> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(List<TalepTahminMeteringData> data) {
        this.data = data;
    }

}
