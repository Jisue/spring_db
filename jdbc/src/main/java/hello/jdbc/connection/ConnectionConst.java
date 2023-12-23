package hello.jdbc.connection;

// Connection 상수를 만듦
// 생성을 못하게 abstract
// DB 연결 정보
public abstract class ConnectionConst {
    public static final String URL = "jdbc:h2:tcp://localhost/~/hello-jdbc";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "0000";
}
