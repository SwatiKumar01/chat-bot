
package com.bhawna.va.dto.orderPojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Actions", "AlternateOrderId", "ArchiveDate", "BalanceDue", "BusinessDate", "CalculatedValues",
        "CancelComments", "CancelLineCount", "CancelReason", "CancelledOrderSubTotal", "CancelledOrderTotal",
        "CancelledTotalDiscounts", "CapturedDate", "CollectedAmount", "ConfirmedDate", "CountedDate", "CreatedBy",
        "CreatedTimestamp", "CurrencyCode", "CustomerEmail", "CustomerFirstName", "CustomerId", "CustomerLastName",
        "CustomerPhone", "CustomerTypeId", "DoNotReleaseBefore", "DocType", "EventSubmitTime", "Extended",
        "FulfillmentStatus", "IsArchiveInProgress", "IsCancelled", "IsConfirmed", "IsOnHold", "IsOrderCountable",
        "IsPostVoided", "IsReadyForTender", "IsTaxExempt", "IsTaxOverridden", "MaxAppeasementAmount",
        "MaxFulfillmentStatus", "MaxFulfillmentStatusId", "MaxReturnStatus", "MaxReturnStatusId",
        "MerchReturnLineCount", "MerchSaleLineCount", "MinFulfillmentStatus", "MinFulfillmentStatusId",
        "MinReturnStatus", "MinReturnStatusId", "NextEventTime", "OrderActions", "OrderAttribute", "OrderExtension2",
        "OrderHold", "OrderId", "OrderLine", "OrderLineCount", "OrderNote", "OrderPromotionRequest", "OrderSubTotal",
        "OrderTaxDetail", "OrderTotal", "OrderType", "OrgId", "PK", "PackageCount", "ParentReservationRequestId",
        "PostVoidReason", "Priority", "ProcessInfo", "ProcessReturnComments", "ProcessReturnReason", "PublishStatus",
        "RefundPaymentMethod", "RefundRecipient", "Release", "ReturnLabel", "ReturnLabelEmail", "ReturnLineCount",
        "ReturnStatus", "ReturnTotalWithoutFees", "ReturnTrackingDetail", "SellingChannel", "SellingLocationId",
        "StoreReturnCount", "StoreSaleCount", "SuspendedOrderId", "TaxExemptComments", "TaxExemptId", "TaxExemptReason",
        "TaxOverrideReason", "TaxOverrideType", "TaxOverrideValue", "TotalCharges", "TotalDiscounts", "TotalReturnFees",
        "TotalTaxes", "TrackingInfo", "TransactionReference", "Translations", "UpdatedBy", "UpdatedTimestamp",
        "entityName", "messages" })
public class OrderDTO implements Serializable
{

    @JsonProperty("Actions")
    private Actions actions;

    @JsonProperty("AlternateOrderId")
    private String alternateOrderId;

    @JsonProperty("ArchiveDate")
    private String archiveDate;

    @JsonProperty("BalanceDue")
    private Integer balanceDue;

    @JsonProperty("BusinessDate")
    private String businessDate;

    @JsonProperty("CalculatedValues")
    private CalculatedValues calculatedValues;

    @JsonProperty("CancelComments")
    private String cancelComments;

    @JsonProperty("CancelLineCount")
    private Integer cancelLineCount;

    @JsonProperty("CancelReason")
    private CancelReason cancelReason;

    @JsonProperty("CancelledOrderSubTotal")
    private Integer cancelledOrderSubTotal;

    @JsonProperty("CancelledOrderTotal")
    private Integer cancelledOrderTotal;

    @JsonProperty("CancelledTotalDiscounts")
    private Integer cancelledTotalDiscounts;

    @JsonProperty("CapturedDate")
    private String capturedDate;

    @JsonProperty("CollectedAmount")
    private Integer collectedAmount;

    @JsonProperty("ConfirmedDate")
    private String confirmedDate;

    @JsonProperty("CountedDate")
    private String countedDate;

    @JsonProperty("CreatedBy")
    private String createdBy;

    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;

    @JsonProperty("CurrencyCode")
    private String currencyCode;

    @JsonProperty("CustomerEmail")
    private String customerEmail;

    @JsonProperty("CustomerFirstName")
    private String customerFirstName;

    @JsonProperty("CustomerId")
    private String customerId;

    @JsonProperty("CustomerLastName")
    private String customerLastName;

    @JsonProperty("CustomerPhone")
    private String customerPhone;

    @JsonProperty("CustomerTypeId")
    private String customerTypeId;

    @JsonProperty("DoNotReleaseBefore")
    private String doNotReleaseBefore;

    @JsonProperty("DocType")
    private DocType docType;

    @JsonProperty("EventSubmitTime")
    private String eventSubmitTime;

    @JsonProperty("Extended")
    private Extended extended;

    @JsonProperty("FulfillmentStatus")
    private String fulfillmentStatus;

    @JsonProperty("IsArchiveInProgress")
    private Boolean isArchiveInProgress;

    @JsonProperty("IsCancelled")
    private Boolean isCancelled;

    @JsonProperty("IsConfirmed")
    private Boolean isConfirmed;

    @JsonProperty("IsOnHold")
    private Boolean isOnHold;

