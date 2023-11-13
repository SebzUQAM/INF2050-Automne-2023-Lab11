package org.uqam;

import java.util.Arrays;

public class IdentifierTransformation {

    public static String snakeCaseIdentifierToPascalCase(String snakeCase) {
        if(snakeCase == null || snakeCase.isEmpty()){
            return snakeCase;
        }
        String resultPascalCase = snakeCaseIdentifierToCamelCase(snakeCase);
        resultPascalCase = changeFirstCharForUppercase(resultPascalCase);
        return resultPascalCase;
    }

    public static String snakeCaseIdentifierToCamelCase(String identifier) {
        if(identifier == null || identifier.isEmpty()){
            return identifier;
        }

        identifier = removeFirstsUnderscore(identifier);
        String[] workStrings = identifier.toLowerCase().split("_");

        for (int stringIndex = 1; stringIndex < workStrings.length; stringIndex++) {
            workStrings[stringIndex] = changeFirstCharForUppercase(workStrings[stringIndex]);
        }

        return String.join("", workStrings);
    }

    private static String removeFirstsUnderscore(String str){
        while (str.charAt(0) == '_'){
            str = str.substring(1);
        }
        return str;
    }

    private static String changeFirstCharForUppercase(String str){
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
