package exemplos1;

import lombok.Data;
import lombok.AllArgsConstructor;

public class TesteLombok {

    @Data
    @AllArgsConstructor
    public static class Cliente { // <-- static
        private String nome;
        private int idade;
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Amanda", 23);
        System.out.println(cliente.getNome());
    }
}
