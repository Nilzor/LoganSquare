package com.bluelinelabs.logansquare.processor;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.bluelinelabs.logansquare.annotation.JsonObject.FieldNamingPolicy;
import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;

import java.util.List;

@JsonObject(fieldNamingPolicy = FieldNamingPolicy.FIRST_CHAR_LOWER_CASE)
public class FirstCharLowerCaseNamingPolicyModel {

    @JsonField
    public String PascalCaseString;

    @JsonField
    public List<String> PascalCaseList;

}
