package sg.edu.rp.c346.id21010650.p13ps;

public class CarparkAvailability {
    private String lotType;
    private String totalLots;
    private String lotsAvailable;
    private String carparkNumber;
    private String updatedTime;

    public CarparkAvailability(String lotType, String totalLots, String lotsAvailable, String carparkNumber, String updatedTime) {
        this.lotType = lotType;
        this.totalLots = totalLots;
        this.lotsAvailable = lotsAvailable;
        this.carparkNumber = carparkNumber;
        this.updatedTime = updatedTime;

}
    public String getLotType() {
        return lotType;
    }

    public void setLotType(String lotType) {
        this.lotType = lotType;
    }

    public String getTotalLots() {
        return totalLots;
    }

    public void setTotalLots(String totalLots) {
        this.totalLots = totalLots;
    }

    public String getLotsAvailable() {
        return lotsAvailable;
    }

    public void setLotsAvailable(String lotsAvailable) {
        this.lotsAvailable = lotsAvailable;
    }

    public String getCarparkNumber() {
        return carparkNumber;
    }

    public void setCarparkNumber(String carparkNumber) {
        this.carparkNumber = carparkNumber;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return "CarparkAvailability\n" +
                "Lot Type= " + lotType + '\n' +
                "Total Lots= " + totalLots + '\n' +
                "Lots Available= " + lotsAvailable + '\n';
                "Carpark Number= " + carparkNumber + '\n' +
                "Updated Time= " + updatedTime + '\n' +



}}
