/**
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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.openapitools.client.model.Animal;




public class MixedPropertiesAndAdditionalPropertiesClass  {
  
  private UUID uuid;

  private OffsetDateTime dateTime;

  private Map<String, Animal> map = null;

 /**
   * Get uuid
   * @return uuid
  **/
  public UUID getUuid() {
    return uuid;
  }

  /**
    * Set uuid
  **/
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public MixedPropertiesAndAdditionalPropertiesClass uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

 /**
   * Get dateTime
   * @return dateTime
  **/
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  /**
    * Set dateTime
  **/
  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public MixedPropertiesAndAdditionalPropertiesClass dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

 /**
   * Get map
   * @return map
  **/
  public Map<String, Animal> getMap() {
    return map;
  }

  /**
    * Set map
  **/
  public void setMap(Map<String, Animal> map) {
    this.map = map;
  }

  public MixedPropertiesAndAdditionalPropertiesClass map(Map<String, Animal> map) {
    this.map = map;
    return this;
  }

  public MixedPropertiesAndAdditionalPropertiesClass putMapItem(String key, Animal mapItem) {
    this.map.put(key, mapItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MixedPropertiesAndAdditionalPropertiesClass {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

