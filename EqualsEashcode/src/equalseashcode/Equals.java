package equalseashcode;

public class Equals {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@ezmail.com.br";
        
        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@ezmail.com.br";
        
        System.out.println(u1 == u2); //false
        System.out.println(u1.equals(u2)); //false no padrão
        
               
        
    }
    
}
