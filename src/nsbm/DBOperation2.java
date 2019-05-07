/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Harshanee
 */
public class DBOperation2 {
    String url = "jdbc:mysql://localhost:3306/nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    boolean addPosts(Postgraduate po) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO postgraduate VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);
            System.out.println("aaa");
            pst.setInt(1, po.getRegID());
            pst.setString(2, po.getFirstName());
            pst.setString(3, po.getLastname());
            pst.setString(4, po.getDob());
            pst.setString(5, po.getIdNO());
            pst.setString(6, po.getEmail());
            pst.setString(7, po.getDegreeName());
            pst.setString(8, po.getInstitute());
            pst.setString(9, po.getYearOfComplecation());
            pst.setString(10, po.getGpa());
            pst.setString(11, po.getDegreeClass());
            pst.setString(12, po.getFaculty());
            pst.setString(13, po.getRegisteredYear());
            pst.setString(14, po.getDegreeType());
            pst.setString(15, po.getIntake());
            pst.setString(16, po.getStudyYear());
            pst.setString(17, po.getRegisteredSemester());
            pst.setString(18, po.getSubject11());
            pst.setString(19, po.getSubject12());
            pst.setString(20, po.getSubject13());
            pst.setString(21, po.getSubject14());
            pst.setString(22, po.getStudyYear1());
            pst.setString(23, po.getRegisteredSemester1());
            pst.setString(24, po.getSubject21());
            pst.setString(25, po.getSubject22());
            pst.setString(26, po.getSubject23());
            pst.setString(27, po.getSubject24());
            System.out.println("bbb");
            pst.executeUpdate();
            System.out.println("ccc");

            return true;

        } catch (SQLException e) {
            System.out.print(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {

            }

        }
    }
    
     ArrayList<Postgraduate> getPostStudent() {
        try {
            ArrayList<Postgraduate> list = new ArrayList<Postgraduate>();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SeLECT * FROM postgraduate ";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                Postgraduate p = new Postgraduate();
                p.setRegID(rs.getInt(1));
                p.setFirstName(rs.getString(2));
                p.setLastname(rs.getString(3));
                p.setDob(rs.getString(4));
                p.setIdNO(rs.getString(5));
                p.setEmail(rs.getString(6));
                p.setDegreeName(rs.getString(7));
                p.setInstitute(rs.getString(8));
                p.setYearOfComplecation(rs.getString(9));
                p.setGpa(rs.getString(10));
                p.setDegreeClass(rs.getString(11));
                p.setFaculty(rs.getString(12));
                p.setDegreeType(rs.getString(13));
                p.setIntake(rs.getString(14));
                p.setRegisteredYear(rs.getString(15));
                p.setStudyYear(rs.getString(16));
                p.setRegisteredSemester(rs.getString(17));
                p.setSubject11(rs.getString(18));
                p.setSubject12(rs.getString(19));
                p.setSubject13(rs.getString(20));
                p.setSubject14(rs.getString(21));
                p.setStudyYear1(rs.getString(22));
                p.setRegisteredSemester1(rs.getString(23));
                p.setSubject21(rs.getString(24));
                p.setSubject22(rs.getString(25));
                p.setSubject23(rs.getString(26));
                p.setSubject24(rs.getString(27));
                list.add(p);
            }
            return list;

        } catch (Exception e) {
            System.out.print(e);
            return null;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {

            }

        }
    }
     
     public boolean updatePost(Postgraduate po) {
        try {
            System.out.println("a");
            con = (Connection) DriverManager.getConnection(url, username, password);
            System.out.println("b");
            String query = "UPDATE postgraduate SET firstname='" +po.getFirstName()+ "',lastname='" + po.getLastname() + "',dob='" + po.getDob() + "',idno='" + po.getIdNO() + "',email='" + po.getEmail() + "',degreename='" + po.getDegreeName() + "',institute='" + po.getInstitute() + "',yearofcomplecation='" + po.getYearOfComplecation() + "',gpa='" + po.getGpa() + "',degreeclass='" + po.getDegreeClass() + "',faculty='" + po.getFaculty() + "',registeredyear='" + po.getRegisteredYear() + "',degreetype='" + po.getDegreeType() + "',intake='"+po.getIntake()+"',studyyear='"+po.getStudyYear()+"',registeredsemester='" + po.getRegisteredSemester() + "',subject11='" + po.getSubject11() + "',subject12='" + po.getSubject12() + "',subject13='" + po.getSubject13() + "',subject14='" + po.getSubject14() + "',studyyear='"+po.getStudyYear()+"',registeredsemester='" + po.getRegisteredSemester() + "',subject21='" + po.getSubject21() + "',subject22='" + po.getSubject22() + "',subject23='" + po.getSubject23() + "',subject23='" + po.getSubject23() + "',subject24='" + po.getSubject24() + "'  WHERE regid=" + po.getRegID();
            System.out.println("c");
            pst = (PreparedStatement) con.prepareStatement(query);   
            
            System.out.println("d");
            pst.executeUpdate();
         
            return true;

        } catch (Exception e) {
            System.out.print(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {

            }

        }

    }

    public boolean deletePost(Postgraduate po) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM postgraduate WHERE regid="+po.getRegID();
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.print(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {

            }

        }

    } 

}


