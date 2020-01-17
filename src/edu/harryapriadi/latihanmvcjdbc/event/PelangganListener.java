/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.harryapriadi.latihanmvcjdbc.event;

import edu.harryapriadi.latihanmvcjdbc.entity.Pelanggan;
import edu.harryapriadi.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Lenovo
 * NAMA         : HARRY APRIADI
 * KELAS        : PBOULANG
 * NIM          : 10116413
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
   public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    public void onDelete();
}
