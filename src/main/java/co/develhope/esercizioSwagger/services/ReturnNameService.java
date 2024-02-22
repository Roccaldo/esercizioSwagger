package co.develhope.esercizioSwagger.services;

import org.springframework.stereotype.Service;

@Service
public class ReturnNameService {
    public String getName(String name) {
        return name;
    }

    public StringBuilder invertName(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.reverse();
        return stringBuilder;
    }
}
