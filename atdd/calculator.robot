*** Settings ***
Library    Selenium2Library
# Test Teardown    Close Browser

*** Testcases ***
Grade A
    ใส่คะแนน 80
    กดปุ่ม convert
    Show grade A

*** Keywords ***
Show grade A
    Wait until page contains    You got grade A

ใส่คะแนน 80
    Open Browser    http://localhost:8080/demo/grade.html
    Input text    score    80

กดปุ่ม convert
    Click button    Convert
