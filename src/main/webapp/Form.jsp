
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Style.css" type="text/css">
<title>Калькулятор организации выставки</title>
</head>
<body>
<h1>Calculation</h1>
	<form action="${pageContext.request.contextPath}/JavaCalc" method="post">

		<label for="1">Продолжительность выставки:</label>
		<input type="text" name="1" id="1" value="${first}">
				
</form>

<p><b>=Затраты на творческую подготовку выставки=</b></p>	

<form>	
		<label for="2">Бюджет творческой деятельности</label>
		<input type="text" name="2" id="2" value="${second}">
</form>
		
<p><b>=Затраты на рекламу выставки=</b></p>
	
<form>	
		<label for="3">Рекламный бюджет:</label>
		<input type="text" name="3" id="3" value="${thitd}">
</form>
		
<p><b>=Затраты на техническую подготовку выставки=</b></p>

<form>		
		<label for="4">Зарплата административного персонала:</label>
		<input type="text" name="4" id="4" value="${fourth}">
</form>

<form>		
		<label for="5">Зарплата исполнительного персонала:</label>
		<input type="text" name="5" id="5" value="${fifth}">
</form>

<form>		
		<label for="6">Зарплата вспомогательного персонала:</label>
		<input type="text" name="6" id="6" value="${sixth}">
</form>

<form>		
		<label for="7">Стоимость аренды грузового автомобиля:</label>
		<input type="text" name="7" id="7" value="${seventh}">
</form>

<form>		
		<label for="8">Количество грузовых автомобилей:</label>
		<input type="text" name="8" id="8" value="${eight}">
</form>
		
<form>		
		<label for="9">Стоимость монтажа стендов:</label>
		<input type="text" name="9" id="9" value="${nineth}">
</form>
		
<form>		
		<label for="10">Страхование выставки:</label>
		<input type="text" name="10" id="10" value="${tenth}">
</form>
		
<form>		
		<label for="11">Площадь арендуемого помещения:</label>
		<input type="text" name="11" id="11" value="${eleventh}">
</form>
		
<form>		
		<label for="12">Стоимость аренды помещения:</label>
		<input type="text" name="12" id="12" value="${twelvth}">
</form>
		
<form>		
		<label for="13">Процент накладных расходов:</label>
		<input type="text" name="13" id="13" value="${therteenth}">
</form>
		
<p><b>=Затраты на проведение сопутствующих мероприятий=</b></p>
		
<form>		
		<label for="14">Бюджет мероприятий:</label>
		<input type="text" name="14" id="14" value="${fourteenth}">
</form>
				
<p><b>=Затраты на представительские продукты и сувениры=</b></p>
		
<form>		
		<label for="15">Бюджет на продукты и сувениры:</label>
		<input type="text" name="15" id="15" value="${fifteenth}">

</form>	
	
<p><b>=Затраты на эксплуатацию выставки=</b></p>
		
<form>		
		<label for="16">Обслуживание помещений:</label>
		<input type="text" name="16" id="16" value="${sixteenth}">
</form>

<form>		
		<label for="17">Тариф электроэнергии:</label>
		<input type="text" name="17" id="17" value="${seventeenth}">
</form>

<form>		
		<label for="18">Тариф водоснабжения:</label>
		<input type="text" name="18" id="18" value="${eighteenth}">
</form>

<form>		
		<label for="19">Расходы на охрану:</label>
		<input type="text" name="19" id="19" value="${nineteenth}">
		</form>
		
<p><b>=Затраты на закрытие и демонтаж выставки=</b></p>
		
<form>		
		<label for="20">Бюджет на демонтаж выставки:</label>
		<input type="text" name="20" id="20" value="${twenteeth}">
		</form>
		
	<form>
	<p><input type="submit" name="sign" value="Calculate">
	<b>Стоимость выставки: ${result}</b></p>
	</form>	
<form>		
		
		<input type="submit" name="sign" value="Informstion">
		<input type="submit" name="sign" value="Create PDF">
	</form>	

	</body>
</html>