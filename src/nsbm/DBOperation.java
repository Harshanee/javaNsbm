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
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Harshanee
 */
public class DBOperation {

    String url = "jdbc:mysql://localhost:3306/nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    boolean addStudent(Undergraduate un) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO undergraduate VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);
            System.out.println("aaa");
            pst.setInt(1, un.getRegID());
            pst.setString(2, un.getFirstName());
            pst.setString(3, un.getLastname());
            pst.setString(4, un.getDob());
            pst.setString(5, un.getIdNO());
            pst.setString(6, un.getEmail());
            pst.setString(7, un.getSection());
            pst.setString(8, un.getSubject1());
            pst.setString(9, un.getSubject2());
            pst.setString(10, un.getSubject3());
            pst.setString(11, un.getGrade1());
            pst.setString(12, un.getGrade2());
            pst.setString(13, un.getGrade3());
            pst.setString(14, un.getZscore());
            pst.setString(15, un.getIslandRank());
            pst.setString(16, un.getFaculty());
            pst.setString(17, un.getDegreeType());
            pst.setString(18, un.getRegisteredYear());
            pst.setString(19, un.getIntake());
            pst.setString(20, un.getStudyYear());
            pst.setString(21, un.getRegisteredSemester());
            pst.setString(22, un.getSubject11());
            pst.setString(23, un.getSubject12());
            pst.setString(24, un.getSubject13());
            pst.setString(25, un.getSubject14());
            pst.setString(26, un.getStudyYear1());
            pst.setString(27, un.getRegisteredSemester1());
            pst.setString(28, un.getSubject21());
            pst.setString(29, un.getSubject22());
            pst.setString(30, un.getSubject23());
            pst.setString(31, un.getSubject24());
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

