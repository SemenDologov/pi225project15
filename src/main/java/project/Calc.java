package project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calc
 */
@WebServlet("/Calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Calc() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		calculate close;
		calculate creative;
		calculate event;
		calculate gifts;
		calculate marketing;
		calculate overheadCosts;
		calculate service;
		calculate techPreparation;
		
		try {
			lineInput closeInput = new NumberInput(request.getParameter("twenteeth"));
			closeInput.checkinput();
			close = new Close(Double.parseDouble(closeInput.getLabel()));
			
			lineInput creativeInput = new NumberInput(request.getParameter("second"));
			creativeInput.checkinput();
			creative = new Creative(Double.parseDouble(creativeInput.getLabel()));
			
			lineInput eventInput = new NumberInput(request.getParameter("fourteenth"));
			eventInput.checkinput();
			event = new Event(Double.parseDouble(eventInput.getLabel()));
			
			lineInput giftsInput = new NumberInput(request.getParameter("fifteenth"));
			giftsInput.checkinput();
			gifts = new Gifts(Double.parseDouble(giftsInput.getLabel()));
			
			lineInput marketingInput = new NumberInput(request.getParameter("thitd"));
			marketingInput.checkinput();
			marketing = new Marketing(Double.parseDouble(marketingInput.getLabel()));
			
			lineInput daysInput = new WholeNumberInput(request.getParameter("first"));
			daysInput.checkinput();
			lineInput roomServiseInput = new NumberInput(request.getParameter("sixteenth"));
			roomServiseInput.checkinput();
			lineInput electroInput = new NumberInput(request.getParameter("seventeenth"));
			electroInput.checkinput();
			lineInput waterInput = new NumberInput(request.getParameter("eighteenth"));
			waterInput.checkinput();
			lineInput securityInput = new NumberInput(request.getParameter("nineteenth"));
			securityInput.checkinput();
			service = new Service(Double.parseDouble(roomServiseInput.getLabel()),
								Double.parseDouble(electroInput.getLabel()),
								Double.parseDouble(waterInput.getLabel()),
								Double.parseDouble(securityInput.getLabel()),
								Double.parseDouble(daysInput.getLabel()));
			
			lineInput adminSalary = new NumberInput(request.getParameter("fourth"));
			adminSalary.checkinput();
			lineInput executorSalary = new NumberInput(request.getParameter("fifth"));
			executorSalary.checkinput();
			lineInput serviceSalary = new NumberInput(request.getParameter("sixth"));
			serviceSalary.checkinput();
			lineInput carPriceInput = new NumberInput(request.getParameter("seventh"));
			carPriceInput.checkinput();
			lineInput numberOfCarsInput = new WholeNumberInput(request.getParameter("eight"));
			numberOfCarsInput.checkinput();
			lineInput priceOfStandsInput = new NumberInput(request.getParameter("nineth"));
			priceOfStandsInput.checkinput();
			lineInput insuranceInput = new NumberInput(request.getParameter("tenth"));
			insuranceInput.checkinput();
			lineInput squareInput = new NumberInput(request.getParameter("eleventh"));
			squareInput.checkinput();
			lineInput squarePriceInput = new NumberInput(request.getParameter("twelvth"));
			squarePriceInput.checkinput();
			techPreparation = new TechPreparation(Double.parseDouble(adminSalary.getLabel()),
					Double.parseDouble(executorSalary.getLabel()),
					Double.parseDouble(serviceSalary.getLabel()),
					Double.parseDouble(carPriceInput.getLabel()),
					Double.parseDouble(numberOfCarsInput.getLabel()),
					Double.parseDouble(priceOfStandsInput.getLabel()),
					Double.parseDouble(insuranceInput.getLabel()),
					Double.parseDouble(squareInput.getLabel()),
					Double.parseDouble(squarePriceInput.getLabel()));
			
			Double sum = close.calculation() + creative.calculation() + event.calculation() + gifts.calculation() + marketing.calculation() + service.calculation() + techPreparation.calculation();
			
			lineInput overheadInput = new PercentInput(request.getParameter("therteenth"));
			overheadInput.checkinput();
			overheadCosts = new OverheadCosts(sum, Double.parseDouble(overheadInput.getLabel()));
			
			Double sum2 = overheadCosts.calculation();
			String formattedOut = String.format("%.2f", sum2);
			
			request.setAttribute("result", formattedOut);
			request.getRequestDispatcher("/Form.jsp").forward(request, response);
			
		} catch (LessThanZeroException e) {
			request.getRequestDispatcher("/negativeNumber.jsp").forward(request, response);
		} catch (MoneyInputException e) {
			request.getRequestDispatcher("/MoreThanTwo.jsp").forward(request, response);
		} catch (PercentException e) {
			request.getRequestDispatcher("/Percent.jsp").forward(request, response);
		} catch (WholeNumberException e) {
			request.getRequestDispatcher("/NotanInteger.jsp").forward(request, response);
		} catch (NumberFormatException e) {
			request.getRequestDispatcher("/NotaNumber.jsp").forward(request, response);
		} catch (NullPointerException e) {
			request.setAttribute("result", 0);
			request.getRequestDispatcher("/Form.jsp").forward(request, response);
		}
		
		/*
		try {
			lineInput creativeInput = new NumberInput(request.getParameter("second"));
			creativeInput.checkinput();
			creative = new Creative(Double.parseDouble(creativeInput.getLabel()));
		} catch (LessThanZeroException e) {
			request.getRequestDispatcher("/negativeNumber.jsp").forward(request, response);
		} catch (MoneyInputException e) {
			request.getRequestDispatcher("/MoreThanTwo.jsp").forward(request, response);
		}
		*/
		/*
		try {
			lineInput eventInput = new NumberInput(request.getParameter("fourteenth"));
			eventInput.checkinput();
			event = new Event(Double.parseDouble(eventInput.getLabel()));
		} catch (LessThanZeroException e) {
			request.getRequestDispatcher("/negativeNumber.jsp").forward(request, response);
		} catch (MoneyInputException e) {
			request.getRequestDispatcher("/MoreThanTwo.jsp").forward(request, response);
		}
		*/
		/*
		try {
			lineInput giftsInput = new NumberInput(request.getParameter("fifteenth"));
			giftsInput.checkinput();
			gifts = new Gifts(Double.parseDouble(giftsInput.getLabel()));
		} catch (LessThanZeroException e) {
			request.getRequestDispatcher("/negativeNumber.jsp").forward(request, response);
		} catch (MoneyInputException e) {
			request.getRequestDispatcher("/MoreThanTwo.jsp").forward(request, response);
		}
		*/
		/*
		try {
			lineInput marketingInput = new NumberInput(request.getParameter("thitd"));
			marketingInput.checkinput();
			marketing = new Marketing(Double.parseDouble(marketingInput.getLabel()));
		} catch (LessThanZeroException e) {
			request.getRequestDispatcher("/negativeNumber.jsp").forward(request, response);
		} catch (MoneyInputException e) {
			request.getRequestDispatcher("/MoreThanTwo.jsp").forward(request, response);
		}
		*/
		/*
		try {
			lineInput overheadInput = new PercentInput(request.getParameter("therteenth"));
			overheadInput.checkinput();
			overheadCosts = new OverheadCosts(Double.parseDouble(overheadInput.getLabel()));
		} catch (LessThanZeroException e) {
			request.getRequestDispatcher("/negativeNumber.jsp").forward(request, response);
		} catch (MoneyInputException e) {
			request.getRequestDispatcher("/MoreThanTwo.jsp").forward(request, response);
		}
		*/
		/*
		try {
			lineInput daysInput = new WholeNumberInput(request.getParameter("first"));
			daysInput.checkinput();
			lineInput roomServiseInput = new NumberInput(request.getParameter("sixteenth"));
			roomServiseInput.checkinput();
			lineInput electroInput = new NumberInput(request.getParameter("seventeenth"));
			electroInput.checkinput();
			lineInput waterInput = new NumberInput(request.getParameter("eighteenth"));
			waterInput.checkinput();
			lineInput securityInput = new NumberInput(request.getParameter("nineteenth"));
			securityInput.checkinput();
			service = new Service(Double.parseDouble(roomServiseInput.getLabel()),
								Double.parseDouble(electroInput.getLabel()),
								Double.parseDouble(waterInput.getLabel()),
								Double.parseDouble(securityInput.getLabel()),
								Double.parseDouble(daysInput.getLabel()));
		} catch (LessThanZeroException e) {
			request.getRequestDispatcher("/negativeNumber.jsp").forward(request, response);
		} catch (MoneyInputException e) {
			request.getRequestDispatcher("/MoreThanTwo.jsp").forward(request, response);
		}
		*/
		/*
		try {
			lineInput adminSalary = new NumberInput(request.getParameter("fourth"));
			adminSalary.checkinput();
			lineInput executorSalary = new NumberInput(request.getParameter("fifth"));
			executorSalary.checkinput();
			lineInput serviceSalary = new NumberInput(request.getParameter("sixth"));
			serviceSalary.checkinput();
			lineInput carPriceInput = new NumberInput(request.getParameter("seventh"));
			carPriceInput.checkinput();
			lineInput numberOfCarsInput = new WholeNumberInput(request.getParameter("eight"));
			numberOfCarsInput.checkinput();
			lineInput priceOfStandsInput = new NumberInput(request.getParameter("nineth"));
			priceOfStandsInput.checkinput();
			lineInput insuranceInput = new NumberInput(request.getParameter("tenth"));
			insuranceInput.checkinput();
			lineInput squareInput = new NumberInput(request.getParameter("eleventh"));
			squareInput.checkinput();
			lineInput squarePriceInput = new NumberInput(request.getParameter("twelvth"));
			squarePriceInput.checkinput();
		} catch (LessThanZeroException e) {
			request.getRequestDispatcher("/negativeNumber.jsp").forward(request, response);
		} catch (MoneyInputException e) {
			request.getRequestDispatcher("/MoreThanTwo.jsp").forward(request, response);
		}
		calculate techPreparation = new TechPreparation(Double.parseDouble(adminSalary.getLabel()),
														Double.parseDouble(executorSalary.getLabel()),
														Double.parseDouble(serviceSalary.getLabel()),
														Double.parseDouble(carPriceInput.getLabel()),
														Double.parseDouble(numberOfCarsInput.getLabel()),
														Double.parseDouble(priceOfStandsInput.getLabel()),
														Double.parseDouble(insuranceInput.getLabel()),
														Double.parseDouble(squareInput.getLabel()),
														Double.parseDouble(squarePriceInput.getLabel()));
		*/
	}

}
