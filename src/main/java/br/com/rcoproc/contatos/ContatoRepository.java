package br.com.rcoproc.contatos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
