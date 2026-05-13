package com.ebay.otherapis.generated.internationalshipping.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines information about an EU AR agent, such as their address, name, and phone number.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentInfoData implements AdditionalDataHolder, Parsable {
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
     * Instantiates a new {@link AgentInfoData} and sets the default values.
     */
    public AgentInfoData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentInfoData}
     */
    @jakarta.annotation.Nonnull
    public static AgentInfoData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentInfoData();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("agentAddress", (n) -> { this.setAgentAddress(n.getStringValue()); });
        deserializerMap.put("agentName", (n) -> { this.setAgentName(n.getStringValue()); });
        deserializerMap.put("agentPhone", (n) -> { this.setAgentPhone(n.getStringValue()); });
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
}
