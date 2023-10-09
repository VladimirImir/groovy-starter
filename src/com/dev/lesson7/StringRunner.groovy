package com.dev.lesson7

/**
 * " "
 * ' '
 * """ """
 * ''' '''
 * / /
 * $/ /$
 */

def name = "Ivan"
def value = 'Hello "Hi!" '
char char1 = 'H'

def stringValue = "Hello $name"
println stringValue

def value2 = """
SELECT *
FROM
table where name = $name
table where name2 = ${getWithPrefix(name)}
"""
println value2

def value3 = '''
SELECT *
FROM
table where name = $name
'''
println value3

def value4 = /Hello World $name/
println value4

def value5 = $/Hello World $name/$
println value5

println name[2]
println name[-1]
println name[1..3]
println name * 3
println name - 'Iv'
println name - 'an'

def getWithPrefix(String name) {
    "prefix-" + name
}
