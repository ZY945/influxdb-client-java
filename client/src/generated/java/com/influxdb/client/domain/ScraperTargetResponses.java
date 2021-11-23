/*
 * Influx OSS API Service
 * The InfluxDB v2 API provides a programmatic interface for all interactions with InfluxDB. Access the InfluxDB API using the `/api/v2/` endpoint. 
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client.domain;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.influxdb.client.domain.ScraperTargetResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ScraperTargetResponses
 */

public class ScraperTargetResponses {
  public static final String SERIALIZED_NAME_CONFIGURATIONS = "configurations";
  @SerializedName(SERIALIZED_NAME_CONFIGURATIONS)
  private List<ScraperTargetResponse> configurations = new ArrayList<>();

  public ScraperTargetResponses configurations(List<ScraperTargetResponse> configurations) {
    this.configurations = configurations;
    return this;
  }

  public ScraperTargetResponses addConfigurationsItem(ScraperTargetResponse configurationsItem) {
    if (this.configurations == null) {
      this.configurations = new ArrayList<>();
    }
    this.configurations.add(configurationsItem);
    return this;
  }

   /**
   * Get configurations
   * @return configurations
  **/
  @ApiModelProperty(value = "")
  public List<ScraperTargetResponse> getConfigurations() {
    return configurations;
  }

  public void setConfigurations(List<ScraperTargetResponse> configurations) {
    this.configurations = configurations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScraperTargetResponses scraperTargetResponses = (ScraperTargetResponses) o;
    return Objects.equals(this.configurations, scraperTargetResponses.configurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScraperTargetResponses {\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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

