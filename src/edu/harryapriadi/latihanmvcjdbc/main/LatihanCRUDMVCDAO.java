/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.harryapriadi.latihanmvcjdbc.main;

import edu.harryapriadi.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.harryapriadi.latihanmvcjdbc.entity.Pelanggan;
import edu.harryapriadi.latihanmvcjdbc.error.PelangganException;
import edu.harryapriadi.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;
import javax.swing.SwingUtilities;

/**
 *
 * @author Lenovo
 * NAMA         : HARRY APRIADI
 * KELAS        : PBOULANG
 * NIM          : 10116413
 */
public class LatihanCRUDMVCDAO {

    public static void main(String[] args) throws SQLException, PelangganException {

 SwingUtilities.invokeLater(new Runnable() {
     @Override
     public void run() {
         try {
             MainViewPelanggan pelanggan = new MainViewPelanggan();
             pelanggan.loadDatabase();
             pelanggan.setVisible(true);
         } catch (Exception e) {
         }
         
         
     }
 });
    }

}
