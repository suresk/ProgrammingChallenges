Programming Challenges!
=======================

This project will consist of a collection of Java-based programming challenges. Each one will consist of 
one or more interfaces that you must implement to provide the desired functionality for the test. Each challenge
will be run as part of a TestNG test. Winners will be determined by the lowest amount of total runtime (in 
milliseconds). Entries that fail any tests will be disqualified.

=======================
CHALLENEGES
=======================

1. Missing Numbers (net.uresk.challenges.missingnumbers)

You'll be given an array of numbers, an upper bound, and whether or not the array includes duplicates. Your
task is to return a list of numbers that are missing, in order from smallest to largest, with no duplicates.

Implement the MissingNumberFinder interface to provide this functionality. Your code will be run against a
number of tests - each one being run 10 - 1000 times.

Parameters:

a. The array of numbers will contain between 1 and Integer.MAX_VALUE (inclusive) integers. It may or may not contain
duplicate values (check the duplicates flag).

b. The upper bound is between 1 and Integer.MAX_VALUE, inclusive.

Hardware:

1. The test will be run on a Windows 7 machine with a Core i7 925 processor.

2. The amount of memory you'll have available is the upperbound of the largest test * 16 bytes.

3. This will be run with JDK 1.6 update 24 with the -server flag.