package equalseashcode;

import java.util.Objects;

public class Usuario {
    String nome;
    String email;
/*
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Usuario){
            Usuario outro = (Usuario) obj;
            return super.equals(obj);
        }
        return false;      
*/

    /*
    @Override
    public boolean equals(Object obj) {
        Usuario outro = (Usuario) obj;
        
        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual = outro.email.equals(this.email);
        
        return nomeIgual && emailIgual; 
    }
*/

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
    
    

    
}
