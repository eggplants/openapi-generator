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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DeprecatedObject
 * @deprecated
 */
@Deprecated
@JsonPropertyOrder({
  DeprecatedObject.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 8.0.0-SNAPSHOT")
public class DeprecatedObject {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public DeprecatedObject() {
  }

  /**
  * Constructor with all args parameters
  */
  public DeprecatedObject(@JsonProperty(JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public DeprecatedObject name(String name) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeprecatedObject deprecatedObject = (DeprecatedObject) o;
    return Objects.equals(this.name, deprecatedObject.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeprecatedObject {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

  public static class Builder {

    private DeprecatedObject instance;

    public Builder() {
      this(new DeprecatedObject());
    }

    protected Builder(DeprecatedObject instance) {
      this.instance = instance;
    }

    public DeprecatedObject.Builder name(String name) {
      this.instance.name = name;
      return this;
    }


    /**
    * returns a built DeprecatedObject instance.
    *
    * The builder is not reusable.
    */
    public DeprecatedObject build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
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
  public static DeprecatedObject.Builder builder() {
    return new DeprecatedObject.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public DeprecatedObject.Builder toBuilder() {
    return new DeprecatedObject.Builder()
      .name(getName());
  }


}

