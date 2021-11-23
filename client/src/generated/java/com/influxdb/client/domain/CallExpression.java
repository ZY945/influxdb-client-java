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
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.influxdb.client.domain.Expression;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a function call
 */
@ApiModel(description = "Represents a function call")

public class CallExpression extends Expression {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CALLEE = "callee";
  @SerializedName(SERIALIZED_NAME_CALLEE)
  @JsonAdapter(CallExpressionCalleeAdapter.class)
  private Expression callee = null;

  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  @JsonAdapter(CallExpressionArgumentsAdapter.class)
  private List<Expression> arguments = new ArrayList<>();

  public CallExpression type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of AST node
   * @return type
  **/
  @ApiModelProperty(value = "Type of AST node")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CallExpression callee(Expression callee) {
    this.callee = callee;
    return this;
  }

   /**
   * Get callee
   * @return callee
  **/
  @ApiModelProperty(value = "")
  public Expression getCallee() {
    return callee;
  }

  public void setCallee(Expression callee) {
    this.callee = callee;
  }

  public CallExpression arguments(List<Expression> arguments) {
    this.arguments = arguments;
    return this;
  }

  public CallExpression addArgumentsItem(Expression argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

   /**
   * Function arguments
   * @return arguments
  **/
  @ApiModelProperty(value = "Function arguments")
  public List<Expression> getArguments() {
    return arguments;
  }

  public void setArguments(List<Expression> arguments) {
    this.arguments = arguments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallExpression callExpression = (CallExpression) o;
    return Objects.equals(this.type, callExpression.type) &&
        Objects.equals(this.callee, callExpression.callee) &&
        Objects.equals(this.arguments, callExpression.arguments) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, callee, arguments, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallExpression {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    callee: ").append(toIndentedString(callee)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

  public static class CallExpressionArgumentsAdapter implements JsonDeserializer<Object>, JsonSerializer<Object> {

    public CallExpressionArgumentsAdapter() {
    }

    @Override
    public Object deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {

      List<String> discriminator = Arrays.asList("type");

      List<Object> results = new ArrayList<>();

      for (JsonElement arrayItem: json.getAsJsonArray()){
        JsonObject jsonObject = arrayItem.getAsJsonObject();

        String[] types = discriminator.stream().map(jsonObject::get).filter(Objects::nonNull).map(JsonElement::getAsString).toArray(String[]::new);

        results.add(deserialize(types, jsonObject, context));
      }

      return results;
    }

    @Override
    public JsonElement serialize(Object object, Type typeOfSrc, JsonSerializationContext context) {

      return context.serialize(object);
    }

    private Object deserialize(final String[] types, final JsonElement json, final JsonDeserializationContext context) {

      if (Arrays.equals(new String[]{ "ArrayExpression" }, types)) {
        return context.deserialize(json, ArrayExpression.class);
      }
      if (Arrays.equals(new String[]{ "DictExpression" }, types)) {
        return context.deserialize(json, DictExpression.class);
      }
      if (Arrays.equals(new String[]{ "FunctionExpression" }, types)) {
        return context.deserialize(json, FunctionExpression.class);
      }
      if (Arrays.equals(new String[]{ "BinaryExpression" }, types)) {
        return context.deserialize(json, BinaryExpression.class);
      }
      if (Arrays.equals(new String[]{ "CallExpression" }, types)) {
        return context.deserialize(json, CallExpression.class);
      }
      if (Arrays.equals(new String[]{ "ConditionalExpression" }, types)) {
        return context.deserialize(json, ConditionalExpression.class);
      }
      if (Arrays.equals(new String[]{ "LogicalExpression" }, types)) {
        return context.deserialize(json, LogicalExpression.class);
      }
      if (Arrays.equals(new String[]{ "MemberExpression" }, types)) {
        return context.deserialize(json, MemberExpression.class);
      }
      if (Arrays.equals(new String[]{ "IndexExpression" }, types)) {
        return context.deserialize(json, IndexExpression.class);
      }
      if (Arrays.equals(new String[]{ "ObjectExpression" }, types)) {
        return context.deserialize(json, ObjectExpression.class);
      }
      if (Arrays.equals(new String[]{ "ParenExpression" }, types)) {
        return context.deserialize(json, ParenExpression.class);
      }
      if (Arrays.equals(new String[]{ "PipeExpression" }, types)) {
        return context.deserialize(json, PipeExpression.class);
      }
      if (Arrays.equals(new String[]{ "UnaryExpression" }, types)) {
        return context.deserialize(json, UnaryExpression.class);
      }
      if (Arrays.equals(new String[]{ "BooleanLiteral" }, types)) {
        return context.deserialize(json, BooleanLiteral.class);
      }
      if (Arrays.equals(new String[]{ "DateTimeLiteral" }, types)) {
        return context.deserialize(json, DateTimeLiteral.class);
      }
      if (Arrays.equals(new String[]{ "DurationLiteral" }, types)) {
        return context.deserialize(json, DurationLiteral.class);
      }
      if (Arrays.equals(new String[]{ "FloatLiteral" }, types)) {
        return context.deserialize(json, FloatLiteral.class);
      }
      if (Arrays.equals(new String[]{ "IntegerLiteral" }, types)) {
        return context.deserialize(json, IntegerLiteral.class);
      }
      if (Arrays.equals(new String[]{ "PipeLiteral" }, types)) {
        return context.deserialize(json, PipeLiteral.class);
      }
      if (Arrays.equals(new String[]{ "RegexpLiteral" }, types)) {
        return context.deserialize(json, RegexpLiteral.class);
      }
      if (Arrays.equals(new String[]{ "StringLiteral" }, types)) {
        return context.deserialize(json, StringLiteral.class);
      }
      if (Arrays.equals(new String[]{ "UnsignedIntegerLiteral" }, types)) {
        return context.deserialize(json, UnsignedIntegerLiteral.class);
      }
      if (Arrays.equals(new String[]{ "Identifier" }, types)) {
        return context.deserialize(json, Identifier.class);
      }

      return context.deserialize(json, Object.class);
    }
  }
  public static class CallExpressionCalleeAdapter implements JsonDeserializer<Object>, JsonSerializer<Object> {

    public CallExpressionCalleeAdapter() {
    }

    @Override
    public Object deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {

      List<String> discriminator = Arrays.asList("type");

      JsonObject jsonObject = json.getAsJsonObject();

      String[] types = discriminator.stream().map(jsonObject::get).filter(Objects::nonNull).map(JsonElement::getAsString).toArray(String[]::new);

      return deserialize(types, jsonObject, context);
    }

    @Override
    public JsonElement serialize(Object object, Type typeOfSrc, JsonSerializationContext context) {

      return context.serialize(object);
    }

    private Object deserialize(final String[] types, final JsonElement json, final JsonDeserializationContext context) {

      if (Arrays.equals(new String[]{ "ArrayExpression" }, types)) {
        return context.deserialize(json, ArrayExpression.class);
      }
      if (Arrays.equals(new String[]{ "DictExpression" }, types)) {
        return context.deserialize(json, DictExpression.class);
      }
      if (Arrays.equals(new String[]{ "FunctionExpression" }, types)) {
        return context.deserialize(json, FunctionExpression.class);
      }
      if (Arrays.equals(new String[]{ "BinaryExpression" }, types)) {
        return context.deserialize(json, BinaryExpression.class);
      }
      if (Arrays.equals(new String[]{ "CallExpression" }, types)) {
        return context.deserialize(json, CallExpression.class);
      }
      if (Arrays.equals(new String[]{ "ConditionalExpression" }, types)) {
        return context.deserialize(json, ConditionalExpression.class);
      }
      if (Arrays.equals(new String[]{ "LogicalExpression" }, types)) {
        return context.deserialize(json, LogicalExpression.class);
      }
      if (Arrays.equals(new String[]{ "MemberExpression" }, types)) {
        return context.deserialize(json, MemberExpression.class);
      }
      if (Arrays.equals(new String[]{ "IndexExpression" }, types)) {
        return context.deserialize(json, IndexExpression.class);
      }
      if (Arrays.equals(new String[]{ "ObjectExpression" }, types)) {
        return context.deserialize(json, ObjectExpression.class);
      }
      if (Arrays.equals(new String[]{ "ParenExpression" }, types)) {
        return context.deserialize(json, ParenExpression.class);
      }
      if (Arrays.equals(new String[]{ "PipeExpression" }, types)) {
        return context.deserialize(json, PipeExpression.class);
      }
      if (Arrays.equals(new String[]{ "UnaryExpression" }, types)) {
        return context.deserialize(json, UnaryExpression.class);
      }
      if (Arrays.equals(new String[]{ "BooleanLiteral" }, types)) {
        return context.deserialize(json, BooleanLiteral.class);
      }
      if (Arrays.equals(new String[]{ "DateTimeLiteral" }, types)) {
        return context.deserialize(json, DateTimeLiteral.class);
      }
      if (Arrays.equals(new String[]{ "DurationLiteral" }, types)) {
        return context.deserialize(json, DurationLiteral.class);
      }
      if (Arrays.equals(new String[]{ "FloatLiteral" }, types)) {
        return context.deserialize(json, FloatLiteral.class);
      }
      if (Arrays.equals(new String[]{ "IntegerLiteral" }, types)) {
        return context.deserialize(json, IntegerLiteral.class);
      }
      if (Arrays.equals(new String[]{ "PipeLiteral" }, types)) {
        return context.deserialize(json, PipeLiteral.class);
      }
      if (Arrays.equals(new String[]{ "RegexpLiteral" }, types)) {
        return context.deserialize(json, RegexpLiteral.class);
      }
      if (Arrays.equals(new String[]{ "StringLiteral" }, types)) {
        return context.deserialize(json, StringLiteral.class);
      }
      if (Arrays.equals(new String[]{ "UnsignedIntegerLiteral" }, types)) {
        return context.deserialize(json, UnsignedIntegerLiteral.class);
      }
      if (Arrays.equals(new String[]{ "Identifier" }, types)) {
        return context.deserialize(json, Identifier.class);
      }

      return context.deserialize(json, Object.class);
    }
  }
}

