package guru.springframework.config;

public class DataSourceProperties {

    private String username;

    private String password;

    private String dburl;

    public DataSourceProperties() {
    }

    public DataSourceProperties(String username, String password, String dburl) {
        this.username = username;
        this.password = password;
        this.dburl = dburl;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDburl(String dburl) {
        this.dburl = dburl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDburl() {
        return dburl;
    }

}
