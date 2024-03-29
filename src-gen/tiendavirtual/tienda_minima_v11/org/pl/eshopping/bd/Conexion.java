package tiendavirtual.tienda_minima_v11.org.pl.eshopping.bd;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import tiendavirtual.tienda_minima_v11.org.pl.eshopping.general.Config;
/*** added by dConexion
 */
public class Conexion {
	private static final String SERVIDOR = Config.SERVIDOR;
	private static final int PUERTO = Config.PUERTO;
	private static final String BD = Config.BD;
	private static final String NOMBRE_USUARIO = Config.NOMBRE_USUARIO;
	private static final String CONTRASENA_USUARIO = Config.CONTRASENA_USUARIO;
	public static Connection getConexion() throws SQLException {
		MysqlDataSource ds = new MysqlDataSource();
		ds.setServerName(SERVIDOR);
		ds.setPortNumber(PUERTO);
		ds.setDatabaseName(BD);
		ds.setUser(NOMBRE_USUARIO);
		ds.setPassword(CONTRASENA_USUARIO);
		return ds.getConnection();
	}
}