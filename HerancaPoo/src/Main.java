//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Derivada Der = new Derivada("Marcos", "A1");
        System.out.println(Der.getNome());

    }
}

class Derivada extends Pessoa {
    public Derivada ( String nome , String id ) {
        super ( nome , id );
    }
    public String getNome ( ) {
        return recuperarNome ( );
    }

    private String recuperarNome() {
        return null;
    }
}

class Pessoa {
    private String id;
    private String nome;

    public Pessoa(String id, String nome){
        this.id = id;
        this.nome = nome;
    }
}