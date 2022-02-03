/*
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.38.18-beta.1
 * Contact: hi@ory.am
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.oathkeeper.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RuleMatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-03T09:31:09.121879663Z[Etc/UTC]")
public class RuleMatch {
  public static final String SERIALIZED_NAME_METHODS = "methods";
  @SerializedName(SERIALIZED_NAME_METHODS)
  private List<String> methods = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public RuleMatch methods(List<String> methods) {
    
    this.methods = methods;
    return this;
  }

  public RuleMatch addMethodsItem(String methodsItem) {
    if (this.methods == null) {
      this.methods = new ArrayList<>();
    }
    this.methods.add(methodsItem);
    return this;
  }

   /**
   * An array of HTTP methods (e.g. GET, POST, PUT, DELETE, ...). When ORY Oathkeeper searches for rules to decide what to do with an incoming request to the proxy server, it compares the HTTP method of the incoming request with the HTTP methods of each rules. If a match is found, the rule is considered a partial match. If the matchesUrl field is satisfied as well, the rule is considered a full match.
   * @return methods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of HTTP methods (e.g. GET, POST, PUT, DELETE, ...). When ORY Oathkeeper searches for rules to decide what to do with an incoming request to the proxy server, it compares the HTTP method of the incoming request with the HTTP methods of each rules. If a match is found, the rule is considered a partial match. If the matchesUrl field is satisfied as well, the rule is considered a full match.")

  public List<String> getMethods() {
    return methods;
  }


  public void setMethods(List<String> methods) {
    this.methods = methods;
  }


  public RuleMatch url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * This field represents the URL pattern this rule matches. When ORY Oathkeeper searches for rules to decide what to do with an incoming request to the proxy server, it compares the full request URL (e.g. https://mydomain.com/api/resource) without query parameters of the incoming request with this field. If a match is found, the rule is considered a partial match. If the matchesMethods field is satisfied as well, the rule is considered a full match.  You can use regular expressions in this field to match more than one url. Regular expressions are encapsulated in brackets &lt; and &gt;. The following example matches all paths of the domain &#x60;mydomain.com&#x60;: &#x60;https://mydomain.com/&lt;.*&gt;&#x60;.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field represents the URL pattern this rule matches. When ORY Oathkeeper searches for rules to decide what to do with an incoming request to the proxy server, it compares the full request URL (e.g. https://mydomain.com/api/resource) without query parameters of the incoming request with this field. If a match is found, the rule is considered a partial match. If the matchesMethods field is satisfied as well, the rule is considered a full match.  You can use regular expressions in this field to match more than one url. Regular expressions are encapsulated in brackets < and >. The following example matches all paths of the domain `mydomain.com`: `https://mydomain.com/<.*>`.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleMatch ruleMatch = (RuleMatch) o;
    return Objects.equals(this.methods, ruleMatch.methods) &&
        Objects.equals(this.url, ruleMatch.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methods, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleMatch {\n");
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

}

