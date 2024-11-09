import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ConnectionPool {
    //使用map数据类型充当连接池，存储已经存在的连接
    private Map<String, Connection> pool = new HashMap<>();

    //使用函数对其连接，传入连接配置
    public Connection getConnection(String url, String user, String password) throws SQLException {
        String key = url + ":" + user + ":" + password;
        //当输入参数匹配时，返回已经存在的连接对象。
        //当不同的对象调用配置相同的数据库连接对象时，返回的都是同一个对象。
        if (!pool.containsKey(key)) {
            pool.put(key, DriverManager.getConnection(url, user, password));
        }
        return pool.get(key);
    }

    public void releaseConnection(Connection connection) {
        // 实际应用中可能需要更复杂的逻辑来管理连接的生命周期
    }
}