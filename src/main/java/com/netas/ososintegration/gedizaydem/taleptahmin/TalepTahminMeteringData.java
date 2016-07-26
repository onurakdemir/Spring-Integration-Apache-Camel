
package com.netas.ososintegration.gedizaydem.taleptahmin;

public class TalepTahminMeteringData {

    private Object meteringTime;
    private Double consumptionAmount;
    private Double generationAmount;

    /**
     * 
     * @return
     *     The meteringTime
     */
    public Object getMeteringTime() {
        return meteringTime;
    }

    /**
     * 
     * @param meteringTime
     *     The meteringTime
     */
    public void setMeteringTime(Object meteringTime) {
        this.meteringTime = meteringTime;
    }

    /**
     * 
     * @return
     *     The consumptionAmount
     */
    public Double getConsumptionAmount() {
        return consumptionAmount;
    }

    /**
     * 
     * @param consumptionAmount
     *     The consumptionAmount
     */
    public void setConsumptionAmount(Double consumptionAmount) {
        this.consumptionAmount = consumptionAmount;
    }

    /**
     * 
     * @return
     *     The generationAmount
     */
    public Double getGenerationAmount() {
        return generationAmount;
    }

    /**
     * 
     * @param generationAmount
     *     The generationAmount
     */
    public void setGenerationAmount(Double generationAmount) {
        this.generationAmount = generationAmount;
    }

}
