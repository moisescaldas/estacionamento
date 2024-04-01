package io.github.moisescaldas.estacionamento_parkshopping.utils;

import org.modelmapper.ModelMapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ModelMapperUtil {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public static <T> T convert(Object source, Class<T> cls) {
        return MODEL_MAPPER.map(source, cls);
    }
}
