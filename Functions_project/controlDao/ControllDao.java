/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Student;
import Model.Teacher;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoanganhPC
 */
public class ControllDao extends Dao {
    public ControllDao() {
    }
    int changpass(String user ,String pass,String newpass){
        String sql="update account set pass=? where username=? and pass=?";
        int t=2;
        try{
            PreparedStatement p=connection.prepareStatement(sql);
            p.setString(1, newpass);
            p.setString(2, user);
            p.setString(3, pass);
             t= p.executeUpdate();
        }catch(SQLException e){
         Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);    
        }return t;
    }
    void updatecode(String idteacher,String newcode){
        String sql="update teacher set code=? where id=?";
        try{
            PreparedStatement p=connection.prepareStatement(sql);
            p.setString(1, newcode);
            p.setString(2, idteacher);
            p.executeUpdate();
        }catch(SQLException e){
         Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);    
        }
    }
    void delete(String id,String idteacher){
        String sql="delete class where id=? and studentid=? "
                +  " delete Student where studentid=?";
        try{
           PreparedStatement p=connection.prepareStatement(sql);
           p.setString(1, idteacher);
           p.setString(2, id);
           p.setString(3, id);
           p.executeUpdate();
        }catch(SQLException e){
        Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);       
        }
    }
    public ArrayList<Student> allstudents(){
    String sql="select * from Student";
    ArrayList<Student> a=new ArrayList<>();
    try{
      PreparedStatement p=connection.prepareStatement(sql);
      ResultSet r=p.executeQuery();
      while(r.next()){
          a.add(new Student(r.getString("name"), r.getString("studentid"), r.getString("email"), r.getString("phonenumber"),
                         r.getBoolean("gender"),null,r.getString("campus"),r.getString("img"),r.getString("address"),r.getDate("dob")));
      }
    }catch(SQLException e){
     Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);   
    }
    return a;
    }
    public List<Student> GetAllStudents(String idteacher) {
        List<Student> l = new ArrayList<>();
        try {
            String sql = "select s.* from Student s \n"
                    + "join class c on s.studentid=c.studentid where c.id=?";
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, idteacher);
            ResultSet r = p.executeQuery();
            while (r.next()) {
                l.add(new Student(r.getString("name"), r.getString("studentid"), r.getString("email"), r.getString("phonenumber"),
                         r.getBoolean("gender"), null,r.getString("campus"),r.getString("img"),r.getString("address"),r.getDate("dob")));
            }
        } catch (SQLException e) {
            Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return l;
    }

    public void Update(Student s) throws SQLException {
            String sql = "update Student set name=?,phonenumber=?,[address]=?,gender=?,dob=?,img=? \n" +
",email=? where studentid=?";
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, s.getName());
            p.setString(2, s.getPhoneNumber());
            p.setString(3, s.getAddress());
            p.setBoolean(4, s.isGender());
            p.setDate(5, Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(s.getDob())));
            p.setString(6, s.getImg());
            p.setString(7, s.getEmail());
            p.setString(8, s.getId());
            p.executeUpdate(); 
    }

    public void NewStudent(Student s) {
        try {
            String sql = "insert into Student(studentid,name,gender,campus,email,phonenumber,[address],img,dob) "
                    + "values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, s.getId());
            p.setString(2, s.getName());
            p.setBoolean(3, s.isGender());
            p.setString(4, s.getCampus());
            p.setString(5, s.getEmail());
            p.setString(6, s.getPhoneNumber());
            p.setString(7, s.getAddress());
            p.setString(8, s.getImg());
            p.setDate(9, Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(s.getDob())));
            p.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);
        }
    }
     Teacher forgot(String user,String date,String id){
        String sql="select a.pass,t.email from account a join teacher t on a.id=? where a.username=? and t.dob=?";
        try{
         PreparedStatement p=connection.prepareStatement(sql);
         p.setString(1, id);
         p.setString(2, user);
         p.setString(3, date);
         ResultSet r=p.executeQuery();
         if(r.next()){
           return new Teacher(null, null,r.getString("email"), null, null, null,r.getString("pass"), null, null);
        }
        }catch(SQLException e){
         Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);   
        }
        return null;
     }
     boolean login(String name, String pass,String campus) {
        String sql = "select a.username,a.pass from account a join teacher t \n" +
" on a.id=t.id where t.campus=? and \n" +
"a.username=? and a.pass=?";
        try {
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, campus);
            p.setString(2, name);
            p.setString(3, pass);
            ResultSet r = p.executeQuery();
            if (r.next()) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean checklogin(String name) {
        String sql1 = "select * from account where username=?";
        try {
            PreparedStatement p = connection.prepareStatement(sql1);
            p.setString(1, name);
            ResultSet r = p.executeQuery();
            if (r.next()) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public void addaccount(String name, String pass, String id) {
        String sql = "insert into account(username,pass,id) values(?,?,?)";
        try {
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, name);
            p.setString(2, pass);
            p.setString(3, id);
            p.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<Teacher> listTeacher() {
        String sql1 = "select * from teacher";
        ArrayList<Teacher> al = new ArrayList<>();
        try {
            PreparedStatement p = connection.prepareStatement(sql1);
            ResultSet r = p.executeQuery();
            while(r.next()) {
                al.add(new Teacher(r.getString("id"), r.getString("campus"), r.getString("email"), r.getString("name"),
                        r.getString("img"), r.getString("code"), null, null,r.getDate("dob")));
            }
        } catch (SQLException e) {
            Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return al;
    }
    public Teacher TeacherbyId(String id) {
        String sql1 = "select * from teacher where id=?";
        Teacher t=null;
        try {
            PreparedStatement p = connection.prepareStatement(sql1);
            p.setString(1, id);
            ResultSet r = p.executeQuery();
            if(r.next()) {
                t=new Teacher(r.getString("id"), r.getString("campus"), r.getString("email"), r.getString("name"),
                      r.getString("img"), r.getString("code"), null, null,r.getDate("dob"));
            }
        } catch (SQLException e) {
            Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return t;
    }
    public Student StudentbyId(String id) {
        String sql1 = "select * from Student where studentid=?";
        Student t=null;
        try {
            PreparedStatement p = connection.prepareStatement(sql1);
            p.setString(1, id);
            ResultSet r = p.executeQuery();
            if(r.next()) {
               t=new Student(r.getString("name"), r.getString("studentid"), r.getString("email"), r.getString("phonenumber"),
                         r.getBoolean("gender"), null,r.getString("campus"),r.getString("img"),r.getString("address"),r.getDate("dob"));
            }
        } catch (SQLException e) {
            Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return t;
    }

    public void addTeacher(Teacher t) {
        String sql = "insert into teacher(id,campus,email,name,img,code,dob) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, t.getId());
            p.setString(2, t.getCampus());
            p.setString(3, t.getEmail());
            p.setString(4, t.getName());
            p.setString(5, t.getImg());
            p.setString(5, t.getImg());
            p.setString(6, t.getCode());
            p.setDate(7,Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(t.getDob())));
            p.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public String getId(String user) {
        String n = null;
        try {
            String sql = "select id from account where username=?";
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, user);
            ResultSet r = p.executeQuery();
            if (r.next()) {
                n = r.getString("id");
            }
        } catch (SQLException e) {
            Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return n;
    }
    public Teacher getTeacherbycode(String code,String campus){
        String sql="select * from teacher where code=? and campus=?";
        Teacher t=null;
        try{
        PreparedStatement p=connection.prepareStatement(sql);
        p.setString(1, code);
        p.setString(2, campus);
        ResultSet r =p.executeQuery();
        if(r.next())t=new Teacher(r.getString("id"), r.getString("campus"), r.getString("email"),
                r.getString("name"), r.getString("img"), r.getString("code"), null, null,r.getDate("dob"));
        }catch(SQLException e){
          Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);  
        }
        return t;
    }
    public void addClass(String teacher , String student){
        String sql="insert into class(id,studentid) values(?,?)";
        try{
           PreparedStatement p=connection.prepareStatement(sql);
           p.setString(1, teacher);
           p.setString(2, student);
           p.executeUpdate();
        }catch(SQLException e){
          Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e); 
        }
    }
}
