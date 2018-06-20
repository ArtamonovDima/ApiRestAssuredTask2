package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClassForState extends PojoParent {

    @JsonProperty("TerminalKey")
    private String terminalKey;
    @JsonProperty("PaymentId")
    private String paymentId;
    @JsonProperty("Token")
    private String token;

    public ClassForState(){

    }

    public ClassForState(String terminalKey, String paymentId, String token){
        this.terminalKey=terminalKey;
        this.paymentId=paymentId;
        this.token=token;
    }

    public String getTerminalKey() {
        return terminalKey;
    }

    public void setTerminalKey(String terminalKey) {
        this.terminalKey = terminalKey;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "ClassForState{" +
                "terminalKey='" + terminalKey + '\'' +
                ", paymentId='" + paymentId + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
