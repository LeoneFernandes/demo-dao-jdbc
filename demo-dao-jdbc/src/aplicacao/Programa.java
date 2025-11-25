package aplicacao;

import java.util.Date;

import modelEntidade.Departamento;
import modelEntidade.Vendedor;

public class Programa {

    public static void main(String[] args) {
        
        Departamento obj = new Departamento(1, "Livros");

        Vendedor vendedor = new Vendedor(21, "Bob", "bob@gmail.com", 2200, new Date(), obj);

        System.out.println(vendedor);

        

    }

}
