package com.dev.lesson17

import com.dev.lesson18.WithId
import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder
import groovy.util.logging.Slf4j

@ToString
@TupleConstructor
@EqualsAndHashCode
//@Canonical
@Immutable
@Builder
//@Slf4j
class Student implements WithId {
    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }

    def methodMissing(String name, Object arguments) {
        println "missing method $name is invoked: $arguments"
        def field = name - 'findBy'
        def fieldValue = this."$field"
        println "select * from Student where $field = $fieldValue"
    }

    def property(String name) {
        println "missing property $name"
        "default value"
    }
}
