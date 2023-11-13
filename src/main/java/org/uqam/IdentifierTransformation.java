package org.uqam;

import java.util.Arrays;

public class IdentifierTransformation {

    public static String snakeCaseIdentifierToPascalCase(String identifier) {
        if(identifier == null || identifier.isEmpty()){
            return identifier;
        }
        char[] workString = snakeCaseIdentifierToCamelCase(identifier).toCharArray();
        if (workString.length > 0) {
            workString[0] = Character.toUpperCase(workString[0]);
        }
        return new String(workString);
    }

    public static String snakeCaseIdentifierToCamelCase(String identifier) {
        if(identifier == null || identifier.isEmpty()){
            return identifier;
        }

        identifier = removeFirstsUnderscore(identifier);

        String[] workStrings = identifier.toLowerCase().split("_");

        for (int charIndex = 1; charIndex < workStrings.length; charIndex++) {
            String str = workStrings[charIndex];
            if(str.length() > 0) {
                str = str.substring(0,1).toUpperCase() + str.substring(1);
                workStrings[charIndex] = str;
            }
        }

        return String.join("", workStrings);
    }

    private static String removeFirstsUnderscore(String str){
        while (str.charAt(0) == '_'){
            str = str.substring(1);
        }
        return str;
    }
}
