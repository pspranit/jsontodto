package com.dto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

public class FactorTextDeserilizer implements JsonDeserializer<List<FactorText>> {

	public List<FactorText> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		List<FactorText> list = new ArrayList<FactorText>();
		if (json.isJsonObject()) {
			FactorText obj = (FactorText) context.deserialize(json, new TypeToken<FactorText>() {
			}.getType());
			list.add(obj);
			return list;
		} else if (json.isJsonArray()) {

			if (context.deserialize(json, new TypeToken<ArrayList<FactorText>>() {}.getType()) != null) {
				
				list = context.deserialize(json, new TypeToken<ArrayList<FactorText>>() {}.getType());
			}
		}
		return list;
	}

}
