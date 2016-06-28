*** Settings ***
Library    Selenium2Library
Test Teardown    Close Browser

*** Variables ***

*** Testcases ***
Start game เริ่มต้น
  ให้ผู้เล่นสองคนมีคะแนนเป็น 0 เท่ากัน
  ขานคะแนนว่า    Love Love

Alice ได้คะแนนแรก
  [Tags]    dev
  Alice ได้แต้มคะแนน
  ขานคะแนนว่า    Fifteen Love

*** Keywords ***
ขานคะแนนว่า
  [Arguments]    ${คำขาน}
  Wait Until Page Contains    ${คำขาน}

Alice ได้แต้มคะแนน
  Open Browser    http://localhost:8080/demo/tennis
  Click Button    ALICE Win

ข้อความที่แสดงบนหน้าจอต้องเป็น Love Love
  Wait Until Page Contains    Love Love

ให้ผู้เล่นสองคนมีคะแนนเป็น 0 เท่ากัน
  Open Browser    http://localhost:8080/demo/tennis
