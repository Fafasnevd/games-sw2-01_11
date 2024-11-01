package application.record;

import application.modal.Jogo;

public record JogoListDTO(long id, String titulo) {
    public JogoListDTO(Jogo jogo) {
        this(jogo.getId(), jogo.getTitulo());
    }
}
