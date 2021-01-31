package ravi.hobby.project.cda.controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class TestUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    protected static String mapToJson(Object obj) throws JsonProcessingException {
        return objectMapper.writeValueAsString(obj);
    }

    protected static <T> T mapFromJson(String json, Class<T> clazz)
            throws JsonParseException, JsonMappingException, IOException {

        return objectMapper.readValue(json, clazz);
    }

    protected static <T> T mapFromJson(String json, final TypeReference<T> type)
            throws JsonParseException, JsonMappingException, IOException {

        return objectMapper.readValue(json, type);
    }
}
