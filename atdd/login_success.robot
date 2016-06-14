*** Setting ***
Library    Selenium2Library

*** Testcases ***
Login success
    เปิดหน้า login
    กรอก user somkiat
    กรอก pin 1234
    กดปุ่ม login
    ต้องแสดงข้อความสวัสดีจ๊ะ


*** Keywords ***
ต้องแสดงข้อความสวัสดีจ๊ะ
    Wait Until Page Contains    สวัสดีจ๊ะ

กดปุ่ม login
    Click Button   login

กรอก pin 1234
    Input Text   pin   1234

กรอก user somkiat
    Input Text   user   somkiat

เปิดหน้า login
    Open Browser    http://localhost:8080/demo/login.html








	
	