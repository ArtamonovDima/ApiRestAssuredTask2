package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClassForAuthorize extends PojoParent {

    @JsonProperty("TerminalKey")
    private String terminalKey;
    @JsonProperty("PaymentId")
    private String paymentId;
    @JsonProperty("CardData")
    private String cardData;

    public ClassForAuthorize(){

    }

    public ClassForAuthorize(String terminalKey, String paymentId, String cardData){
        this.terminalKey=terminalKey;
        this.paymentId=paymentId;
        this.cardData=cardData;
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
        return cardData;
    }

    public void setToken(String token) {
        this.cardData = token;
    }

    @Override
    public String toString() {
        return "ClassForAuthorize{" +
                "terminalKey='" + terminalKey + '\'' +
                ", paymentId='" + paymentId + '\'' +
                ", token='" + cardData + '\'' +
                '}';
    }
}
