import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Usuario {
    
    @Id
    private Integer id;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email  = email;
    }

    public String getSenha() {
        return password;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}