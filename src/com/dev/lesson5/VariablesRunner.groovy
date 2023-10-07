package com.dev.lesson5

import groovy.transform.CompileStatic

//import java.sql.Date
import java.sql.Date as SqlDate

class VariablesRunner {

    /**
     * byte, short, int, long, BigInteger
     * float, double, BigDecimal
     * char
     * boolean
     */

    //@CompileStatic
    static void main(String[] args) {
        //int value = 5
        Integer _value = 5
        BigInteger _value2 = 36G
        BigDecimal _value3 = 3.3G

        /** def = var*/
        def value = 5
        def value2 = 36G
        def value3 = 3.3G
        //new Date()
        new SqlDate()
    }
}
