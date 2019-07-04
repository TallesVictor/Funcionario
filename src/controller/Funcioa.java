/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import model.Produto;
import view.Cadastro;
/**
 *
 * @author Windows 7
 */
public class Funcioa {

    public static ArrayList<Produto> listaUsuario = new ArrayList<Produto>();
  //
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarCadastro();
        
    }
  
    public static void mostrarCadastro() {
        Cadastro cadastro = new Cadastro();
        cadastro.setTitle("Cadastro");
        cadastro.setLocationRelativeTo(null);
        cadastro.setVisible(true);
    }
    public static void adicionarUsuario(Produto usuario){
        listaUsuario.add(usuario);
    }
    
    public static ArrayList<Produto> buscarTodos(){
        return listaUsuario;
    }
    
    public static ArrayList<Produto> filtrar(String cargo, String textoDe, String textoAte) {
        ArrayList<Produto> listaFiltrada = new ArrayList<>();
        Double valorDe = 0.0;
        Double valorAte = 90000000.0;
        
        if (!"".equals(textoDe)) {
            valorDe = Double.parseDouble(textoDe);
        }
        
        if (!"".equals(textoAte)) {
            valorAte = Double.parseDouble(textoAte);
        }
        
        for (Produto usuario : listaUsuario) {
            if ((usuario.getCargo().startsWith(cargo)
                 || cargo.equals(""))
                 && usuario.getSalario() >= valorDe 
                 && usuario.getSalario() <= valorAte){
                listaFiltrada.add(usuario);
                    
            }
        }
        return listaFiltrada;
    }
      
}
