<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo Automated Testing</title>
</head>
<body>

<jsp:useBean id="quotation" class="demo.testing.QuotationView" scope="request" />

<center>
    <h1>ใบเสนอราคา QUOTATION</h1>
</center>

<table border="1" width="70%" align="center">
    <tr>
        <td colspan="5" align="center">
            <p><font size="5">ชื่อโครงการ</font></p>
        </td>
    </tr>
    <tr align="center">
        <td><b>ลำดับที่</b></td>
        <td><b>รายการ</b></td>
        <td><b>จำนวน</b></td>
        <td><b>ราคาต่อหน่วย</b></td>
        <td><b>จำนวนเงิน</b></td>
    </tr>
    <tr>
        <td align="center">1</td>
        <td>
        		<jsp:getProperty name="quotation" property="title"/>
        	</td>
        <td align="center">
        		<jsp:getProperty name="quotation" property="unit"/>
        	</td>
        <td align="right">
        		<jsp:getProperty name="quotation" property="unitPrice"/>
        	</td>
        <td align="right">
        		<jsp:getProperty name="quotation" property="totalPrice"/>
        	</td>
    </tr>
</table>
<br/>
<table border="1" width="70%" align="center">
    <tr>
        <td rowspan="7" align="center" width="52%">
            <p><font size="5">สรุป</font></p>
        </td>
    </tr>
    <tr align="center">
        <td><b>จำนวนเงินรวม</b></td>
        <td align="right">
        		<jsp:getProperty name="quotation" property="amountPrice"/>
        	</td>
    </tr>
    <tr align="center">
        <td><b>ส่วนลด</b></td>
        <td align="right">
        		<jsp:getProperty name="quotation" property="discount"/>
        	</td>
    </tr>
    <tr align="center">
        <td><b>จำนวนเงินหลังจากหักส่วนลด</b></td>
        <td align="right">
        		<jsp:getProperty name="quotation" property="amountAfterDiscount"/>
        	</td>
    </tr>
    <tr align="center">
        <td><b>ภาษีมูลค่าเพิ่ม 7%</b></td>
        <td align="right">
        		<jsp:getProperty name="quotation" property="vat"/>
        </td>
    </tr>
    <tr align="center">
        <td><b>จำนวนเงินรวมทั้งสิ้น</b></td>
        <td align="right">
        		<jsp:getProperty name="quotation" property="amountAfterVat"/>
        </td>
    </tr>

</table>
    
</body>
</html>