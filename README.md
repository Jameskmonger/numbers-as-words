# numbers-as-words

This is a simple tool to translate a number (e.g. "501") into the British English representation ("five hundred and one").

## Instructions

Run the tests with `mvn test`.

## Structure

There is a `SimpleUnitTranslator` which handles all numbers 1 - 20, and then all multiples of 10 between 20 and 90 (inclusive).

The entry point `NumbersAsWords` then translates at different levels ("simple", hundreds, thousands, millions) recursively until the whole number has been translated.