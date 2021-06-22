/*
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.38.12-beta.1
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
 * JsonWebKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-22T21:25:56.920945792Z[Etc/UTC]")
public class JsonWebKey {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg;

  public static final String SERIALIZED_NAME_CRV = "crv";
  @SerializedName(SERIALIZED_NAME_CRV)
  private String crv;

  public static final String SERIALIZED_NAME_D = "d";
  @SerializedName(SERIALIZED_NAME_D)
  private String d;

  public static final String SERIALIZED_NAME_DP = "dp";
  @SerializedName(SERIALIZED_NAME_DP)
  private String dp;

  public static final String SERIALIZED_NAME_DQ = "dq";
  @SerializedName(SERIALIZED_NAME_DQ)
  private String dq;

  public static final String SERIALIZED_NAME_E = "e";
  @SerializedName(SERIALIZED_NAME_E)
  private String e;

  public static final String SERIALIZED_NAME_K = "k";
  @SerializedName(SERIALIZED_NAME_K)
  private String k;

  public static final String SERIALIZED_NAME_KID = "kid";
  @SerializedName(SERIALIZED_NAME_KID)
  private String kid;

  public static final String SERIALIZED_NAME_KTY = "kty";
  @SerializedName(SERIALIZED_NAME_KTY)
  private String kty;

  public static final String SERIALIZED_NAME_N = "n";
  @SerializedName(SERIALIZED_NAME_N)
  private String n;

  public static final String SERIALIZED_NAME_P = "p";
  @SerializedName(SERIALIZED_NAME_P)
  private String p;

  public static final String SERIALIZED_NAME_Q = "q";
  @SerializedName(SERIALIZED_NAME_Q)
  private String q;

  public static final String SERIALIZED_NAME_QI = "qi";
  @SerializedName(SERIALIZED_NAME_QI)
  private String qi;

  public static final String SERIALIZED_NAME_USE = "use";
  @SerializedName(SERIALIZED_NAME_USE)
  private String use;

  public static final String SERIALIZED_NAME_X = "x";
  @SerializedName(SERIALIZED_NAME_X)
  private String x;

  public static final String SERIALIZED_NAME_X5C = "x5c";
  @SerializedName(SERIALIZED_NAME_X5C)
  private List<String> x5c = null;

  public static final String SERIALIZED_NAME_Y = "y";
  @SerializedName(SERIALIZED_NAME_Y)
  private String y;


  public JsonWebKey alg(String alg) {
    
    this.alg = alg;
    return this;
  }

   /**
   * The \&quot;alg\&quot; (algorithm) parameter identifies the algorithm intended for use with the key.  The values used should either be registered in the IANA \&quot;JSON Web Signature and Encryption Algorithms\&quot; registry established by [JWA] or be a value that contains a Collision- Resistant Name.
   * @return alg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The \"alg\" (algorithm) parameter identifies the algorithm intended for use with the key.  The values used should either be registered in the IANA \"JSON Web Signature and Encryption Algorithms\" registry established by [JWA] or be a value that contains a Collision- Resistant Name.")

  public String getAlg() {
    return alg;
  }


  public void setAlg(String alg) {
    this.alg = alg;
  }


  public JsonWebKey crv(String crv) {
    
    this.crv = crv;
    return this;
  }

   /**
   * Get crv
   * @return crv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCrv() {
    return crv;
  }


  public void setCrv(String crv) {
    this.crv = crv;
  }


  public JsonWebKey d(String d) {
    
    this.d = d;
    return this;
  }

   /**
   * Get d
   * @return d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getD() {
    return d;
  }


  public void setD(String d) {
    this.d = d;
  }


  public JsonWebKey dp(String dp) {
    
    this.dp = dp;
    return this;
  }

   /**
   * Get dp
   * @return dp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDp() {
    return dp;
  }


  public void setDp(String dp) {
    this.dp = dp;
  }


  public JsonWebKey dq(String dq) {
    
    this.dq = dq;
    return this;
  }

   /**
   * Get dq
   * @return dq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDq() {
    return dq;
  }


  public void setDq(String dq) {
    this.dq = dq;
  }


  public JsonWebKey e(String e) {
    
    this.e = e;
    return this;
  }

   /**
   * Get e
   * @return e
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getE() {
    return e;
  }


  public void setE(String e) {
    this.e = e;
  }


  public JsonWebKey k(String k) {
    
    this.k = k;
    return this;
  }

   /**
   * Get k
   * @return k
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getK() {
    return k;
  }


  public void setK(String k) {
    this.k = k;
  }


  public JsonWebKey kid(String kid) {
    
    this.kid = kid;
    return this;
  }

   /**
   * The \&quot;kid\&quot; (key ID) parameter is used to match a specific key.  This is used, for instance, to choose among a set of keys within a JWK Set during key rollover.  The structure of the \&quot;kid\&quot; value is unspecified.  When \&quot;kid\&quot; values are used within a JWK Set, different keys within the JWK Set SHOULD use distinct \&quot;kid\&quot; values.  (One example in which different keys might use the same \&quot;kid\&quot; value is if they have different \&quot;kty\&quot; (key type) values but are considered to be equivalent alternatives by the application using them.)  The \&quot;kid\&quot; value is a case-sensitive string.
   * @return kid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The \"kid\" (key ID) parameter is used to match a specific key.  This is used, for instance, to choose among a set of keys within a JWK Set during key rollover.  The structure of the \"kid\" value is unspecified.  When \"kid\" values are used within a JWK Set, different keys within the JWK Set SHOULD use distinct \"kid\" values.  (One example in which different keys might use the same \"kid\" value is if they have different \"kty\" (key type) values but are considered to be equivalent alternatives by the application using them.)  The \"kid\" value is a case-sensitive string.")

  public String getKid() {
    return kid;
  }


  public void setKid(String kid) {
    this.kid = kid;
  }


  public JsonWebKey kty(String kty) {
    
    this.kty = kty;
    return this;
  }

   /**
   * The \&quot;kty\&quot; (key type) parameter identifies the cryptographic algorithm family used with the key, such as \&quot;RSA\&quot; or \&quot;EC\&quot;. \&quot;kty\&quot; values should either be registered in the IANA \&quot;JSON Web Key Types\&quot; registry established by [JWA] or be a value that contains a Collision- Resistant Name.  The \&quot;kty\&quot; value is a case-sensitive string.
   * @return kty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The \"kty\" (key type) parameter identifies the cryptographic algorithm family used with the key, such as \"RSA\" or \"EC\". \"kty\" values should either be registered in the IANA \"JSON Web Key Types\" registry established by [JWA] or be a value that contains a Collision- Resistant Name.  The \"kty\" value is a case-sensitive string.")

  public String getKty() {
    return kty;
  }


  public void setKty(String kty) {
    this.kty = kty;
  }


  public JsonWebKey n(String n) {
    
    this.n = n;
    return this;
  }

   /**
   * Get n
   * @return n
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getN() {
    return n;
  }


  public void setN(String n) {
    this.n = n;
  }


  public JsonWebKey p(String p) {
    
    this.p = p;
    return this;
  }

   /**
   * Get p
   * @return p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getP() {
    return p;
  }


  public void setP(String p) {
    this.p = p;
  }


  public JsonWebKey q(String q) {
    
    this.q = q;
    return this;
  }

   /**
   * Get q
   * @return q
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQ() {
    return q;
  }


  public void setQ(String q) {
    this.q = q;
  }


  public JsonWebKey qi(String qi) {
    
    this.qi = qi;
    return this;
  }

   /**
   * Get qi
   * @return qi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQi() {
    return qi;
  }


  public void setQi(String qi) {
    this.qi = qi;
  }


  public JsonWebKey use(String use) {
    
    this.use = use;
    return this;
  }

   /**
   * The \&quot;use\&quot; (public key use) parameter identifies the intended use of the public key. The \&quot;use\&quot; parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Values are commonly \&quot;sig\&quot; (signature) or \&quot;enc\&quot; (encryption).
   * @return use
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The \"use\" (public key use) parameter identifies the intended use of the public key. The \"use\" parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Values are commonly \"sig\" (signature) or \"enc\" (encryption).")

  public String getUse() {
    return use;
  }


  public void setUse(String use) {
    this.use = use;
  }


  public JsonWebKey x(String x) {
    
    this.x = x;
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getX() {
    return x;
  }


  public void setX(String x) {
    this.x = x;
  }


  public JsonWebKey x5c(List<String> x5c) {
    
    this.x5c = x5c;
    return this;
  }

  public JsonWebKey addX5cItem(String x5cItem) {
    if (this.x5c == null) {
      this.x5c = new ArrayList<>();
    }
    this.x5c.add(x5cItem);
    return this;
  }

   /**
   * The \&quot;x5c\&quot; (X.509 certificate chain) parameter contains a chain of one or more PKIX certificates [RFC5280].  The certificate chain is represented as a JSON array of certificate value strings.  Each string in the array is a base64-encoded (Section 4 of [RFC4648] -- not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value. The PKIX certificate containing the key value MUST be the first certificate.
   * @return x5c
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The \"x5c\" (X.509 certificate chain) parameter contains a chain of one or more PKIX certificates [RFC5280].  The certificate chain is represented as a JSON array of certificate value strings.  Each string in the array is a base64-encoded (Section 4 of [RFC4648] -- not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value. The PKIX certificate containing the key value MUST be the first certificate.")

  public List<String> getX5c() {
    return x5c;
  }


  public void setX5c(List<String> x5c) {
    this.x5c = x5c;
  }


  public JsonWebKey y(String y) {
    
    this.y = y;
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getY() {
    return y;
  }


  public void setY(String y) {
    this.y = y;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonWebKey jsonWebKey = (JsonWebKey) o;
    return Objects.equals(this.alg, jsonWebKey.alg) &&
        Objects.equals(this.crv, jsonWebKey.crv) &&
        Objects.equals(this.d, jsonWebKey.d) &&
        Objects.equals(this.dp, jsonWebKey.dp) &&
        Objects.equals(this.dq, jsonWebKey.dq) &&
        Objects.equals(this.e, jsonWebKey.e) &&
        Objects.equals(this.k, jsonWebKey.k) &&
        Objects.equals(this.kid, jsonWebKey.kid) &&
        Objects.equals(this.kty, jsonWebKey.kty) &&
        Objects.equals(this.n, jsonWebKey.n) &&
        Objects.equals(this.p, jsonWebKey.p) &&
        Objects.equals(this.q, jsonWebKey.q) &&
        Objects.equals(this.qi, jsonWebKey.qi) &&
        Objects.equals(this.use, jsonWebKey.use) &&
        Objects.equals(this.x, jsonWebKey.x) &&
        Objects.equals(this.x5c, jsonWebKey.x5c) &&
        Objects.equals(this.y, jsonWebKey.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, crv, d, dp, dq, e, k, kid, kty, n, p, q, qi, use, x, x5c, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonWebKey {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
    sb.append("    dp: ").append(toIndentedString(dp)).append("\n");
    sb.append("    dq: ").append(toIndentedString(dq)).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    p: ").append(toIndentedString(p)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    qi: ").append(toIndentedString(qi)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    x5c: ").append(toIndentedString(x5c)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

