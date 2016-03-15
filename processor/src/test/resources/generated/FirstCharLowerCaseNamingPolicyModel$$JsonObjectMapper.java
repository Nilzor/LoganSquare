package com.bluelinelabs.logansquare.processor;

import com.bluelinelabs.logansquare.JsonMapper;
import com.bluelinelabs.logansquare.processor.FirstCharLowerCaseNamingPolicyModel;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public final class FirstCharLowerCaseNamingPolicyModel$$JsonObjectMapper extends JsonMapper<FirstCharLowerCaseNamingPolicyModel> {
    @Override
    public FirstCharLowerCaseNamingPolicyModel parse(JsonParser jsonParser) throws IOException {
        return _parse(jsonParser);
    }

    public static FirstCharLowerCaseNamingPolicyModel _parse(JsonParser jsonParser) throws IOException {
        FirstCharLowerCaseNamingPolicyModel instance = new FirstCharLowerCaseNamingPolicyModel();
        if (jsonParser.getCurrentToken() == null) {
            jsonParser.nextToken();
        }
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String fieldName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            parseField(instance, fieldName, jsonParser);
            jsonParser.skipChildren();
        }
        return instance;
    }

    public static void parseField(FirstCharLowerCaseNamingPolicyModel instance, String fieldName, JsonParser jsonParser) throws IOException {
        if ("pazcalCaseList".equals(fieldName)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                ArrayList<String> collection1 = new ArrayList<String>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    String value1;
                    value1 = jsonParser.getValueAsString(null);
                    if (value1 != null) {
                        collection1.add(value1);
                    }
                }
                instance.camelCaseList = collection1;
            } else{
                instance.camelCaseList = null;
            }
        } else if ("pascalCaseString".equals(fieldName)){
            instance.camelCaseString = jsonParser.getValueAsString(null);
        }
    }

    @Override
    public void serialize(FirstCharLowerCaseNamingPolicyModel object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
        _serialize(object, jsonGenerator, writeStartAndEnd);
    }

    public static void _serialize(FirstCharLowerCaseNamingPolicyModel object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
        if (writeStartAndEnd) {
            jsonGenerator.writeStartObject();
        }
        final List<String> lslocalcamel_case_list = object.camelCaseList;
        if (lslocalcamel_case_list != null) {
            jsonGenerator.writeFieldName("pascalCaseList");
            jsonGenerator.writeStartArray();
            for (String element1 : lslocalcamel_case_list) {
                jsonGenerator.writeString(element1);
            }
            jsonGenerator.writeEndArray();
        }
        jsonGenerator.writeStringField("pascalCaseString", object.camelCaseString);
        if (writeStartAndEnd) {
            jsonGenerator.writeEndObject();
        }
    }
}