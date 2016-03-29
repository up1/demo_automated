*** Setting ***
Library    Selenium2Library
Test Teardown    Close Browser

*** Testcases ***
คะแนน 80 ต้องได้เกรด A
    กรอกคะแนน    80
    คำนวณเกรด
    ต้องได้เกรด    A

คะแนน 79 ต้องได้เกรด B
    กรอกคะแนน    79
    คำนวณเกรด
    ต้องได้เกรด   B

*** Keywords ***
กรอกคะแนน
    [Arguments]    ${score}
    Open Browser    http://localhost:8080/grade/
    Input Text    score   ${score}

คำนวณเกรด
    Click Button   convert

ต้องได้เกรด
    [Arguments]    ${grade}
    Wait Until Page Contains    You got grade ${grade}





	
	