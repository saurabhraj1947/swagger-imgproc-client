/*
 * Image Processing API
 * Applies a sequence of transformations to an image
 *
 * OpenAPI spec version: 1.0
 * Contact: ahtran@seattleu.edu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.seattleu.imageprocessor.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Details of a transformation to be performed on image
 */
@ApiModel(description = "Details of a transformation to be performed on image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:35:47.287-08:00")
public class Transformation {
  @JsonProperty("degreeRotation")
  private Integer degreeRotation = null;

  /**
   * Flip Type
   */
  public enum FlipTypeEnum {
    HORIZONTAL("HORIZONTAL"),
    
    VERTICAL("VERTICAL");

    private String value;

    FlipTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FlipTypeEnum fromValue(String value) {
      for (FlipTypeEnum b : FlipTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("flipType")
  private FlipTypeEnum flipType = null;

  /**
   * Rotation Type
   */
  public enum RotationTypeEnum {
    LEFT("LEFT"),
    
    RIGHT("RIGHT");

    private String value;

    RotationTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RotationTypeEnum fromValue(String value) {
      for (RotationTypeEnum b : RotationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("rotationType")
  private RotationTypeEnum rotationType = null;

  /**
   * Transformation Type
   */
  public enum TransFormationTypeEnum {
    FLIP("FLIP"),
    
    ROTATE("ROTATE"),
    
    GRAYSCALE("GRAYSCALE"),
    
    RESIZE("RESIZE"),
    
    THUMBNAIL("THUMBNAIL"),
    
    ROTATE_LEFT("ROTATE_LEFT"),
    
    ROTATE_RIGHT("ROTATE_RIGHT");

    private String value;

    TransFormationTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransFormationTypeEnum fromValue(String value) {
      for (TransFormationTypeEnum b : TransFormationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("transFormationType")
  private TransFormationTypeEnum transFormationType = null;

  @JsonProperty("transformedHeight")
  private Integer transformedHeight = null;

  @JsonProperty("transformedWidth")
  private Integer transformedWidth = null;

  public Transformation degreeRotation(Integer degreeRotation) {
    this.degreeRotation = degreeRotation;
    return this;
  }

   /**
   * Degrees of rotation
   * @return degreeRotation
  **/
  @ApiModelProperty(value = "Degrees of rotation")
  public Integer getDegreeRotation() {
    return degreeRotation;
  }

  public void setDegreeRotation(Integer degreeRotation) {
    this.degreeRotation = degreeRotation;
  }

  public Transformation flipType(FlipTypeEnum flipType) {
    this.flipType = flipType;
    return this;
  }

   /**
   * Flip Type
   * @return flipType
  **/
  @ApiModelProperty(value = "Flip Type")
  public FlipTypeEnum getFlipType() {
    return flipType;
  }

  public void setFlipType(FlipTypeEnum flipType) {
    this.flipType = flipType;
  }

  public Transformation rotationType(RotationTypeEnum rotationType) {
    this.rotationType = rotationType;
    return this;
  }

   /**
   * Rotation Type
   * @return rotationType
  **/
  @ApiModelProperty(value = "Rotation Type")
  public RotationTypeEnum getRotationType() {
    return rotationType;
  }

  public void setRotationType(RotationTypeEnum rotationType) {
    this.rotationType = rotationType;
  }

  public Transformation transFormationType(TransFormationTypeEnum transFormationType) {
    this.transFormationType = transFormationType;
    return this;
  }

   /**
   * Transformation Type
   * @return transFormationType
  **/
  @ApiModelProperty(required = true, value = "Transformation Type")
  public TransFormationTypeEnum getTransFormationType() {
    return transFormationType;
  }

  public void setTransFormationType(TransFormationTypeEnum transFormationType) {
    this.transFormationType = transFormationType;
  }

  public Transformation transformedHeight(Integer transformedHeight) {
    this.transformedHeight = transformedHeight;
    return this;
  }

   /**
   * desired imag height after resizing
   * @return transformedHeight
  **/
  @ApiModelProperty(value = "desired imag height after resizing")
  public Integer getTransformedHeight() {
    return transformedHeight;
  }

  public void setTransformedHeight(Integer transformedHeight) {
    this.transformedHeight = transformedHeight;
  }

  public Transformation transformedWidth(Integer transformedWidth) {
    this.transformedWidth = transformedWidth;
    return this;
  }

   /**
   * desired imag width after resizing
   * @return transformedWidth
  **/
  @ApiModelProperty(value = "desired imag width after resizing")
  public Integer getTransformedWidth() {
    return transformedWidth;
  }

  public void setTransformedWidth(Integer transformedWidth) {
    this.transformedWidth = transformedWidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transformation transformation = (Transformation) o;
    return Objects.equals(this.degreeRotation, transformation.degreeRotation) &&
        Objects.equals(this.flipType, transformation.flipType) &&
        Objects.equals(this.rotationType, transformation.rotationType) &&
        Objects.equals(this.transFormationType, transformation.transFormationType) &&
        Objects.equals(this.transformedHeight, transformation.transformedHeight) &&
        Objects.equals(this.transformedWidth, transformation.transformedWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(degreeRotation, flipType, rotationType, transFormationType, transformedHeight, transformedWidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transformation {\n");
    
    sb.append("    degreeRotation: ").append(toIndentedString(degreeRotation)).append("\n");
    sb.append("    flipType: ").append(toIndentedString(flipType)).append("\n");
    sb.append("    rotationType: ").append(toIndentedString(rotationType)).append("\n");
    sb.append("    transFormationType: ").append(toIndentedString(transFormationType)).append("\n");
    sb.append("    transformedHeight: ").append(toIndentedString(transformedHeight)).append("\n");
    sb.append("    transformedWidth: ").append(toIndentedString(transformedWidth)).append("\n");
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
