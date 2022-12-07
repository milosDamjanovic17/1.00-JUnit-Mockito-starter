package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class ConditionalTest {

    @Test
    @Disabled("Don't run this until JIRA#randomBroj is fixed!")
    void basicTest(){
        // execute method and perform asserts

    }


    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWinOSOnly(){


    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOSOnly(){

    }

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    void testForMultipleOS(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_18)
    void testForJavaJRE18(){
        // currently we are running 17.0.5 in this project
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void testForJavaJRE8(){
        // currently we are running 17.0.5 in this project
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForJavaJRE17(){
        // currently we are running 17.0.5 in this project
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11)
    void testMinimumJRE(){
        // currently we are running 17.0.5 in this project
        // it will test only on JREs 11 or above
    }

    @Test
    @EnabledForJreRange(max = JRE.JAVA_11)
    void testMaximumJRE(){
        // currently we are running 17.0.5 in this project
        // it will test only if run JRE 11 or less
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void testJRERange(){
        // currently we are running 17.0.5 in this project
        // it will test only if JRE >= 11 || JRE <= 17
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "MOOSE_ENV", matches = "DEV")
    void testOnlyForDevEnvironment(){
        // test only if we are running in DEV environment, Modify Run Configuration -> Environment Variables <named = matches>
    }

    @Test
    @EnabledIfSystemProperty(named = "MOOSE_SYS_PROP", matches = "CI_CD_DEPLOY")
    void testOnlyForGivenSysProperty(){
        // test only if we are running in CI_CD_DEPLOY, Modify Run Configuration -> Build And Run -> -ea -DMOOSE_SYS_PROP=CI_CD_DEPLOY
    }



}
