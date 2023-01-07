
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
@JsonPropertyOrder({
    "Actions",
    "AddressId",
    "Allocation",
    "AlternateOrderLineId",
    "BusinessDate",
    "CalculatedValues",
    "CancelComments",
    "CancelReason",
    "CancelledOrderLineSubTotal",
    "CancelledTotalDiscounts",
    "CarrierCode",
    "CreatedBy",
    "CreatedTimestamp",
    "DeliveryMethod",
    "DoNotShipBeforeDate",
    "EffectiveRank",
    "Extended",
    "FulfillmentDetail",
    "FulfillmentGroupId",
    "FulfillmentStatus",
    "GiftCardValue",
    "IsActivationRequired",
    "IsCancelled",
    "IsEligibleForOverride",
    "IsEvenExchange",
    "IsExchangeable",
    "IsGift",
    "IsGiftCard",
    "IsHazmat",
    "IsItemNotOnFile",
    "IsItemTaxExemptable",
    "IsItemTaxOverridable",
    "IsNonMerchandise",
    "IsOnHold",
    "IsPackAndHold",
    "IsPerishable",
    "IsPreOrder",
    "IsPreSale",
    "IsPriceOverridden",
    "IsReceiptExpected",
    "IsReturn",
    "IsReturnAllowedByAgePolicy",
    "IsReturnable",
    "IsReturnableAtStore",
    "IsTaxIncluded",
    "IsTaxOverridden",
    "ItemBarcode",
    "ItemBrand",
    "ItemColorDescription",
    "ItemDepartmentName",
    "ItemDepartmentNumber",
    "ItemDescription",
    "ItemId",
    "ItemMaxDiscountAmount",
    "ItemMaxDiscountPercentage",
    "ItemSeason",
    "ItemShortDescription",
    "ItemSize",
    "ItemStyle",
    "ItemTaxCode",
    "LatestDeliveryDate",
    "LatestFulfilledDate",
    "LineProcessInfo",
    "LineType",
    "MaxAppeasementAmount",
    "MaxFulfillmentStatus",
    "MaxFulfillmentStatusId",
    "MinFulfillmentStatus",
    "MinFulfillmentStatusId",
    "OrderId",
    "OrderLineAdditional",
    "OrderLineAttribute",
    "OrderLineCancelHistory",
    "OrderLineChargeDetail",
    "OrderLineExtension1",
    "OrderLineExtension2",
    "OrderLineHold",
    "OrderLineId",
    "OrderLineNote",
    "OrderLinePickupDetail",
    "OrderLinePriceOverrideHistory",
    "OrderLinePromisingInfo",
    "OrderLinePromotionRequest",
    "OrderLineSalesAssociate",
    "OrderLineSubTotal",
    "OrderLineTagDetail",
    "OrderLineTaxDetail",
    "OrderLineTotal",
    "OrderLineVASInstructions",
    "OrgId",
    "OriginalUnitPrice",
    "PK",
    "ParentLineCreatedTimestamp",
    "ParentOrderId",
    "ParentOrderLineId",
    "ParentOrderLineType",
    "PaymentGroupId",
    "PhysicalOriginId",
    "PipelineId",
    "Priority",
    "ProductClass",
    "PromisedDeliveryDate",
    "PromisedShipDate",
    "Quantity",
    "QuantityDetail",
    "RefundPrice",
    "RequestedDeliveryDate",
    "ReturnDetail",
    "ReturnLineTotalWithoutFees",
    "ReturnType",
    "ReturnableLineTotal",
    "ReturnableQuantity",
    "SellingLocationId",
    "ServiceLevelCode",
    "ShipFromAddress",
    "ShipFromAddressId",
    "ShipToAddress",
    "ShipToLocationId",
    "ShippingMethodId",
    "SmallImageURI",
    "StoreSaleEntryMethod",
    "StreetDate",
    "TaxOverrideType",
    "TaxOverrideValue",
    "TaxableAmount",
    "TotalCharges",
    "TotalDiscountOnItem",
    "TotalDiscounts",
    "TotalTaxes",
    "TransactionReferenceId",
    "Translations",
    "UOM",
    "UnitPrice",
    "UpdatedBy",
    "UpdatedTimestamp",
    "VolumetricWeight",
    "VolumetricWeightUOM",
    "entityName",
    "messages"
})
public class OrderLine implements Serializable
{

