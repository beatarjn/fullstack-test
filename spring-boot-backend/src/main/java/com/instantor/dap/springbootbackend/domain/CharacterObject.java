package com.instantor.dap.springbootbackend.domain;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CharacterObject {

    public Character getCharacter() {
//        ObjectMapper mapper = new ObjectMapper();
//        Character jsonObject = null;
//        try {
//            jsonObject = mapper.readValue
//                    (new File("domain\\character.json"), Character.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return jsonObject;
        String obj = null;

        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("C:\\Users\\Beate\\Desktop\\instantortest\\spring-boot-backend\\src\\main\\java\\com\\instantor\\dap\\springbootbackend\\domain\\character.json")) {

            obj = jsonParser.parse(reader).toString();
//            JSONArray list = (JSONArray) obj;
//            for (int i = 0; i < list.size(); i++) {
//                JSONArray list1 = (JSONArray) list.get(i);
//            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ObjectMapper mapper = new ObjectMapper();
        Character jsonObject = null;
        try {
            jsonObject = mapper.readValue
                    (obj, Character.class);

        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
