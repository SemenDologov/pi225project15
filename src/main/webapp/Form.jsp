
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
<form>
		<label for="first">Продолжительность выставки:</label>
		<input type="text" name="first" id="first" value="${first}">		
</form>

<p><b>=Затраты на творческую подготовку выставки=</b></p>	

<form>	
		<label for="second">Бюджет творческой деятельности</label>
		<input type="text" name="second" id="second" value="${second}">
</form>
		
<p><b>=Затраты на рекламу выставки=</b></p>
	
<form>	
		<label for="thitd">Рекламный бюджет:</label>
		<input type="text" name="thitd" id="thitd" value="${thitd}">
</form>
		
<p><b>=Затраты на техническую подготовку выставки=</b></p>

<form>		
		<label for="fourth">Зарплата административного персонала:</label>
		<input type="text" name="fourth" id="fourth" value="${fourth}">
</form>

<form>		
		<label for="fifth">Зарплата исполнительного персонала:</label>
		<input type="text" name="fifth" id="fifth" value="${fifth}">
</form>

<form>		
		<label for="sixth">Зарплата вспомогательного персонала:</label>
		<input type="text" name="sixth" id="sixth" value="${sixth}">
</form>

<form>		
		<label for="seventh">Стоимость аренды грузового автомобиля:</label>
		<input type="text" name="seventh" id="seventh" value="${seventh}">
</form>

<form>		
		<label for="eight">Количество грузовых автомобилей:</label>
		<input type="text" name="eight" id="eight" value="${eight}">
</form>
		
<form>		
		<label for="nineth">Стоимость монтажа стендов:</label>
		<input type="text" name="nineth" id="nineth" value="${nineth}">
</form>
		
<form>		
		<label for="tenth">Страхование выставки:</label>
		<input type="text" name="tenth" id="tenth" value="${tenth}">
</form>
		
<form>		
		<label for="eleventh">Площадь арендуемого помещения:</label>
		<input type="text" name="eleventh" id="eleventh" value="${eleventh}">
</form>
		
<form>		
		<label for="twelvth">Стоимость аренды помещения:</label>
		<input type="text" name="twelvth" id="twelvth" value="${twelvth}">
</form>
		
<form>		
		<label for="therteenth">Процент накладных расходов:</label>
		<input type="text" name="therteenth" id="therteenth" value="${therteenth}">
</form>
		
<p><b>=Затраты на проведение сопутствующих мероприятий=</b></p>
		
<form>		
		<label for="fourteenth">Бюджет мероприятий:</label>
		<input type="text" name="fourteenth" id="fourteenth" value="${fourteenth}">
</form>
				
<p><b>=Затраты на представительские продукты и сувениры=</b></p>
		
<form>		
		<label for="fifteenth">Бюджет на продукты и сувениры:</label>
		<input type="text" name="fifteenth" id="fifteenth" value="${fifteenth}">

</form>	
	
<p><b>=Затраты на эксплуатацию выставки=</b></p>
		
<form>		
		<label for="sixteenth">Обслуживание помещений:</label>
		<input type="text" name="sixteenth" id="sixteenth" value="${sixteenth}">
</form>

<form>		
		<label for="seventeenth">Тариф электроэнергии:</label>
		<input type="text" name="seventeenth" id="seventeenth" value="${seventeenth}">
</form>

<form>		
		<label for="eighteenth">Тариф водоснабжения:</label>
		<input type="text" name="eighteenth" id="eighteenth" value="${eighteenth}">
</form>

<form>		
		<label for="nineteenth">Расходы на охрану:</label>
		<input type="text" name="nineteenth" id="nineteenth" value="${nineteenth}">
		</form>
		
<p><b>=Затраты на закрытие и демонтаж выставки=</b></p>
		
<form>		
		<label for="20">Бюджет на демонтаж выставки:</label>
		<input type="text" name="twenteeth" id="twenteeth" value="${twenteeth}">
		</form>
		
	<form action="${pageContext.request.contextPath}/Calc" method="post">
	<input type="submit" name="sign" value="Calculate">
	<p><b>Стоимость выставки: ${result}</b></p>
	</form>	
<form action="${pageContext.request.contextPath}/Information" method="post">		
		
		<input type="submit" name="sign" value="Information">
		</form>	
		<form>	
		<input type="submit" name="sign" value="Create PDF">
	</form>	

	</body>
</html>