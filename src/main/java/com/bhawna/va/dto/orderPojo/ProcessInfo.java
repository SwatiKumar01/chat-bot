
package com.bhawna.va.dto.orderPojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AccountReceivableAccountNumber",
    "AccountReceivableCode",
    "Actions",
    "AdvertisingCode",
    "AdvertisingDate",
    "BillOfLadingBreakAttribute",
    "CashOnDeliveryFund",
    "CreatedBy",
    "CreatedTimestamp",
    "CustomerBrokerAccountNumber",
    "CustomerDepartment",
    "DeclaredValue",
    "DeclaredValueCurrencyCode",
    "DesignatedEquipmentId",
    "DesignatedShipVia",
    "DestinationShipThroughLocation",
    "DsgStaticRouteId",
    "Extended",
    "FTSRNumber",
    "FedexDutyTaxAccountID",
    "FedexDutyTaxPaymentType",
    "FreightForwardAccountNumber",
    "GlobalLocationNumber",
    "ImporterDefinition",
    "InternalGoodsDescription",
    "InternationalGoodsDescription",
    "IsAutoConsolidationBlocked",
    "IsAutoCreateBlocked",
    "IsBackOrdered",
    "IsCartonMinWeight",
    "IsShipmentDocumentsOnly",
    "IsWarehouseTransfer",
    "LPNCubingIndicator",
    "Language",
    "MoveType",
    "MovementOption",
    "OrgId",
    "PK",
    "PalletCubingIndicator",
    "PlanningDestinationFacilityId",
    "PlanningOriginFacilityId",
    "PrimaryMaxicodeAddressNumber",
    "Priority",
    "RouteTo",
    "RouteType1",
    "RouteType2",
    "RouteWaveNumber",
    "RoutingAttributes",
    "ScheduleDeliveryDate",
    "SecondryMaxicodeAddressNumber",
    "ShipLocationControl",
    "ShipmentPlanningScheduleDay",
    "ShipmmentPlanningScheduleDay",
    "Translations",
    "TransportationWaveOptionId",
    "UpdatedBy",
    "UpdatedTimestamp",
    "WaveId",
    "entityName",
    "messages"
})
public class ProcessInfo implements Serializable
{