    @JsonProperty("Actions")
    private Actions____ actions;
    @JsonProperty("AddressId")
    private String addressId;
    @JsonProperty("Allocation")
    private List<Allocation> allocation = null;
    @JsonProperty("AlternateOrderLineId")
    private String alternateOrderLineId;
    @JsonProperty("BusinessDate")
    private String businessDate;
    @JsonProperty("CalculatedValues")
    private CalculatedValues__ calculatedValues;
    @JsonProperty("CancelComments")
    private String cancelComments;
    @JsonProperty("CancelReason")
    private CancelReason_ cancelReason;
    @JsonProperty("CancelledOrderLineSubTotal")
    private Integer cancelledOrderLineSubTotal;
    @JsonProperty("CancelledTotalDiscounts")
    private Integer cancelledTotalDiscounts;
    @JsonProperty("CarrierCode")
    private String carrierCode;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("DeliveryMethod")
    private DeliveryMethod deliveryMethod;
    @JsonProperty("DoNotShipBeforeDate")
    private String doNotShipBeforeDate;
    @JsonProperty("EffectiveRank")
    private String effectiveRank;
    @JsonProperty("Extended")
    private Extended_____ extended;
    @JsonProperty("FulfillmentDetail")
    private List<FulfillmentDetail> fulfillmentDetail = null;
    @JsonProperty("FulfillmentGroupId")
    private String fulfillmentGroupId;
    @JsonProperty("FulfillmentStatus")
    private String fulfillmentStatus;
    @JsonProperty("GiftCardValue")
    private Integer giftCardValue;
    @JsonProperty("IsActivationRequired")
    private Boolean isActivationRequired;
    @JsonProperty("IsCancelled")
    private Boolean isCancelled;
    @JsonProperty("IsEligibleForOverride")
    private Boolean isEligibleForOverride;
    @JsonProperty("IsEvenExchange")
    private Boolean isEvenExchange;
    @JsonProperty("IsExchangeable")
    private Boolean isExchangeable;
    @JsonProperty("IsGift")
    private Boolean isGift;
    @JsonProperty("IsGiftCard")
    private Boolean isGiftCard;
    @JsonProperty("IsHazmat")
    private Boolean isHazmat;
    @JsonProperty("IsItemNotOnFile")
    private Boolean isItemNotOnFile;
    @JsonProperty("IsItemTaxExemptable")
    private Boolean isItemTaxExemptable;
    @JsonProperty("IsItemTaxOverridable")
    private Boolean isItemTaxOverridable;
    @JsonProperty("IsNonMerchandise")
    private Boolean isNonMerchandise;
    @JsonProperty("IsOnHold")
    private Boolean isOnHold;
    @JsonProperty("IsPackAndHold")
    private Boolean isPackAndHold;
    @JsonProperty("IsPerishable")
    private Boolean isPerishable;
    @JsonProperty("IsPreOrder")
    private Boolean isPreOrder;
    @JsonProperty("IsPreSale")
    private Boolean isPreSale;
    @JsonProperty("IsPriceOverridden")
    private Boolean isPriceOverridden;
    @JsonProperty("IsReceiptExpected")
    private Boolean isReceiptExpected;
    @JsonProperty("IsReturn")
    private Boolean isReturn;
    @JsonProperty("IsReturnAllowedByAgePolicy")
    private Boolean isReturnAllowedByAgePolicy;
    @JsonProperty("IsReturnable")
    private Boolean isReturnable;
    @JsonProperty("IsReturnableAtStore")
    private Boolean isReturnableAtStore;
    @JsonProperty("IsTaxIncluded")
    private Boolean isTaxIncluded;
    @JsonProperty("IsTaxOverridden")
    private Boolean isTaxOverridden;
    @JsonProperty("ItemBarcode")
    private String itemBarcode;
    @JsonProperty("ItemBrand")
    private String itemBrand;
    @JsonProperty("ItemColorDescription")
    private String itemColorDescription;
    @JsonProperty("ItemDepartmentName")
    private String itemDepartmentName;
    @JsonProperty("ItemDepartmentNumber")
    private Integer itemDepartmentNumber;
    @JsonProperty("ItemDescription")
    private String itemDescription;
    @JsonProperty("ItemId")
    private String itemId;
    @JsonProperty("ItemMaxDiscountAmount")
    private Integer itemMaxDiscountAmount;
    @JsonProperty("ItemMaxDiscountPercentage")
    private Integer itemMaxDiscountPercentage;
    @JsonProperty("ItemSeason")
    private String itemSeason;
    @JsonProperty("ItemShortDescription")
    private String itemShortDescription;
    @JsonProperty("ItemSize")
    private String itemSize;
    @JsonProperty("ItemStyle")
    private String itemStyle;
    @JsonProperty("ItemTaxCode")
    private String itemTaxCode;
    @JsonProperty("LatestDeliveryDate")
    private String latestDeliveryDate;
    @JsonProperty("LatestFulfilledDate")
    private String latestFulfilledDate;
    @JsonProperty("LineProcessInfo")
    private LineProcessInfo lineProcessInfo;
    @JsonProperty("LineType")
    private LineType lineType;
    @JsonProperty("MaxAppeasementAmount")
    private Integer maxAppeasementAmount;
    @JsonProperty("MaxFulfillmentStatus")
    private MaxFulfillmentStatus_ maxFulfillmentStatus;
    @JsonProperty("MaxFulfillmentStatusId")
    private String maxFulfillmentStatusId;
    @JsonProperty("MinFulfillmentStatus")
    private MinFulfillmentStatus_ minFulfillmentStatus;
    @JsonProperty("MinFulfillmentStatusId")
    private String minFulfillmentStatusId;
    @JsonProperty("OrderId")
    private String orderId;
    @JsonProperty("OrderLineAdditional")
    private OrderLineAdditional orderLineAdditional;
    @JsonProperty("OrderLineAttribute")
    private List<OrderLineAttribute> orderLineAttribute = null;
    @JsonProperty("OrderLineCancelHistory")
    private List<OrderLineCancelHistory> orderLineCancelHistory = null;
    @JsonProperty("OrderLineChargeDetail")
    private List<OrderLineChargeDetail> orderLineChargeDetail = null;
    @JsonProperty("OrderLineExtension1")
    private OrderLineExtension1 orderLineExtension1;
    @JsonProperty("OrderLineExtension2")
    private List<OrderLineExtension2> orderLineExtension2 = null;
    @JsonProperty("OrderLineHold")
    private List<OrderLineHold> orderLineHold = null;
    @JsonProperty("OrderLineId")
    private String orderLineId;
    @JsonProperty("OrderLineNote")
    private List<OrderLineNote> orderLineNote = null;
    @JsonProperty("OrderLinePickupDetail")
    private List<OrderLinePickupDetail> orderLinePickupDetail = null;
    @JsonProperty("OrderLinePriceOverrideHistory")
    private List<OrderLinePriceOverrideHistory> orderLinePriceOverrideHistory = null;
    @JsonProperty("OrderLinePromisingInfo")
    private OrderLinePromisingInfo orderLinePromisingInfo;
    @JsonProperty("OrderLinePromotionRequest")
    private List<OrderLinePromotionRequest> orderLinePromotionRequest = null;
    @JsonProperty("OrderLineSalesAssociate")
    private List<OrderLineSalesAssociate> orderLineSalesAssociate = null;
    @JsonProperty("OrderLineSubTotal")
    private Integer orderLineSubTotal;
    @JsonProperty("OrderLineTagDetail")
    private List<OrderLineTagDetail> orderLineTagDetail = null;
    @JsonProperty("OrderLineTaxDetail")
    private List<OrderLineTaxDetail> orderLineTaxDetail = null;
    @JsonProperty("OrderLineTotal")
    private Integer orderLineTotal;
    @JsonProperty("OrderLineVASInstructions")
    private List<OrderLineVASInstruction> orderLineVASInstructions = null;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("OriginalUnitPrice")
    private Integer originalUnitPrice;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("ParentLineCreatedTimestamp")
    private String parentLineCreatedTimestamp;
    @JsonProperty("ParentOrderId")
    private String parentOrderId;
    @JsonProperty("ParentOrderLineId")
    private String parentOrderLineId;
    @JsonProperty("ParentOrderLineType")
    private ParentOrderLineType parentOrderLineType;
    @JsonProperty("PaymentGroupId")
    private String paymentGroupId;
    @JsonProperty("PhysicalOriginId")
    private String physicalOriginId;
    @JsonProperty("PipelineId")
    private String pipelineId;
    @JsonProperty("Priority")
    private Integer priority;
    @JsonProperty("ProductClass")
    private String productClass;
    @JsonProperty("PromisedDeliveryDate")
    private String promisedDeliveryDate;
    @JsonProperty("PromisedShipDate")
    private String promisedShipDate;
    @JsonProperty("Quantity")
    private Integer quantity;
    @JsonProperty("QuantityDetail")
    private List<QuantityDetail> quantityDetail = null;
    @JsonProperty("RefundPrice")
    private Integer refundPrice;
    @JsonProperty("RequestedDeliveryDate")
    private String requestedDeliveryDate;
    @JsonProperty("ReturnDetail")
    private List<ReturnDetail> returnDetail = null;
    @JsonProperty("ReturnLineTotalWithoutFees")
    private Integer returnLineTotalWithoutFees;
    @JsonProperty("ReturnType")
    private ReturnType_ returnType;
    @JsonProperty("ReturnableLineTotal")
    private Integer returnableLineTotal;
    @JsonProperty("ReturnableQuantity")
    private Integer returnableQuantity;
    @JsonProperty("SellingLocationId")
    private String sellingLocationId;
    @JsonProperty("ServiceLevelCode")
    private String serviceLevelCode;
    @JsonProperty("ShipFromAddress")
    private ShipFromAddress shipFromAddress;
    @JsonProperty("ShipFromAddressId")
    private String shipFromAddressId;
    @JsonProperty("ShipToAddress")
    private ShipToAddress shipToAddress;
    @JsonProperty("ShipToLocationId")
    private String shipToLocationId;
    @JsonProperty("ShippingMethodId")
    private String shippingMethodId;
    @JsonProperty("SmallImageURI")
    private String smallImageURI;
    @JsonProperty("StoreSaleEntryMethod")
    private StoreSaleEntryMethod storeSaleEntryMethod;
    @JsonProperty("StreetDate")
    private String streetDate;
    @JsonProperty("TaxOverrideType")
    private TaxOverrideType taxOverrideType;
    @JsonProperty("TaxOverrideValue")
    private Integer taxOverrideValue;
    @JsonProperty("TaxableAmount")
    private Integer taxableAmount;
    @JsonProperty("TotalCharges")
    private Integer totalCharges;
    @JsonProperty("TotalDiscountOnItem")
    private Integer totalDiscountOnItem;
    @JsonProperty("TotalDiscounts")
    private Integer totalDiscounts;
    @JsonProperty("TotalTaxes")
    private Integer totalTaxes;
    @JsonProperty("TransactionReferenceId")
    private String transactionReferenceId;
    @JsonProperty("Translations")
    private Translations__________________________ translations;
    @JsonProperty("UOM")
    private String uOM;
    @JsonProperty("UnitPrice")
    private Integer unitPrice;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("VolumetricWeight")
    private Integer volumetricWeight;
    @JsonProperty("VolumetricWeightUOM")
    private VolumetricWeightUOM volumetricWeightUOM;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages_________________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7721308922247862499L;

