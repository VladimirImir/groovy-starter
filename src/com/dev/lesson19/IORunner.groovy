package com.dev.lesson19

import groovy.io.FileType

class IORunner {

    static void main(String[] args) {
        def file = new File(".idea/.gitignore")
        println file.text

        file.each { line -> println line }
        file.withInputStream {
            def allText = new String(it.readAllBytes())
            println allText
        }

        def writer = new StringWriter()
        try (def reader = file.newReader()) {
            writer << reader
        }

        // write
        def file2 = new File("text.txt")
        file2.text = "Some text"
        file2 << "New line" << System.lineSeparator()

        def srcDir = new File("src")
        //srcDir.eachDir { println it }
        srcDir.eachDirRecurse { println it }

        srcDir.eachFile(FileType.FILES) { println it }
    }
}
