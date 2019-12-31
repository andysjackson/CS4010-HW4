/*
 * Andrew Jackson
 * cs4010 hw4
 * 08/11/2017
 */
package dvdAJ;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class CartServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(  HttpServletRequest request,
                                    HttpServletResponse response)
                                    throws ServletException, IOException {
        String url = "/index.jsp"; /*home*/
        
        String action = request.getParameter("action");
        if (action == null) {
            action = "cart";
        }
        if (action.equals("shop")){
                        
            url = "/index.jsp";
        }
        else if (action.equals("cart")){
            String productCode = request.getParameter("productCode");
            String quantityString = request.getParameter("quantity");
            
            HttpSession session = request.getSession();
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null){
                cart = new Cart();
            }
            int quantity;
            try {
                quantity = Integer.parseInt(quantityString);
                if (quantity < 0){
                    quantity = 1;
                }
            }
            catch (NumberFormatException nfe){
                quantity = 1;
            }
            if (quantityString.equals("add")){
                cart.updateContents(productCode , quantityString);
            }
            else{
                cart.updateContents(productCode , new Integer(quantity).toString());
            }
            session.setAttribute("cart" , cart);
            url = "/cart.jsp";
        }
        else if(action.equals("checkout")){
            url = "/checkout.jsp";
        }
        else if(action.equals("reset")){
            HttpSession session = request.getSession();
            session.removeAttribute("cart");
            url = "/index.jsp";
        }
        
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request , response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "dvd cart servlet";
    }

}
