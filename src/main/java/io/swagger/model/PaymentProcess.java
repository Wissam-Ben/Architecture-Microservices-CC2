package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Buyer;
import io.swagger.model.CreditCard;
import io.swagger.model.Order;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentProcess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-31T12:37:02.602Z[GMT]")


public class PaymentProcess   {
  @JsonProperty("buyer")
  private Buyer buyer ;

  @JsonProperty("checkoutId")
  private String checkoutId ;

  @JsonProperty("creditCardInfo")
  private CreditCard creditCardInfo ;

  @JsonProperty("paymentOrder")
  @Valid
  private List<Order> paymentOrder ;

  public PaymentProcess buyer(Buyer buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * Get buyer
   * @return buyer
   **/
  @Schema(description = "")
  
    @Valid
    public Buyer getBuyer() {
    return buyer;
  }

  public void setBuyer(Buyer buyer) {
    this.buyer = buyer;
  }

  public PaymentProcess checkoutId(String checkoutId) {
    this.checkoutId = checkoutId;
    return this;
  }

  /**
   * Get checkoutId
   * @return checkoutId
   **/
  @Schema(description = "")
  
    public String getCheckoutId() {
    return checkoutId;
  }

  public void setCheckoutId(String checkoutId) {
    this.checkoutId = checkoutId;
  }

  public PaymentProcess creditCardInfo(CreditCard creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
    return this;
  }

  /**
   * Get creditCardInfo
   * @return creditCardInfo
   **/
  @Schema(description = "")
  
    @Valid
    public CreditCard getCreditCardInfo() {
    return creditCardInfo;
  }

  public void setCreditCardInfo(CreditCard creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
  }

  public PaymentProcess paymentOrder(List<Order> paymentOrder) {
    this.paymentOrder = paymentOrder;
    return this;
  }

  public PaymentProcess addPaymentOrderItem(Order paymentOrderItem) {
    if (this.paymentOrder == null) {
      this.paymentOrder = new ArrayList<Order>();
    }
    this.paymentOrder.add(paymentOrderItem);
    return this;
  }

  /**
   * Get paymentOrder
   * @return paymentOrder
   **/
  @Schema(description = "")
      @Valid
    public List<Order> getPaymentOrder() {
    return paymentOrder;
  }

  public void setPaymentOrder(List<Order> paymentOrder) {
    this.paymentOrder = paymentOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProcess paymentProcess = (PaymentProcess) o;
    return Objects.equals(this.buyer, paymentProcess.buyer) &&
        Objects.equals(this.checkoutId, paymentProcess.checkoutId) &&
        Objects.equals(this.creditCardInfo, paymentProcess.creditCardInfo) &&
        Objects.equals(this.paymentOrder, paymentProcess.paymentOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyer, checkoutId, creditCardInfo, paymentOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProcess {\n");
    
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    creditCardInfo: ").append(toIndentedString(creditCardInfo)).append("\n");
    sb.append("    paymentOrder: ").append(toIndentedString(paymentOrder)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
