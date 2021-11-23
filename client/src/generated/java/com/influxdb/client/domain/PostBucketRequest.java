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
import com.influxdb.client.domain.BucketRetentionRules;
import com.influxdb.client.domain.SchemaType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PostBucketRequest
 */

public class PostBucketRequest {
  public static final String SERIALIZED_NAME_ORG_I_D = "orgID";
  @SerializedName(SERIALIZED_NAME_ORG_I_D)
  private String orgID;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RP = "rp";
  @SerializedName(SERIALIZED_NAME_RP)
  private String rp;

  public static final String SERIALIZED_NAME_RETENTION_RULES = "retentionRules";
  @SerializedName(SERIALIZED_NAME_RETENTION_RULES)
  private List<BucketRetentionRules> retentionRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCHEMA_TYPE = "schemaType";
  @SerializedName(SERIALIZED_NAME_SCHEMA_TYPE)
  private SchemaType schemaType = null;

  public PostBucketRequest orgID(String orgID) {
    this.orgID = orgID;
    return this;
  }

   /**
   * Get orgID
   * @return orgID
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOrgID() {
    return orgID;
  }

  public void setOrgID(String orgID) {
    this.orgID = orgID;
  }

  public PostBucketRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostBucketRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostBucketRequest rp(String rp) {
    this.rp = rp;
    return this;
  }

   /**
   * Get rp
   * @return rp
  **/
  @ApiModelProperty(value = "")
  public String getRp() {
    return rp;
  }

  public void setRp(String rp) {
    this.rp = rp;
  }

  public PostBucketRequest retentionRules(List<BucketRetentionRules> retentionRules) {
    this.retentionRules = retentionRules;
    return this;
  }

  public PostBucketRequest addRetentionRulesItem(BucketRetentionRules retentionRulesItem) {
    this.retentionRules.add(retentionRulesItem);
    return this;
  }

   /**
   * Rules to expire or retain data.  No rules means data never expires.
   * @return retentionRules
  **/
  @ApiModelProperty(required = true, value = "Rules to expire or retain data.  No rules means data never expires.")
  public List<BucketRetentionRules> getRetentionRules() {
    return retentionRules;
  }

  public void setRetentionRules(List<BucketRetentionRules> retentionRules) {
    this.retentionRules = retentionRules;
  }

  public PostBucketRequest schemaType(SchemaType schemaType) {
    this.schemaType = schemaType;
    return this;
  }

   /**
   * Get schemaType
   * @return schemaType
  **/
  @ApiModelProperty(value = "")
  public SchemaType getSchemaType() {
    return schemaType;
  }

  public void setSchemaType(SchemaType schemaType) {
    this.schemaType = schemaType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostBucketRequest postBucketRequest = (PostBucketRequest) o;
    return Objects.equals(this.orgID, postBucketRequest.orgID) &&
        Objects.equals(this.name, postBucketRequest.name) &&
        Objects.equals(this.description, postBucketRequest.description) &&
        Objects.equals(this.rp, postBucketRequest.rp) &&
        Objects.equals(this.retentionRules, postBucketRequest.retentionRules) &&
        Objects.equals(this.schemaType, postBucketRequest.schemaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgID, name, description, rp, retentionRules, schemaType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostBucketRequest {\n");
    sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rp: ").append(toIndentedString(rp)).append("\n");
    sb.append("    retentionRules: ").append(toIndentedString(retentionRules)).append("\n");
    sb.append("    schemaType: ").append(toIndentedString(schemaType)).append("\n");
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

