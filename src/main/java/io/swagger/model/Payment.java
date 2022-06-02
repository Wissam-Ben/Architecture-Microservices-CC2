package io.swagger.model;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Buyer;
import io.swagger.model.Order;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-31T12:37:02.602Z[GMT]")


public class Payment implements Serializable {
  @JsonProperty("id")
  private String id ;

  @JsonProperty("buyer")
  private Buyer buyer ;

  @JsonProperty("amount")
  private String amount ;

  @JsonProperty("seller_account")
  private String sellerAccount ;

  @JsonProperty("currency")
  private String currency ;

  @JsonProperty("orders")
  @Valid
  private List<Order> orders ;

  public Payment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Payment buyer(Buyer buyer) {
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

  public Payment amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(description = "")
  
    public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Payment sellerAccount(String sellerAccount) {
    this.sellerAccount = sellerAccount;
    return this;
  }

  /**
   * Get sellerAccount
   * @return sellerAccount
   **/
  @Schema(description = "")
  
    public String getSellerAccount() {
    return sellerAccount;
  }

  public void setSellerAccount(String sellerAccount) {
    this.sellerAccount = sellerAccount;
  }

  public Payment currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   **/
  @Schema(description = "")
  
    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Payment orders(List<Order> orders) {
    this.orders = orders;
    return this;
  }

  public Payment addOrdersItem(Order ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<Order>();
    }
    this.orders.add(ordersItem);
    return this;
  }

  /**
   * Get orders
   * @return orders
   **/
  @Schema(description = "")
      @Valid
    public List<Order> getOrders() {
    return orders;
  }

  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.id, payment.id) &&
        Objects.equals(this.buyer, payment.buyer) &&
        Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.sellerAccount, payment.sellerAccount) &&
        Objects.equals(this.currency, payment.currency) &&
        Objects.equals(this.orders, payment.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, buyer, amount, sellerAccount, currency, orders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    sellerAccount: ").append(toIndentedString(sellerAccount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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
