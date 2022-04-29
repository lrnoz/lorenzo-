package Repositorry;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;

public interface FornecedorRepository {

    @Entity(name = "Fornecedor")
    public class Fornecedor {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "nome")
        @NotNull
        @Size(max = 150)
        private String nome;

        @Size(max = 100)
        private String email;

        @Size(max=25)
        private String telefone;

        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getCpf() {
            return telefone;
        }
        public void setCpf(String cpf) {
            this.telefone = cpf;
        }
        @Override
        public String toString() {
            return "Cliente{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", email='" + email + '\'' +
                    ", cpf='" + telefone + '\'' +
                    '}';
        }
    }

}
