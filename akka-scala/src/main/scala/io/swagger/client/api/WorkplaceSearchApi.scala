/**
 * Cybernetics.AFA.Integration.FURA
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object WorkplaceSearchApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (OK)
   *   code 500 : Any (InternalServerError)
   * 
   * @param organizationNumber Organization Number
   */
  def workplaceSearchSearch(organizationNumber: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "http://localhost/Cybernetics.AFA.Integration.FURA", "/workplace-search/{organizationNumber}", "application/json")
      .withPathParam("organizationNumber", organizationNumber)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Any](500)
      

}

