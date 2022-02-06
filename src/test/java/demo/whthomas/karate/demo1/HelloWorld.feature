Feature: karate 'hello world' example

  Background:
    Given url 'http://127.0.0.1:8080/'

  Scenario: say hello
    Given path 'hello'
    And param name = 'Thomas'
    When method post
    Then status 200
    Then print response

  Scenario: say hello with get
    Given path 'hello-world'
    When method get
    Then status 200
    Then print response

  Scenario: 说Hello通过参数的方式
    Given path '/hello-world/Terry/say'
    When method get
    Then status 200
    Then print response

  Scenario: 发送一个Json数据
    Given path '/person'
    And request { name: '张三' }
    When method post
    Then status 200
    Then print response