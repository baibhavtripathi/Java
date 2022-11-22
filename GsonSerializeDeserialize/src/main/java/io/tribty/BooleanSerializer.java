package io.tribty;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class BooleanSerializer implements JsonSerializer<Boolean> {
    /**
     * @param aBoolean
     * @param type
     * @param jsonSerializationContext
     * @return
     */
    @Override
    public JsonElement serialize(Boolean aBoolean, Type type, JsonSerializationContext jsonSerializationContext) {
        if (aBoolean)   return new JsonPrimitive(1);
        return new JsonPrimitive(0);
    }
}