    @JsonProperty("AccountReceivableAccountNumber")
    private String accountReceivableAccountNumber;
    @JsonProperty("AccountReceivableCode")
    private String accountReceivableCode;
    @JsonProperty("Actions")
    private Actions_______________________________ actions;
    @JsonProperty("AdvertisingCode")
    private String advertisingCode;
    @JsonProperty("AdvertisingDate")
    private String advertisingDate;
    @JsonProperty("BillOfLadingBreakAttribute")
    private String billOfLadingBreakAttribute;
    @JsonProperty("CashOnDeliveryFund")
    private Boolean cashOnDeliveryFund;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("CustomerBrokerAccountNumber")
    private String customerBrokerAccountNumber;
    @JsonProperty("CustomerDepartment")
    private String customerDepartment;
    @JsonProperty("DeclaredValue")
    private Integer declaredValue;
    @JsonProperty("DeclaredValueCurrencyCode")
    private String declaredValueCurrencyCode;
    @JsonProperty("DesignatedEquipmentId")
    private Integer designatedEquipmentId;
    @JsonProperty("DesignatedShipVia")
    private String designatedShipVia;
    @JsonProperty("DestinationShipThroughLocation")
    private String destinationShipThroughLocation;
    @JsonProperty("DsgStaticRouteId")
    private String dsgStaticRouteId;
    @JsonProperty("Extended")
    private Extended_______________________________ extended;
    @JsonProperty("FTSRNumber")
    private String fTSRNumber;
    @JsonProperty("FedexDutyTaxAccountID")
    private String fedexDutyTaxAccountID;
    @JsonProperty("FedexDutyTaxPaymentType")
    private Integer fedexDutyTaxPaymentType;
    @JsonProperty("FreightForwardAccountNumber")
    private String freightForwardAccountNumber;
    @JsonProperty("GlobalLocationNumber")
    private String globalLocationNumber;
    @JsonProperty("ImporterDefinition")
    private String importerDefinition;
    @JsonProperty("InternalGoodsDescription")
    private String internalGoodsDescription;
    @JsonProperty("InternationalGoodsDescription")
    private String internationalGoodsDescription;
    @JsonProperty("IsAutoConsolidationBlocked")
    private Boolean isAutoConsolidationBlocked;
    @JsonProperty("IsAutoCreateBlocked")
    private Boolean isAutoCreateBlocked;
    @JsonProperty("IsBackOrdered")
    private Boolean isBackOrdered;
    @JsonProperty("IsCartonMinWeight")
    private Boolean isCartonMinWeight;
    @JsonProperty("IsShipmentDocumentsOnly")
    private Boolean isShipmentDocumentsOnly;
    @JsonProperty("IsWarehouseTransfer")
    private Boolean isWarehouseTransfer;
    @JsonProperty("LPNCubingIndicator")
    private String lPNCubingIndicator;
    @JsonProperty("Language")
    private String language;
    @JsonProperty("MoveType")
    private String moveType;
    @JsonProperty("MovementOption")
    private String movementOption;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("PalletCubingIndicator")
    private Integer palletCubingIndicator;
    @JsonProperty("PlanningDestinationFacilityId")
    private String planningDestinationFacilityId;
    @JsonProperty("PlanningOriginFacilityId")
    private String planningOriginFacilityId;
    @JsonProperty("PrimaryMaxicodeAddressNumber")
    private String primaryMaxicodeAddressNumber;
    @JsonProperty("Priority")
    private String priority;
    @JsonProperty("RouteTo")
    private String routeTo;
    @JsonProperty("RouteType1")
    private String routeType1;
    @JsonProperty("RouteType2")
    private String routeType2;
    @JsonProperty("RouteWaveNumber")
    private String routeWaveNumber;
    @JsonProperty("RoutingAttributes")
    private String routingAttributes;
    @JsonProperty("ScheduleDeliveryDate")
    private String scheduleDeliveryDate;
    @JsonProperty("SecondryMaxicodeAddressNumber")
    private String secondryMaxicodeAddressNumber;
    @JsonProperty("ShipLocationControl")
    private String shipLocationControl;
    @JsonProperty("ShipmentPlanningScheduleDay")
    private String shipmentPlanningScheduleDay;
    @JsonProperty("ShipmmentPlanningScheduleDay")
    private String shipmmentPlanningScheduleDay;
    @JsonProperty("Translations")
    private Translations______________________________ translations;
    @JsonProperty("TransportationWaveOptionId")
    private String transportationWaveOptionId;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("WaveId")
    private Integer waveId;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages_____________________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 9058511592133477141L;

    @JsonProperty("AccountReceivableAccountNumber")
    public String getAccountReceivableAccountNumber() {
        return accountReceivableAccountNumber;
    }

    @JsonProperty("AccountReceivableAccountNumber")
    public void setAccountReceivableAccountNumber(String accountReceivableAccountNumber) {
        this.accountReceivableAccountNumber = accountReceivableAccountNumber;
    }

    @JsonProperty("AccountReceivableCode")
    public String getAccountReceivableCode() {
        return accountReceivableCode;
    }

    @JsonProperty("AccountReceivableCode")
    public void setAccountReceivableCode(String accountReceivableCode) {
        this.accountReceivableCode = accountReceivableCode;
    }

