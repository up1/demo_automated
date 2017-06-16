*** Settings ***
Library    Selenium2Library
Test Teardown    Close Browser

*** Variables ***
${URL}    http://localhost:8080/demo/
${BROWSER}    chrome

*** Testcases ***
Login Success
  Open Browser  ${URL}   browser=${BROWSER}
  Input Text   id=username    test
  Input Text   id=password    1234
  Click Button    login
  Wait Until Page Contains    สวัสดีจ๊ะ
