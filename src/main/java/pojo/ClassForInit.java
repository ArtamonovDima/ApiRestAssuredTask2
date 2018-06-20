package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClassForInit extends PojoParent{

    @JsonProperty("TerminalKey")
    private String terminalKey;
    @JsonProperty("Amount")
    private String amount;
    @JsonProperty("OrderId")
    private String orderId;

    public ClassForInit(){

    }

    public ClassForInit(String terminalKey, String amount, String orderId){
        this.terminalKey=terminalKey;
        this.amount=amount;
        this.orderId=orderId;
    }

    public String getTerminalKey() {
        return terminalKey;
    }

    public void setTerminalKey(String terminalKey) {
        this.terminalKey = terminalKey;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "ClassForInitMethod{" +
                "terminalKey='" + terminalKey + '\'' +
                ", amount='" + amount + '\'' +
                ", orderId='" + orderId + '\'' +
                '}';
    }
}
