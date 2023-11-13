package org.uqam;

import java.util.Arrays;

public class IdentifierTransformation {

    public static String snakeCaseIdentifierToPascalCase(String identifier) {
        if(identifier == null){
            return null;
        }
        char[] workString = snakeCaseIdentifierToCamelCase(identifier).toCharArray();
        if (workString.length > 0) {
            workString[0] = Character.toUpperCase(workString[0]);
        }
        return new String(workString);
    }

    public static String snakeCaseIdentifierToCamelCase(String identifier) {
        if(identifier == null || identifier.equals("")){
            return identifier;
        }

        while (identifier.charAt(0) == '_'){
            identifier = identifier.substring(1);
        }
        String[] workStrings = identifier.toLowerCase().split("_");

        for (int charIndex = 1; charIndex < workStrings.length; charIndex++) {
            String str = workStrings[charIndex];
            if(str.length() > 0) {
                str = str.replace(str.charAt(0), Character.toUpperCase(str.charAt(0)));
                workStrings[charIndex] = str;
            }
        }

        return String.join("", workStrings);
    }
}
