/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.ISalidaInventario;
import Modelo.Categoria;
import Modelo.DataBase;
import Modelo.Entrada;
import Modelo.Salida;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jonathan
 */
public class SalidaDAO implements ISalidaInventario{
    
    DataBase bd = new DataBase();
    @Override
    public Boolean registrar(Salida salida) {
        String sql = "INSERT INTO salidaproducto(`Codigo`, `idCliente`, `fechaSalida`, `subtotal`, `valorIva`, `valorDescuento`, `total`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`)"
                + " VALUES('"
                + salida.getCodigo()+"','"
                + salida.getIdCliente()+"','"
                + salida.getFechaSalida().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))+"','"
                + salida.getSubtotal()+"','"
                + salida.getValorIva()+"','"
                + salida.getValorDescuento()+"','"
                + salida.getTotal()+"','"
                + salida.getEstado()+"','"
                + salida.getFechaIngreso().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))+"','"
                + salida.getUsuarioIngreso()+"', "
                + null+", "
                + null+", "
                + null+", "
                + null+") ";
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean modificar(Salida salida) {
        String sql = "UPDATE salidaproducto SET Codigo='"
                + salida.getCodigo()+"',idCliente='"
                + salida.getIdCliente()+"',fechaSalida='"
                + salida.getFechaSalida()+"',subtotal='"
                + salida.getSubtotal()+"',valorIva='"
                + salida.getValorIva()+"',valorDescuento='"
                + salida.getValorDescuento()+"',total='"
                + salida.getTotal()+"',fechaModifica='"
                + salida.getFechaModifica().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))+"',usuarioModifica='"
                + salida.getUsuarioModifica()+"' WHERE idSalidaProducto="
                + salida.getIdSalidaProducto();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean eliminar(Salida salida) {
        String sql = "UPDATE salidaproducto SET estado='"
                + salida.getEstado()+"',fechaElimina='"
                + salida.getFechaElimina().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))+"',usuarioElimina='"
                + salida.getUsuarioElimina()+"' WHERE idSalidaProducto="
                + salida.getIdSalidaProducto();
        
        if(bd.update(sql) > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Salida> listar() {
        String sql = "SELECT * FROM salidaproducto WHERE estado = 1";
        List<Map> rows = bd.execute(sql);
        List<Salida> salidas = new ArrayList();
        for(Map row : rows){
            Salida ent = new Salida();
            ent.setIdSalidaProducto((int) row.get("idSalidaProducto"));
            ent.setCodigo((String) row.get("Codigo"));
            ent.setIdCliente(String.valueOf( row.get("idCliente")));
            ent.setFechaSalida(LocalDate.parse(row.get("fechaSalida").toString(),DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            ent.setSubtotal((float) row.get("subtotal"));
            ent.setValorIva((int) row.get("valorIva"));
            ent.setValorDescuento((float) row.get("valorDescuento"));
            ent.setTotal((float) row.get("total"));
            salidas.add(ent);
        }
        return salidas;
    }

    @Override
    public Salida leer(int idSalida) {
        String sql = "SELECT * FROM salidaproducto WHERE idSalidaProducto="+idSalida;
        List<Map> data = bd.execute(sql);
        Salida ent = new Salida();
        for(Map da : data){
            ent.setIdSalidaProducto((int) da.get("idSalidaProducto"));
            ent.setCodigo((String) da.get("Codigo"));
            ent.setIdCliente(String.valueOf(da.get("idCliente")));
            ent.setFechaSalida(LocalDate.parse(da.get("fechaSalida").toString(),DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            ent.setSubtotal((float) da.get("subtotal"));
            ent.setValorIva((int) da.get("valorIva"));
            ent.setValorDescuento((float) da.get("valorDescuento"));
            ent.setTotal((float) da.get("total"));            
        }
        return ent;
    }
    
}
