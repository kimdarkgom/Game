import dto.Item;
import dto.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DB {
    ArrayList<Item> list = new ArrayList<>();
    public Connection dbConn(){
        final String driver = "org.mariadb.jdbc.Driver";
        final String DB_IP = "localhost";
        final String DB_PORT = "3307";
        final String DB_NAME = "gamedb";
        final String DB_USER = "root";
        final String DB_PASS = "1234";
        final String DB_URL =
                "jdbc:mariadb://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME;

        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            if (conn != null) {

            }

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로드 실패");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DB 접속 실패");
            e.printStackTrace();
        }
        return conn;
    }
    public void insertItem(Item idto){

        //쿼리문 준비
        String sql = "INSERT INTO `gamedb`.`item` (`name`, `att`,`dmg`, `eff`) VALUES (?,?,?,?);";

        PreparedStatement pstmt = null;
        Connection conn = dbConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, idto.getName());
            pstmt.setString(2, idto.getAtt());
            pstmt.setInt(3, idto.getDmg());
            pstmt.setString(4, idto.getEff());

            int result = pstmt.executeUpdate();
            if(result==1) {


            }

        } catch (Exception e) {
            System.out.println("데이터 삽입 실패!");
        }    finally {
            try {
                if(pstmt!=null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {}
        }
    }

    public Object getItem() {
        Connection conn = dbConn();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String sql = "select * from item";

            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String att = rs.getString("att");
                int dmg = rs.getInt("dmg");
                String eff = rs.getString("eff");
                System.out.println("고유 번호 : "+id+", 이름  : "+name+", 설명 : "+att+", 공격력 : +"+dmg+", 효과 :"+eff);
            }

        } catch (SQLException e) {
            System.out.println("error: " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }

                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public void deleteItem(Item idto){

        //쿼리문 준비
        String sql = "DELETE FROM `gamedb`.`item` WHERE  `id`=?;";

        PreparedStatement pstmt = null;
        Connection conn = dbConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, idto.getId());
            int result = pstmt.executeUpdate();
            if(result==1) {

            }

        } catch (Exception e) {
            System.out.println("데이터 삭제 실패!");
        }    finally {
            try {
                if(pstmt!=null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {}
        }
    }
    public void insertUser(User udto){

        //쿼리문 준비
        String sql = "INSERT INTO `gamedb`.`user` (`name`, `job`,`hp`) VALUES (?,?,?);";

        PreparedStatement pstmt = null;
        Connection conn = dbConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, udto.getName());
            pstmt.setString(2, udto.getJob());
            pstmt.setInt(3, udto.getHp());

            int result = pstmt.executeUpdate();
            if(result==1) {


            }

        } catch (Exception e) {
            System.out.println("데이터 삽입 실패!");
        }    finally {
            try {
                if(pstmt!=null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {}
        }
    }
    public Object getUser() {
        Connection conn = dbConn();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String sql = "select * from user";

            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job = rs.getString("job");
                int hp = rs.getInt("hp");
                System.out.println("고유 번호 : "+id+", 이름  : "+name+", 직업 : "+job+", hp : "+hp);
            }

        } catch (SQLException e) {
            System.out.println("error: " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }

                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public void deleteUser(User udto){

        //쿼리문 준비
        String sql = "DELETE FROM `gamedb`.`user` WHERE  `id`=?;";

        PreparedStatement pstmt = null;
        Connection conn = dbConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, udto.getId());
            int result = pstmt.executeUpdate();
            if(result==1) {

            }

        } catch (Exception e) {
            System.out.println("데이터 삭제 실패!");
        }    finally {
            try {
                if(pstmt!=null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {}
        }
    }
    public Object getId() {
        Connection conn = dbConn();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String sql = "select * from item";

            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                System.out.println(id);

            }

        } catch (SQLException e) {
            System.out.println("error: " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }

                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public ArrayList<Item> getItemList(){
        return list;
    }

}
