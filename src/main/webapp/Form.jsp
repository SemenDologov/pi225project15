
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
<form action="${pageContext.request.contextPath}/Calc" method="post">
		<label for="first">Продолжительность выставки:</label>
		<input type="text" name="first" id="first" value="${first}">		


<p><b>=Затраты на творческую подготовку выставки=</b></p>	


		<label for="second">Бюджет творческой деятельности</label>
		<input type="text" name="second" id="second" value="${second}">

		
<p><b>=Затраты на рекламу выставки=</b></p>
	
	
		<label for="thitd">Рекламный бюджет:</label>
		<input type="text" name="thitd" id="thitd" value="${thitd}">

		
<p><b>=Затраты на техническую подготовку выставки=</b></p>

		
		<label for="fourth">Зарплата административного персонала:</label>
		<input type="text" name="fourth" id="fourth" value="${fourth}">

		
		<label for="fifth">Зарплата исполнительного персонала:</label>
		<input type="text" name="fifth" id="fifth" value="${fifth}">

	
		<label for="sixth">Зарплата вспомогательного персонала:</label>
		<input type="text" name="sixth" id="sixth" value="${sixth}">
	
		<label for="seventh">Стоимость аренды грузового автомобиля:</label>
		<input type="text" name="seventh" id="seventh" value="${seventh}">
		
		<label for="eight">Количество грузовых автомобилей:</label>
		<input type="text" name="eight" id="eight" value="${eight}">
		
		<label for="nineth">Стоимость монтажа стендов:</label>
		<input type="text" name="nineth" id="nineth" value="${nineth}">
		
		<label for="tenth">Страхование выставки:</label>
		<input type="text" name="tenth" id="tenth" value="${tenth}">
		
		<label for="eleventh">Площадь арендуемого помещения:</label>
		<input type="text" name="eleventh" id="eleventh" value="${eleventh}">
		
		<label for="twelvth">Стоимость аренды помещения:</label>
		<input type="text" name="twelvth" id="twelvth" value="${twelvth}">
	
		<label for="therteenth">Процент накладных расходов:</label>
		<input type="text" name="therteenth" id="therteenth" value="${therteenth}">

		
<p><b>=Затраты на проведение сопутствующих мероприятий=</b></p>
		
		
		<label for="fourteenth">Бюджет мероприятий:</label>
		<input type="text" name="fourteenth" id="fourteenth" value="${fourteenth}">

				
<p><b>=Затраты на представительские продукты и сувениры=</b></p>
		
	
		<label for="fifteenth">Бюджет на продукты и сувениры:</label>
		<input type="text" name="fifteenth" id="fifteenth" value="${fifteenth}">


	
<p><b>=Затраты на эксплуатацию выставки=</b></p>
		
		
		<label for="sixteenth">Обслуживание помещений:</label>
		<input type="text" name="sixteenth" id="sixteenth" value="${sixteenth}">
		
		<label for="seventeenth">Тариф электроэнергии:</label>
		<input type="text" name="seventeenth" id="seventeenth" value="${seventeenth}">
		
		<label for="eighteenth">Тариф водоснабжения:</label>
		<input type="text" name="eighteenth" id="eighteenth" value="${eighteenth}">
		
		<label for="nineteenth">Расходы на охрану:</label>
		<input type="text" name="nineteenth" id="nineteenth" value="${nineteenth}">

		
<p><b>=Затраты на закрытие и демонтаж выставки=</b></p>
		
	
		<label for="20">Бюджет на демонтаж выставки:</label>
		<input type="text" name="twenteeth" id="twenteeth" value="${twenteeth}">

		

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