    ArrayList<Undergraduate> getStudent() {
        try {
            ArrayList<Undergraduate> list = new ArrayList<Undergraduate>();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SeLECT * FROM undergraduate ";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                Undergraduate u = new Undergraduate();
                u.setRegID(rs.getInt(1));
                u.setFirstName(rs.getString(2));
                u.setLastname(rs.getString(3));
                u.setDob(rs.getString(4));
                u.setIdNO(rs.getString(5));
                u.setEmail(rs.getString(6));
                u.setSection(rs.getString(7));
                u.setSubject1(rs.getString(8));
                u.setSubject2(rs.getString(9));
                u.setSubject3(rs.getString(10));
                u.setGrade1(rs.getString(11));
                u.setGrade2(rs.getString(12));
                u.setGrade3(rs.getString(13));
                u.setZscore(rs.getString(14));
                u.setIslandRank(rs.getString(15));
                u.setFaculty(rs.getString(16));
                u.setDegreeType(rs.getString(17));
                u.setRegisteredYear(rs.getString(18));
                u.setIntake(rs.getString(19));
                u.setStudyYear(rs.getString(20));
                u.setRegisteredSemester(rs.getString(21));
                u.setSubject11(rs.getString(22));
                u.setSubject12(rs.getString(23));
                u.setSubject13(rs.getString(24));
                u.setSubject14(rs.getString(25));
                u.setStudyYear1(rs.getString(26));
                u.setRegisteredSemester1(rs.getString(27));
                u.setSubject21(rs.getString(28));
                u.setSubject22(rs.getString(29));
                u.setSubject23(rs.getString(30));
                u.setSubject24(rs.getString(31));
                list.add(u);
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

    public boolean updateStudent(Undergraduate un) {
        try {
            System.out.println("a");
            con = (Connection) DriverManager.getConnection(url, username, password);
            System.out.println("b");
            String query = "UPDATE undergraduate SET firstname='" + un.getFirstName() + "',lastname='" + un.getLastname() + "',dob='" + un.getDob() + "',idno='" + un.getIdNO() + "',email='" + un.getEmail() + "',section='" + un.getSection() + "',subject1='" + un.getSubject1() + "',subject2='" + un.getSubject2() + "',subject3='" + un.getSubject3() + "',grade1='" + un.getGrade1() + "',grade2='" + un.getGrade2() + "',grade3='" + un.getGrade3() + "',zscore='" + un.getZscore() + "',islandrank='" + un.getIslandRank() + "',faculty='" + un.getFaculty() + "',degreetype='" + un.getDegreeType() + "',registeredyear='" + un.getRegisteredYear() + "',intakes='" + un.getIntake() + "',studyyear='" + un.getStudyYear() + "',registeredsemester='" + un.getRegisteredSemester() + "',subject11='" + un.getSubject11() + "',subject12='" + un.getSubject12() + "',subject13='" + un.getSubject13() + "',subject14='" + un.getSubject14() + "',studyyear1='" + un.getStudyYear1() + "',registeredsemester1='" + un.getRegisteredSemester1() + "',subject21='" + un.getSubject21() + "',subject22='" + un.getSubject22() + "',subject23='" + un.getSubject23() + "',subject23='" + un.getSubject23() + "',subject24='" + un.getSubject24() + "'  WHERE regid=" + un.getRegID();
            System.out.println("c");
            pst = (PreparedStatement) con.prepareStatement(query);

            System.out.println("d");
            pst.executeUpdate();
            System.out.println("e");
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

    public boolean deleteStudent(Undergraduate un) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM undergraduate WHERE regid=" + un.getRegID();
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

    ArrayList<Undergraduate> getStudentComputing() {
        try {
            ArrayList<Undergraduate> list = new ArrayList<Undergraduate>();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SeLECT * FROM undergraduate ";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                Undergraduate u = new Undergraduate();
                u.setRegID(rs.getInt(1));
                u.setFirstName(rs.getString(2));
                u.setLastname(rs.getString(3));
                u.setDob(rs.getString(4));
                u.setIdNO(rs.getString(5));
                u.setEmail(rs.getString(6));
                u.setSection(rs.getString(7));
                u.setSubject1(rs.getString(8));
                u.setSubject2(rs.getString(9));
                u.setSubject3(rs.getString(10));
                u.setGrade1(rs.getString(11));
                u.setGrade2(rs.getString(12));
                u.setGrade3(rs.getString(13));
                u.setZscore(rs.getString(14));
                u.setIslandRank(rs.getString(15));
                u.setFaculty(rs.getString(16));
                u.setDegreeType(rs.getString(17));
                u.setRegisteredYear(rs.getString(18));
                u.setRegisteredSemester(rs.getString(19));
                u.setSubject11(rs.getString(20));
                u.setSubject12(rs.getString(21));
                u.setSubject13(rs.getString(22));
                u.setSubject14(rs.getString(23));
                u.setSubject21(rs.getString(24));
                u.setSubject22(rs.getString(25));
                u.setSubject23(rs.getString(26));
                u.setSubject24(rs.getString(27));
                list.add(u);
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

    boolean addSubject(SubjectInfo si) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO subjects VALUES (?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setString(1, si.getSubName());
            pst.setString(2, si.getSubCode());
            pst.setString(3, si.getSubCredit());
            pst.setString(4, si.getFaculty());

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

    ArrayList<SubjectInfo> getSubject() {
        try {
            ArrayList<SubjectInfo> list = new ArrayList<SubjectInfo>();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM subjects ";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                SubjectInfo s = new SubjectInfo();
                s.setSubName(rs.getString(1));
                s.setSubCode(rs.getString(2));
                s.setSubCredit(rs.getString(3));
                s.setFaculty(rs.getString(4));

                list.add(s);
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

    boolean addMainSubject(SubjectInfo si1) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO mainsubjects VALUES (?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setString(1, si1.getSubName());
            pst.setString(2, si1.getSubCode());
            pst.setString(3, si1.getSubCredit());
            pst.setString(4, si1.getFaculty());

            System.out.println("bbb");
            pst.executeUpdate();
            System.out.println("cccggg");

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

    ArrayList<SubjectInfo> getMainSubject() {
        try {
            ArrayList<SubjectInfo> list = new ArrayList<SubjectInfo>();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM mainsubjects ";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                SubjectInfo s1 = new SubjectInfo();
                s1.setSubName(rs.getString(1));
                s1.setSubCode(rs.getString(2));
                s1.setSubCredit(rs.getString(3));
                s1.setFaculty(rs.getString(4));

                list.add(s1);
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

    ArrayList<Undergraduate> getResultsdetails() {
        try {
            ArrayList<Undergraduate> list = new ArrayList<Undergraduate>();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT* FROM undergraduate ";
            System.out.println("RRRqqqqq");
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                Undergraduate u = new Undergraduate();
                u.setRegID(rs.getInt(1));
                u.setFirstName(rs.getString(2));
                u.setLastname(rs.getString(3));
                u.setDob(rs.getString(4));
                u.setIdNO(rs.getString(5));
                u.setEmail(rs.getString(6));
                u.setSection(rs.getString(7));
                u.setSubject1(rs.getString(8));
                u.setSubject2(rs.getString(9));
                u.setSubject3(rs.getString(10));
                u.setGrade1(rs.getString(11));
                u.setGrade2(rs.getString(12));
                u.setGrade3(rs.getString(13));
                u.setZscore(rs.getString(14));
                u.setIslandRank(rs.getString(15));
                u.setFaculty(rs.getString(16));
                u.setDegreeType(rs.getString(17));
                u.setRegisteredYear(rs.getString(18));
                u.setIntake(rs.getString(19));
                u.setStudyYear(rs.getString(20));
                u.setRegisteredSemester(rs.getString(21));
                u.setSubject11(rs.getString(22));
                u.setSubject12(rs.getString(23));
                u.setSubject13(rs.getString(24));
                u.setSubject14(rs.getString(25));
                u.setStudyYear1(rs.getString(26));
                u.setRegisteredSemester1(rs.getString(27));
                u.setSubject21(rs.getString(28));
                u.setSubject22(rs.getString(29));
                u.setSubject23(rs.getString(30));
                u.setSubject24(rs.getString(31));

                System.out.println("RRRqqqqq1");
                list.add(u);

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

    public String SubCode(ResultMake rm) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SElECT* FROM subjects WHERE code = " + rm.getMark();
            pst = (PreparedStatement) con.prepareStatement(query);
            System.out.println("zzzzz");
            rs = pst.executeQuery();
            SubjectInfo s = new SubjectInfo();
            while (rs.next()) {
                
                s.setSubName(rs.getString(1));
                s.setSubCode(rs.getString(2));
                s.setSubCredit(rs.getString(3));
                s.setFaculty(rs.getString(4));

               System.out.println("zzz1");
            }

            return s.getSubCredit();

        } catch (Exception e) {
            System.out.print(e);
            return "";
          

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
    
    boolean addResult(ResultMake r) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO marks VALUES (?,?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setString(1, r.getRegid());
            pst.setString(2, r.getMmark11());
            pst.setString(3, r.getMmark12());
            pst.setString(4, r.getMmark13());
            pst.setString(5, r.getMark11());
            pst.setString(6, r.getMark12());
            pst.setString(7, r.getMark13());
            pst.setString(8, r.getMark14());
            pst.setString(9, r.getGpa());

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
    
    ArrayList<ResultMake> getResults() {
        try {
            ArrayList<ResultMake> list = new ArrayList<ResultMake>();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT* FROM marks ";
            System.out.println("RRRqqqqq");
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                ResultMake rm = new ResultMake();
                
                rm.setRegid(rs.getString(1));
                rm.setMmark11(rs.getString(2));
                rm.setMmark12(rs.getString(3));
                rm.setMmark13(rs.getString(4));
                rm.setMark11(rs.getString(5));
                rm.setMark12(rs.getString(6));
                rm.setMark13(rs.getString(7));
                rm.setMark14(rs.getString(8));
                rm.setGpa(rs.getString(9));
                
               
                
                
                System.out.println("RRRqqqqq1");
                list.add(rm);

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

}