    @JsonProperty("Actions")
    public Actions_______________________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions_______________________________ actions) {
        this.actions = actions;
    }

    @JsonProperty("AdvertisingCode")
    public String getAdvertisingCode() {
        return advertisingCode;
    }

    @JsonProperty("AdvertisingCode")
    public void setAdvertisingCode(String advertisingCode) {
        this.advertisingCode = advertisingCode;
    }

    @JsonProperty("AdvertisingDate")
    public String getAdvertisingDate() {
        return advertisingDate;
    }

    @JsonProperty("AdvertisingDate")
    public void setAdvertisingDate(String advertisingDate) {
        this.advertisingDate = advertisingDate;
    }

    @JsonProperty("BillOfLadingBreakAttribute")
    public String getBillOfLadingBreakAttribute() {
        return billOfLadingBreakAttribute;
    }

    @JsonProperty("BillOfLadingBreakAttribute")
    public void setBillOfLadingBreakAttribute(String billOfLadingBreakAttribute) {
        this.billOfLadingBreakAttribute = billOfLadingBreakAttribute;
    }

    @JsonProperty("CashOnDeliveryFund")
    public Boolean getCashOnDeliveryFund() {
        return cashOnDeliveryFund;
    }

    @JsonProperty("CashOnDeliveryFund")
    public void setCashOnDeliveryFund(Boolean cashOnDeliveryFund) {
        this.cashOnDeliveryFund = cashOnDeliveryFund;
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

    @JsonProperty("CustomerBrokerAccountNumber")
    public String getCustomerBrokerAccountNumber() {
        return customerBrokerAccountNumber;
    }

    @JsonProperty("CustomerBrokerAccountNumber")
    public void setCustomerBrokerAccountNumber(String customerBrokerAccountNumber) {
        this.customerBrokerAccountNumber = customerBrokerAccountNumber;
    }

    @JsonProperty("CustomerDepartment")
    public String getCustomerDepartment() {
        return customerDepartment;
    }

    @JsonProperty("CustomerDepartment")
    public void setCustomerDepartment(String customerDepartment) {
        this.customerDepartment = customerDepartment;
    }

    @JsonProperty("DeclaredValue")
    public Integer getDeclaredValue() {
        return declaredValue;
    }

    @JsonProperty("DeclaredValue")
    public void setDeclaredValue(Integer declaredValue) {
        this.declaredValue = declaredValue;
    }

    @JsonProperty("DeclaredValueCurrencyCode")
    public String getDeclaredValueCurrencyCode() {
        return declaredValueCurrencyCode;
    }

    @JsonProperty("DeclaredValueCurrencyCode")
    public void setDeclaredValueCurrencyCode(String declaredValueCurrencyCode) {
        this.declaredValueCurrencyCode = declaredValueCurrencyCode;
    }

    @JsonProperty("DesignatedEquipmentId")
    public Integer getDesignatedEquipmentId() {
        return designatedEquipmentId;
    }

    @JsonProperty("DesignatedEquipmentId")
    public void setDesignatedEquipmentId(Integer designatedEquipmentId) {
        this.designatedEquipmentId = designatedEquipmentId;
    }

    @JsonProperty("DesignatedShipVia")
    public String getDesignatedShipVia() {
        return designatedShipVia;
    }

    @JsonProperty("DesignatedShipVia")
    public void setDesignatedShipVia(String designatedShipVia) {
        this.designatedShipVia = designatedShipVia;
    }

    @JsonProperty("DestinationShipThroughLocation")
    public String getDestinationShipThroughLocation() {
        return destinationShipThroughLocation;
    }

    @JsonProperty("DestinationShipThroughLocation")
    public void setDestinationShipThroughLocation(String destinationShipThroughLocation) {
        this.destinationShipThroughLocation = destinationShipThroughLocation;
    }

    @JsonProperty("DsgStaticRouteId")
    public String getDsgStaticRouteId() {
        return dsgStaticRouteId;
    }

    @JsonProperty("DsgStaticRouteId")
    public void setDsgStaticRouteId(String dsgStaticRouteId) {
        this.dsgStaticRouteId = dsgStaticRouteId;
    }

    @JsonProperty("Extended")
    public Extended_______________________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended_______________________________ extended) {
        this.extended = extended;
    }

    @JsonProperty("FTSRNumber")
    public String getFTSRNumber() {
        return fTSRNumber;
    }

    @JsonProperty("FTSRNumber")
    public void setFTSRNumber(String fTSRNumber) {
        this.fTSRNumber = fTSRNumber;
    }

    @JsonProperty("FedexDutyTaxAccountID")
    public String getFedexDutyTaxAccountID() {
        return fedexDutyTaxAccountID;
    }

    @JsonProperty("FedexDutyTaxAccountID")
    public void setFedexDutyTaxAccountID(String fedexDutyTaxAccountID) {
        this.fedexDutyTaxAccountID = fedexDutyTaxAccountID;
    }

    @JsonProperty("FedexDutyTaxPaymentType")
    public Integer getFedexDutyTaxPaymentType() {
        return fedexDutyTaxPaymentType;
    }

    @JsonProperty("FedexDutyTaxPaymentType")
    public void setFedexDutyTaxPaymentType(Integer fedexDutyTaxPaymentType) {
        this.fedexDutyTaxPaymentType = fedexDutyTaxPaymentType;
    }

    @JsonProperty("FreightForwardAccountNumber")
    public String getFreightForwardAccountNumber() {
        return freightForwardAccountNumber;
    }

    @JsonProperty("FreightForwardAccountNumber")
    public void setFreightForwardAccountNumber(String freightForwardAccountNumber) {
        this.freightForwardAccountNumber = freightForwardAccountNumber;
    }

    @JsonProperty("GlobalLocationNumber")
    public String getGlobalLocationNumber() {
        return globalLocationNumber;
    }

    @JsonProperty("GlobalLocationNumber")
    public void setGlobalLocationNumber(String globalLocationNumber) {
        this.globalLocationNumber = globalLocationNumber;
    }

    @JsonProperty("ImporterDefinition")
    public String getImporterDefinition() {
        return importerDefinition;
    }

    @JsonProperty("ImporterDefinition")
    public void setImporterDefinition(String importerDefinition) {
        this.importerDefinition = importerDefinition;
    }

    @JsonProperty("InternalGoodsDescription")
    public String getInternalGoodsDescription() {
        return internalGoodsDescription;
    }

    @JsonProperty("InternalGoodsDescription")
    public void setInternalGoodsDescription(String internalGoodsDescription) {
        this.internalGoodsDescription = internalGoodsDescription;
    }

    @JsonProperty("InternationalGoodsDescription")
    public String getInternationalGoodsDescription() {
        return internationalGoodsDescription;
    }

    @JsonProperty("InternationalGoodsDescription")
    public void setInternationalGoodsDescription(String internationalGoodsDescription) {
        this.internationalGoodsDescription = internationalGoodsDescription;
    }

    @JsonProperty("IsAutoConsolidationBlocked")
    public Boolean getIsAutoConsolidationBlocked() {
        return isAutoConsolidationBlocked;
    }

    @JsonProperty("IsAutoConsolidationBlocked")
    public void setIsAutoConsolidationBlocked(Boolean isAutoConsolidationBlocked) {
        this.isAutoConsolidationBlocked = isAutoConsolidationBlocked;
    }

    @JsonProperty("IsAutoCreateBlocked")
    public Boolean getIsAutoCreateBlocked() {
        return isAutoCreateBlocked;
    }

    @JsonProperty("IsAutoCreateBlocked")
    public void setIsAutoCreateBlocked(Boolean isAutoCreateBlocked) {
        this.isAutoCreateBlocked = isAutoCreateBlocked;
    }

    @JsonProperty("IsBackOrdered")
    public Boolean getIsBackOrdered() {
        return isBackOrdered;
    }

    @JsonProperty("IsBackOrdered")
    public void setIsBackOrdered(Boolean isBackOrdered) {
        this.isBackOrdered = isBackOrdered;
    }

    @JsonProperty("IsCartonMinWeight")
    public Boolean getIsCartonMinWeight() {
        return isCartonMinWeight;
    }

    @JsonProperty("IsCartonMinWeight")
    public void setIsCartonMinWeight(Boolean isCartonMinWeight) {
        this.isCartonMinWeight = isCartonMinWeight;
    }

    @JsonProperty("IsShipmentDocumentsOnly")
    public Boolean getIsShipmentDocumentsOnly() {
        return isShipmentDocumentsOnly;
    }

    @JsonProperty("IsShipmentDocumentsOnly")
    public void setIsShipmentDocumentsOnly(Boolean isShipmentDocumentsOnly) {
        this.isShipmentDocumentsOnly = isShipmentDocumentsOnly;
    }

    @JsonProperty("IsWarehouseTransfer")
    public Boolean getIsWarehouseTransfer() {
        return isWarehouseTransfer;
    }

    @JsonProperty("IsWarehouseTransfer")
    public void setIsWarehouseTransfer(Boolean isWarehouseTransfer) {
        this.isWarehouseTransfer = isWarehouseTransfer;
    }

    @JsonProperty("LPNCubingIndicator")
    public String getLPNCubingIndicator() {
        return lPNCubingIndicator;
    }

    @JsonProperty("LPNCubingIndicator")
    public void setLPNCubingIndicator(String lPNCubingIndicator) {
        this.lPNCubingIndicator = lPNCubingIndicator;
    }

    @JsonProperty("Language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("Language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("MoveType")
    public String getMoveType() {
        return moveType;
    }

    @JsonProperty("MoveType")
    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }

    @JsonProperty("MovementOption")
    public String getMovementOption() {
        return movementOption;
    }

    @JsonProperty("MovementOption")
    public void setMovementOption(String movementOption) {
        this.movementOption = movementOption;
    }

    @JsonProperty("OrgId")
    public String getOrgId() {
        return orgId;
    }

    @JsonProperty("OrgId")
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @JsonProperty("PK")
    public String getPK() {
        return pK;
    }

    @JsonProperty("PK")
    public void setPK(String pK) {
        this.pK = pK;
    }

    @JsonProperty("PalletCubingIndicator")
    public Integer getPalletCubingIndicator() {
        return palletCubingIndicator;
    }

    @JsonProperty("PalletCubingIndicator")
    public void setPalletCubingIndicator(Integer palletCubingIndicator) {
        this.palletCubingIndicator = palletCubingIndicator;
    }

    @JsonProperty("PlanningDestinationFacilityId")
    public String getPlanningDestinationFacilityId() {
        return planningDestinationFacilityId;
    }

    @JsonProperty("PlanningDestinationFacilityId")
    public void setPlanningDestinationFacilityId(String planningDestinationFacilityId) {
        this.planningDestinationFacilityId = planningDestinationFacilityId;
    }

    @JsonProperty("PlanningOriginFacilityId")
    public String getPlanningOriginFacilityId() {
        return planningOriginFacilityId;
    }

    @JsonProperty("PlanningOriginFacilityId")
    public void setPlanningOriginFacilityId(String planningOriginFacilityId) {
        this.planningOriginFacilityId = planningOriginFacilityId;
    }

    @JsonProperty("PrimaryMaxicodeAddressNumber")
    public String getPrimaryMaxicodeAddressNumber() {
        return primaryMaxicodeAddressNumber;
    }

    @JsonProperty("PrimaryMaxicodeAddressNumber")
    public void setPrimaryMaxicodeAddressNumber(String primaryMaxicodeAddressNumber) {
        this.primaryMaxicodeAddressNumber = primaryMaxicodeAddressNumber;
    }

    @JsonProperty("Priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("Priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("RouteTo")
    public String getRouteTo() {
        return routeTo;
    }

    @JsonProperty("RouteTo")
    public void setRouteTo(String routeTo) {
        this.routeTo = routeTo;
    }

    @JsonProperty("RouteType1")
    public String getRouteType1() {
        return routeType1;
    }

    @JsonProperty("RouteType1")
    public void setRouteType1(String routeType1) {
        this.routeType1 = routeType1;
    }

    @JsonProperty("RouteType2")
    public String getRouteType2() {
        return routeType2;
    }

    @JsonProperty("RouteType2")
    public void setRouteType2(String routeType2) {
        this.routeType2 = routeType2;
    }

    @JsonProperty("RouteWaveNumber")
    public String getRouteWaveNumber() {
        return routeWaveNumber;
    }

    @JsonProperty("RouteWaveNumber")
    public void setRouteWaveNumber(String routeWaveNumber) {
        this.routeWaveNumber = routeWaveNumber;
    }

    @JsonProperty("RoutingAttributes")
    public String getRoutingAttributes() {
        return routingAttributes;
    }

    @JsonProperty("RoutingAttributes")
    public void setRoutingAttributes(String routingAttributes) {
        this.routingAttributes = routingAttributes;
    }

    @JsonProperty("ScheduleDeliveryDate")
    public String getScheduleDeliveryDate() {
        return scheduleDeliveryDate;
    }

    @JsonProperty("ScheduleDeliveryDate")
    public void setScheduleDeliveryDate(String scheduleDeliveryDate) {
        this.scheduleDeliveryDate = scheduleDeliveryDate;
    }

    @JsonProperty("SecondryMaxicodeAddressNumber")
    public String getSecondryMaxicodeAddressNumber() {
        return secondryMaxicodeAddressNumber;
    }

    @JsonProperty("SecondryMaxicodeAddressNumber")
    public void setSecondryMaxicodeAddressNumber(String secondryMaxicodeAddressNumber) {
        this.secondryMaxicodeAddressNumber = secondryMaxicodeAddressNumber;
    }

    @JsonProperty("ShipLocationControl")
    public String getShipLocationControl() {
        return shipLocationControl;
    }

    @JsonProperty("ShipLocationControl")
    public void setShipLocationControl(String shipLocationControl) {
        this.shipLocationControl = shipLocationControl;
    }

    @JsonProperty("ShipmentPlanningScheduleDay")
    public String getShipmentPlanningScheduleDay() {
        return shipmentPlanningScheduleDay;
    }

    @JsonProperty("ShipmentPlanningScheduleDay")
    public void setShipmentPlanningScheduleDay(String shipmentPlanningScheduleDay) {
        this.shipmentPlanningScheduleDay = shipmentPlanningScheduleDay;
    }

    @JsonProperty("ShipmmentPlanningScheduleDay")
    public String getShipmmentPlanningScheduleDay() {
        return shipmmentPlanningScheduleDay;
    }

    @JsonProperty("ShipmmentPlanningScheduleDay")
    public void setShipmmentPlanningScheduleDay(String shipmmentPlanningScheduleDay) {
        this.shipmmentPlanningScheduleDay = shipmmentPlanningScheduleDay;
    }

    @JsonProperty("Translations")
    public Translations______________________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations______________________________ translations) {
        this.translations = translations;
    }

    @JsonProperty("TransportationWaveOptionId")
    public String getTransportationWaveOptionId() {
        return transportationWaveOptionId;
    }

    @JsonProperty("TransportationWaveOptionId")
    public void setTransportationWaveOptionId(String transportationWaveOptionId) {
        this.transportationWaveOptionId = transportationWaveOptionId;
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

    @JsonProperty("WaveId")
    public Integer getWaveId() {
        return waveId;
    }

    @JsonProperty("WaveId")
    public void setWaveId(Integer waveId) {
        this.waveId = waveId;
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
    public Messages_____________________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages_____________________________ messages) {
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
