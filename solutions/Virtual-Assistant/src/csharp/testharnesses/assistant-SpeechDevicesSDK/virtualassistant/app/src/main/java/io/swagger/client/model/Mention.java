/*
 * Microsoft Bot Connector API - v3.0
 * The Bot Connector REST API allows your bot to send and receive messages to channels configured in the  [Bot Framework Developer Portal](https://dev.botframework.com). The Connector service uses industry-standard REST  and JSON over HTTPS.    Client libraries for this REST API are available. See below for a list.    Many bots will use both the Bot Connector REST API and the associated [Bot State REST API](/en-us/restapi/state). The  Bot State REST API allows a bot to store and retrieve state associated with users and conversations.    Authentication for both the Bot Connector and Bot State REST APIs is accomplished with JWT Bearer tokens, and is  described in detail in the [Connector Authentication](/en-us/restapi/authentication) document.    # Client Libraries for the Bot Connector REST API    * [Bot Builder for C#](/en-us/csharp/builder/sdkreference/)  * [Bot Builder for Node.js](/en-us/node/builder/overview/)  * Generate your own from the [Connector API Swagger file](https://raw.githubusercontent.com/Microsoft/BotBuilder/master/CSharp/Library/Microsoft.Bot.Connector.Shared/Swagger/ConnectorAPI.json)    � 2016 Microsoft
 *
 * OpenAPI spec version: v3
 * Contact: botframework@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ChannelAccount;
import java.io.IOException;

/**
 * Mention information (entity type: \&quot;mention\&quot;)
 */
@ApiModel(description = "Mention information (entity type: \"mention\")")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-29T10:06:15.114-07:00")
public class Mention {
  @SerializedName("mentioned")
  private ChannelAccount mentioned = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("type")
  private String type = null;

  public Mention mentioned(ChannelAccount mentioned) {
    this.mentioned = mentioned;
    return this;
  }

   /**
   * The mentioned user
   * @return mentioned
  **/
  @ApiModelProperty(value = "The mentioned user")
  public ChannelAccount getMentioned() {
    return mentioned;
  }

  public void setMentioned(ChannelAccount mentioned) {
    this.mentioned = mentioned;
  }

  public Mention text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Sub Text which represents the mention (can be null or empty)
   * @return text
  **/
  @ApiModelProperty(value = "Sub Text which represents the mention (can be null or empty)")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Mention type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Entity Type (typically from schema.org types)
   * @return type
  **/
  @ApiModelProperty(value = "Entity Type (typically from schema.org types)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mention mention = (Mention) o;
    return Objects.equals(this.mentioned, mention.mentioned) &&
        Objects.equals(this.text, mention.text) &&
        Objects.equals(this.type, mention.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mentioned, text, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mention {\n");
    
    sb.append("    mentioned: ").append(toIndentedString(mentioned)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

