# oathkeeper-client

ORY Oathkeeper
- API version: v0.38.14-beta.1
  - Build date: 2021-07-14T17:07:40.967782263Z[Etc/UTC]

ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.

  For more information, please visit [https://www.ory.am](https://www.ory.am)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>sh.ory.oathkeeper</groupId>
  <artifactId>oathkeeper-client</artifactId>
  <version>v0.38.14-beta.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "sh.ory.oathkeeper:oathkeeper-client:v0.38.14-beta.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/oathkeeper-client-v0.38.14-beta.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import sh.ory.oathkeeper.ApiClient;
import sh.ory.oathkeeper.ApiException;
import sh.ory.oathkeeper.Configuration;
import sh.ory.oathkeeper.models.*;
import sh.ory.oathkeeper.api.ApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ApiApi apiInstance = new ApiApi(defaultClient);
    try {
      apiInstance.decisions();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiApi#decisions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiApi* | [**decisions**](docs/ApiApi.md#decisions) | **GET** /decisions | Access Control Decision API
*ApiApi* | [**getRule**](docs/ApiApi.md#getRule) | **GET** /rules/{id} | Retrieve a rule
*ApiApi* | [**getVersion**](docs/ApiApi.md#getVersion) | **GET** /version | Get service version
*ApiApi* | [**getWellKnownJSONWebKeys**](docs/ApiApi.md#getWellKnownJSONWebKeys) | **GET** /.well-known/jwks.json | Lists cryptographic keys
*ApiApi* | [**isInstanceAlive**](docs/ApiApi.md#isInstanceAlive) | **GET** /health/alive | Check alive status
*ApiApi* | [**isInstanceReady**](docs/ApiApi.md#isInstanceReady) | **GET** /health/ready | Check readiness status
*ApiApi* | [**listRules**](docs/ApiApi.md#listRules) | **GET** /rules | List all rules


## Documentation for Models

 - [HealthNotReadyStatus](docs/HealthNotReadyStatus.md)
 - [HealthStatus](docs/HealthStatus.md)
 - [InlineResponse500](docs/InlineResponse500.md)
 - [JsonWebKey](docs/JsonWebKey.md)
 - [JsonWebKeySet](docs/JsonWebKeySet.md)
 - [Rule](docs/Rule.md)
 - [RuleHandler](docs/RuleHandler.md)
 - [RuleMatch](docs/RuleMatch.md)
 - [Upstream](docs/Upstream.md)
 - [Version](docs/Version.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hi@ory.am

