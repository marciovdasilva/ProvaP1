package exercicio03;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Teste {
	public Teste(){
		try{
			Connection con = getConexao();
			excluiTodosClientes(con);
			insereCliente(con, 1, "Hugo");
			insereCliente(con, 2, "José");
			insereCliente(con, 3, "Luiz");
			mostrarTodosClientes(con);
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	private void mostrarTodosClientes(Connection con) {
		// TODO Auto-generated method stub
		
	}
	private void excluiTodosClientes(Connection con) {
		// TODO Auto-generated method stub
		
	}
	public Connection getConexao() throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:h2:~/aulah2", "sa", "sa");
		return con;
	}
	public void insereCliente(Connection con, int id, String nome) throws SQLException {
			PreparedStatement ps = con.prepareStatement("INSERT INTO cliente (id, nome)"+" VALUES(?, ?)");
			ps.setInt(1, id);
			ps.setString(2, nome);
			ps.executeUpdate();
		}
	private ArrayList mostrarTodosClientes1(Connection con) throws SQLException{
		PreparedStatement ps = con.prepareStatement("SELECT * FROM cliente");
		ResultSet rs = ps.executeQuery();
		ArrayList lista = new ArrayList();
		while(rs.next()){
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		}
		return lista;
	}
	
	public static void main(String[] args) {
		new Teste();
	}

}
