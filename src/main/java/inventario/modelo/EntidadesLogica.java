//package inventario.modelo;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
//
//import inventario.controlador.Conexion;
//
//public class EntidadesLogica implements CreateReader{
//	 Conexion cn = new Conexion();
//	 Connection con;
//	 PreparedStatement ps;
//	 ResultSet rs; 
//	 entidades e = new entidades();
//	 
//	@Override
//	public List verInventario() {
//		ArrayList<entidades>list = new ArrayList<>();
//		String sql = "select * from inventario";
//		
//		try {
//			con = cn.getConnection();
//			ps = con.prepareStatement(sql);
//			rs =  ps.executeQuery();
//			
//			while(rs.next()) {
//				entidades ent = new entidades();
//				ent.setId(rs.getInt("id"));
//				ent.setProducto(rs.getString("nom_Producto"));
//				ent.setCantidad(rs.getString("cantidad"));
//				ent.setNom_Proveedor(rs.getString("nom_Proveedor"));
//				ent.setDestino(rs.getString("destino"));
//				list.add(ent);
//			}
//		} catch (Exception e){
//			
//		}
//		return list;
//	}
//
//	@Override
//	public entidades list(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean add(entidades et) {
//		String sql = "insert into inventario(nom_Producto,cantidad,nom_Proveedor,destino) values('"+et.getProducto()+"','"+et.getCantidad()+"','"+et.getNom_Proveedor()+"','"+et.getDestino()+"')";
//		try {
//			con = cn.getConnection();
//			ps = con.prepareStatement(sql);
//			ps.executeUpdate();
//		} catch (Exception e) {
//			
//		}
//		return false;
//	}
//
//}
