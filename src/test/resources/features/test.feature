@feature_fizzbuzz
Feature: FizzBuzz

    @scenario_ints_1_to_20
    Scenario: Integers 1 to 20
        Given I submit the values '1; 2; 3; 4; 5; 6; 7; 8; 9; 10; 11; 12; 13; 14; 15; 16; 17; 18; 19; 20'
        Then fizzbuzz should return the result '1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz'

    @scenario_ints_20_to_1
    Scenario: Integers 20 to 1
        Given I submit the values '20; 19; 18; 17; 16; 15; 14; 13; 12; 11; 10; 9; 8; 7; 6; 5; 4; 3; 2; 1'
        Then fizzbuzz should return the result 'buzz 19 fizz 17 16 fizzbuzz 14 13 fizz 11 buzz fizz 8 7 fizz buzz 4 fizz 2 1'

    @scenario_all_multiples
    Scenario: All Multiples
        Given I submit the values '3; 5; 6; 10; 15'
        Then fizzbuzz should return the result 'fizz buzz fizz buzz fizzbuzz'

    @scenario_no_multiples
    Scenario: No Multiples
        Given I submit the values '1; 2; 4; 7; 8; 11'
        Then fizzbuzz should return the result '1 2 4 7 8 11'

    @scenario_empty_list
    Scenario: Empty List
        Given I submit an empty list
        Then fizzbuzz should return the result ''

    @scenario_null_list
    Scenario: Null List
        Given I submit a null list
        Then fizzbuzz should throw an exception

     @scenario_null_entry_list
     Scenario: Null Entry in List
         Given I submit the values '5; 4; 3; 2; 1; NULL'
         Then fizzbuzz should throw an exception