    @JsonProperty("IsOrderCountable")
    private Boolean isOrderCountable;

    @JsonProperty("IsPostVoided")
    private Boolean isPostVoided;

    @JsonProperty("IsReadyForTender")
    private Boolean isReadyForTender;

    @JsonProperty("IsTaxExempt")
    private Boolean isTaxExempt;

    @JsonProperty("IsTaxOverridden")
    private Boolean isTaxOverridden;

    @JsonProperty("MaxAppeasementAmount")
    private Integer maxAppeasementAmount;

    @JsonProperty("MaxFulfillmentStatus")
    private MaxFulfillmentStatus maxFulfillmentStatus;

    @JsonProperty("MaxFulfillmentStatusId")
    private String maxFulfillmentStatusId;

    @JsonProperty("MaxReturnStatus")
    private MaxReturnStatus maxReturnStatus;

    @JsonProperty("MaxReturnStatusId")
    private String maxReturnStatusId;

    @JsonProperty("MerchReturnLineCount")
    private Integer merchReturnLineCount;

    @JsonProperty("MerchSaleLineCount")
    private Integer merchSaleLineCount;

    @JsonProperty("MinFulfillmentStatus")
    private MinFulfillmentStatus minFulfillmentStatus;

    @JsonProperty("MinFulfillmentStatusId")
    private String minFulfillmentStatusId;

    @JsonProperty("MinReturnStatus")
    private MinReturnStatus minReturnStatus;

    @JsonProperty("MinReturnStatusId")
    private String minReturnStatusId;

    @JsonProperty("NextEventTime")
    private String nextEventTime;

    @JsonProperty("OrderActions")
    private OrderActions orderActions;

    @JsonProperty("OrderAttribute")
    private List<OrderAttribute> orderAttribute = null;

    @JsonProperty("OrderExtension2")
    private List<OrderExtension2> orderExtension2 = null;

    @JsonProperty("OrderHold")
    private List<OrderHold> orderHold = null;

    @JsonProperty("OrderId")
    private String orderId;

    @JsonProperty("OrderLine")
    private List<OrderLine> orderLine = null;

    @JsonProperty("OrderLineCount")
    private Integer orderLineCount;

    @JsonProperty("OrderNote")
    private List<OrderNote> orderNote = null;

    @JsonProperty("OrderPromotionRequest")
    private List<OrderPromotionRequest> orderPromotionRequest = null;

    @JsonProperty("OrderSubTotal")
    private Integer orderSubTotal;

    @JsonProperty("OrderTaxDetail")
    private List<OrderTaxDetail> orderTaxDetail = null;

    @JsonProperty("OrderTotal")
    private Integer orderTotal;

    @JsonProperty("OrderType")
    private OrderType orderType;

    @JsonProperty("OrgId")
    private String orgId;

    @JsonProperty("PK")
    private String pK;

    @JsonProperty("PackageCount")
    private Integer packageCount;

    @JsonProperty("ParentReservationRequestId")
    private String parentReservationRequestId;

    @JsonProperty("PostVoidReason")
    private PostVoidReason postVoidReason;

    @JsonProperty("Priority")
    private Integer priority;

    @JsonProperty("ProcessInfo")
    private ProcessInfo processInfo;

    @JsonProperty("ProcessReturnComments")
    private String processReturnComments;

    @JsonProperty("ProcessReturnReason")
    private ProcessReturnReason processReturnReason;

    @JsonProperty("PublishStatus")
    private PublishStatus publishStatus;

    @JsonProperty("RefundPaymentMethod")
    private RefundPaymentMethod refundPaymentMethod;

    @JsonProperty("RefundRecipient")
    private RefundRecipient refundRecipient;

    @JsonProperty("Release")
    private List<Release> release = null;

    @JsonProperty("ReturnLabel")
    private List<ReturnLabel> returnLabel = null;

    @JsonProperty("ReturnLabelEmail")
    private String returnLabelEmail;

    @JsonProperty("ReturnLineCount")
    private Integer returnLineCount;

    @JsonProperty("ReturnStatus")
    private String returnStatus;

    @JsonProperty("ReturnTotalWithoutFees")
    private Integer returnTotalWithoutFees;

    @JsonProperty("ReturnTrackingDetail")
    private List<ReturnTrackingDetail> returnTrackingDetail = null;

    @JsonProperty("SellingChannel")
    private SellingChannel sellingChannel;

    @JsonProperty("SellingLocationId")
    private String sellingLocationId;

    @JsonProperty("StoreReturnCount")
    private Integer storeReturnCount;

    @JsonProperty("StoreSaleCount")
    private Integer storeSaleCount;

    @JsonProperty("SuspendedOrderId")
    private String suspendedOrderId;

    @JsonProperty("TaxExemptComments")
    private String taxExemptComments;

    @JsonProperty("TaxExemptId")
    private String taxExemptId;

    @JsonProperty("TaxExemptReason")
    private TaxExemptReason taxExemptReason;

    @JsonProperty("TaxOverrideReason")
    private TaxOverrideReason_ taxOverrideReason;

    @JsonProperty("TaxOverrideType")
    private TaxOverrideType_ taxOverrideType;

    @JsonProperty("TaxOverrideValue")
    private Integer taxOverrideValue;

