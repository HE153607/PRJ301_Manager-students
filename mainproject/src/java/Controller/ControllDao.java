/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Parents;
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
    public void sendcomment(String content,String tid,String sid,String date){
        String sql="insert into comment(content,dtime,tid,studentid) values(?,?,?,?)";
        try{
         PreparedStatement p=connection.prepareStatement(sql);
         p.setString(1, content);
         p.setDate(2,Date.valueOf(date));
         p.setString(3, tid);
         p.setString(4, sid);
         p.executeUpdate();
        }catch(SQLException e){
   Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);         
    }
    }
    public boolean parentlogin(String card){
       try{
       PreparedStatement p=connection.prepareStatement("select p.* from parent p \n" +
" where p.idcard=? ");
       p.setString(1, card);
         ResultSet r=p.executeQuery();
         if(r.next())
          return true;
    }catch(SQLException e){
   Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);         
    }return false;
    }
    public ArrayList<Student> getcomment(String id){
        ArrayList<Student> a=new ArrayList<>();
       try{
       PreparedStatement p=connection.prepareStatement("select * from comment c where c.studentid=?");
       p.setString(1, id);
         ResultSet r=p.executeQuery();
         while(r.next())
         a.add(new Student(r.getString("content"), r.getString("tid"), r.getString("studentid"),r.getDate("dtime")));
         
    }catch(SQLException e){
   Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);         
    }return a;
    }
    public ArrayList<Student> tableattend(String id){
        ArrayList<Student> a=new ArrayList<>();
       try{
       PreparedStatement p=connection.prepareStatement("select attend,dtime from attend where id=? ");
       p.setString(1, id);
         ResultSet r=p.executeQuery();
         while(r.next())
         a.add(new Student(r.getBoolean("attend"), r.getDate("dtime")));
         
    }catch(SQLException e){
   Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);         
    }return a;
    }
    public Parents parentcampus(String card ,String campus){
       try{
       PreparedStatement p=connection.prepareStatement("select p.* from parent p join Student s on s.studentid=p.studentid\n" +
" where p.idcard=? and s.campus=?");
       p.setString(1, card);
       p.setString(2, campus);
         ResultSet r=p.executeQuery();
         if(r.next())
          return new Parents(r.getString("pid"), r.getString("idcard"),r.getString("phone"), r.getString("name"), r.getString("studentid"));
    }catch(SQLException e){
   Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);         
    }return null;
    }
    public void join(String n,String id){
        try{
         PreparedStatement p=connection.prepareStatement("insert into datejoin(djoin,id) values(?,?)");
         p.setDate(1, Date.valueOf(n));
         p.setString(2,id);
         p.executeUpdate();
        }catch(SQLException e){
   Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);         
    }
    }
    public void insertparent(Parents parent){
        String sql ="insert into parent(name,phone,pid,studentid,idcard) values(?,?,?,?,?)";
        try{
       PreparedStatement p=connection.prepareStatement(sql);
       p.setString(1, parent.getName());
       p.setString(2, parent.getPhone());
       p.setString(3, parent.getId());
       p.setString(4, parent.getChildid());
       p.setString(5, parent.getIdcard());
       p.executeUpdate();

    }catch(SQLException e){
   Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);         
    }
    }
    public ArrayList<Parents> getparents(){
        ArrayList<Parents> l = new ArrayList<>();
         String sql ="select * from parent";
        try{
       PreparedStatement p=connection.prepareStatement(sql);
       ResultSet r=p.executeQuery();
     while(r.next()){
         l.add(new Parents(r.getString("pid"), r.getString("idcard"), r.getString("phone"), r.getString("name"), r.getString("studentid")));
        }
    }catch(SQLException e){
   Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);         
    }
    return l;
    }
    public ArrayList<Student> getstudents(String date,String idteacher){
    ArrayList<Student> l = new ArrayList<>();
        try {
            String sql = "select s.*,a.attend from class c join attend a on c.studentid=a.id join Student s on s.studentid=a.id \n" +
" where c.id=? and a.dtime=? ";
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, idteacher);
            p.setDate(2, Date.valueOf(date));
            ResultSet r = p.executeQuery();
            while (r.next()) {
                l.add(new Student(r.getString("name"), r.getString("studentid"), r.getString("email"), r.getString("phonenumber"),
                         r.getBoolean("gender"), null,r.getString("campus"),r.getString("img"),r.getString("address"),r.getDate("dob"),r.getBoolean("attend")));
            }
        } catch (SQLException e) {
            Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return l;    
    }
    public void insertattend(String id ,boolean state,String date){
        String sql="insert into attend(attend,id,dtime) values(?,?,?)";
        try{
       PreparedStatement p=connection.prepareStatement(sql);
       p.setBoolean(1, state);
       p.setString(2, id);
       p.setDate(3, Date.valueOf(date));
       p.executeUpdate();

    }catch(SQLException e){
   Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);         
    }
    }
    public void updateattend(String id ,boolean state,String date){
        String sql="update attend set attend=? where id=? and dtime=?";
        try{
       PreparedStatement p=connection.prepareStatement(sql);
       p.setBoolean(1, state);
       p.setString(2, id);
       p.setDate(3, Date.valueOf(date));
       p.executeUpdate();

    }catch(SQLException e){
   Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);         
    }
    }
    public Parents getparentbystudentid(String id){
        Parents p=null;
        try{
            PreparedStatement pp=connection.prepareStatement("select p.* from parent p join Student s on p.studentid=s.studentid where s.studentid=?");
            pp.setString(1, id);
            ResultSet r=pp.executeQuery();
            if(r.next())
                p=new Parents(null,r.getString("idcard"), r.getString("phone"), r.getString("name"), null);
        }catch(Exception e){
      Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);              
        }
        return p;
    }
    public Date getdatejoin(String idstudent){
      String sql="select djoin from datejoin where id=?";
        try{
       PreparedStatement p=connection.prepareStatement(sql);
       p.setString(1,idstudent);
       ResultSet r=p.executeQuery();
          if(r.next())
              return r.getDate("djoin");
    }catch(SQLException e){
   Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);         
    }  
        return null;
    }
    public Student studentbycard(String card ,String campus){
        
        String sql="select s.* from Student s join parent p on p.studentid=s.studentid where p.idcard=? and campus=?";
        try{
       PreparedStatement p=connection.prepareStatement(sql);
       p.setString(1,card);
       p.setNString(2,campus);
       ResultSet r=p.executeQuery();
          if(r.next())
              return new Student(r.getString("name"), r.getString("studentid"),null,null,
                         r.getBoolean("gender"),null,null,r.getString("img"),null,null);
    }catch(SQLException e){
   Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);         
    }
        return null;
    }
    public boolean getcode(String code){
    String sql ="select code from teacher where code=?";
    try{
       PreparedStatement p=connection.prepareStatement(sql);
       p.setString(1, code);
       ResultSet r=p.executeQuery();
       if(r.next())
           return true;
    }catch(SQLException e){
   Logger.getLogger(ControllDao.class.getName()).log(Level.SEVERE, null, e);         
    }
    return false;
    }
    public ControllDao() {
    }
    ArrayList<Student> getlistpage(int page,ArrayList<Student> ar){
        ArrayList<Student> a=new ArrayList<>();
        for(int i=0;i<ar.size();i++){
            if(i>=((page-1)*3)&&i<(page*3))
                a.add(ar.get(i));
        }
        return a;
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
        String sql=" delete class where id=? and studentid=? "
                +  "  delete parent where studentid=? \n" +
" delete comment where studentid=? \n" +
" delete datejoin where id=? \n" +
" delete attend where id=? delete Student where studentid=?";
        try{
            connection.setAutoCommit(false);
           PreparedStatement p=connection.prepareStatement(sql);
           p.setString(1, idteacher);
           p.setString(2, id);
           p.setString(3, id);
           p.setString(4, id);
           p.setString(5, id);
           p.setString(6, id);
           p.setString(7, id);
           p.executeUpdate();
           connection.commit();
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
