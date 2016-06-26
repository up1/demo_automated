*** Settings ***
Library    Selenium2Library
Test Teardown    Close Browser
*** Variables ***

*** Testcases ***
Grade A ด้วยคะแนน 80
  [Tags]    done
  เปิด browser firefox ไปที่ระบบคำนวณเกรด
  กรอกคะแนน    80
  กดปุ่มคำนวณเกรด
  หน้าจอแสดง    You got grade A

Grade A ด้วยคะแนน 81
  [Tags]    done
  เปิด browser firefox ไปที่ระบบคำนวณเกรด
  กรอกคะแนน    81
  กดปุ่มคำนวณเกรด
  หน้าจอแสดง    You got grade A

Grade B ด้วยคะแนน 79
  [Tags]    dev
  เปิด browser firefox ไปที่ระบบคำนวณเกรด
  กรอกคะแนน    79
  กดปุ่มคำนวณเกรด
  หน้าจอแสดง     You got grade B

*** Keywords ***
หน้าจอแสดง
  [Arguments]   ${expected result}
  Wait Until Page Contains    ${expected result}

กดปุ่มคำนวณเกรด
  Click Button    convert

กรอกคะแนน
  [Arguments]   ${score}
  Input Text    score    ${score}


เปิด browser firefox ไปที่ระบบคำนวณเกรด
  Open Browser    http://128.199.208.27:8080/demo/grade.html