    @JsonProperty("TotalCharges")
    private Integer totalCharges;

    @JsonProperty("TotalDiscounts")
    private Integer totalDiscounts;

    @JsonProperty("TotalReturnFees")
    private Integer totalReturnFees;

    @JsonProperty("TotalTaxes")
    private Integer totalTaxes;

    @JsonProperty("TrackingInfo")
    private List<TrackingInfo> trackingInfo = null;

    @JsonProperty("TransactionReference")
    private List<TransactionReference> transactionReference = null;

    @JsonProperty("Translations")
    private Translations______________________________________ translations;

    @JsonProperty("UpdatedBy")
    private String updatedBy;

    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;

    @JsonProperty("entityName")
    private String entityName;

    @JsonProperty("messages")
    private Messages_____________________________________ messages;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    private final static long serialVersionUID = -582405930091701511L;

    @JsonProperty("Actions")
    public Actions getActions()
    {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions actions)
    {
        this.actions = actions;
    }

    @JsonProperty("AlternateOrderId")
    public String getAlternateOrderId()
    {
        return alternateOrderId;
    }

    @JsonProperty("AlternateOrderId")
    public void setAlternateOrderId(String alternateOrderId)
    {
        this.alternateOrderId = alternateOrderId;
    }

    @JsonProperty("ArchiveDate")
    public String getArchiveDate()
    {
        return archiveDate;
    }

    @JsonProperty("ArchiveDate")
    public void setArchiveDate(String archiveDate)
    {
        this.archiveDate = archiveDate;
    }

    @JsonProperty("BalanceDue")
    public Integer getBalanceDue()
    {
        return balanceDue;
    }

    @JsonProperty("BalanceDue")
    public void setBalanceDue(Integer balanceDue)
    {
        this.balanceDue = balanceDue;
    }

    @JsonProperty("BusinessDate")
    public String getBusinessDate()
    {
        return businessDate;
    }

    @JsonProperty("BusinessDate")
    public void setBusinessDate(String businessDate)
    {
        this.businessDate = businessDate;
    }

    @JsonProperty("CalculatedValues")
    public CalculatedValues getCalculatedValues()
    {
        return calculatedValues;
    }

    @JsonProperty("CalculatedValues")
    public void setCalculatedValues(CalculatedValues calculatedValues)
    {
        this.calculatedValues = calculatedValues;
    }

    @JsonProperty("CancelComments")
    public String getCancelComments()
    {
        return cancelComments;
    }

    @JsonProperty("CancelComments")
    public void setCancelComments(String cancelComments)
    {
        this.cancelComments = cancelComments;
    }

    @JsonProperty("CancelLineCount")
    public Integer getCancelLineCount()
    {
        return cancelLineCount;
    }

    @JsonProperty("CancelLineCount")
    public void setCancelLineCount(Integer cancelLineCount)
    {
        this.cancelLineCount = cancelLineCount;
    }

    @JsonProperty("CancelReason")
    public CancelReason getCancelReason()
    {
        return cancelReason;
    }

    @JsonProperty("CancelReason")
    public void setCancelReason(CancelReason cancelReason)
    {
        this.cancelReason = cancelReason;
    }

    @JsonProperty("CancelledOrderSubTotal")
    public Integer getCancelledOrderSubTotal()
    {
        return cancelledOrderSubTotal;
    }

    @JsonProperty("CancelledOrderSubTotal")
    public void setCancelledOrderSubTotal(Integer cancelledOrderSubTotal)
    {
        this.cancelledOrderSubTotal = cancelledOrderSubTotal;
    }

    @JsonProperty("CancelledOrderTotal")
    public Integer getCancelledOrderTotal()
    {
        return cancelledOrderTotal;
    }

    @JsonProperty("CancelledOrderTotal")
    public void setCancelledOrderTotal(Integer cancelledOrderTotal)
    {
        this.cancelledOrderTotal = cancelledOrderTotal;
    }

    @JsonProperty("CancelledTotalDiscounts")
    public Integer getCancelledTotalDiscounts()
    {
        return cancelledTotalDiscounts;
    }

    @JsonProperty("CancelledTotalDiscounts")
    public void setCancelledTotalDiscounts(Integer cancelledTotalDiscounts)
    {
        this.cancelledTotalDiscounts = cancelledTotalDiscounts;
    }

    @JsonProperty("CapturedDate")
    public String getCapturedDate()
    {
        return capturedDate;
    }

    @JsonProperty("CapturedDate")
    public void setCapturedDate(String capturedDate)
    {
        this.capturedDate = capturedDate;
    }

    @JsonProperty("CollectedAmount")
    public Integer getCollectedAmount()
    {
        return collectedAmount;
    }

    @JsonProperty("CollectedAmount")
    public void setCollectedAmount(Integer collectedAmount)
    {
        this.collectedAmount = collectedAmount;
    }

    @JsonProperty("ConfirmedDate")
    public String getConfirmedDate()
    {
        return confirmedDate;
    }

    @JsonProperty("ConfirmedDate")
    public void setConfirmedDate(String confirmedDate)
    {
        this.confirmedDate = confirmedDate;
    }

    @JsonProperty("CountedDate")
    public String getCountedDate()
    {
        return countedDate;
    }

