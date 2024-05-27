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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ArrayOfArrayOfNumberOnly
 */
@JsonPropertyOrder({
  ArrayOfArrayOfNumberOnly.JSON_PROPERTY_ARRAY_ARRAY_NUMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 8.0.0-SNAPSHOT")
public class ArrayOfArrayOfNumberOnly {
  public static final String JSON_PROPERTY_ARRAY_ARRAY_NUMBER = "ArrayArrayNumber";
  private List<List<BigDecimal>> arrayArrayNumber;

  public ArrayOfArrayOfNumberOnly() {
  }

  /**
  * Constructor with all args parameters
  */
  public ArrayOfArrayOfNumberOnly(@JsonProperty(JSON_PROPERTY_ARRAY_ARRAY_NUMBER) List<List<BigDecimal>> arrayArrayNumber) {
    this.arrayArrayNumber = arrayArrayNumber;
  }

  public ArrayOfArrayOfNumberOnly arrayArrayNumber(List<List<BigDecimal>> arrayArrayNumber) {
    
    this.arrayArrayNumber = arrayArrayNumber;
    return this;
  }

  public ArrayOfArrayOfNumberOnly addArrayArrayNumberItem(List<BigDecimal> arrayArrayNumberItem) {
    if (this.arrayArrayNumber == null) {
      this.arrayArrayNumber = new ArrayList<>();
    }
    this.arrayArrayNumber.add(arrayArrayNumberItem);
    return this;
  }

   /**
   * Get arrayArrayNumber
   * @return arrayArrayNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARRAY_ARRAY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<List<BigDecimal>> getArrayArrayNumber() {
    return arrayArrayNumber;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY_ARRAY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayArrayNumber(List<List<BigDecimal>> arrayArrayNumber) {
    this.arrayArrayNumber = arrayArrayNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly = (ArrayOfArrayOfNumberOnly) o;
    return Objects.equals(this.arrayArrayNumber, arrayOfArrayOfNumberOnly.arrayArrayNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayArrayNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayOfArrayOfNumberOnly {\n");
    sb.append("    arrayArrayNumber: ").append(toIndentedString(arrayArrayNumber)).append("\n");
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

    private ArrayOfArrayOfNumberOnly instance;

    public Builder() {
      this(new ArrayOfArrayOfNumberOnly());
    }

    protected Builder(ArrayOfArrayOfNumberOnly instance) {
      this.instance = instance;
    }

    public ArrayOfArrayOfNumberOnly.Builder arrayArrayNumber(List<List<BigDecimal>> arrayArrayNumber) {
      this.instance.arrayArrayNumber = arrayArrayNumber;
      return this;
    }


    /**
    * returns a built ArrayOfArrayOfNumberOnly instance.
    *
    * The builder is not reusable.
    */
    public ArrayOfArrayOfNumberOnly build() {
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
  public static ArrayOfArrayOfNumberOnly.Builder builder() {
    return new ArrayOfArrayOfNumberOnly.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public ArrayOfArrayOfNumberOnly.Builder toBuilder() {
    return new ArrayOfArrayOfNumberOnly.Builder()
      .arrayArrayNumber(getArrayArrayNumber());
  }


}

