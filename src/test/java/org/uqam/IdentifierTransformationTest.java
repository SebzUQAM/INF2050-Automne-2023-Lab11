package org.uqam;

import static org.junit.jupiter.api.Assertions.*;

class IdentifierTransformationTest {

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToPascalCase01() {
        String pCase = IdentifierTransformation.snakeCaseIdentifierToPascalCase(
                "allo_bonjour_salut"
        );
        assertEquals("AlloBonjourSalut",pCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase01() {
        String cCase = IdentifierTransformation.snakeCaseIdentifierToCamelCase(
                "allo_bonjour_salut"
        );
        assertEquals("alloBonjourSalut",cCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToPascalCase02() {
        String pCase = IdentifierTransformation.snakeCaseIdentifierToPascalCase(
                "allo_bOnJour_salut"
        );
        assertEquals("AlloBonjourSalut",pCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase02() {
        String cCase = IdentifierTransformation.snakeCaseIdentifierToCamelCase(
                "allo_bOnJour_salut"
        );
        assertEquals("alloBonjourSalut",cCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToPascalCase03() {
        String pCase = IdentifierTransformation.snakeCaseIdentifierToPascalCase(
                "allo_bOnJour__salut"
        );
        assertEquals("AlloBonjourSalut",pCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase03() {
        String cCase = IdentifierTransformation.snakeCaseIdentifierToCamelCase(
                "allo_bOnJour__salut"
        );
        assertEquals("alloBonjourSalut",cCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToPascalCase04() {
        String pCase = IdentifierTransformation.snakeCaseIdentifierToPascalCase(
                "allo_bOnJour__sàlut"
        );
        assertEquals("AlloBonjourSàlut",pCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase04() {
        String cCase = IdentifierTransformation.snakeCaseIdentifierToCamelCase(
                "allo_bOnJour__sàlut"
        );
        assertEquals("alloBonjourSàlut",cCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToPascalCase05() {
        String pCase = IdentifierTransformation.snakeCaseIdentifierToPascalCase(
                "Allo_bOnJour__sàlut"
        );
        assertEquals("AlloBonjourSàlut",pCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase05() {
        String cCase = IdentifierTransformation.snakeCaseIdentifierToCamelCase(
                "Allo_bOnJour__sàlut"
        );
        assertEquals("alloBonjourSàlut",cCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToPascalCase06() {
        String pCase = IdentifierTransformation.snakeCaseIdentifierToPascalCase(
                "Allo_bOnJour55__sàlut"
        );
        assertEquals("AlloBonjour55Sàlut",pCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase06() {
        String cCase = IdentifierTransformation.snakeCaseIdentifierToCamelCase(
                "Allo_bOnJour55__sàlut"
        );
        assertEquals("alloBonjour55Sàlut",cCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToPascalCase07() {
        String pCase = IdentifierTransformation.snakeCaseIdentifierToPascalCase(
                "_Allo_bOnJour55__sàlut"
        );
        assertEquals("AlloBonjour55Sàlut",pCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase07() {
        String cCase = IdentifierTransformation.snakeCaseIdentifierToCamelCase(
                "_Allo_bOnJour55__sàlut"
        );
        assertEquals("alloBonjour55Sàlut",cCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToPascalCase08() {
        String pCase = IdentifierTransformation.snakeCaseIdentifierToPascalCase(
                "_Allo_bOnJour55__sàlut_"
        );
        assertEquals("AlloBonjour55Sàlut",pCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase08() {
        String cCase = IdentifierTransformation.snakeCaseIdentifierToCamelCase(
                "_Allo_bOnJour55__sàlut_"
        );
        assertEquals("alloBonjour55Sàlut",cCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToPascalCase09() {
        String pCase = IdentifierTransformation.snakeCaseIdentifierToPascalCase( null );

        assertEquals(null,pCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase09() {
        String pCase = IdentifierTransformation.snakeCaseIdentifierToCamelCase( null );
        assertEquals(null,pCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToPascalCase10() {
        String pCase = IdentifierTransformation.snakeCaseIdentifierToPascalCase( "" );
        assertEquals("",pCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase10() {
        String cCase = IdentifierTransformation.snakeCaseIdentifierToCamelCase( "" );
        assertEquals("",cCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToPascalCase11() {
        String pCase = IdentifierTransformation.snakeCaseIdentifierToPascalCase(
                "_Allo_bOnJoubr55__sàlut_"
        );
        assertEquals("AlloBonjoubr55Sàlut",pCase);
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase11() {
        String cCase = IdentifierTransformation.snakeCaseIdentifierToCamelCase(
                "_Allo_bOnJoubr55__sàlut_"
        );
        assertEquals("alloBonjoubr55Sàlut",cCase);
    }
}