    @JsonProperty("CountedDate")
    public void setCountedDate(String countedDate)
    {
        this.countedDate = countedDate;
    }

    @JsonProperty("CreatedBy")
    public String getCreatedBy()
    {
        return createdBy;
    }

    @JsonProperty("CreatedBy")
    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    @JsonProperty("CreatedTimestamp")
    public String getCreatedTimestamp()
    {
        return createdTimestamp;
    }

    @JsonProperty("CreatedTimestamp")
    public void setCreatedTimestamp(String createdTimestamp)
    {
        this.createdTimestamp = createdTimestamp;
    }

    @JsonProperty("CurrencyCode")
    public String getCurrencyCode()
    {
        return currencyCode;
    }

    @JsonProperty("CurrencyCode")
    public void setCurrencyCode(String currencyCode)
    {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("CustomerEmail")
    public String getCustomerEmail()
    {
        return customerEmail;
    }

    @JsonProperty("CustomerEmail")
    public void setCustomerEmail(String customerEmail)
    {
        this.customerEmail = customerEmail;
    }

    @JsonProperty("CustomerFirstName")
    public String getCustomerFirstName()
    {
        return customerFirstName;
    }

    @JsonProperty("CustomerFirstName")
    public void setCustomerFirstName(String customerFirstName)
    {
        this.customerFirstName = customerFirstName;
    }

    @JsonProperty("CustomerId")
    public String getCustomerId()
    {
        return customerId;
    }

    @JsonProperty("CustomerId")
    public void setCustomerId(String customerId)
    {
        this.customerId = customerId;
    }

    @JsonProperty("CustomerLastName")
    public String getCustomerLastName()
    {
        return customerLastName;
    }

    @JsonProperty("CustomerLastName")
    public void setCustomerLastName(String customerLastName)
    {
        this.customerLastName = customerLastName;
    }

    @JsonProperty("CustomerPhone")
    public String getCustomerPhone()
    {
        return customerPhone;
    }

    @JsonProperty("CustomerPhone")
    public void setCustomerPhone(String customerPhone)
    {
        this.customerPhone = customerPhone;
    }

    @JsonProperty("CustomerTypeId")
    public String getCustomerTypeId()
    {
        return customerTypeId;
    }

    @JsonProperty("CustomerTypeId")
    public void setCustomerTypeId(String customerTypeId)
    {
        this.customerTypeId = customerTypeId;
    }

    @JsonProperty("DoNotReleaseBefore")
    public String getDoNotReleaseBefore()
    {
        return doNotReleaseBefore;
    }

    @JsonProperty("DoNotReleaseBefore")
    public void setDoNotReleaseBefore(String doNotReleaseBefore)
    {
        this.doNotReleaseBefore = doNotReleaseBefore;
    }

    @JsonProperty("DocType")
    public DocType getDocType()
    {
        return docType;
    }

    @JsonProperty("DocType")
    public void setDocType(DocType docType)
    {
        this.docType = docType;
    }

    @JsonProperty("EventSubmitTime")
    public String getEventSubmitTime()
    {
        return eventSubmitTime;
    }

    @JsonProperty("EventSubmitTime")
    public void setEventSubmitTime(String eventSubmitTime)
    {
        this.eventSubmitTime = eventSubmitTime;
    }

    @JsonProperty("Extended")
    public Extended getExtended()
    {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended extended)
    {
        this.extended = extended;
    }

    @JsonProperty("FulfillmentStatus")
    public String getFulfillmentStatus()
    {
        return fulfillmentStatus;
    }

    @JsonProperty("FulfillmentStatus")
    public void setFulfillmentStatus(String fulfillmentStatus)
    {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    @JsonProperty("IsArchiveInProgress")
    public Boolean getIsArchiveInProgress()
    {
        return isArchiveInProgress;
    }

    @JsonProperty("IsArchiveInProgress")
    public void setIsArchiveInProgress(Boolean isArchiveInProgress)
    {
        this.isArchiveInProgress = isArchiveInProgress;
    }

    @JsonProperty("IsCancelled")
    public Boolean getIsCancelled()
    {
        return isCancelled;
    }

    @JsonProperty("IsCancelled")
    public void setIsCancelled(Boolean isCancelled)
    {
        this.isCancelled = isCancelled;
    }

    @JsonProperty("IsConfirmed")
    public Boolean getIsConfirmed()
    {
        return isConfirmed;
    }

    @JsonProperty("IsConfirmed")
    public void setIsConfirmed(Boolean isConfirmed)
    {
        this.isConfirmed = isConfirmed;
    }

    @JsonProperty("IsOnHold")
    public Boolean getIsOnHold()
    {
        return isOnHold;
    }

    @JsonProperty("IsOnHold")
    public void setIsOnHold(Boolean isOnHold)
    {
        this.isOnHold = isOnHold;
    }

    @JsonProperty("IsOrderCountable")
    public Boolean getIsOrderCountable()
    {
        return isOrderCountable;
    }

    @JsonProperty("IsOrderCountable")
    public void setIsOrderCountable(Boolean isOrderCountable)
    {
        this.isOrderCountable = isOrderCountable;
    }

    @JsonProperty("IsPostVoided")
    public Boolean getIsPostVoided()
    {
        return isPostVoided;
    }

    @JsonProperty("IsPostVoided")
    public void setIsPostVoided(Boolean isPostVoided)
    {
        this.isPostVoided = isPostVoided;
    }

    @JsonProperty("IsReadyForTender")
    public Boolean getIsReadyForTender()
    {
        return isReadyForTender;
    }

    @JsonProperty("IsReadyForTender")
    public void setIsReadyForTender(Boolean isReadyForTender)
    {
        this.isReadyForTender = isReadyForTender;
    }

    @JsonProperty("IsTaxExempt")
    public Boolean getIsTaxExempt()
    {
        return isTaxExempt;
    }

    @JsonProperty("IsTaxExempt")
    public void setIsTaxExempt(Boolean isTaxExempt)
    {
        this.isTaxExempt = isTaxExempt;
    }

    @JsonProperty("IsTaxOverridden")
    public Boolean getIsTaxOverridden()
    {
        return isTaxOverridden;
    }

    @JsonProperty("IsTaxOverridden")
    public void setIsTaxOverridden(Boolean isTaxOverridden)
    {
        this.isTaxOverridden = isTaxOverridden;
    }

    @JsonProperty("MaxAppeasementAmount")
    public Integer getMaxAppeasementAmount()
    {
        return maxAppeasementAmount;
    }

    @JsonProperty("MaxAppeasementAmount")
    public void setMaxAppeasementAmount(Integer maxAppeasementAmount)
    {
        this.maxAppeasementAmount = maxAppeasementAmount;
    }

    @JsonProperty("MaxFulfillmentStatus")
    public MaxFulfillmentStatus getMaxFulfillmentStatus()
    {
        return maxFulfillmentStatus;
    }

    @JsonProperty("MaxFulfillmentStatus")
    public void setMaxFulfillmentStatus(MaxFulfillmentStatus maxFulfillmentStatus)
    {
        this.maxFulfillmentStatus = maxFulfillmentStatus;
    }

    @JsonProperty("MaxFulfillmentStatusId")
    public String getMaxFulfillmentStatusId()
    {
        return maxFulfillmentStatusId;
    }

    @JsonProperty("MaxFulfillmentStatusId")
    public void setMaxFulfillmentStatusId(String maxFulfillmentStatusId)
    {
        this.maxFulfillmentStatusId = maxFulfillmentStatusId;
    }

    @JsonProperty("MaxReturnStatus")
    public MaxReturnStatus getMaxReturnStatus()
    {
        return maxReturnStatus;
    }

    @JsonProperty("MaxReturnStatus")
    public void setMaxReturnStatus(MaxReturnStatus maxReturnStatus)
    {
        this.maxReturnStatus = maxReturnStatus;
    }

    @JsonProperty("MaxReturnStatusId")
    public String getMaxReturnStatusId()
    {
        return maxReturnStatusId;
    }

    @JsonProperty("MaxReturnStatusId")
    public void setMaxReturnStatusId(String maxReturnStatusId)
    {
        this.maxReturnStatusId = maxReturnStatusId;
    }

    @JsonProperty("MerchReturnLineCount")
    public Integer getMerchReturnLineCount()
    {
        return merchReturnLineCount;
    }

    @JsonProperty("MerchReturnLineCount")
    public void setMerchReturnLineCount(Integer merchReturnLineCount)
    {
        this.merchReturnLineCount = merchReturnLineCount;
    }

    @JsonProperty("MerchSaleLineCount")
    public Integer getMerchSaleLineCount()
    {
        return merchSaleLineCount;
    }

    @JsonProperty("MerchSaleLineCount")
    public void setMerchSaleLineCount(Integer merchSaleLineCount)
    {
        this.merchSaleLineCount = merchSaleLineCount;
    }

    @JsonProperty("MinFulfillmentStatus")
    public MinFulfillmentStatus getMinFulfillmentStatus()
    {
        return minFulfillmentStatus;
    }

    @JsonProperty("MinFulfillmentStatus")
    public void setMinFulfillmentStatus(MinFulfillmentStatus minFulfillmentStatus)
    {
        this.minFulfillmentStatus = minFulfillmentStatus;
    }

    @JsonProperty("MinFulfillmentStatusId")
    public String getMinFulfillmentStatusId()
    {
        return minFulfillmentStatusId;
    }

    @JsonProperty("MinFulfillmentStatusId")
    public void setMinFulfillmentStatusId(String minFulfillmentStatusId)
    {
        this.minFulfillmentStatusId = minFulfillmentStatusId;
    }

    @JsonProperty("MinReturnStatus")
    public MinReturnStatus getMinReturnStatus()
    {
        return minReturnStatus;
    }

    @JsonProperty("MinReturnStatus")
    public void setMinReturnStatus(MinReturnStatus minReturnStatus)
    {
        this.minReturnStatus = minReturnStatus;
    }

    @JsonProperty("MinReturnStatusId")
    public String getMinReturnStatusId()
    {
        return minReturnStatusId;
    }

    @JsonProperty("MinReturnStatusId")
    public void setMinReturnStatusId(String minReturnStatusId)
    {
        this.minReturnStatusId = minReturnStatusId;
    }

    @JsonProperty("NextEventTime")
    public String getNextEventTime()
    {
        return nextEventTime;
    }

    @JsonProperty("NextEventTime")
    public void setNextEventTime(String nextEventTime)
    {
        this.nextEventTime = nextEventTime;
    }

    @JsonProperty("OrderActions")
    public OrderActions getOrderActions()
    {
        return orderActions;
    }

    @JsonProperty("OrderActions")
    public void setOrderActions(OrderActions orderActions)
    {
        this.orderActions = orderActions;
    }

    @JsonProperty("OrderAttribute")
    public List<OrderAttribute> getOrderAttribute()
    {
        return orderAttribute;
    }

    @JsonProperty("OrderAttribute")
    public void setOrderAttribute(List<OrderAttribute> orderAttribute)
    {
        this.orderAttribute = orderAttribute;
    }

    @JsonProperty("OrderExtension2")
    public List<OrderExtension2> getOrderExtension2()
    {
        return orderExtension2;
    }

    @JsonProperty("OrderExtension2")
    public void setOrderExtension2(List<OrderExtension2> orderExtension2)
    {
        this.orderExtension2 = orderExtension2;
    }

    @JsonProperty("OrderHold")
    public List<OrderHold> getOrderHold()
    {
        return orderHold;
    }

    @JsonProperty("OrderHold")
    public void setOrderHold(List<OrderHold> orderHold)
    {
        this.orderHold = orderHold;
    }

    @JsonProperty("OrderId")
    public String getOrderId()
    {
        return orderId;
    }

    @JsonProperty("OrderId")
    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
    }

    @JsonProperty("OrderLine")
    public List<OrderLine> getOrderLine()
    {
        return orderLine;
    }

    @JsonProperty("OrderLine")
    public void setOrderLine(List<OrderLine> orderLine)
    {
        this.orderLine = orderLine;
    }

    @JsonProperty("OrderLineCount")
    public Integer getOrderLineCount()
    {
        return orderLineCount;
    }

    @JsonProperty("OrderLineCount")
    public void setOrderLineCount(Integer orderLineCount)
    {
        this.orderLineCount = orderLineCount;
    }

    @JsonProperty("OrderNote")
    public List<OrderNote> getOrderNote()
    {
        return orderNote;
    }

    @JsonProperty("OrderNote")
    public void setOrderNote(List<OrderNote> orderNote)
    {
        this.orderNote = orderNote;
    }

    @JsonProperty("OrderPromotionRequest")
    public List<OrderPromotionRequest> getOrderPromotionRequest()
    {
        return orderPromotionRequest;
    }

    @JsonProperty("OrderPromotionRequest")
    public void setOrderPromotionRequest(List<OrderPromotionRequest> orderPromotionRequest)
    {
        this.orderPromotionRequest = orderPromotionRequest;
    }

    @JsonProperty("OrderSubTotal")
    public Integer getOrderSubTotal()
    {
        return orderSubTotal;
    }

    @JsonProperty("OrderSubTotal")
    public void setOrderSubTotal(Integer orderSubTotal)
    {
        this.orderSubTotal = orderSubTotal;
    }

    @JsonProperty("OrderTaxDetail")
    public List<OrderTaxDetail> getOrderTaxDetail()
    {
        return orderTaxDetail;
    }

    @JsonProperty("OrderTaxDetail")
    public void setOrderTaxDetail(List<OrderTaxDetail> orderTaxDetail)
    {
        this.orderTaxDetail = orderTaxDetail;
    }

    @JsonProperty("OrderTotal")
    public Integer getOrderTotal()
    {
        return orderTotal;
    }

    @JsonProperty("OrderTotal")
    public void setOrderTotal(Integer orderTotal)
    {
        this.orderTotal = orderTotal;
    }

    @JsonProperty("OrderType")
    public OrderType getOrderType()
    {
        return orderType;
    }

    @JsonProperty("OrderType")
    public void setOrderType(OrderType orderType)
    {
        this.orderType = orderType;
    }

    @JsonProperty("OrgId")
    public String getOrgId()
    {
        return orgId;
    }

    @JsonProperty("OrgId")
    public void setOrgId(String orgId)
    {
        this.orgId = orgId;
    }

    @JsonProperty("PK")
    public String getPK()
    {
        return pK;
    }

    @JsonProperty("PK")
    public void setPK(String pK)
    {
        this.pK = pK;
    }

    @JsonProperty("PackageCount")
    public Integer getPackageCount()
    {
        return packageCount;
    }

    @JsonProperty("PackageCount")
    public void setPackageCount(Integer packageCount)
    {
        this.packageCount = packageCount;
    }

    @JsonProperty("ParentReservationRequestId")
    public String getParentReservationRequestId()
    {
        return parentReservationRequestId;
    }

    @JsonProperty("ParentReservationRequestId")
    public void setParentReservationRequestId(String parentReservationRequestId)
    {
        this.parentReservationRequestId = parentReservationRequestId;
    }

    @JsonProperty("PostVoidReason")
    public PostVoidReason getPostVoidReason()
    {
        return postVoidReason;
    }

    @JsonProperty("PostVoidReason")
    public void setPostVoidReason(PostVoidReason postVoidReason)
    {
        this.postVoidReason = postVoidReason;
    }

    @JsonProperty("Priority")
    public Integer getPriority()
    {
        return priority;
    }

    @JsonProperty("Priority")
    public void setPriority(Integer priority)
    {
        this.priority = priority;
    }

    @JsonProperty("ProcessInfo")
    public ProcessInfo getProcessInfo()
    {
        return processInfo;
    }

    @JsonProperty("ProcessInfo")
    public void setProcessInfo(ProcessInfo processInfo)
    {
        this.processInfo = processInfo;
    }

    @JsonProperty("ProcessReturnComments")
    public String getProcessReturnComments()
    {
        return processReturnComments;
    }

    @JsonProperty("ProcessReturnComments")
    public void setProcessReturnComments(String processReturnComments)
    {
        this.processReturnComments = processReturnComments;
    }

    @JsonProperty("ProcessReturnReason")
    public ProcessReturnReason getProcessReturnReason()
    {
        return processReturnReason;
    }

    @JsonProperty("ProcessReturnReason")
    public void setProcessReturnReason(ProcessReturnReason processReturnReason)
    {
        this.processReturnReason = processReturnReason;
    }

    @JsonProperty("PublishStatus")
    public PublishStatus getPublishStatus()
    {
        return publishStatus;
    }

    @JsonProperty("PublishStatus")
    public void setPublishStatus(PublishStatus publishStatus)
    {
        this.publishStatus = publishStatus;
    }

    @JsonProperty("RefundPaymentMethod")
    public RefundPaymentMethod getRefundPaymentMethod()
    {
        return refundPaymentMethod;
    }

    @JsonProperty("RefundPaymentMethod")
    public void setRefundPaymentMethod(RefundPaymentMethod refundPaymentMethod)
    {
        this.refundPaymentMethod = refundPaymentMethod;
    }

    @JsonProperty("RefundRecipient")
    public RefundRecipient getRefundRecipient()
    {
        return refundRecipient;
    }

    @JsonProperty("RefundRecipient")
    public void setRefundRecipient(RefundRecipient refundRecipient)
    {
        this.refundRecipient = refundRecipient;
    }

    @JsonProperty("Release")
    public List<Release> getRelease()
    {
        return release;
    }

    @JsonProperty("Release")
    public void setRelease(List<Release> release)
    {
        this.release = release;
    }

    @JsonProperty("ReturnLabel")
    public List<ReturnLabel> getReturnLabel()
    {
        return returnLabel;
    }

    @JsonProperty("ReturnLabel")
    public void setReturnLabel(List<ReturnLabel> returnLabel)
    {
        this.returnLabel = returnLabel;
    }

    @JsonProperty("ReturnLabelEmail")
    public String getReturnLabelEmail()
    {
        return returnLabelEmail;
    }

    @JsonProperty("ReturnLabelEmail")
    public void setReturnLabelEmail(String returnLabelEmail)
    {
        this.returnLabelEmail = returnLabelEmail;
    }

    @JsonProperty("ReturnLineCount")
    public Integer getReturnLineCount()
    {
        return returnLineCount;
    }

    @JsonProperty("ReturnLineCount")
    public void setReturnLineCount(Integer returnLineCount)
    {
        this.returnLineCount = returnLineCount;
    }

    @JsonProperty("ReturnStatus")
    public String getReturnStatus()
    {
        return returnStatus;
    }

    @JsonProperty("ReturnStatus")
    public void setReturnStatus(String returnStatus)
    {
        this.returnStatus = returnStatus;
    }

    @JsonProperty("ReturnTotalWithoutFees")
    public Integer getReturnTotalWithoutFees()
    {
        return returnTotalWithoutFees;
    }

    @JsonProperty("ReturnTotalWithoutFees")
    public void setReturnTotalWithoutFees(Integer returnTotalWithoutFees)
    {
        this.returnTotalWithoutFees = returnTotalWithoutFees;
    }

    @JsonProperty("ReturnTrackingDetail")
    public List<ReturnTrackingDetail> getReturnTrackingDetail()
    {
        return returnTrackingDetail;
    }

    @JsonProperty("ReturnTrackingDetail")
    public void setReturnTrackingDetail(List<ReturnTrackingDetail> returnTrackingDetail)
    {
        this.returnTrackingDetail = returnTrackingDetail;
    }

    @JsonProperty("SellingChannel")
    public SellingChannel getSellingChannel()
    {
        return sellingChannel;
    }

    @JsonProperty("SellingChannel")
    public void setSellingChannel(SellingChannel sellingChannel)
    {
        this.sellingChannel = sellingChannel;
    }

    @JsonProperty("SellingLocationId")
    public String getSellingLocationId()
    {
        return sellingLocationId;
    }

    @JsonProperty("SellingLocationId")
    public void setSellingLocationId(String sellingLocationId)
    {
        this.sellingLocationId = sellingLocationId;
    }

    @JsonProperty("StoreReturnCount")
    public Integer getStoreReturnCount()
    {
        return storeReturnCount;
    }

    @JsonProperty("StoreReturnCount")
    public void setStoreReturnCount(Integer storeReturnCount)
    {
        this.storeReturnCount = storeReturnCount;
    }

    @JsonProperty("StoreSaleCount")
    public Integer getStoreSaleCount()
    {
        return storeSaleCount;
    }

    @JsonProperty("StoreSaleCount")
    public void setStoreSaleCount(Integer storeSaleCount)
    {
        this.storeSaleCount = storeSaleCount;
    }

    @JsonProperty("SuspendedOrderId")
    public String getSuspendedOrderId()
    {
        return suspendedOrderId;
    }

    @JsonProperty("SuspendedOrderId")
    public void setSuspendedOrderId(String suspendedOrderId)
    {
        this.suspendedOrderId = suspendedOrderId;
    }

    @JsonProperty("TaxExemptComments")
    public String getTaxExemptComments()
    {
        return taxExemptComments;
    }

    @JsonProperty("TaxExemptComments")
    public void setTaxExemptComments(String taxExemptComments)
    {
        this.taxExemptComments = taxExemptComments;
    }

    @JsonProperty("TaxExemptId")
    public String getTaxExemptId()
    {
        return taxExemptId;
    }

    @JsonProperty("TaxExemptId")
    public void setTaxExemptId(String taxExemptId)
    {
        this.taxExemptId = taxExemptId;
    }

    @JsonProperty("TaxExemptReason")
    public TaxExemptReason getTaxExemptReason()
    {
        return taxExemptReason;
    }

    @JsonProperty("TaxExemptReason")
    public void setTaxExemptReason(TaxExemptReason taxExemptReason)
    {
        this.taxExemptReason = taxExemptReason;
    }

    @JsonProperty("TaxOverrideReason")
    public TaxOverrideReason_ getTaxOverrideReason()
    {
        return taxOverrideReason;
    }

    @JsonProperty("TaxOverrideReason")
    public void setTaxOverrideReason(TaxOverrideReason_ taxOverrideReason)
    {
        this.taxOverrideReason = taxOverrideReason;
    }

    @JsonProperty("TaxOverrideType")
    public TaxOverrideType_ getTaxOverrideType()
    {
        return taxOverrideType;
    }

    @JsonProperty("TaxOverrideType")
    public void setTaxOverrideType(TaxOverrideType_ taxOverrideType)
    {
        this.taxOverrideType = taxOverrideType;
    }

    @JsonProperty("TaxOverrideValue")
    public Integer getTaxOverrideValue()
    {
        return taxOverrideValue;
    }

    @JsonProperty("TaxOverrideValue")
    public void setTaxOverrideValue(Integer taxOverrideValue)
    {
        this.taxOverrideValue = taxOverrideValue;
    }

    @JsonProperty("TotalCharges")
    public Integer getTotalCharges()
    {
        return totalCharges;
    }

    @JsonProperty("TotalCharges")
    public void setTotalCharges(Integer totalCharges)
    {
        this.totalCharges = totalCharges;
    }

    @JsonProperty("TotalDiscounts")
    public Integer getTotalDiscounts()
    {
        return totalDiscounts;
    }

    @JsonProperty("TotalDiscounts")
    public void setTotalDiscounts(Integer totalDiscounts)
    {
        this.totalDiscounts = totalDiscounts;
    }

    @JsonProperty("TotalReturnFees")
    public Integer getTotalReturnFees()
    {
        return totalReturnFees;
    }

    @JsonProperty("TotalReturnFees")
    public void setTotalReturnFees(Integer totalReturnFees)
    {
        this.totalReturnFees = totalReturnFees;
    }

    @JsonProperty("TotalTaxes")
    public Integer getTotalTaxes()
    {
        return totalTaxes;
    }

    @JsonProperty("TotalTaxes")
    public void setTotalTaxes(Integer totalTaxes)
    {
        this.totalTaxes = totalTaxes;
    }

    @JsonProperty("TrackingInfo")
    public List<TrackingInfo> getTrackingInfo()
    {
        return trackingInfo;
    }

    @JsonProperty("TrackingInfo")
    public void setTrackingInfo(List<TrackingInfo> trackingInfo)
    {
        this.trackingInfo = trackingInfo;
    }

    @JsonProperty("TransactionReference")
    public List<TransactionReference> getTransactionReference()
    {
        return transactionReference;
    }

    @JsonProperty("TransactionReference")
    public void setTransactionReference(List<TransactionReference> transactionReference)
    {
        this.transactionReference = transactionReference;
    }

    @JsonProperty("Translations")
    public Translations______________________________________ getTranslations()
    {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations______________________________________ translations)
    {
        this.translations = translations;
    }

    @JsonProperty("UpdatedBy")
    public String getUpdatedBy()
    {
        return updatedBy;
    }

    @JsonProperty("UpdatedBy")
    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    @JsonProperty("UpdatedTimestamp")
    public String getUpdatedTimestamp()
    {
        return updatedTimestamp;
    }

    @JsonProperty("UpdatedTimestamp")
    public void setUpdatedTimestamp(String updatedTimestamp)
    {
        this.updatedTimestamp = updatedTimestamp;
    }

    @JsonProperty("entityName")
    public String getEntityName()
    {
        return entityName;
    }

    @JsonProperty("entityName")
    public void setEntityName(String entityName)
    {
        this.entityName = entityName;
    }

    @JsonProperty("messages")
    public Messages_____________________________________ getMessages()
    {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages_____________________________________ messages)
    {
        this.messages = messages;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties()
    {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value)
    {
        this.additionalProperties.put(name, value);
    }

}
