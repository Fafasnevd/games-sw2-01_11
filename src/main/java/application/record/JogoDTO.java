package application.record;

import java.util.Set;

import application.modal.Jogo;
import application.modal.Plataforma;

public record JogoDTO(long id, String titulo, Set<Plataforma> plataformas) {
    public JogoDTO(Jogo jogo) {
        this(jogo.getId(), jogo.getTitulo(), jogo.getPlataformas());
    }
}
