/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontrol;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ayu yanti
 */
public class koneksi {
private Connection koneksi;
public Connection connect(){
try{
Class.forName("com.mysql.jdbc.Driver");
System.out.println("BERHASIL KONEKSI");
}
catch(ClassNotFoundException ex){
System.out.println("GAGAL KONEKSI"+ex);
}
String url = "jdbc:mysql://localhost/dua";
try{
koneksi = DriverManager.getConnection(url,"root","");
System.out.println("DATABASE DITEMUKAN");
}
catch (SQLException ex){
System.out.println("BERHASIL MENGHUBUNGKAN DATABASE "+ex);}
return koneksi;
}
}
