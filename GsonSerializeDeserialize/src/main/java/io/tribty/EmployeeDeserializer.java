package io.tribty;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class EmployeeDeserializer implements JsonDeserializer<Employee> {
    /**
     * @param jsonElement
     * @param type
     * @param jsonDeserializationContext
     * @return
     * @throws JsonParseException
     */
    @Override
    public Employee deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject json = jsonElement.getAsJsonObject();
        int year = 1940, month = 1, day = 1;
        if (json.has("year")) year = json.get("year").getAsInt();
        else throw new JsonParseException("'year' is not provided in Employee JsonElement");
        if (json.has("month")) month = json.get("month").getAsInt();
        else throw new JsonParseException("'month' is not provided in Employee JsonElement");
        if (json.has("day")) day = json.get("day").getAsInt();
        else throw new JsonParseException("'day' is not provided in Employee JsonElement");
        LocalDate date = LocalDate.of(year, month, day);
        return new Employee(
                json.get("empId").getAsInt(),
                json.get("empName").getAsString(),
                json.get("salary").getAsDouble(),
                date,
                json.get("isPermanet").getAsBoolean()
        );
    }
}
