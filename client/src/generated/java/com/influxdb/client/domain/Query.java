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
import com.influxdb.client.domain.Dialect;
import com.influxdb.client.domain.File;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Query influx using the Flux language
 */
@ApiModel(description = "Query influx using the Flux language")

public class Query {
  public static final String SERIALIZED_NAME_EXTERN = "extern";
  @SerializedName(SERIALIZED_NAME_EXTERN)
  private File extern = null;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  /**
   * The type of query. Must be \&quot;flux\&quot;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FLUX("flux");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.FLUX;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private Map<String, Object> params = new HashMap<>();

  public static final String SERIALIZED_NAME_DIALECT = "dialect";
  @SerializedName(SERIALIZED_NAME_DIALECT)
  private Dialect dialect = null;

  public static final String SERIALIZED_NAME_NOW = "now";
  @SerializedName(SERIALIZED_NAME_NOW)
  private OffsetDateTime now;

  public Query extern(File extern) {
    this.extern = extern;
    return this;
  }

   /**
   * Get extern
   * @return extern
  **/
  @ApiModelProperty(value = "")
  public File getExtern() {
    return extern;
  }

  public void setExtern(File extern) {
    this.extern = extern;
  }

  public Query query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Query script to execute.
   * @return query
  **/
  @ApiModelProperty(required = true, value = "Query script to execute.")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

   /**
   * The type of query. Must be \&quot;flux\&quot;.
   * @return type
  **/
  @ApiModelProperty(value = "The type of query. Must be \"flux\".")
  public TypeEnum getType() {
    return type;
  }

  public Query params(Map<String, Object> params) {
    this.params = params;
    return this;
  }

  public Query putParamsItem(String key, Object paramsItem) {
    if (this.params == null) {
      this.params = new HashMap<>();
    }
    this.params.put(key, paramsItem);
    return this;
  }

   /**
   * Enumeration of key/value pairs that respresent parameters to be injected into query (can only specify either this field or extern and not both)
   * @return params
  **/
  @ApiModelProperty(value = "Enumeration of key/value pairs that respresent parameters to be injected into query (can only specify either this field or extern and not both)")
  public Map<String, Object> getParams() {
    return params;
  }

  public void setParams(Map<String, Object> params) {
    this.params = params;
  }

  public Query dialect(Dialect dialect) {
    this.dialect = dialect;
    return this;
  }

   /**
   * Get dialect
   * @return dialect
  **/
  @ApiModelProperty(value = "")
  public Dialect getDialect() {
    return dialect;
  }

  public void setDialect(Dialect dialect) {
    this.dialect = dialect;
  }

  public Query now(OffsetDateTime now) {
    this.now = now;
    return this;
  }

   /**
   * Specifies the time that should be reported as \&quot;now\&quot; in the query. Default is the server&#39;s now time.
   * @return now
  **/
  @ApiModelProperty(value = "Specifies the time that should be reported as \"now\" in the query. Default is the server's now time.")
  public OffsetDateTime getNow() {
    return now;
  }

  public void setNow(OffsetDateTime now) {
    this.now = now;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Query query = (Query) o;
    return Objects.equals(this.extern, query.extern) &&
        Objects.equals(this.query, query.query) &&
        Objects.equals(this.type, query.type) &&
        Objects.equals(this.params, query.params) &&
        Objects.equals(this.dialect, query.dialect) &&
        Objects.equals(this.now, query.now);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extern, query, type, params, dialect, now);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    sb.append("    extern: ").append(toIndentedString(extern)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    dialect: ").append(toIndentedString(dialect)).append("\n");
    sb.append("    now: ").append(toIndentedString(now)).append("\n");
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

