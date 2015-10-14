<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo Automated Testing</title>

<style type="text/css">
input {
	text-align: right;
}
</style>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#unit").blur(function() {
			calculateTotalPrice();
		});
		$("#unit_price").blur(function() {
			calculateTotalPrice();
		});
		$("#discount").blur(function() {
			calculateTotalPrice();
		});
	});

	function calculateTotalPrice() {
		var unit = parseFloat($("#unit").val(), 10);
		var unit_price = parseFloat($("#unit_price").val(), 10);
		var discount = parseFloat($("#discount").val(), 10);
		var total_price = parseFloat(unit * unit_price, 10).toFixed(2);
		var amount_total_price = parseFloat(total_price, 10);
		var amount_total_price_after_discount = parseFloat(amount_total_price
				- discount, 10)

		var vat = parseFloat(amount_total_price_after_discount, 10) * 0.07;
		var include_vat = amount_total_price_after_discount + vat;
		var amount_total_price_after_vat = parseFloat(include_vat, 10).toFixed(
				2);

		$("#total_price").text(total_price.digits).digits();
		$("#amount_total_price").text(total_price).digits();
		$("#amount_total_price_after_discount").text(
				amount_total_price_after_discount.toFixed(2)).digits();
		$("#vat").text(vat.toFixed(2)).digits();
		$("#amount_total_price_after_vat").text(amount_total_price_after_vat)
				.digits();
	}

	$.fn.digits = function() {
		return this.each(function() {
			$(this).text($(this).text().replace(/(\d)(?=(\d{3})+\.)/g, "$1,"));
		})
	}
</script>

</head>
<body>

	<center>
		<h1>สร้างใบเสนอราคา QUOTATION</h1>
	</center>
	<br />
	<form action="/quotation/create" method="post">
		<table border="1" width="70%" align="center">
			<tr>
				<td colspan="5" align="center">
					<p>
						<font size="5">ชื่อโครงการ</font>
					</p>
				</td>
			</tr>
			<tr align="center">
				<td><b>ลำดับที่</b></td>
				<td width="20%"><b>รายการ</b></td>
				<td><b>จำนวน</b></td>
				<td width="10%"><b>ราคาต่อหน่วย</b></td>
				<td width="10%"><b>จำนวนเงิน</b></td>
			</tr>
			<tr>
				<td align="center">1</td>
				<td><input type="text" id="item_name" name="item_name"
					size="50"></td>
				<td align="center"><input type="text" id="unit" name="unit"
					value="0" size="5"></td>
				<td><input type="text" id="unit_price" name="unit_price"
					value="0" size="15"></td>
				<td align="right">
					<p id="total_price"></p>
				</td>
			</tr>
		</table>
		<br />
		<table border="1" width="70%" align="center">
			<tr>
				<td rowspan="7" align="center" width="52%">
					<p>
						<font size="5">สรุป</font>
					</p>
				</td>
			</tr>
			<tr align="right">
				<td><b>จำนวนเงินรวม</b></td>
				<td align="right" width="10%">
					<p id="amount_total_price"></p>
				</td>
			</tr>
			<tr align="right">
				<td><b>ส่วนลด</b></td>
				<td><input type="text" id="discount" name="discount" size="15"
					value="0" align="right"></td>
			</tr>
			<tr align="right">
				<td><b>จำนวนเงินหลังจากหักส่วนลด</b></td>
				<td align="right">
					<p id="amount_total_price_after_discount"></p>
				</td>
			</tr>
			<tr align="right">
				<td><b>ภาษีมูลค่าเพิ่ม 7%</b></td>
				<td align="right">
					<p id="vat"></p>
				</td>
			</tr>
			<tr align="right">
				<td><b>จำนวนเงินรวมทั้งสิ้น</b></td>
				<td align="right">
					<p id="amount_total_price_after_vat"></p>
				</td>
			</tr>

		</table>
		<br /> <br /> <br />
		<center>
			<button id="create_quotation">
				<h1>สร้าง QUOTATION สิ รออะไร !!</h1>
			</button>
		</center>
	</form>

</body>
</html>