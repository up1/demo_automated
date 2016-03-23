*** Setting ***
Library    Selenium2Library

*** Testcases ***
ตัดเกรด A ที่คะแนน 80
    กรอกคะแนน 80
    คำนวณแล้วต้องแสดงเกรด A
	
*** Keywords ***
กรอกคะแนน 80
    Open Browser    http://localhost:8080/grade/
    Input Text    score   80
    Click Button    Convert to grade

คำนวณแล้วต้องแสดงเกรด A
    Wait until page contains    A


	
	