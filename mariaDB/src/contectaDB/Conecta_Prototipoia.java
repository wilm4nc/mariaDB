package contectaDB;
import java.sql.*;



public class Conecta_Prototipoia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
//			1.Crear la conexion	
			
			Connection iaConexion = DriverManager.getConnection("jdbc:mysql://192.168.0.25:3306/prototipoia", "ia", "123");
			
//			2. crear objeto statement
			
			Statement iaStatement =iaConexion.createStatement();
				
//			3. Ejecutar SQL
				
			ResultSet iaResultset=iaStatement.executeQuery("Select *from usuarioia");
			
//			4. Recorrer el result set
			
			while(iaResultset.next()) {
				
				System.out.println(iaResultset.getString("id") + " - " + iaResultset.getString("nombre"));
			
							}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No Conecta!");
			e.printStackTrace();
			
		}
	}

}
