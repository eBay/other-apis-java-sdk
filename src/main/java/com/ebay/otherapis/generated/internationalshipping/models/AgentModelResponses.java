package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields that describe an EU AR agent.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentModelResponses implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The address of the EU AR agent.
     */
    private String agentAddress;
    /**
     * The name of the EU AR agent.
     */
    private String agentName;
    /**
     * The phone number of the EU AR agent.
     */
    private String agentPhone;
    /**
     * This array returns the supported shipping countries and eBay user IDs associated with the EU AR agent.
     */
    private java.util.List<AgentPreferenceListResponse> agentPreferences;
    /**
     * The seller-defined setting name of the AR agent.
     */
    private String arName;
    /**
     * Instantiates a new {@link AgentModelResponses} and sets the default values.
     */
    public AgentModelResponses() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentModelResponses}
     */
    @jakarta.annotation.Nonnull
    public static AgentModelResponses createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentModelResponses();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the agentAddress property value. The address of the EU AR agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentAddress() {
        return this.agentAddress;
    }
    /**
     * Gets the agentName property value. The name of the EU AR agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentName() {
        return this.agentName;
    }
    /**
     * Gets the agentPhone property value. The phone number of the EU AR agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentPhone() {
        return this.agentPhone;
    }
    /**
     * Gets the agentPreferences property value. This array returns the supported shipping countries and eBay user IDs associated with the EU AR agent.
     * @return a {@link java.util.List<AgentPreferenceListResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgentPreferenceListResponse> getAgentPreferences() {
        return this.agentPreferences;
    }
    /**
     * Gets the arName property value. The seller-defined setting name of the AR agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getArName() {
        return this.arName;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("agentAddress", (n) -> { this.setAgentAddress(n.getStringValue()); });
        deserializerMap.put("agentName", (n) -> { this.setAgentName(n.getStringValue()); });
        deserializerMap.put("agentPhone", (n) -> { this.setAgentPhone(n.getStringValue()); });
        deserializerMap.put("agentPreferences", (n) -> { this.setAgentPreferences(n.getCollectionOfObjectValues(AgentPreferenceListResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("arName", (n) -> { this.setArName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("agentAddress", this.getAgentAddress());
        writer.writeStringValue("agentName", this.getAgentName());
        writer.writeStringValue("agentPhone", this.getAgentPhone());
        writer.writeCollectionOfObjectValues("agentPreferences", this.getAgentPreferences());
        writer.writeStringValue("arName", this.getArName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the agentAddress property value. The address of the EU AR agent.
     * @param value Value to set for the agentAddress property.
     */
    public void setAgentAddress(@jakarta.annotation.Nullable final String value) {
        this.agentAddress = value;
    }
    /**
     * Sets the agentName property value. The name of the EU AR agent.
     * @param value Value to set for the agentName property.
     */
    public void setAgentName(@jakarta.annotation.Nullable final String value) {
        this.agentName = value;
    }
    /**
     * Sets the agentPhone property value. The phone number of the EU AR agent.
     * @param value Value to set for the agentPhone property.
     */
    public void setAgentPhone(@jakarta.annotation.Nullable final String value) {
        this.agentPhone = value;
    }
    /**
     * Sets the agentPreferences property value. This array returns the supported shipping countries and eBay user IDs associated with the EU AR agent.
     * @param value Value to set for the agentPreferences property.
     */
    public void setAgentPreferences(@jakarta.annotation.Nullable final java.util.List<AgentPreferenceListResponse> value) {
        this.agentPreferences = value;
    }
    /**
     * Sets the arName property value. The seller-defined setting name of the AR agent.
     * @param value Value to set for the arName property.
     */
    public void setArName(@jakarta.annotation.Nullable final String value) {
        this.arName = value;
    }
}
