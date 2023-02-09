public class Functionality implements IFunctionality{

    IData iData;
    public Functionality(IData iData){
        this.iData =iData;
    }
    @Override
    public double getBMI(String cpr) {
        return iData.getWeight(cpr) / Math.pow(iData.getHeight(cpr), 2);
    }

    @Override
    public String getTextualBMI(String cpr) {
        return String.valueOf(getBMI(cpr));
    }

    @Override
    public String getName(String cpr) {
        return iData.getName(cpr);
    }
}
