/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.client.model.ParentPet;
import java.util.Set;
import java.util.HashSet;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.openapitools.client.JSON;
/**
 * ChildCat
 */
@JsonPropertyOrder({
  ChildCat.JSON_PROPERTY_NAME,
  ChildCat.JSON_PROPERTY_PET_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 8.0.0-SNAPSHOT")
@JsonIgnoreProperties(
  value = "pet_type", // ignore manually set pet_type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the pet_type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "pet_type", visible = true)

public class ChildCat extends ParentPet {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PET_TYPE = "pet_type";
  private String petType = "ChildCat";

  public ChildCat() { 
  }

  public ChildCat name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public static final Set<String> PET_TYPE_VALUES = new HashSet<>(Arrays.asList(
    "ChildCat"
  ));

  public ChildCat petType(String petType) {
    if (!PET_TYPE_VALUES.contains(petType)) {
      throw new IllegalArgumentException(petType + " is invalid. Possible values for petType: " + String.join(", ", PET_TYPE_VALUES));
    }

    this.petType = petType;
    return this;
  }

   /**
   * Get petType
   * @return petType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPetType() {
    return petType;
  }


  @JsonProperty(JSON_PROPERTY_PET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPetType(String petType) {
    if (!PET_TYPE_VALUES.contains(petType)) {
      throw new IllegalArgumentException(petType + " is invalid. Possible values for petType: " + String.join(", ", PET_TYPE_VALUES));
    }

    this.petType = petType;
  }


  /**
   * Return true if this ChildCat object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildCat childCat = (ChildCat) o;
    return Objects.equals(this.name, childCat.name) &&
        Objects.equals(this.petType, childCat.petType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, petType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildCat {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    petType: ").append(toIndentedString(petType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `pet_type` to the URL query string
    if (getPetType() != null) {
      joiner.add(String.format("%spet_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPetType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("ChildCat", ChildCat.class);
  JSON.registerDiscriminator(ChildCat.class, "pet_type", mappings);
}

    public static class Builder extends ParentPet.Builder {

    private ChildCat instance;

    public Builder() {
      this(new ChildCat());
    }

    protected Builder(ChildCat instance) {
      super(instance);
      this.instance = instance;
    }

    public ChildCat.Builder name(String name) {
      this.instance.name = name;
      return this;
    }
    public ChildCat.Builder petType(String petType) {
      this.instance.petType = petType;
      return this;
    }


    /**
    * returns a built ChildCat instance.
    *
    * The builder is not reusable.
    */
    public ChildCat build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        super.build();
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static ChildCat.Builder builder() {
    return new ChildCat.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public ChildCat.Builder toBuilder() {
    return new ChildCat.Builder()
      .petType(getPetType())
      .name(getName());
  }

}

