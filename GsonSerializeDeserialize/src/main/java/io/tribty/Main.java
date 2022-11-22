package io.tribty;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Serialization
        Employee employee = new Employee(1, "Akex", 78008.90, LocalDate.now(), true);
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Boolean.class, new BooleanSerializer())
                .registerTypeAdapter(LocalDate.class, new LocalDateSerializer())
                .registerTypeAdapter(LocalDate.class, new LocalDateDeserializer())
                .registerTypeAdapter(LocalDateTime.class,
                        (JsonSerializer<LocalDateTime>) (localDateTime, type, jsonSerializationContext) ->
                                new JsonPrimitive(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss").format(localDateTime)))
                .registerTypeAdapter(LocalDateTime.class,
                        (JsonDeserializer<LocalDateTime>) (json, type, jsonDeserializationContext) ->
                                LocalDateTime.parse(json.getAsString(),
                                        DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss").withLocale(Locale.ENGLISH)))
                .setPrettyPrinting()
                .create();
        System.out.println("Serialize Employee:" + gson.toJson(employee));
        // Deserialize LocalDateTime
        System.out.println("Deserialized DateTime: " + gson.fromJson("\"26::Oct::2018 11::09::05\"", LocalDateTime.class));
        // Serialize LocalDateTime
        System.out.println("Serialized DateTime: " + gson.toJson(LocalDateTime.now()));
    }
}