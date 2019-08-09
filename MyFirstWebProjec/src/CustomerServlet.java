import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.dao.impl.CustomerDAOImpl;
import com.delloite.cms.model.Customer;

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CustomerServlet() {
        super();
      
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int customerId = Integer.parseInt(request.getParameter("customerId"));
		String customerName = request.getParameter("customerName");
		String customerAddress = request.getParameter("customerAddress");
		int billAmount = Integer.parseInt(request.getParameter("billAmount"));
		
		Customer customer = new Customer(customerId, customerName, customerAddress, billAmount);
		CustomerDAO customerDAO = new CustomerDAOImpl();
		boolean result = customerDAO.insertCustomer(customer);
		if(result)
		{
			response.getWriter().println("<h1>Hello"
					+ customerName + customerAddress + billAmount );
		}
		response.setContentType("text/html");
		response.getWriter().println("<h1>Hello"+customerId + customerName + customerAddress + billAmount );
		
	}
	
}
