package dev.harpiaz.dio_restful_cloud.service;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dev.harpiaz.dio_restful_cloud.model.Board;
import dev.harpiaz.dio_restful_cloud.repository.BoardRepository;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public Board createBoard(Board board) {
        if (boardRepository.existsByName(board.getName())) {
            throw new IllegalArgumentException("Board with this name already exists");
        }
        return boardRepository.save(board);
    }

    public Board findById(Long id) {
        return boardRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

}