    @JsonProperty("Actions")
    public Actions____ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions____ actions) {
        this.actions = actions;
    }

    @JsonProperty("AddressId")
    public String getAddressId() {
        return addressId;
    }

    @JsonProperty("AddressId")
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    @JsonProperty("Allocation")
    public List<Allocation> getAllocation() {
        return allocation;
    }

    @JsonProperty("Allocation")
    public void setAllocation(List<Allocation> allocation) {
        this.allocation = allocation;
    }

    @JsonProperty("AlternateOrderLineId")
    public String getAlternateOrderLineId() {
        return alternateOrderLineId;
    }

    @JsonProperty("AlternateOrderLineId")
    public void setAlternateOrderLineId(String alternateOrderLineId) {
        this.alternateOrderLineId = alternateOrderLineId;
    }

    @JsonProperty("BusinessDate")
    public String getBusinessDate() {
        return businessDate;
    }

    @JsonProperty("BusinessDate")
    public void setBusinessDate(String businessDate) {
        this.businessDate = businessDate;
    }

    @JsonProperty("CalculatedValues")
    public CalculatedValues__ getCalculatedValues() {
        return calculatedValues;
    }

    @JsonProperty("CalculatedValues")
    public void setCalculatedValues(CalculatedValues__ calculatedValues) {
        this.calculatedValues = calculatedValues;
    }

    @JsonProperty("CancelComments")
    public String getCancelComments() {
        return cancelComments;
    }

    @JsonProperty("CancelComments")
    public void setCancelComments(String cancelComments) {
        this.cancelComments = cancelComments;
    }

    @JsonProperty("CancelReason")
    public CancelReason_ getCancelReason() {
        return cancelReason;
    }

    @JsonProperty("CancelReason")
    public void setCancelReason(CancelReason_ cancelReason) {
        this.cancelReason = cancelReason;
    }

    @JsonProperty("CancelledOrderLineSubTotal")
    public Integer getCancelledOrderLineSubTotal() {
        return cancelledOrderLineSubTotal;
    }

    @JsonProperty("CancelledOrderLineSubTotal")
    public void setCancelledOrderLineSubTotal(Integer cancelledOrderLineSubTotal) {
        this.cancelledOrderLineSubTotal = cancelledOrderLineSubTotal;
    }

    @JsonProperty("CancelledTotalDiscounts")
    public Integer getCancelledTotalDiscounts() {
        return cancelledTotalDiscounts;
    }

    @JsonProperty("CancelledTotalDiscounts")
    public void setCancelledTotalDiscounts(Integer cancelledTotalDiscounts) {
        this.cancelledTotalDiscounts = cancelledTotalDiscounts;
    }

    @JsonProperty("CarrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("CarrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    @JsonProperty("CreatedBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("CreatedBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("CreatedTimestamp")
    public String getCreatedTimestamp() {
        return createdTimestamp;
    }

    @JsonProperty("CreatedTimestamp")
    public void setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    @JsonProperty("DeliveryMethod")
    public DeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }

    @JsonProperty("DeliveryMethod")
    public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    @JsonProperty("DoNotShipBeforeDate")
    public String getDoNotShipBeforeDate() {
        return doNotShipBeforeDate;
    }

    @JsonProperty("DoNotShipBeforeDate")
    public void setDoNotShipBeforeDate(String doNotShipBeforeDate) {
        this.doNotShipBeforeDate = doNotShipBeforeDate;
    }

    @JsonProperty("EffectiveRank")
    public String getEffectiveRank() {
        return effectiveRank;
    }

    @JsonProperty("EffectiveRank")
    public void setEffectiveRank(String effectiveRank) {
        this.effectiveRank = effectiveRank;
    }

    @JsonProperty("Extended")
    public Extended_____ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended_____ extended) {
        this.extended = extended;
    }

    @JsonProperty("FulfillmentDetail")
    public List<FulfillmentDetail> getFulfillmentDetail() {
        return fulfillmentDetail;
    }

    @JsonProperty("FulfillmentDetail")
    public void setFulfillmentDetail(List<FulfillmentDetail> fulfillmentDetail) {
        this.fulfillmentDetail = fulfillmentDetail;
    }

    @JsonProperty("FulfillmentGroupId")
    public String getFulfillmentGroupId() {
        return fulfillmentGroupId;
    }

    @JsonProperty("FulfillmentGroupId")
    public void setFulfillmentGroupId(String fulfillmentGroupId) {
        this.fulfillmentGroupId = fulfillmentGroupId;
    }

    @JsonProperty("FulfillmentStatus")
    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    @JsonProperty("FulfillmentStatus")
    public void setFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    @JsonProperty("GiftCardValue")
    public Integer getGiftCardValue() {
        return giftCardValue;
    }

    @JsonProperty("GiftCardValue")
    public void setGiftCardValue(Integer giftCardValue) {
        this.giftCardValue = giftCardValue;
    }

    @JsonProperty("IsActivationRequired")
    public Boolean getIsActivationRequired() {
        return isActivationRequired;
    }

    @JsonProperty("IsActivationRequired")
    public void setIsActivationRequired(Boolean isActivationRequired) {
        this.isActivationRequired = isActivationRequired;
    }

    @JsonProperty("IsCancelled")
    public Boolean getIsCancelled() {
        return isCancelled;
    }

    @JsonProperty("IsCancelled")
    public void setIsCancelled(Boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    @JsonProperty("IsEligibleForOverride")
    public Boolean getIsEligibleForOverride() {
        return isEligibleForOverride;
    }

    @JsonProperty("IsEligibleForOverride")
    public void setIsEligibleForOverride(Boolean isEligibleForOverride) {
        this.isEligibleForOverride = isEligibleForOverride;
    }

    @JsonProperty("IsEvenExchange")
    public Boolean getIsEvenExchange() {
        return isEvenExchange;
    }

    @JsonProperty("IsEvenExchange")
    public void setIsEvenExchange(Boolean isEvenExchange) {
        this.isEvenExchange = isEvenExchange;
    }

    @JsonProperty("IsExchangeable")
    public Boolean getIsExchangeable() {
        return isExchangeable;
    }

    @JsonProperty("IsExchangeable")
    public void setIsExchangeable(Boolean isExchangeable) {
        this.isExchangeable = isExchangeable;
    }

    @JsonProperty("IsGift")
    public Boolean getIsGift() {
        return isGift;
    }

    @JsonProperty("IsGift")
    public void setIsGift(Boolean isGift) {
        this.isGift = isGift;
    }

    @JsonProperty("IsGiftCard")
    public Boolean getIsGiftCard() {
        return isGiftCard;
    }

    @JsonProperty("IsGiftCard")
    public void setIsGiftCard(Boolean isGiftCard) {
        this.isGiftCard = isGiftCard;
    }

    @JsonProperty("IsHazmat")
    public Boolean getIsHazmat() {
        return isHazmat;
    }

    @JsonProperty("IsHazmat")
    public void setIsHazmat(Boolean isHazmat) {
        this.isHazmat = isHazmat;
    }

    @JsonProperty("IsItemNotOnFile")
    public Boolean getIsItemNotOnFile() {
        return isItemNotOnFile;
    }

    @JsonProperty("IsItemNotOnFile")
    public void setIsItemNotOnFile(Boolean isItemNotOnFile) {
        this.isItemNotOnFile = isItemNotOnFile;
    }

    @JsonProperty("IsItemTaxExemptable")
    public Boolean getIsItemTaxExemptable() {
        return isItemTaxExemptable;
    }

    @JsonProperty("IsItemTaxExemptable")
    public void setIsItemTaxExemptable(Boolean isItemTaxExemptable) {
        this.isItemTaxExemptable = isItemTaxExemptable;
    }

    @JsonProperty("IsItemTaxOverridable")
    public Boolean getIsItemTaxOverridable() {
        return isItemTaxOverridable;
    }

    @JsonProperty("IsItemTaxOverridable")
    public void setIsItemTaxOverridable(Boolean isItemTaxOverridable) {
        this.isItemTaxOverridable = isItemTaxOverridable;
    }

    @JsonProperty("IsNonMerchandise")
    public Boolean getIsNonMerchandise() {
        return isNonMerchandise;
    }

    @JsonProperty("IsNonMerchandise")
    public void setIsNonMerchandise(Boolean isNonMerchandise) {
        this.isNonMerchandise = isNonMerchandise;
    }

    @JsonProperty("IsOnHold")
    public Boolean getIsOnHold() {
        return isOnHold;
    }

    @JsonProperty("IsOnHold")
    public void setIsOnHold(Boolean isOnHold) {
        this.isOnHold = isOnHold;
    }

    @JsonProperty("IsPackAndHold")
    public Boolean getIsPackAndHold() {
        return isPackAndHold;
    }

    @JsonProperty("IsPackAndHold")
    public void setIsPackAndHold(Boolean isPackAndHold) {
        this.isPackAndHold = isPackAndHold;
    }

    @JsonProperty("IsPerishable")
    public Boolean getIsPerishable() {
        return isPerishable;
    }

    @JsonProperty("IsPerishable")
    public void setIsPerishable(Boolean isPerishable) {
        this.isPerishable = isPerishable;
    }

    @JsonProperty("IsPreOrder")
    public Boolean getIsPreOrder() {
        return isPreOrder;
    }

    @JsonProperty("IsPreOrder")
    public void setIsPreOrder(Boolean isPreOrder) {
        this.isPreOrder = isPreOrder;
    }

    @JsonProperty("IsPreSale")
    public Boolean getIsPreSale() {
        return isPreSale;
    }

    @JsonProperty("IsPreSale")
    public void setIsPreSale(Boolean isPreSale) {
        this.isPreSale = isPreSale;
    }

    @JsonProperty("IsPriceOverridden")
    public Boolean getIsPriceOverridden() {
        return isPriceOverridden;
    }

    @JsonProperty("IsPriceOverridden")
    public void setIsPriceOverridden(Boolean isPriceOverridden) {
        this.isPriceOverridden = isPriceOverridden;
    }

    @JsonProperty("IsReceiptExpected")
    public Boolean getIsReceiptExpected() {
        return isReceiptExpected;
    }

    @JsonProperty("IsReceiptExpected")
    public void setIsReceiptExpected(Boolean isReceiptExpected) {
        this.isReceiptExpected = isReceiptExpected;
    }

    @JsonProperty("IsReturn")
    public Boolean getIsReturn() {
        return isReturn;
    }

    @JsonProperty("IsReturn")
    public void setIsReturn(Boolean isReturn) {
        this.isReturn = isReturn;
    }

    @JsonProperty("IsReturnAllowedByAgePolicy")
    public Boolean getIsReturnAllowedByAgePolicy() {
        return isReturnAllowedByAgePolicy;
    }

    @JsonProperty("IsReturnAllowedByAgePolicy")
    public void setIsReturnAllowedByAgePolicy(Boolean isReturnAllowedByAgePolicy) {
        this.isReturnAllowedByAgePolicy = isReturnAllowedByAgePolicy;
    }

    @JsonProperty("IsReturnable")
    public Boolean getIsReturnable() {
        return isReturnable;
    }

    @JsonProperty("IsReturnable")
    public void setIsReturnable(Boolean isReturnable) {
        this.isReturnable = isReturnable;
    }

    @JsonProperty("IsReturnableAtStore")
    public Boolean getIsReturnableAtStore() {
        return isReturnableAtStore;
    }

    @JsonProperty("IsReturnableAtStore")
    public void setIsReturnableAtStore(Boolean isReturnableAtStore) {
        this.isReturnableAtStore = isReturnableAtStore;
    }

    @JsonProperty("IsTaxIncluded")
    public Boolean getIsTaxIncluded() {
        return isTaxIncluded;
    }

    @JsonProperty("IsTaxIncluded")
    public void setIsTaxIncluded(Boolean isTaxIncluded) {
        this.isTaxIncluded = isTaxIncluded;
    }

    @JsonProperty("IsTaxOverridden")
    public Boolean getIsTaxOverridden() {
        return isTaxOverridden;
    }

    @JsonProperty("IsTaxOverridden")
    public void setIsTaxOverridden(Boolean isTaxOverridden) {
        this.isTaxOverridden = isTaxOverridden;
    }

    @JsonProperty("ItemBarcode")
    public String getItemBarcode() {
        return itemBarcode;
    }

    @JsonProperty("ItemBarcode")
    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode;
    }

    @JsonProperty("ItemBrand")
    public String getItemBrand() {
        return itemBrand;
    }

    @JsonProperty("ItemBrand")
    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    @JsonProperty("ItemColorDescription")
    public String getItemColorDescription() {
        return itemColorDescription;
    }

    @JsonProperty("ItemColorDescription")
    public void setItemColorDescription(String itemColorDescription) {
        this.itemColorDescription = itemColorDescription;
    }

    @JsonProperty("ItemDepartmentName")
    public String getItemDepartmentName() {
        return itemDepartmentName;
    }

    @JsonProperty("ItemDepartmentName")
    public void setItemDepartmentName(String itemDepartmentName) {
        this.itemDepartmentName = itemDepartmentName;
    }

    @JsonProperty("ItemDepartmentNumber")
    public Integer getItemDepartmentNumber() {
        return itemDepartmentNumber;
    }

    @JsonProperty("ItemDepartmentNumber")
    public void setItemDepartmentNumber(Integer itemDepartmentNumber) {
        this.itemDepartmentNumber = itemDepartmentNumber;
    }

    @JsonProperty("ItemDescription")
    public String getItemDescription() {
        return itemDescription;
    }

    @JsonProperty("ItemDescription")
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @JsonProperty("ItemId")
    public String getItemId() {
        return itemId;
    }

    @JsonProperty("ItemId")
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @JsonProperty("ItemMaxDiscountAmount")
    public Integer getItemMaxDiscountAmount() {
        return itemMaxDiscountAmount;
    }

    @JsonProperty("ItemMaxDiscountAmount")
    public void setItemMaxDiscountAmount(Integer itemMaxDiscountAmount) {
        this.itemMaxDiscountAmount = itemMaxDiscountAmount;
    }

    @JsonProperty("ItemMaxDiscountPercentage")
    public Integer getItemMaxDiscountPercentage() {
        return itemMaxDiscountPercentage;
    }

    @JsonProperty("ItemMaxDiscountPercentage")
    public void setItemMaxDiscountPercentage(Integer itemMaxDiscountPercentage) {
        this.itemMaxDiscountPercentage = itemMaxDiscountPercentage;
    }

    @JsonProperty("ItemSeason")
    public String getItemSeason() {
        return itemSeason;
    }

    @JsonProperty("ItemSeason")
    public void setItemSeason(String itemSeason) {
        this.itemSeason = itemSeason;
    }

    @JsonProperty("ItemShortDescription")
    public String getItemShortDescription() {
        return itemShortDescription;
    }

    @JsonProperty("ItemShortDescription")
    public void setItemShortDescription(String itemShortDescription) {
        this.itemShortDescription = itemShortDescription;
    }

    @JsonProperty("ItemSize")
    public String getItemSize() {
        return itemSize;
    }

    @JsonProperty("ItemSize")
    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
    }

    @JsonProperty("ItemStyle")
    public String getItemStyle() {
        return itemStyle;
    }

    @JsonProperty("ItemStyle")
    public void setItemStyle(String itemStyle) {
        this.itemStyle = itemStyle;
    }

    @JsonProperty("ItemTaxCode")
    public String getItemTaxCode() {
        return itemTaxCode;
    }

    @JsonProperty("ItemTaxCode")
    public void setItemTaxCode(String itemTaxCode) {
        this.itemTaxCode = itemTaxCode;
    }

    @JsonProperty("LatestDeliveryDate")
    public String getLatestDeliveryDate() {
        return latestDeliveryDate;
    }

    @JsonProperty("LatestDeliveryDate")
    public void setLatestDeliveryDate(String latestDeliveryDate) {
        this.latestDeliveryDate = latestDeliveryDate;
    }

    @JsonProperty("LatestFulfilledDate")
    public String getLatestFulfilledDate() {
        return latestFulfilledDate;
    }

    @JsonProperty("LatestFulfilledDate")
    public void setLatestFulfilledDate(String latestFulfilledDate) {
        this.latestFulfilledDate = latestFulfilledDate;
    }

    @JsonProperty("LineProcessInfo")
    public LineProcessInfo getLineProcessInfo() {
        return lineProcessInfo;
    }

    @JsonProperty("LineProcessInfo")
    public void setLineProcessInfo(LineProcessInfo lineProcessInfo) {
        this.lineProcessInfo = lineProcessInfo;
    }

    @JsonProperty("LineType")
    public LineType getLineType() {
        return lineType;
    }

    @JsonProperty("LineType")
    public void setLineType(LineType lineType) {
        this.lineType = lineType;
    }

    @JsonProperty("MaxAppeasementAmount")
    public Integer getMaxAppeasementAmount() {
        return maxAppeasementAmount;
    }

    @JsonProperty("MaxAppeasementAmount")
    public void setMaxAppeasementAmount(Integer maxAppeasementAmount) {
        this.maxAppeasementAmount = maxAppeasementAmount;
    }

    @JsonProperty("MaxFulfillmentStatus")
    public MaxFulfillmentStatus_ getMaxFulfillmentStatus() {
        return maxFulfillmentStatus;
    }

    @JsonProperty("MaxFulfillmentStatus")
    public void setMaxFulfillmentStatus(MaxFulfillmentStatus_ maxFulfillmentStatus) {
        this.maxFulfillmentStatus = maxFulfillmentStatus;
    }

    @JsonProperty("MaxFulfillmentStatusId")
    public String getMaxFulfillmentStatusId() {
        return maxFulfillmentStatusId;
    }

    @JsonProperty("MaxFulfillmentStatusId")
    public void setMaxFulfillmentStatusId(String maxFulfillmentStatusId) {
        this.maxFulfillmentStatusId = maxFulfillmentStatusId;
    }

    @JsonProperty("MinFulfillmentStatus")
    public MinFulfillmentStatus_ getMinFulfillmentStatus() {
        return minFulfillmentStatus;
    }

    @JsonProperty("MinFulfillmentStatus")
    public void setMinFulfillmentStatus(MinFulfillmentStatus_ minFulfillmentStatus) {
        this.minFulfillmentStatus = minFulfillmentStatus;
    }

    @JsonProperty("MinFulfillmentStatusId")
    public String getMinFulfillmentStatusId() {
        return minFulfillmentStatusId;
    }

    @JsonProperty("MinFulfillmentStatusId")
    public void setMinFulfillmentStatusId(String minFulfillmentStatusId) {
        this.minFulfillmentStatusId = minFulfillmentStatusId;
    }

    @JsonProperty("OrderId")
    public String getOrderId() {
        return orderId;
    }

    @JsonProperty("OrderId")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("OrderLineAdditional")
    public OrderLineAdditional getOrderLineAdditional() {
        return orderLineAdditional;
    }

    @JsonProperty("OrderLineAdditional")
    public void setOrderLineAdditional(OrderLineAdditional orderLineAdditional) {
        this.orderLineAdditional = orderLineAdditional;
    }

    @JsonProperty("OrderLineAttribute")
    public List<OrderLineAttribute> getOrderLineAttribute() {
        return orderLineAttribute;
    }

    @JsonProperty("OrderLineAttribute")
    public void setOrderLineAttribute(List<OrderLineAttribute> orderLineAttribute) {
        this.orderLineAttribute = orderLineAttribute;
    }

    @JsonProperty("OrderLineCancelHistory")
    public List<OrderLineCancelHistory> getOrderLineCancelHistory() {
        return orderLineCancelHistory;
    }

    @JsonProperty("OrderLineCancelHistory")
    public void setOrderLineCancelHistory(List<OrderLineCancelHistory> orderLineCancelHistory) {
        this.orderLineCancelHistory = orderLineCancelHistory;
    }

    @JsonProperty("OrderLineChargeDetail")
    public List<OrderLineChargeDetail> getOrderLineChargeDetail() {
        return orderLineChargeDetail;
    }

    @JsonProperty("OrderLineChargeDetail")
    public void setOrderLineChargeDetail(List<OrderLineChargeDetail> orderLineChargeDetail) {
        this.orderLineChargeDetail = orderLineChargeDetail;
    }

    @JsonProperty("OrderLineExtension1")
    public OrderLineExtension1 getOrderLineExtension1() {
        return orderLineExtension1;
    }

    @JsonProperty("OrderLineExtension1")
    public void setOrderLineExtension1(OrderLineExtension1 orderLineExtension1) {
        this.orderLineExtension1 = orderLineExtension1;
    }

    @JsonProperty("OrderLineExtension2")
    public List<OrderLineExtension2> getOrderLineExtension2() {
        return orderLineExtension2;
    }

    @JsonProperty("OrderLineExtension2")
    public void setOrderLineExtension2(List<OrderLineExtension2> orderLineExtension2) {
        this.orderLineExtension2 = orderLineExtension2;
    }

    @JsonProperty("OrderLineHold")
    public List<OrderLineHold> getOrderLineHold() {
        return orderLineHold;
    }

    @JsonProperty("OrderLineHold")
    public void setOrderLineHold(List<OrderLineHold> orderLineHold) {
        this.orderLineHold = orderLineHold;
    }

    @JsonProperty("OrderLineId")
    public String getOrderLineId() {
        return orderLineId;
    }

    @JsonProperty("OrderLineId")
    public void setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
    }

    @JsonProperty("OrderLineNote")
    public List<OrderLineNote> getOrderLineNote() {
        return orderLineNote;
    }

    @JsonProperty("OrderLineNote")
    public void setOrderLineNote(List<OrderLineNote> orderLineNote) {
        this.orderLineNote = orderLineNote;
    }

    @JsonProperty("OrderLinePickupDetail")
    public List<OrderLinePickupDetail> getOrderLinePickupDetail() {
        return orderLinePickupDetail;
    }

    @JsonProperty("OrderLinePickupDetail")
    public void setOrderLinePickupDetail(List<OrderLinePickupDetail> orderLinePickupDetail) {
        this.orderLinePickupDetail = orderLinePickupDetail;
    }

    @JsonProperty("OrderLinePriceOverrideHistory")
    public List<OrderLinePriceOverrideHistory> getOrderLinePriceOverrideHistory() {
        return orderLinePriceOverrideHistory;
    }

    @JsonProperty("OrderLinePriceOverrideHistory")
    public void setOrderLinePriceOverrideHistory(List<OrderLinePriceOverrideHistory> orderLinePriceOverrideHistory) {
        this.orderLinePriceOverrideHistory = orderLinePriceOverrideHistory;
    }

    @JsonProperty("OrderLinePromisingInfo")
    public OrderLinePromisingInfo getOrderLinePromisingInfo() {
        return orderLinePromisingInfo;
    }

    @JsonProperty("OrderLinePromisingInfo")
    public void setOrderLinePromisingInfo(OrderLinePromisingInfo orderLinePromisingInfo) {
        this.orderLinePromisingInfo = orderLinePromisingInfo;
    }

    @JsonProperty("OrderLinePromotionRequest")
    public List<OrderLinePromotionRequest> getOrderLinePromotionRequest() {
        return orderLinePromotionRequest;
    }

    @JsonProperty("OrderLinePromotionRequest")
    public void setOrderLinePromotionRequest(List<OrderLinePromotionRequest> orderLinePromotionRequest) {
        this.orderLinePromotionRequest = orderLinePromotionRequest;
    }

    @JsonProperty("OrderLineSalesAssociate")
    public List<OrderLineSalesAssociate> getOrderLineSalesAssociate() {
        return orderLineSalesAssociate;
    }

    @JsonProperty("OrderLineSalesAssociate")
    public void setOrderLineSalesAssociate(List<OrderLineSalesAssociate> orderLineSalesAssociate) {
        this.orderLineSalesAssociate = orderLineSalesAssociate;
    }

    @JsonProperty("OrderLineSubTotal")
    public Integer getOrderLineSubTotal() {
        return orderLineSubTotal;
    }

    @JsonProperty("OrderLineSubTotal")
    public void setOrderLineSubTotal(Integer orderLineSubTotal) {
        this.orderLineSubTotal = orderLineSubTotal;
    }

    @JsonProperty("OrderLineTagDetail")
    public List<OrderLineTagDetail> getOrderLineTagDetail() {
        return orderLineTagDetail;
    }

    @JsonProperty("OrderLineTagDetail")
    public void setOrderLineTagDetail(List<OrderLineTagDetail> orderLineTagDetail) {
        this.orderLineTagDetail = orderLineTagDetail;
    }

    @JsonProperty("OrderLineTaxDetail")
    public List<OrderLineTaxDetail> getOrderLineTaxDetail() {
        return orderLineTaxDetail;
    }

    @JsonProperty("OrderLineTaxDetail")
    public void setOrderLineTaxDetail(List<OrderLineTaxDetail> orderLineTaxDetail) {
        this.orderLineTaxDetail = orderLineTaxDetail;
    }

    @JsonProperty("OrderLineTotal")
    public Integer getOrderLineTotal() {
        return orderLineTotal;
    }

    @JsonProperty("OrderLineTotal")
    public void setOrderLineTotal(Integer orderLineTotal) {
        this.orderLineTotal = orderLineTotal;
    }

    @JsonProperty("OrderLineVASInstructions")
    public List<OrderLineVASInstruction> getOrderLineVASInstructions() {
        return orderLineVASInstructions;
    }

    @JsonProperty("OrderLineVASInstructions")
    public void setOrderLineVASInstructions(List<OrderLineVASInstruction> orderLineVASInstructions) {
        this.orderLineVASInstructions = orderLineVASInstructions;
    }

    @JsonProperty("OrgId")
    public String getOrgId() {
        return orgId;
    }

    @JsonProperty("OrgId")
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @JsonProperty("OriginalUnitPrice")
    public Integer getOriginalUnitPrice() {
        return originalUnitPrice;
    }

    @JsonProperty("OriginalUnitPrice")
    public void setOriginalUnitPrice(Integer originalUnitPrice) {
        this.originalUnitPrice = originalUnitPrice;
    }

    @JsonProperty("PK")
    public String getPK() {
        return pK;
    }

    @JsonProperty("PK")
    public void setPK(String pK) {
        this.pK = pK;
    }

    @JsonProperty("ParentLineCreatedTimestamp")
    public String getParentLineCreatedTimestamp() {
        return parentLineCreatedTimestamp;
    }

    @JsonProperty("ParentLineCreatedTimestamp")
    public void setParentLineCreatedTimestamp(String parentLineCreatedTimestamp) {
        this.parentLineCreatedTimestamp = parentLineCreatedTimestamp;
    }

    @JsonProperty("ParentOrderId")
    public String getParentOrderId() {
        return parentOrderId;
    }

    @JsonProperty("ParentOrderId")
    public void setParentOrderId(String parentOrderId) {
        this.parentOrderId = parentOrderId;
    }

    @JsonProperty("ParentOrderLineId")
    public String getParentOrderLineId() {
        return parentOrderLineId;
    }

    @JsonProperty("ParentOrderLineId")
    public void setParentOrderLineId(String parentOrderLineId) {
        this.parentOrderLineId = parentOrderLineId;
    }

    @JsonProperty("ParentOrderLineType")
    public ParentOrderLineType getParentOrderLineType() {
        return parentOrderLineType;
    }

    @JsonProperty("ParentOrderLineType")
    public void setParentOrderLineType(ParentOrderLineType parentOrderLineType) {
        this.parentOrderLineType = parentOrderLineType;
    }

    @JsonProperty("PaymentGroupId")
    public String getPaymentGroupId() {
        return paymentGroupId;
    }

    @JsonProperty("PaymentGroupId")
    public void setPaymentGroupId(String paymentGroupId) {
        this.paymentGroupId = paymentGroupId;
    }

    @JsonProperty("PhysicalOriginId")
    public String getPhysicalOriginId() {
        return physicalOriginId;
    }

    @JsonProperty("PhysicalOriginId")
    public void setPhysicalOriginId(String physicalOriginId) {
        this.physicalOriginId = physicalOriginId;
    }

    @JsonProperty("PipelineId")
    public String getPipelineId() {
        return pipelineId;
    }

    @JsonProperty("PipelineId")
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    @JsonProperty("Priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("Priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("ProductClass")
    public String getProductClass() {
        return productClass;
    }

    @JsonProperty("ProductClass")
    public void setProductClass(String productClass) {
        this.productClass = productClass;
    }

    @JsonProperty("PromisedDeliveryDate")
    public String getPromisedDeliveryDate() {
        return promisedDeliveryDate;
    }

    @JsonProperty("PromisedDeliveryDate")
    public void setPromisedDeliveryDate(String promisedDeliveryDate) {
        this.promisedDeliveryDate = promisedDeliveryDate;
    }

    @JsonProperty("PromisedShipDate")
    public String getPromisedShipDate() {
        return promisedShipDate;
    }

    @JsonProperty("PromisedShipDate")
    public void setPromisedShipDate(String promisedShipDate) {
        this.promisedShipDate = promisedShipDate;
    }

    @JsonProperty("Quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("QuantityDetail")
    public List<QuantityDetail> getQuantityDetail() {
        return quantityDetail;
    }

    @JsonProperty("QuantityDetail")
    public void setQuantityDetail(List<QuantityDetail> quantityDetail) {
        this.quantityDetail = quantityDetail;
    }

    @JsonProperty("RefundPrice")
    public Integer getRefundPrice() {
        return refundPrice;
    }

    @JsonProperty("RefundPrice")
    public void setRefundPrice(Integer refundPrice) {
        this.refundPrice = refundPrice;
    }

    @JsonProperty("RequestedDeliveryDate")
    public String getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    @JsonProperty("RequestedDeliveryDate")
    public void setRequestedDeliveryDate(String requestedDeliveryDate) {
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    @JsonProperty("ReturnDetail")
    public List<ReturnDetail> getReturnDetail() {
        return returnDetail;
    }

    @JsonProperty("ReturnDetail")
    public void setReturnDetail(List<ReturnDetail> returnDetail) {
        this.returnDetail = returnDetail;
    }

    @JsonProperty("ReturnLineTotalWithoutFees")
    public Integer getReturnLineTotalWithoutFees() {
        return returnLineTotalWithoutFees;
    }

    @JsonProperty("ReturnLineTotalWithoutFees")
    public void setReturnLineTotalWithoutFees(Integer returnLineTotalWithoutFees) {
        this.returnLineTotalWithoutFees = returnLineTotalWithoutFees;
    }

    @JsonProperty("ReturnType")
    public ReturnType_ getReturnType() {
        return returnType;
    }

    @JsonProperty("ReturnType")
    public void setReturnType(ReturnType_ returnType) {
        this.returnType = returnType;
    }

    @JsonProperty("ReturnableLineTotal")
    public Integer getReturnableLineTotal() {
        return returnableLineTotal;
    }

    @JsonProperty("ReturnableLineTotal")
    public void setReturnableLineTotal(Integer returnableLineTotal) {
        this.returnableLineTotal = returnableLineTotal;
    }

    @JsonProperty("ReturnableQuantity")
    public Integer getReturnableQuantity() {
        return returnableQuantity;
    }

    @JsonProperty("ReturnableQuantity")
    public void setReturnableQuantity(Integer returnableQuantity) {
        this.returnableQuantity = returnableQuantity;
    }

    @JsonProperty("SellingLocationId")
    public String getSellingLocationId() {
        return sellingLocationId;
    }

    @JsonProperty("SellingLocationId")
    public void setSellingLocationId(String sellingLocationId) {
        this.sellingLocationId = sellingLocationId;
    }

    @JsonProperty("ServiceLevelCode")
    public String getServiceLevelCode() {
        return serviceLevelCode;
    }

    @JsonProperty("ServiceLevelCode")
    public void setServiceLevelCode(String serviceLevelCode) {
        this.serviceLevelCode = serviceLevelCode;
    }

    @JsonProperty("ShipFromAddress")
    public ShipFromAddress getShipFromAddress() {
        return shipFromAddress;
    }

    @JsonProperty("ShipFromAddress")
    public void setShipFromAddress(ShipFromAddress shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
    }

    @JsonProperty("ShipFromAddressId")
    public String getShipFromAddressId() {
        return shipFromAddressId;
    }

    @JsonProperty("ShipFromAddressId")
    public void setShipFromAddressId(String shipFromAddressId) {
        this.shipFromAddressId = shipFromAddressId;
    }

    @JsonProperty("ShipToAddress")
    public ShipToAddress getShipToAddress() {
        return shipToAddress;
    }

    @JsonProperty("ShipToAddress")
    public void setShipToAddress(ShipToAddress shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    @JsonProperty("ShipToLocationId")
    public String getShipToLocationId() {
        return shipToLocationId;
    }

    @JsonProperty("ShipToLocationId")
    public void setShipToLocationId(String shipToLocationId) {
        this.shipToLocationId = shipToLocationId;
    }

    @JsonProperty("ShippingMethodId")
    public String getShippingMethodId() {
        return shippingMethodId;
    }

    @JsonProperty("ShippingMethodId")
    public void setShippingMethodId(String shippingMethodId) {
        this.shippingMethodId = shippingMethodId;
    }

    @JsonProperty("SmallImageURI")
    public String getSmallImageURI() {
        return smallImageURI;
    }

    @JsonProperty("SmallImageURI")
    public void setSmallImageURI(String smallImageURI) {
        this.smallImageURI = smallImageURI;
    }

    @JsonProperty("StoreSaleEntryMethod")
    public StoreSaleEntryMethod getStoreSaleEntryMethod() {
        return storeSaleEntryMethod;
    }

    @JsonProperty("StoreSaleEntryMethod")
    public void setStoreSaleEntryMethod(StoreSaleEntryMethod storeSaleEntryMethod) {
        this.storeSaleEntryMethod = storeSaleEntryMethod;
    }

    @JsonProperty("StreetDate")
    public String getStreetDate() {
        return streetDate;
    }

    @JsonProperty("StreetDate")
    public void setStreetDate(String streetDate) {
        this.streetDate = streetDate;
    }

    @JsonProperty("TaxOverrideType")
    public TaxOverrideType getTaxOverrideType() {
        return taxOverrideType;
    }

    @JsonProperty("TaxOverrideType")
    public void setTaxOverrideType(TaxOverrideType taxOverrideType) {
        this.taxOverrideType = taxOverrideType;
    }

    @JsonProperty("TaxOverrideValue")
    public Integer getTaxOverrideValue() {
        return taxOverrideValue;
    }

    @JsonProperty("TaxOverrideValue")
    public void setTaxOverrideValue(Integer taxOverrideValue) {
        this.taxOverrideValue = taxOverrideValue;
    }

    @JsonProperty("TaxableAmount")
    public Integer getTaxableAmount() {
        return taxableAmount;
    }

    @JsonProperty("TaxableAmount")
    public void setTaxableAmount(Integer taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    @JsonProperty("TotalCharges")
    public Integer getTotalCharges() {
        return totalCharges;
    }

    @JsonProperty("TotalCharges")
    public void setTotalCharges(Integer totalCharges) {
        this.totalCharges = totalCharges;
    }

    @JsonProperty("TotalDiscountOnItem")
    public Integer getTotalDiscountOnItem() {
        return totalDiscountOnItem;
    }

    @JsonProperty("TotalDiscountOnItem")
    public void setTotalDiscountOnItem(Integer totalDiscountOnItem) {
        this.totalDiscountOnItem = totalDiscountOnItem;
    }

    @JsonProperty("TotalDiscounts")
    public Integer getTotalDiscounts() {
        return totalDiscounts;
    }

    @JsonProperty("TotalDiscounts")
    public void setTotalDiscounts(Integer totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    @JsonProperty("TotalTaxes")
    public Integer getTotalTaxes() {
        return totalTaxes;
    }

    @JsonProperty("TotalTaxes")
    public void setTotalTaxes(Integer totalTaxes) {
        this.totalTaxes = totalTaxes;
    }

    @JsonProperty("TransactionReferenceId")
    public String getTransactionReferenceId() {
        return transactionReferenceId;
    }

    @JsonProperty("TransactionReferenceId")
    public void setTransactionReferenceId(String transactionReferenceId) {
        this.transactionReferenceId = transactionReferenceId;
    }

    @JsonProperty("Translations")
    public Translations__________________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations__________________________ translations) {
        this.translations = translations;
    }

    @JsonProperty("UOM")
    public String getUOM() {
        return uOM;
    }

    @JsonProperty("UOM")
    public void setUOM(String uOM) {
        this.uOM = uOM;
    }

    @JsonProperty("UnitPrice")
    public Integer getUnitPrice() {
        return unitPrice;
    }

    @JsonProperty("UnitPrice")
    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    @JsonProperty("UpdatedBy")
    public String getUpdatedBy() {
        return updatedBy;
    }

    @JsonProperty("UpdatedBy")
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @JsonProperty("UpdatedTimestamp")
    public String getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    @JsonProperty("UpdatedTimestamp")
    public void setUpdatedTimestamp(String updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    @JsonProperty("VolumetricWeight")
    public Integer getVolumetricWeight() {
        return volumetricWeight;
    }

    @JsonProperty("VolumetricWeight")
    public void setVolumetricWeight(Integer volumetricWeight) {
        this.volumetricWeight = volumetricWeight;
    }

    @JsonProperty("VolumetricWeightUOM")
    public VolumetricWeightUOM getVolumetricWeightUOM() {
        return volumetricWeightUOM;
    }

    @JsonProperty("VolumetricWeightUOM")
    public void setVolumetricWeightUOM(VolumetricWeightUOM volumetricWeightUOM) {
        this.volumetricWeightUOM = volumetricWeightUOM;
    }

    @JsonProperty("entityName")
    public String getEntityName() {
        return entityName;
    }

    @JsonProperty("entityName")
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @JsonProperty("messages")
    public Messages_________________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages_________________________ messages) {
        this.messages = messages;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
