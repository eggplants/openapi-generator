package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * A category for a pet
 * @param id 
 * @param name 
 */
data class Category(

    @Schema(example = "null", description = "")
    @field:JsonProperty("id") var id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @field:JsonProperty("name") var name: kotlin.String? = null
) {

}
