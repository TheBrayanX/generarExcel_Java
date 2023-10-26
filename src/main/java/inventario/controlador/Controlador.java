//package inventario.controlador;
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//import inventario.modelo.EntidadesLogica;
//import inventario.modelo.entidades;
//
///**
// * Servlet implementation class Controlador
// */
//public class Controlador extends HttpServlet {
//	
////	String listar = "verInventario.jsp";
////	String add = "index.jsp";
////	entidades e = new entidades();
////	EntidadesLogica el = new EntidadesLogica(); 
//	
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public Controlador() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
////	 	String acceso = "";
////		String action = request.getParameter("accion");
////		
////		if(action.equalsIgnoreCase("listar")){
////			acceso = listar;
////		} else if(action.equalsIgnoreCase("add")) {
////			acceso = add;
////		} else if(action.equalsIgnoreCase("Registrar")) {
////			String nomProducto = request.getParameter("nomProducto");
////			String cantidad = request.getParameter("cantidad");
////			String nomProveedor = request.getParameter("nomProveedor");
////			String destino = request.getParameter("destino");
////			e.setProducto(nomProducto);
////			e.setCantidad(cantidad);
////			e.setNom_Proveedor(nomProveedor);
////			e.setDestino(destino); 
////			el.add(e);
////			acceso = listar;
////		}
////		RequestDispatcher vista = request.getRequestDispatcher(acceso);
////		vista.forward(request, response);
//	}
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
