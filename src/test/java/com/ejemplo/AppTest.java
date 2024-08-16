package com.ejemplo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    AppTest1.class,
    AppTest2.class,
    CalculatorTest.class
})
public class AppTest {
}