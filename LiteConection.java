/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aboud.gradleproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Aboud Mahmoud
 */
public class LiteConection {

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:Mangenentdata.db");
    }

    public static void insert_Packge(String PackageSerilNumber, String OwnerPackageName, String OwnerPhoneNumber, String OwnerFacount, String PackgePrice, String PackgeNote, String PackgeDate, String PackgeDamperntHolder, String ImagePath, boolean PackgeDilverd, boolean customs) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("insert into PackageInfromation (PackageSerilNumber,OwnerPackageName,OwnerPhoneNumber,OwnerFacount,PackgePrice,PackgeNote,PackgeDilverd,PackgeIamgePath,PackgeAddDaprement,customs,PackgeDate) values(?,?,?,?,?,?,?,?,?,?,?)");) {

            /*  p.setString(1, fname);
            p.setString(2, Password);*/
            p.setString(1, PackageSerilNumber);
            p.setString(2, OwnerPackageName);
            p.setString(3, OwnerPhoneNumber);
            p.setString(4, OwnerFacount);
            p.setString(5, PackgePrice);
            p.setString(6, PackgeNote);
            p.setBoolean(7, PackgeDilverd);
            p.setString(8, ImagePath);
            p.setString(9, PackgeDamperntHolder);
            p.setBoolean(10, customs);
            p.setString(11, PackgeDate);
            p.execute();
            con.close();
            p.close();
            //  insert_Bill(PackgePrice, OwnerPackageName, PackgeDamperntHolder);
        } catch (SQLException ee) {
            JOptionPane.showMessageDialog(null, ee.getMessage());
        }
    }

    public static ArrayList<PackgeValue> getPackgeInfo() {
        ArrayList<PackgeValue> liste = new ArrayList<PackgeValue>();
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("select * from PackageInfromation");) {

            ResultSet r = p.executeQuery();
            while (r.next()) {
                liste.add(new PackgeValue(r.getString("PackageSerilNumber"), r.getInt("PackageID"), r.getString("OwnerPackageName"),
                        r.getString("OwnerPhoneNumber"), r.getString("OwnerFacount"), r.getString("PackgePrice"), r.getString("PackgeNote"), r.getString("PackgeDate"), r.getString("PackgeAddDaprement"), r.getString("PackgeIamgePath"), r.getBoolean("PackgeDilverd"), r.getBoolean("customs")));
            }
        } catch (SQLException ee) {
            JOptionPane.showMessageDialog(null, ee.getMessage());
        }

        return liste;
    }

    public static Double getPrice() {
        ArrayList<PackgeValue> arr = getPackgeInfo();
        Double t = 0.0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).isPackgeDilverd() == true) {
                t = t + Double.parseDouble(arr.get(i).getPackgePrice());
            }

        }
        return t;
    }

    public static int getLastSigndID() {
        ArrayList<PackgeValue> arr = getPackgeInfo();
        return arr.get(arr.size() - 1).getPackageID();
    }

    public static void insert_Date(String date1, String date2, String TypeOfProcc, int id) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("insert into DatePackge (StartDate,EndDate,TypeOfProcc,PackgeID) values(?,?,?,?)");) {

            p.setString(1, date1);
            p.setString(2, date2);
            p.setString(3, TypeOfProcc);
            p.setInt(4, id);

            p.execute();
        } catch (SQLException ee) {
            JOptionPane.showMessageDialog(null, ee.getMessage());
        }
    }

    public static ArrayList<dateValue> get_The_date() {
        ArrayList<dateValue> arr = new ArrayList<>();
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("select * from DatePackge ");) {

            ResultSet r = p.executeQuery();
            while (r.next()) {
                arr.add(new dateValue(r.getString("StartDate"), r.getString("EndDate"), r.getInt("PackgeID"), r.getString("TypeOfProcc")));
            }
        } catch (SQLException ee) {
            JOptionPane.showMessageDialog(null, ee.getMessage());
        }
        return arr;
    }

    public static void update_packgeInfo(int id, String Name, boolean Dilverd, String SerialNubmer, String PackgePrice, String Daprment, String phoneNumber, String Datepacke) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("update PackageInfromation set  OwnerPackageName=? , PackgeDilverd=?, PackageSerilNumber=? ,PackgePrice=? , PackgeAddDaprement=? , OwnerPhoneNumber=? , PackgeDate=? where PackageID=?");) {
            p.setString(1, Name);
            p.setBoolean(2, Dilverd);
            p.setString(3, SerialNubmer);
            p.setString(4, PackgePrice);
            p.setString(5, Daprment);
            p.setString(6, phoneNumber);
            p.setString(7, Datepacke);
            p.setInt(8, id);
            p.execute();
            JOptionPane.showMessageDialog(null, " „ «· ⁄œÌ·");
            p.close();
            con.close();
            Update_Bill(id, PackgePrice, Name, Daprment);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "error", JOptionPane.WARNING_MESSAGE);
        }

    }

    private static void updatenumbe(int id) {
        ArrayList<PackgeValue> arr = getPackgeInfo();
        ArrayList<CoustmerInfo> arr2 = getThe_Coustmerinfor();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getPackageID() == id) {
                for (int j = 0; j < arr2.size(); j++) {
                    if (arr.get(i).getOwnerPackageName().equals(arr2.get(j).getCoustmerName())) {
                        int x = arr2.get(j).getNumberOfBackge();
                        double str1 = Double.parseDouble(arr2.get(j).getCosutmerFees());
                        double str2 = Double.parseDouble(arr.get(i).getPackgePrice());
                        if (x == 0) {
                            break;
                        } else {
                            x--;
                            Update_Coustmerinfornumber(arr.get(i).getOwnerPackageName(), x, (str1 - str2) + "");
                            break;
                        }
                    }
                }
                //
            }
        }
    }

    public static void delete_packge(int id) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("DELETE FROM PackageInfromation WHERE PackageID=?;");) {

            p.setInt(1, id);
            p.execute();
            JOptionPane.showMessageDialog(null, " „ «·Õ–›");
            con.close();
            p.close();
            deletDate(id);
            updatenumbe(id);
//Update_Coustmerinfornumber(Name,)
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "error", JOptionPane.WARNING_MESSAGE);
        }

    }

    public static void deletDate(int id) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("DELETE FROM DatePackge WHERE PackgeID=?;");) {

            p.setInt(1, id);
            p.execute();

            con.close();
            p.close();
            Delete_Bill(id);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "error", JOptionPane.WARNING_MESSAGE);
        }

    }

    public static void insert_Requste(String Requstsorder, String RequstDiscrabtion, String RequstDate) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("insert into Requsts (Requstsorder,RequstDiscrabtion,RequstDate) values(?,?,?)");) {

            /*  p.setString(1, fname);
            p.setString(2, Password);*/
            p.setString(1, Requstsorder);
            p.setString(2, RequstDiscrabtion);
            p.setString(3, RequstDate);

            p.execute();
        } catch (SQLException ee) {
            JOptionPane.showMessageDialog(null, ee.getMessage());
        }
    }

    public static ArrayList<RequstedValue> getRequsted() {
        ArrayList<RequstedValue> list = new ArrayList<>();
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("select * from Requsts");) {

            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new RequstedValue(r.getString("Requstsorder"), r.getString("RequstDiscrabtion"), r.getString("RequstDate")));
            }
        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }

        return list;
    }

    public static void deletReqsted(String Requstsorder) {

        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("DELETE FROM Requsts WHERE Requstsorder=?;");) {
            p.setString(1, Requstsorder);

            p.execute();
            JOptionPane.showMessageDialog(null, " „ «·Õ–›");
        } catch (SQLException ee) {

            JOptionPane.showMessageDialog(null, ee.getMessage());
        }
    }

    public static void insert_Bill(int id, String BillPrice, String CousmterName, String DaprmentChcker) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("insert into Bill (ID,BillPrice,CousmterName,DaprmentChcker) values(?,?,?,?)");) {
            p.setInt(1, id);
            p.setString(2, BillPrice);
            p.setString(3, CousmterName);
            p.setString(4, DaprmentChcker);
            p.execute();
        } catch (SQLException ee) {
            JOptionPane.showMessageDialog(null, ee.getMessage());
        }
    }

    public static ArrayList<BillValue> getThe_Bill() {
        ArrayList<BillValue> list = new ArrayList<>();
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("select * from Bill");) {

            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new BillValue(r.getString("BillPrice"), r.getString("CousmterName"), r.getString("DaprmentChcker"), r.getInt("ID")));
            }
        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }

        return list;
    }

    public static void Update_Bill(int id, String BillPrice, String CousmterName, String DaprmentChcker) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("update Bill set  BillPrice=? , CousmterName=?, DaprmentChcker=?  where ID=?");) {

            p.setString(1, BillPrice);
            p.setString(2, CousmterName);
            p.setString(3, DaprmentChcker);
            p.setInt(4, id);
            p.execute();
            // JOptionPane.showMessageDialog(null, " „ «· ⁄œÌ·");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void Delete_Bill(int id) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("DELETE FROM Bill WHERE ID=?;");) {

            p.setInt(1, id);
            p.execute();
            //JOptionPane.showMessageDialog(null, " „ «·Õ–›");
            //deletDate(id);
            //  con.close();
            //  p.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void insert_paymaentmethod(String Pay, String PayForWhat) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("insert into PaymamentInfo (Pay,PayForWhat) values(?,?)");) {

            /*  p.setString(1, fname);
            p.setString(2, Password);*/
            p.setString(1, Pay);
            p.setString(2, PayForWhat);

            p.execute();
        } catch (SQLException ee) {
            JOptionPane.showMessageDialog(null, ee.getMessage());
        }
    }

    public static ArrayList<payValue> getThe_paymaentmethod() {
        ArrayList<payValue> list = new ArrayList<>();
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("select * from PaymamentInfo");) {

            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new payValue(r.getInt("ProccessID"), r.getString("Pay"), r.getString("PayForWhat")));
            }
        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }

        return list;
    }

    public static void Update_paymaentmethod(int ProccessID, String Pay, String PayForWhat) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("update PaymamentInfo set  Pay=? , PayForWhat=? where ProccessID=?");) {

            p.setString(1, Pay);
            p.setString(2, PayForWhat);
            p.setInt(3, ProccessID);
            p.execute();
            // JOptionPane.showMessageDialog(null, " „ «· ⁄œÌ·");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void insert_Coustmerinfor(String CoustmerName, String DamerntOfCastmr, String CosutmerFees, String CoustmerPays) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("insert into CoustmerInfo (CoustmerName,DamerntOfCastmr,CosutmerFees,CoustmerPays) values(?,?,?,?)");) {

            /*  p.setString(1, fname);
            p.setString(2, Password);*/
            p.setString(1, CoustmerName);
            p.setString(2, DamerntOfCastmr);
            p.setString(3, CosutmerFees);
            p.setString(4, CoustmerPays);

            p.execute();
            JOptionPane.showMessageDialog(null, " „ «÷«›… «·⁄„Ì·");
        } catch (SQLException ee) {
            JOptionPane.showMessageDialog(null, ee.getMessage());
        }
    }

    public static ArrayList<CoustmerInfo> getThe_Coustmerinfor() {
        ArrayList<CoustmerInfo> list = new ArrayList<>();
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("select * from CoustmerInfo");) {

            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new CoustmerInfo(r.getString("CoustmerName"), r.getString("DamerntOfCastmr"), r.getString("CosutmerFees"), r.getString("CoustmerPays"), r.getInt("CoustmerID"), r.getInt("NumberOfBackge")));
            }
        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }

        return list;
    }

    public static void Delete_Coustmerinfor(int CoustmerID) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("DELETE FROM CoustmerInfo WHERE CoustmerID=?;");) {

            p.setInt(1, CoustmerID);
            p.execute();
            //JOptionPane.showMessageDialog(null, " „ «·Õ–›");
            //deletDate(id);
            //  con.close();
            //  p.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void Update_Coustmerinfor(int CoustmerID, String CoustmerName, String DamerntOfCastmr, String CosutmerFees, String CoustmerPays) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("update CoustmerInfo set  CoustmerName=? , DamerntOfCastmr=? ,CosutmerFees=? ,CoustmerPays=? where CoustmerID=?");) {

            p.setString(1, CoustmerName);
            p.setString(2, DamerntOfCastmr);
            p.setString(3, CosutmerFees);
            p.setString(4, CoustmerPays);
            p.setInt(5, CoustmerID);
            p.execute();
            // JOptionPane.showMessageDialog(null, " „ «· ⁄œÌ·");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void Update_Coustmerinfornumber(String CoustmerName, int NumberOfBackge, String CosutmerFees) {
        try (Connection con = connect();
                PreparedStatement p = con.prepareStatement("update CoustmerInfo set  NumberOfBackge=?  ,CosutmerFees=? where CoustmerName=?");) {

            p.setInt(1, NumberOfBackge);
            p.setString(2, CosutmerFees);
            p.setString(3, CoustmerName);
            p.execute();
            // JOptionPane.showMessageDialog(null, " „ «· ⁄œÌ·");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "error", JOptionPane.WARNING_MESSAGE);
        }
    }

}
