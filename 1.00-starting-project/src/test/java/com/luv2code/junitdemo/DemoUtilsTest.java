package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
@TestMethodOrder(MethodOrderer.Random.class) // it will randomly order test executions, good for checking that test are dependency independent
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach // runs before method execution
    void setupBeforeEach(){

        demoUtils = new DemoUtils();

        System.out.println("Running @BeforeEach method");
    }

    @AfterEach // runs after method execution
    void setupAfterEach(){

        System.out.println("Running @AfterEach method\n");
    }

    @BeforeAll // runs before all methods
    static void setupBeforeEachClass(){
        System.out.println("Running @BeforeAll method that executes before all other methods are executed\n");
    }

    @AfterAll // runs after all methods are executed
    static void setupAfterEachClass(){
        System.out.println("Running @AfterAll method that executes after all methods are executed");
    }


    @Test
    void testEqualsAndNotEquals(){

        System.out.println("Inside testEqualsAndNotEquals method");

        assertEquals(6, demoUtils.add(2,4), "2+4 must be 6!"); // rez inputa i obrade mora biti jednaka expected vrednosti

        assertNotEquals(8, demoUtils.add(2,4), "2+4 is not 8!"); // rez inputa mora biti razlicit od onog sto ne ocekujemo(unexpected)


    }

    @Test
    void testNullAndNotNull(){

        System.out.println("Inside testNullAndNotNull method");

        String s1 = null;
        String s2 = "asdf";

        assertNull(demoUtils.checkNull(s1), "Object should be null!"); // asserts that value is null
        assertNotNull(demoUtils.checkNull(s2), "Object shouldn't be null!"); // asserts that the value is not null

    }

    @Test
    void testSameAndNotSame(){

        System.out.println("Inside testSameAndNotSame method.......");

        String str = "asdf";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "This fileds should have the same values!"); // tests if values are same

        assertNotSame(demoUtils.getAcademy(), str, "Expected field should be different than: " +demoUtils.getAcademy()); // tests if values are different from each other


    }

    @Test
    void testTrueAndFalse(){ // method DemoUtils.isGreater(int n1, int n2)

        System.out.println("Inside testTrueAndFalse method..........");

        int a = 10;
        int b = 4;


        assertTrue(demoUtils.isGreater(a,b), "This should return true"); // potvrdjuje da li rezultat obrade vraca true

        assertFalse(demoUtils.isGreater(b,a), "Output needs to be false"); // // potvrdjuje da li rezultat obrade vraca false

    }

    @Test
    void testArrayEquals(){

        System.out.println("Inside testArrayEquals method.............");

        String [] testArray = {"A", "B", "C"};

        assertArrayEquals(testArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Arrays values should match!"); // asserts if array values are same as expected

    }

    @Test
    void testIterableEquals(){
        System.out.println("inside testIterableEquals method................");

        List<String> testList = List.of("luv", "2", "code");

        assertIterableEquals(testList, demoUtils.getAcademyInList(), "Lists should be the same!"); // asserts if values withing iterable collection are the same


    }

    @Test
    void testLineMatch(){
        System.out.println("inside testLineMatch method................");

        List<String> testList = List.of("luv", "2", "code");

        assertLinesMatch(testList, demoUtils.getAcademyInList(), "Lines should match!"); // asserts that both lists of strings match


    }

    @Test
    void testThrowsAndNotThrow(){

        /* Condition in method if(a<0) throw new Exception */

        assertThrows(Exception.class, () -> { demoUtils.throwException(-8); }, "Expected Exception to be thrown, but nothing was thrown"); // asserts that method throws exception

        assertDoesNotThrow(() -> demoUtils.throwException(2),"Should not throw exception"); // assert that method doesn't throw any exceptions

    }

    @Test
    void testTimeout(){

        /* Thread.sleep(2000); */

        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
            demoUtils.checkTimeout();}, "Method should execute in 3 seconds"); // asserts that method will execute under(Duration.ofSeconds(x)) time

    }


}
